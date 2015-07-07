package miso.carrascal.codeGenerator.generator.basic

import com.google.inject.Inject
import codeGeneratorModel.Artifact
import codeGeneratorModel.Attribute
import org.eclipse.emf.common.util.EList
//import codeGeneratorModel.Reference
import codeGeneratorModel.SimpleAttribute

class generateBasicParam {
	
	@Inject miso.carrascal.codeGenerator.generator.generateUtils genUti
	@Inject miso.carrascal.codeGenerator.generator.packages pack
		
	def write(Artifact artifact) '''
		«val name = artifact.name»
		«val EList<Attribute> allAtts = genUti.getAllNestedAttributes(artifact.attributes)»
«««		«var EList<Reference> refs = artifact.references»
		«var pos = -1»
		package «pack.getBasicChar(artifact)»;

		import java.util.ArrayList;
		import java.util.List;
		import «pack.MisoBasic».BasicAbstractParam;

		public class Basic«name»Param extends BasicAbstractParam {
			«{pos = -1; null}»
			«FOR att:allAtts»
				«{pos++; null}»
				«IF att instanceof SimpleAttribute»
					«IF att.required»
						public static String «genUti.getNewAttName(pos, artifact).toFirstUpper» = "«genUti.getNewAttName(pos, artifact).toUpperCase»";
					«ENDIF»
				«ENDIF»
			«ENDFOR»
«««			«FOR ref:refs»
«««				«IF ref.required»
«««					public static String «ref.name.toFirstUpper» = "«ref.name.toUpperCase»";
«««				«ENDIF»
«««			«ENDFOR»

			private static List<String> values = new ArrayList<String>();
			public static List<String> values() {
				if(values.isEmpty()) {
					values.addAll(BasicAbstractParam.values());
					«{pos = -1; null}»
					«FOR att:allAtts»
						«{pos++; null}»
						«IF att instanceof SimpleAttribute»
							«IF att.required»
							values.add(«genUti.getNewAttName(pos, artifact).toFirstUpper»);
							«ENDIF»
						«ENDIF»
					«ENDFOR»
«««					«FOR ref:refs»
«««						«IF ref.required»
«««							values.add(«ref.name.toFirstUpper»);
«««						«ENDIF»
«««					«ENDFOR»
				}
				return values;
			}
		}
	'''
}