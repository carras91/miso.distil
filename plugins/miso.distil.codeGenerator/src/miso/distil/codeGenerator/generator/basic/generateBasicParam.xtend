package miso.distil.codeGenerator.generator.basic

import com.google.inject.Inject
import codeGeneratorModel.Artifact
import codeGeneratorModel.Attribute
import org.eclipse.emf.common.util.EList
import codeGeneratorModel.SimpleAttribute

/*
 * To write BasicXXXParam.java
 * 
 * @author Carlos Carrascal
 */
class generateBasicParam {
	
	@Inject miso.distil.codeGenerator.generator.generateUtils genUti
	@Inject miso.distil.codeGenerator.generator.packages pack
	/*
	 * To write Basic<artifact.name>Param.java
	 * 
	 * @author Carlos Carrascal
	 */
	def write(Artifact artifact) '''
		«val name = artifact.name»
		«val EList<Attribute> allAtts = genUti.getAllNestedAttributes(artifact.attributes)»
		«var pos = -1»
		package «pack.getBasicChar(artifact)»;

		import java.util.ArrayList;
		import java.util.List;
		import «pack.MisoBasic».BasicAbstractParam;

		/**
		 * Auto-generated parameters
		 * 
		 * @author miso.distil.codeGenerator
		 */
		public class Basic«name»Param extends BasicAbstractParam {
			// Attributes parameters
			«{pos = -1; null}»
			«FOR att:allAtts»
				«{pos++; null}»
				«IF att instanceof SimpleAttribute»
					«IF att.required»
						public static String «genUti.getNewAttName(pos, artifact).toFirstUpper» = "«genUti.getNewAttName(pos, artifact).toUpperCase»";
					«ENDIF»
				«ENDIF»
			«ENDFOR»

			// List with all parameters
			private static List<String> values = new ArrayList<String>();
			/**
			* Auto-generated list with all parameters
			* 
			* @author miso.distil.codeGenerator
			*/
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
				}
				return values;
			}
		}
	'''
}