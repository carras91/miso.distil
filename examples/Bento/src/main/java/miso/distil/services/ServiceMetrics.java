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
public class ServiceMetrics extends ServiceAbstractJson {

	/**
	 * Auto-generated service constructor.
	 */
	public ServiceMetrics() {
		// Input classes
		addInputClass(Model.class);
		// Output classes
		addOutputClass(Model.class);
	}

	@Override
	protected List<Object> prepareService(Request req, Response res, List<? extends Persistent> artifacts) {
		List<Object> input = new ArrayList<Object>();

		// Create the input objects to your service and use (or not) the artifacts
		System.out.println("Metrics has started");
		return input;
	}

	@Override
	protected List<Object> exeService(List<Object> input) {
		List<Object> output = new ArrayList<Object>();
		if(!this.testInput(input))
			return output;

		// Take your inputs
		Model model = Model.class.cast(input.get(0));
		// do something!

		// Create your outputs (do something!)
		output.add(model);

		System.out.println("Metrics has finished");
		return output;
	}
}
