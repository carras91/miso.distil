package miso.carrascal.codeGenerator.generator.services

import com.google.inject.Inject
import org.eclipse.emf.common.util.EList
import codeGeneratorModel.MultiService
import codeGeneratorModel.Service

/*
 * To write XXXService.java
 * 
 * @author Carlos Carrascal
 */
class generateMultiService {
	
	@Inject miso.carrascal.codeGenerator.generator.packages pack

	/*
	 * To write <multiService.name>Service.java
	 * 
	 * @author Carlos Carrascal
	 */	
	def write(MultiService multiService) '''
		package «pack.ServicesCha»;

		import «pack.MisoServices».MultiServiceAbstractJson;

		/**
		 * Auto-generated multi service class
		 * 
		 * @author miso.distil.codeGenerator
		 */
		public class Service«multiService.name» extends MultiServiceAbstractJson {

			/**
			 * Auto-generated multi service constructor
			 * 
			 * @author miso.distil.codeGenerator
			 */
			public Service«multiService.name»() {
				super(«multiService.parallel»);
				«FOR service : multiService.services as EList<Service>»
					addService(new Service«service.name»());
				«ENDFOR»
			}
		}
	'''
}