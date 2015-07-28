package miso.distil.services;

import java.util.ArrayList;
import java.util.List;

import spark.Request;
import spark.Response;
import miso.carrascal.cloudModelServices.abstractServices.services.ServiceAbstractJson;
import miso.carrascal.cloudModelServices.abstractServices.Persistent;
import miso.distil.entities.PersonalData;
import miso.distil.pictureServices.Picture;

/**
 * Auto-generated service class
 * 
 * @author miso.distil.codeGenerator
 */
public class ServiceComparePictures extends ServiceAbstractJson {

	/**
	 * Auto-generated service constructor
	 * 
	 * @author miso.distil.codeGenerator
	 */
	public ServiceComparePictures() {
		// Input classes
		addInputClass(PersonalData.class);
		// Output classes
		addOutputClass((new ArrayList<Picture>()).getClass());
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

		// Create the input objects to your service and use (or not) the artifacts
		input.add(new Picture());

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
		PersonalData personaldata = PersonalData.class.cast(input.get(0));
		// : do something!
		ArrayList<Picture> pictures = new ArrayList<Picture>();
		Picture picture = new Picture("unknown", 0, personaldata, new ArrayList<String>(), "nowhere", false);
		Picture picture1 = new Picture("unknown", 1, personaldata, new ArrayList<String>(), "nowhere", false);
		
		pictures.add(picture);
		pictures.add(picture1);
		// Create your outputs (do something!)
		output.add(pictures);

		return output;
	}
}
