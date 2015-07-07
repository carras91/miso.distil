package miso.carrascal.codeGenerator.generator.services

import com.google.inject.Inject
import org.eclipse.emf.common.util.EList
import codeGeneratorModel.MultiService
import codeGeneratorModel.Service

class generateMultiService {
	
	@Inject miso.carrascal.codeGenerator.generator.packages pack
		
	def write(MultiService multiService) '''
		package «pack.ServicesCha»;

		import «pack.MisoServices».MultiServiceAbstractJson;

		public class Service«multiService.name» extends MultiServiceAbstractJson {

			public Service«multiService.name»() {
				super(«multiService.parallel»);
				«FOR service : multiService.services as EList<Service>»
					addService(new Service«service.name»());
				«ENDFOR»
			}
		}
	'''
}