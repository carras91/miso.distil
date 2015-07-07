package miso.carrascal.codeGenerator.generator

import codeGeneratorModel.Attribute
import codeGeneratorModel.MultiAttribute
import codeGeneratorModel.SimpleAttribute
import java.util.List
import org.eclipse.emf.common.util.EList
import codeGeneratorModel.Artifact
import java.util.ArrayList
import java.util.HashMap
import org.eclipse.emf.common.util.BasicEList
import com.google.inject.Inject

class generateUtils {

	@Inject miso.carrascal.codeGenerator.generator.packages pack
	
	private var HashMap<Artifact, List<Pair<Attribute, List<String>>>> nestedTree = new HashMap<Artifact, List<Pair<Attribute, List<String>>>>()

	def getNestedGets(Integer pos, Artifact artifact) {
		var list = artifact.nestedTree.get(pos).value
		var name = artifact.nestedTree.get(pos).key.name
		var nestedGets = ''''''
		for(String next : list) {
			if(list.get(0).equals(next))
				nestedGets = next.toLowerCase
			else 
				nestedGets = nestedGets + '''.get''' + next.toFirstUpper + '''()'''
		}
		return nestedGets + '''.get''' + name.toString.toFirstUpper + '''()'''
	}
	
	def getNestedAtt(Integer pos, Artifact artifact) {
		var parentName = getNewAttName(pos, artifact)
		var atts = (artifact.nestedTree.get(pos).key as MultiAttribute).type.attributes
		var nestedAtt = ''''''
		for(att : atts as EList<Attribute>) {
			if(atts.last.equals(att)) {
				nestedAtt = nestedAtt + att.name + "_" + parentName
			} else {
				nestedAtt = nestedAtt + att.name + "_" + parentName + ", "
			}
		}
		return nestedAtt
	}
	
	def getNewAttName(Integer pos, Artifact artifact) {
		var newName = artifact.nestedTree.get(pos).key.name
		var reverseList = artifact.nestedTree.get(pos).value.reverseView 
		for(str : reverseList)
			if(!reverseList.last.equals(str))
				newName = newName + '_' + str.toLowerCase
		return newName
	}
	
	def getNewAttName(Attribute att, Artifact artifact) {
		for(pair : artifact.nestedTree) {
			if(pair.key.equals(att)) {
				var newName = pair.key.name
				for(str : pair.value.reverseView)
					if(!pair.value.last.equals(str))
						newName = newName + '_' + str.toLowerCase
				return newName
			}
		}
	}
	
	private def List<Pair<Attribute, List<String>>> getNestedTree(Artifact artifact) {
		if(nestedTree.keySet.contains(artifact)) {
			return nestedTree.get(artifact)
		} else {
			val list = new ArrayList<Pair<Attribute, List<String>>>
			artifact.attributes.forEach[
				var List<String> path = new ArrayList()
				path.add(artifact.name)
				if(it instanceof MultiAttribute) {
					list.addAll(it.getNested(path))
				}
				list.add(new Pair(it, path))
			]
			nestedTree.put(artifact, list)
			return list
		}
	}
	
	private def List<Pair<Attribute, List<String>>> getNested(MultiAttribute att, List<String> parent) {
		val list = new ArrayList<Pair<Attribute, List<String>>>
		att.type.attributes.forEach[
			var List<String> path = new ArrayList(parent)
			path.add(att.name)
			if(it instanceof MultiAttribute) {
				list.addAll(it.getNested(path))
			}
			list.add(new Pair(it, path))
		]
		return list
	}
	
	def getImportList(EList<Attribute> atts) {
		var presentList = false 
		'''«FOR att:atts»
				«IF att.typeName.toString.contains("List<") && !presentList»
					«{presentList = true; null}»
					import java.util.List;
					
				«ENDIF»
			«ENDFOR»
		'''	
	}
	
