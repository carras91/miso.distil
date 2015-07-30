package miso.distil.services;

import java.util.ArrayList;
import java.util.List;

import spark.Request;
import spark.Response;
import miso.carrascal.cloudModelServices.abstractServices.services.ServiceAbstractJson;
import miso.carrascal.cloudModelServices.abstractServices.Persistent;
import miso.distil.documentServices.Document;
import miso.distil.entities.PersonalData;

/**
 * Auto-generated service class
 * 
 * @author miso.distil.codeGenerator
 */
public class ServiceStatisticsDoc extends ServiceAbstractJson {

	/**
	 * Auto-generated service constructor
	 * 
	 * @author miso.distil.codeGenerator
	 */
	public ServiceStatisticsDoc() {
		// Input classes
		addInputClass(Document.class);
		// Output classes
		addOutputClass(PersonalData.class);
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
		System.out.println("Starting prepare service StatisticsDoc");

		//  Create the input objects to your service and use (or not) the artifacts
		if(artifacts.size() == 1) {
			input.add(artifacts.get(0));
		} else {
			input.add(new Document());
		}
		System.out.println("Finishing prepare service StatisticsDoc");

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
		System.out.println("Starting execute service StatisticsDoc");
		if(!this.testInput(input))
			return output;

		// Take your inputs
		Document document = Document.class.cast(input.get(0));
		// do something!

		// Create your outputs (do something!)
		output.add(document.getDocinfo());
		System.out.println("Finishing execute service StatisticsDoc");

		return output;
	}
}
