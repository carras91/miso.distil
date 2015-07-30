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
public class ServiceMetrics extends ServiceAbstractJson {

	/**
	 * Auto-generated service constructor
	 * 
	 * @author miso.distil.codeGenerator
	 */
	public ServiceMetrics() {
		// Input classes
		addInputClass(Model.class);
		// Output classes
		addOutputClass(Model.class);
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

		//  Create the input objects to your service and use (or not) the artifacts

		System.out.println("Metrics has started");
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

		// Take your inputs
		Model model = Model.class.cast(input.get(0));
		// do something!

		// Create your outputs (do something!)
		output.add(model);

		System.out.println("Metrics has finished");
		return output;
	}
}
