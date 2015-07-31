package miso.distil.codeGenerator.generator.entities

import com.google.inject.Inject
import org.eclipse.emf.common.util.EList
import codeGeneratorModel.Attribute
import codeGeneratorModel.Entity
import codeGeneratorModel.Primitive
import codeGeneratorModel.DataEnum
import codeGeneratorModel.Reference

/**
 * To write "entity.name".java.
 * 
 * @author Carlos Carrascal.
 */
class generateEntityClass {
	
	@Inject miso.distil.codeGenerator.generator.generateUtils genUti
	@Inject miso.distil.codeGenerator.generator.Names names
	
	/**
	 * To write "entity.name".java.
	 * 
	 * @author Carlos Carrascal.
	 */
	def write(Entity entity) '''
		package «names.EntitiesCha»;

		«genUti.getImportList(entity.attributes)»
		/**
		 * Auto-generated entity class.
		 * 
		 * @author miso.distil.codeGenerator.
		 */
		public class «entity.name» {

			// Attributes
			«genUti.getPrivateAttributes(entity.attributes)»

			«IF entity.attributes.empty»
				/**
				 * Empty constructor.
				 */
				public «entity.name»() {}
			«ELSE»
				/**
				 * Empty constructor.
				 */
				public «entity.name»() {}
				
				«entity.getConstructorEntity»
			«ENDIF»

			«genUti.getGetSetAtt(entity.attributes)»

			// To string method

			«genUti.getToStringAtts(entity.attributes)»
		}
	'''

	/**
	 * To write the full constructor of entity.
	 * 
	 * @param artifact the artifact.
	 */		
	def private getConstructorEntity(Entity entity) '''
		«val EList<Attribute> atts = entity.attributes»
		/**
		 * Full constructor.
		 * 
		«FOR att : atts»
		* @param «att.name» Attribute «att.name».
		«ENDFOR»
		 */
		public «entity.name»(«FOR att:atts»«genUti.getTypeName(att)» «att.name»«IF !atts.last.equals(att)», «ENDIF»«ENDFOR») {

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