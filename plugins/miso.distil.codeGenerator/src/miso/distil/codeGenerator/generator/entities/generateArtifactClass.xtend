package miso.distil.codeGenerator.generator.entities

import codeGeneratorModel.Attribute
import codeGeneratorModel.Artifact
import com.google.inject.Inject
import org.eclipse.emf.common.util.EList
import codeGeneratorModel.Primitive
import codeGeneratorModel.DataEnum
import codeGeneratorModel.Reference

/**
 * To write "artifact.name".java.
 * 
 * @author Carlos Carrascal.
 */
class generateArtifactClass {

	@Inject miso.distil.codeGenerator.generator.generateUtils genUti
	@Inject miso.distil.codeGenerator.generator.Names names
	
	/**
	 * To write "artifact.name".java.
	 * 
	 * @param artifact the artifact.
	 */
	def write(Artifact artifact) '''
		«val EList<Attribute> atts = artifact.attributes»
		package «names.getArtifactChar(artifact)»;

		import «names.MisoAbstract».Persistent;
		
		«genUti.getImportCompose(atts)»
		«genUti.getImportList(atts)»

		/**
		 * Auto-generated artifact class.
		 * 
		 * @author miso.distil.codeGenerator.
		 */
		public class «artifact.name» extends Persistent {

			private static final long serialVersionUID = 1L;
			// Attributes
			«genUti.getPrivateAttributes(atts)»

			/**
			 * Empty constructor.
			 */
			public «artifact.name»() {
				super();
			}

			«artifact.getConstructorArtifact»

			«genUti.getGetSetAtt(atts)»

			// To string method

			«genUti.getToStringAtts(atts)»
		}
	'''

	/**
	 * To write the full constructor of artifact.
	 * 
	 * @param artifact the artifact.
	 */
	def private getConstructorArtifact(Artifact artifact) '''
		«val EList<Attribute> atts = artifact.attributes»
		/**
		 * Full constructor.
		 * 
		 * @param filename Name file. 
		 * @param filesize File size.
		«FOR att : atts»
		* @param «att.name» Attribute «att.name».
		«ENDFOR»
		 */
		public «artifact.name»(String filename, long filesize«FOR att:atts», «genUti.getTypeName(att)» «att.name»«ENDFOR») {

			super(filename, filesize);

			«FOR att:atts» 
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
			«ENDFOR»
		}
	'''	
}