package miso.distil.services;

import java.util.ArrayList;
import java.util.List;

import spark.Request;
import spark.Response;
import miso.carrascal.cloudModelServices.abstractServices.services.ServiceAbstractJson;
import miso.carrascal.cloudModelServices.abstractServices.Persistent;
import miso.distil.modelServices.Model;

/**
 * Auto-generated service class.
 * 
 * @author miso.distil.codeGenerator.
 */
public class ServiceTypeCheck extends ServiceAbstractJson {

	/**
	 * Auto-generated service constructor.
	 */
	public ServiceTypeCheck() {
		// Input classes
		// Output classes
		addOutputClass(Model.class);
	}

	@Override
	protected List<Object> prepareService(Request req, Response res, List<? extends Persistent> artifacts) {
		List<Object> input = new ArrayList<Object>();

		// Create the input objects to your service and use (or not) the artifacts
		System.out.println("TypeCheck has started");
		
		return input;
	}

	@Override
	protected List<Object> exeService(List<Object> input) {
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
