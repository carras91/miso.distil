package miso.distil.codeGenerator.generator.entities

import com.google.inject.Inject
import org.eclipse.emf.common.util.EList
import codeGeneratorModel.Attribute
import codeGeneratorModel.Entity

/**
 * To write <entity>.java
 * 
 * @author Carlos Carrascal
 */
class generateEntityClass {
	
	@Inject miso.distil.codeGenerator.generator.generateUtils genUti
	@Inject miso.distil.codeGenerator.generator.Names names
	
	/**
	 * To write <entity.name>.java
	 * 
	 * @author Carlos Carrascal
	 */
	def write(Entity entity) '''
		package «names.EntitiesCha»;

		«genUti.getImportList(entity.attributes)»
		/**
		 * Auto-generated entity class
		 * 
		 * @author miso.distil.codeGenerator
		 */
		public class «entity.name» {

			// Attributes
			«genUti.getPrivateAttributes(entity.attributes)»

			«IF entity.attributes.empty»
				// Constructor
				public «entity.name»() {}
			«ELSE»
				// Empty constructor
				public «entity.name»() {}
				
				// Full constructor
				«entity.getConstructorEntity»
			«ENDIF»

			// Getters and setters

			«genUti.getGetSetAtt(entity.attributes)»

			// To string method

			«genUti.getToStringAtts(entity.attributes)»
		}
	'''

	/*
	 * To write the full constructor of entity
	 * 
	 * @author Carlos Carrascal
	 */		
	def private getConstructorEntity(Entity entity) '''
		«val EList<Attribute> atts = entity.attributes»
		public «entity.name»(«FOR att:atts»«genUti.getTypeName(att)» «att.name»«IF !atts.last.equals(att)», «ENDIF»«ENDFOR») {

			«FOR att:atts» 
				this.«att.name» = «att.name»;
			«ENDFOR»
		}
	'''	
}