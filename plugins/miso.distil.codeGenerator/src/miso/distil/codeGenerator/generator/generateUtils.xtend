package miso.distil.codeGenerator.generator

import codeGeneratorModel.Attribute
import codeGeneratorModel.Reference
import codeGeneratorModel.Primitive
import codeGeneratorModel.ArtifactID
import java.util.List
import org.eclipse.emf.common.util.EList
import codeGeneratorModel.Artifact
import java.util.ArrayList
import java.util.HashMap
import org.eclipse.emf.common.util.BasicEList
import com.google.inject.Inject
import codeGeneratorModel.ServiceEnum
import codeGeneratorModel.DataEnum

/**
 * Some methos used everywhere.
 * 
 * @author Carlos Carrascal.
 */
class generateUtils {

	@Inject miso.distil.codeGenerator.generator.Names pack
	
	private var HashMap<Artifact, List<Pair<Attribute, List<String>>>> nestedTree = new HashMap<Artifact, List<Pair<Attribute, List<String>>>>()

	/**
	 * To write the chain ".getX().getY()..." from the attribute number "pos" in artifact.
	 * 
	 * @param pos the position.
	 * @param artifact the artifact.
	 */
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
	
	/**
	 * To write a string "att1, att2, att3, ..." from the attributes inside the reference number pos in artifact.
	 * 
	 * @param pos the position.
	 * @param artifact the artifact.
	 */
	def getNestedAtt(Integer pos, Artifact artifact) {
		var parentName = getNewAttName(pos, artifact)
		var atts = (artifact.nestedTree.get(pos).key as Reference).type.attributes
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
	
	/**
	 * To get an attribute name by his position inside nestedTree (separated by _).
	 * 
	 * @param pos the position.
	 * @param artifact the artifact.
	 */
	def getNewAttName(Integer pos, Artifact artifact) {
		var newName = artifact.nestedTree.get(pos).key.name
		var reverseList = artifact.nestedTree.get(pos).value.reverseView 
		for(str : reverseList)
			if(!reverseList.last.equals(str))
				newName = newName + '_' + str.toLowerCase
		return newName
	}
	
	/**
	 * To get an attribute name by his position inside nestedTree (separated by .).
	 * 
	 * @param pos the position.
	 * @param artifact the artifact.
	 */
	def getNewAttNameByPoint(Integer pos, Artifact artifact) {
		var list = artifact.nestedTree.get(pos).value 
		var newName = ""
		for(var int i = 1; i < list.size; i++) 
			newName = newName + list.get(i).toLowerCase + '.'
		return newName + artifact.nestedTree.get(pos).key.name
	}
	
	/**
	 * To get an attribute name.
	 * 
	 * @param att the attribute.
	 * @param artifact the artifact.
	 */
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
	
	/**
	 * To fill nestedTree and return artifact's attributes information.
	 * 
	 * @param artifact the artifact.
	 */
	private def List<Pair<Attribute, List<String>>> getNestedTree(Artifact artifact) {
		if(nestedTree.keySet.contains(artifact)) {
			return nestedTree.get(artifact)
		} else {
			val list = new ArrayList<Pair<Attribute, List<String>>>
			artifact.attributes.forEach[
				var List<String> path = new ArrayList()
				path.add(artifact.name)
				if(it instanceof Reference) {
					list.addAll(it.getNested(path))
				}
				list.add(new Pair(it, path))
			]
			nestedTree.put(artifact, list)
			return list
		}
	}
	
	/**
	 * To get for each attribute his path in an ascendent way (recursive).
	 * 
	 * @param att the reference.
	 * @param parent the path.
	 */
	private def List<Pair<Attribute, List<String>>> getNested(Reference att, List<String> parent) {
		val list = new ArrayList<Pair<Attribute, List<String>>>
		att.type.attributes.forEach[
			var List<String> path = new ArrayList(parent)
			path.add(att.name)
			if(it instanceof Reference) {
				list.addAll(it.getNested(path))
			}
			list.add(new Pair(it, path))
		]
		return list
	}
	
	/**
	 * To write "import java.util.List;" if needed.
	 * 
	 * @param atts list of attributes.
	 */
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
	
	/**
	 * To write entities imports from atts.
	 * 
	 * @param atts list of attributes.
	 */
	def getImportCompose(EList<Attribute> atts) {
		var nameList = new ArrayList() 
		'''
			«FOR att:atts»
				«IF att instanceof Reference»
					«IF !nameList.contains(att.type.name)»
						«{nameList.add(att.type.name); null}»
						import «pack.EntitiesCha».«att.type.name»;
					«ENDIF»
				«ENDIF»
			«ENDFOR»
		'''
	}
	
	/**
	 * To get a list of nested attributes (primitive and reference) (recursive).
	 * 
	 * @param atts list of attributes.
	 */
	def EList<Attribute> getAllNestedAttributes(EList<Attribute> atts) {
		val EList<Attribute> list = new BasicEList<Attribute>()
		atts.forEach[
			if(it instanceof Reference) {
				list.addAll(it.type.attributes.allNestedAttributes)			
			}
			list.add(it)
		]
		return list
	}
	
	/**
	 * To get a list of nested attributes (but not references) (recursive).
	 * 
	 * @param atts list of attributes.
	 */
	def EList<Attribute> getNestedAttributes(Attribute att) {
		val EList<Attribute> list = new BasicEList<Attribute>()
		if(att instanceof Primitive || att instanceof ArtifactID) {
			list.add(att)
		} else {
			(att as Reference).type.attributes.forEach[
				list.addAll(it.nestedAttributes)
			]
		}
		return list
	}
		
	/**
	 * To write the class name of att.
	 * 
	 * @param att the attribute.
	 */
	def getTypeName(Attribute att) '''«IF att.many»List<«ENDIF»«IF att instanceof Reference»«att.type.name»«ELSEIF att instanceof Primitive»«(att as Primitive).type.toString»«ELSE»String«ENDIF»«IF att.many»>«ENDIF»'''

	/**
	 * To write private attributes.
	 * 
	 * @param atts list of attributes.
	 */
	def getPrivateAttributes(EList<Attribute> atts) '''
		«FOR att : atts»
			private «att.typeName» «att.name»;
		«ENDFOR»
	'''	
	
	/**
	 * To write getters and setters.
	 * 
	 * @param atts list of attributes.
	 */	
	def getGetSetAtt(EList<Attribute> atts) '''
		«FOR att : atts»
			/**
			 * To get «att.name»
			 *
			 * @return «att.name»
			 */
			public «att.typeName» get«att.name.toFirstUpper»() {
				return «att.name»;
			}

			/**
			 * To set «att.name»
			 *
			 * @param «att.name» new «att.name»
			 */
			public void set«att.name.toFirstUpper»(«att.typeName» «att.name») {
				«IF att instanceof Primitive»
					«IF att.type.equals(DataEnum.STRING)»
						«IF att.many»
							this.«att.name» = «att.name»;
							for(int i=0; i < this.«att.name».size(); i++) {
								this.«att.name».set(i, this.«att.name».get(i).toLowerCase());
							}
						«ELSE»
							this.«att.name» = «att.name».toLowerCase();
						«ENDIF»
					«ELSE»
						this.«att.name» = «att.name»;
					«ENDIF»
				«ELSEIF att instanceof Reference»
					this.«att.name» = «att.name»;
				«ELSE»
					«IF att.many»
						this.«att.name» = «att.name»;
						for(int i=0; i < this.«att.name».size(); i++) {
							this.«att.name».set(i, this.«att.name».get(i).toLowerCase());
						}
					«ELSE»
						this.«att.name» = «att.name».toLowerCase();
					«ENDIF»
				«ENDIF»
			}
		«ENDFOR»
	'''
	
	/**
	 * Process ServiceEnum.ALL.
	 * 
	 * @param services the services.
	 */
	def processBasicServices(EList<ServiceEnum> services) {
		if(services.contains(ServiceEnum.ALL)) {
			services.add(ServiceEnum.UPLOAD);
			services.add(ServiceEnum.DOWNLOAD);
			services.add(ServiceEnum.UPDATE);
			services.add(ServiceEnum.READ);
			services.add(ServiceEnum.READ_ALL);
			services.add(ServiceEnum.SEARCH);
			services.add(ServiceEnum.DELETE);
		}
		return services
	}
	
	/**
	 * To write toString method.
	 * 
	 * @param atts list of attributes.
	 */
	def getToStringAtts(EList<Attribute> atts) '''
			@Override
			public String toString() {
				«IF atts.empty»
					return super.toString();
				«ELSE»
					return super.toString() +
					«FOR att : atts»
						"( «att.name» : " + «att.name».toString()«IF atts.last.equals(att)» + " )";«ELSE» + " ) " + «ENDIF»
					«ENDFOR»
				«ENDIF»
			}
	'''	
}