	def getImportCompose(EList<Attribute> atts) {
		var nameList = new ArrayList() 
		'''
			«FOR att:atts»
				«IF att instanceof MultiAttribute»
					«IF !nameList.contains(att.type.name)»
						«{nameList.add(att.type.name); null}»
						import «pack.EntitiesCha».«att.type.name»;
					«ENDIF»
				«ENDIF»
			«ENDFOR»
		'''
	}
	
	def EList<Attribute> getAllNestedAttributes(EList<Attribute> atts) {
		val EList<Attribute> list = new BasicEList<Attribute>()
		atts.forEach[
			if(it instanceof MultiAttribute) {
				list.addAll(it.type.attributes.allNestedAttributes)			
			}
			list.add(it)
		]
		return list
	}
	
	def EList<Attribute> getNestedAttributes(Attribute att) {
		val EList<Attribute> list = new BasicEList<Attribute>()
		if(att instanceof SimpleAttribute) {
			list.add(att)
		} else {
			(att as MultiAttribute).type.attributes.forEach[
				list.addAll(it.nestedAttributes)
			]
		}
		return list
	}
		
		
	def getTypeName(Attribute att) '''«IF att instanceof MultiAttribute»«att.type.name»«ELSE»«val sa = att as SimpleAttribute»«IF sa.many»List<«ENDIF»«sa.data.toString»«IF sa.many»>«ENDIF»«ENDIF»'''

	def getPrivateAttributes(EList<Attribute> atts) '''
		«FOR att : atts»
			private «att.typeName» «att.name»;
		«ENDFOR»
	'''	
	
//	def getTypeName(Reference ref) '''«IF ref.many»List<«ENDIF»String«IF ref.many»>«ENDIF»'''
//	
//	
//	def getPrivateReferences(EList<Reference> refs) '''
//		«FOR ref : refs»
//			private «ref.typeName» «ref.name»;
//		«ENDFOR»
//	'''
	
	def getGetSetAtt(EList<Attribute> atts) '''
		«FOR att : atts»
			public «att.typeName» get«att.name.toFirstUpper»() {
				return «att.name»;
			}

			public void set«att.name.toFirstUpper»(«att.typeName» «att.name») {
				this.«att.name» = «att.name»;
			}
			«IF !atts.last.equals(att)»

			«ENDIF»
		«ENDFOR»
	'''
	
//	def getGetSetRef(EList<Reference> refs) '''
//		«FOR ref : refs»
//			public «ref.typeName» get«ref.name.toFirstUpper»() {
//				return «ref.name»;
//			}
//
//			public void set«ref.name.toFirstUpper»(«ref.typeName» «ref.name») {
//				this.«ref.name» = «ref.name»;
//			}
//			«IF !refs.last.equals(ref)»
//
//			«ENDIF»
//		«ENDFOR»
//	'''
	
	def getToStringAtts(EList<Attribute> atts) '''
			@Override
			public String toString() {
				«IF atts.empty»
					return "";
				«ELSE»
					return 
					«FOR att : atts»
						"(«att.name» : " + «att.name».toString()«IF atts.last.equals(att)» + ")";«ELSE» + ")" + «ENDIF»
					«ENDFOR»
				«ENDIF»
			}
	'''	
	
//	def getToStringRefs(EList<Attribute> atts, EList<Reference> refs) '''
//			@Override
//			public String toString() {
//				«IF atts.empty && refs.empty»
//					return "";
//				«ELSE»
//					return 
//						«FOR att : atts»
//							"(«att.name» : " + «att.name».toString()«IF atts.last.equals(att) && refs.isEmpty» + ")";«ELSE» + ")" + «ENDIF»
//						«ENDFOR»
//						«FOR ref : refs»
//							"(«ref.name» : " + «ref.name».toString()«IF refs.last.equals(ref)» + ")";«ELSE» + ")" + «ENDIF»
//						«ENDFOR»
//				«ENDIF»
//			}
//	'''	
}