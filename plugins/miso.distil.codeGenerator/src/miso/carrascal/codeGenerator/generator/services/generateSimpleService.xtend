package miso.carrascal.codeGenerator.generator.services

import com.google.inject.Inject
import codeGeneratorModel.SimpleService
import codeGeneratorModel.Artifact
import codeGeneratorModel.AbstractEntity
import org.eclipse.emf.common.util.EList
import java.util.ArrayList

class generateSimpleService {
	
	@Inject miso.carrascal.codeGenerator.generator.packages pack
		
	def write(SimpleService simpleService) '''
		«var position = 0»
		«var nameList = new ArrayList<String>()»
		package «pack.ServicesCha»;

		import java.util.ArrayList;
		import java.util.List;

		import spark.Request;
		import spark.Response;
		
		import «pack.MisoServices».ServiceAbstractJson;
		import «pack.MisoAbstract».AbstractPersistentClass;

		«FOR input : simpleService.input as EList<AbstractEntity>»
			«IF !nameList.contains(input.name)»
				«IF input instanceof Artifact»
					import «pack.getArtifactChar(input)».«input.name»;
				«ELSE»
					import «pack.EntitiesCha».«input.name»;
				«ENDIF»
				«{nameList.add(input.name); null}»
			«ENDIF»
		«ENDFOR»
		«FOR output : simpleService.output as EList<AbstractEntity>»
			«IF !nameList.contains(output.name)»
				«IF output instanceof Artifact»
					import «pack.getArtifactChar(output)».«output.name»;
				«ELSE»
					import «pack.EntitiesCha».«output.name»;
				«ENDIF»
				«{nameList.add(output.name); null}»
			«ENDIF»
		«ENDFOR»
		«IF !nameList.empty»

		«ENDIF»
		public class Service«simpleService.name» extends ServiceAbstractJson {

			public Service«simpleService.name»() {
				«FOR input : simpleService.input as EList<AbstractEntity>»
					addInputClass(«input.name».class);
				«ENDFOR»
				«FOR output : simpleService.output as EList<AbstractEntity>»
					addOutputClass(«output.name».class);
				«ENDFOR»
			}

			// Method call
			// If triggered :
			//	- after upload, download, update, read -> artifacts.size = 1, (request, response) from these services
			//	- after readAll, search -> the results of these services, (request, response) from these services
			// 	- on request -> artifacts.size = 0, , (request, response) sent by user
			@Override
			public List<Object> runService(Request req, Response res, List<? extends AbstractPersistentClass> artifacts) {
				List<Object> input = new ArrayList<Object>();

				// Create the input objects to your service and use (or not) the artifacts

				return this.exeService(input);
			}
		
			@Override
			public List<Object> exeService(List<Object> input) {
				List<Object> output = new ArrayList<Object>();
				if(!this.testInput(input))
					return output;
				«IF !simpleService.input.empty»
					«{position = 0; null}»

					// Take your inputs
				«ENDIF»
				«FOR input : simpleService.input as EList<AbstractEntity>»
					// «input.name» «input.name.toLowerCase»«position» = «input.name».class.cast(input.get(«position»));
					«{position++; null}»
				«ENDFOR»
				«IF !simpleService.input.empty»

					// Create your outputs (do something!)
				«ENDIF»
				«FOR output : simpleService.output as EList<AbstractEntity>»
					output.add(new «output.name»());
				«ENDFOR»

				return output;
			}
		}
	'''
}