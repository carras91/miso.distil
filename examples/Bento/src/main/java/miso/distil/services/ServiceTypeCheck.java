package miso.distil.services;

import java.util.ArrayList;
import java.util.List;

import spark.Request;
import spark.Response;
import miso.carrascal.cloudModelServices.abstractServices.services.ServiceAbstractJson;
import miso.carrascal.cloudModelServices.abstractServices.Persistent;
import miso.distil.modelServices.Model;

/**
 * Auto-generated service class
 * 
 * @author miso.distil.codeGenerator
 */
public class ServiceTypeCheck extends ServiceAbstractJson {

	/**
	 * Auto-generated service constructor
	 * 
	 * @author miso.distil.codeGenerator
	 */
	public ServiceTypeCheck() {
		// Input classes
		// Output classes
		addOutputClass(Model.class);
	}

	/**
	 * Method called automatically
	 * If triggered :
	 * - after upload, download, update, read -> artifacts.size = 1, (request, response) from these services
	 * - after readAll, search -> the results of these services, (request, response) from these services
	 * - on request -> artifacts.size = 0, , (request, response) sent by user
	 * 
	 * @author miso.distil.codeGenerator
	 */
	@Override
	public List<Object> runService(Request req, Response res, List<? extends Persistent> artifacts) {
		List<Object> input = new ArrayList<Object>();

		// Create the input objects to your service and use (or not) the artifacts

		System.out.println("TypeCheck has started");

		return this.exeService(input);
	}

	/**
	 * Execution method. It uses an object's list (see the constructor input order) and generates other object's list (see the constructor output order)
	 * 
	 * @author miso.distil.codeGenerator
	 */
	@Override
	public List<Object> exeService(List<Object> input) {
		List<Object> output = new ArrayList<Object>();
		if(!this.testInput(input))
			return output;
		// do something!

		// Create your outputs (do something!)
		String type = "model type";
		output.add(new Model("object name", 42, "model name", type));
		
		System.out.println("TypeCheck has finished");

		return output;
	}
}
