package miso.distil.codeGenerator.generator.services

import com.google.inject.Inject
import codeGeneratorModel.SimpleService
import codeGeneratorModel.Artifact
import org.eclipse.emf.common.util.EList
import java.util.ArrayList
import codeGeneratorModel.Entity
import codeGeneratorModel.Inout

/*
 * To write XXXService.java
 * 
 * @author Carlos Carrascal
 */
class generateSimpleService {
	
	@Inject miso.distil.codeGenerator.generator.Names names
	
	/*
	 * To write <simpleService.name>Service.java
	 * 
	 * @author Carlos Carrascal
	 */		
	def write(SimpleService simpleService) '''
		«var position = 0»
		«var nameList = new ArrayList<String>()»
		package «names.ServicesCha»;

		import java.util.ArrayList;
		import java.util.List;

		import spark.Request;
		import spark.Response;
		
		import «names.MisoServices».ServiceAbstractJson;
		import «names.MisoAbstract».Persistent;

		«FOR input : simpleService.input as EList<Inout>»
			«IF !nameList.contains(input.type.name)»
				«IF input.type instanceof Artifact»
					import «names.getArtifactFileChar(input.type as Artifact)»;
				«ELSE»
					import «names.getEntityFileChar(input.type as Entity)»;
				«ENDIF»
				«{nameList.add(input.type.name); null}»
			«ENDIF»
		«ENDFOR»
		«FOR output : simpleService.output as EList<Inout>»
			«IF !nameList.contains(output.type.name)»
				«IF output.type instanceof Artifact»
					import «names.getArtifactFileChar(output.type as Artifact)»;
				«ELSE»
					import «names.getEntityFileChar(output.type as Entity)»;
				«ENDIF»
				«{nameList.add(output.type.name); null}»
			«ENDIF»
		«ENDFOR»
		«IF !nameList.empty»

		«ENDIF»
		/**
		 * Auto-generated service class
		 * 
		 * @author miso.distil.codeGenerator
		 */
		public class Service«simpleService.name» extends ServiceAbstractJson {

			/**
			 * Auto-generated service constructor
			 * 
			 * @author miso.distil.codeGenerator
			 */
			public Service«simpleService.name»() {
				// Input classes
				«FOR input : simpleService.input as EList<Inout>»
					«IF !input.many»
						addInputClass(«input.type.name».class);
					«ELSE»
						addInputClass((new ArrayList<«input.type.name»>()).getClass());
					«ENDIF»
				«ENDFOR»
				// Output classes
				«FOR output : simpleService.output as EList<Inout>»
					«IF !output.many»
						addOutputClass(«output.type.name».class);
					«ELSE»
						addOutputClass((new ArrayList<«output.type.name»>()).getClass());
					«ENDIF»
				«ENDFOR»
			}

			/**
			 * Method called automatically to prepare the inputs
			 * If triggered :
			 * - after upload, download, update, read -> artifacts.size = 1, (request, response) from these services
			 * - after readAll, search -> the results of these services, (request, response) from these services
			 * - on request -> artifacts.size = 0, , (request, response) sent by user
			 * 
			 * @author miso.distil.codeGenerator
			 */
			@Override
			protected List<Object> prepareService(Request req, Response res, List<? extends Persistent> artifacts) {
				List<Object> input = new ArrayList<Object>();

				// TODO : Create the input objects to your service and use (or not) the artifacts

				return input;
			}

			/**
			 * Execution method. It uses prepareService return and generates other object's list (see the constructor output order)
			 * 
			 * @author miso.distil.codeGenerator
			 */
			@Override
			protected List<Object> exeService(List<Object> input) {
				List<Object> output = new ArrayList<Object>();
				if(!this.testInput(input))
					return output;
				«IF !simpleService.input.empty»
					«{position = 0; null}»

					// Take your inputs
				«ENDIF»
				«FOR input : simpleService.input as EList<Inout>»
					«IF input.many»
					// List<«input.type.name» «input.type.name.toLowerCase»«position» = (new ArrayList<«input.type.name»>()).getClass().cast(input.get(«position»));
					«ELSE»
					// «input.type.name» «input.type.name.toLowerCase»«position» = «input.type.name».class.cast(input.get(«position»));
					«ENDIF»
					«{position++; null}»
				«ENDFOR»
				// TODO : do something!
				«IF !simpleService.output.empty»

					// Create your outputs (do something!)
				«ENDIF»
				«FOR output : simpleService.output as EList<Inout>»
					«IF output.many»
						output.add(new ArrayList<«output.type.name»>());
					«ELSE»
						output.add(new «output.type.name»());
					«ENDIF»
				«ENDFOR»

				return output;
			}
		}
	'''
}