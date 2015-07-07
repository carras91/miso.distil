package miso.carrascal.codeGenerator.generator.entities

import com.google.inject.Inject
import org.eclipse.emf.common.util.EList
import codeGeneratorModel.Attribute
import codeGeneratorModel.Entity

class generateEntityClass {
	
	@Inject miso.carrascal.codeGenerator.generator.generateUtils genUti
	@Inject miso.carrascal.codeGenerator.generator.packages pack
		
	def write(Entity entity) '''
		package «pack.EntitiesCha»;

		«genUti.getImportList(entity.attributes)»
		public class «entity.name» {

			«genUti.getPrivateAttributes(entity.attributes)»

			«IF entity.attributes.empty»
				public «entity.name»() {}
			«ELSE»
				public «entity.name»() {}
				
				«entity.getConstructorEntity»
			«ENDIF»

			«genUti.getGetSetAtt(entity.attributes)»

			«genUti.getToStringAtts(entity.attributes)»
		}
	'''
		
	def private getConstructorEntity(Entity entity) '''
		«val EList<Attribute> atts = entity.attributes»
		public «entity.name»(«FOR att:atts»«genUti.getTypeName(att)» «att.name»«IF !atts.last.equals(att)», «ENDIF»«ENDFOR») {

			«FOR att:atts» 
				this.«att.name» = «att.name»;
			«ENDFOR»
		}
	'''	
}