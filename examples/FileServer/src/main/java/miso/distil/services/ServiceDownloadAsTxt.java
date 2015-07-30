package miso.distil.services;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import spark.Request;
import spark.Response;
import spark.utils.IOUtils;
import miso.carrascal.cloudModelServices.abstractServices.services.ServiceAbstractJson;
import miso.carrascal.cloudModelServices.abstractServices.Persistent;
import miso.carrascal.cloudModelServices.abstractServices.RecordDB;
import miso.distil.documentServices.Document;

/**
 * Auto-generated service class
 * 
 * @author miso.distil.codeGenerator
 */
public class ServiceDownloadAsTxt extends ServiceAbstractJson {

	/**
	 * Auto-generated service constructor
	 * 
	 * @author miso.distil.codeGenerator
	 */
	public ServiceDownloadAsTxt() {
		// Input classes
		addInputClass(Document.class);
		// Output classes
		addOutputClass(Document.class);
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
		System.out.println("Starting prepare service DownloadAsTxt");

		// Create the input objects to your service and use (or not) the artifacts
		if(artifacts.size() == 1) {
			input.add(artifacts.get(0));
		} else {
			input.add(new Document());
		}
		System.out.println("Finishing prepare service DownloadAsTxt");

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
		System.out.println("Starting execute service DownloadAsTxt");
		if(!this.testInput(input))
			return output;

		// Take your inputs
		Document document = Document.class.cast(input.get(0));
		// do something!
		
		InputStream IS = RecordDB.getDefault().getInputStream(document.getObjectid(), Document.class);
		String string = "Not found";
		try {
			string = IOUtils.toString(IS);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Create your outputs (do something!)
		output.add(string);
		System.out.println("Finishing execute service DownloadAsTxt");

		return output;
	}
}
