package miso.carrascal.codeGenerator.generator.entities

import codeGeneratorModel.Attribute
import codeGeneratorModel.Artifact
import com.google.inject.Inject
import org.eclipse.emf.common.util.EList

/*
 * To write <artifact>.java
 * 
 * @author Carlos Carrascal
 */
class generateArtifactClass {

	@Inject miso.carrascal.codeGenerator.generator.generateUtils genUti
	@Inject miso.carrascal.codeGenerator.generator.packages pack
	
	/*
	 * To write <artifact.name>.java
	 * 
	 * @author Carlos Carrascal
	 */
	def write(Artifact artifact) '''
		«val EList<Attribute> atts = artifact.attributes»
		package «pack.getArtifactChar(artifact)»;

		import «pack.MisoAbstract».AbstractPersistentClass;
		
		«genUti.getImportCompose(atts)»
		import java.util.List;

		/**
		 * Auto-generated artifact class
		 * 
		 * @author miso.distil.codeGenerator
		 */
		public class «artifact.name» extends AbstractPersistentClass {

			private static final long serialVersionUID = 1L;
			// Attributes
			«genUti.getPrivateAttributes(atts)»

			// Empty constructor
			public «artifact.name»() {
				super();
			}

			// Full constructor
			«artifact.getConstructorArtifact»

			// Getters and setters

			«genUti.getGetSetAtt(atts)»

			// To string method

			«genUti.getToStringAtts(atts)»
		}
	'''

	/*
	 * To write the full constructor of artifact
	 * 
	 * @author Carlos Carrascal
	 */
	def private getConstructorArtifact(Artifact artifact) '''
		«val EList<Attribute> atts = artifact.attributes»
		public «artifact.name»(String objectName, long fileSize, List<String> tags«FOR att:atts», «genUti.getTypeName(att)» «att.name»«ENDFOR») {

			super(objectName, fileSize, tags);

			«FOR att:atts» 
				this.«att.name» = «att.name»;
			«ENDFOR»
		}
	'''	
}