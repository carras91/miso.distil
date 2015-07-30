package miso.distil.services;

import java.util.ArrayList;
import java.util.List;

import spark.Request;
import spark.Response;
import miso.carrascal.cloudModelServices.abstractServices.services.ServiceAbstractJson;
import miso.carrascal.cloudModelServices.abstractServices.Persistent;
import miso.carrascal.cloudModelServices.abstractServices.RecordDB;
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
	 * - after upload, download, update, read - artifacts.size = 1, (request, response) from these services
	 * - after readAll, search -> the results of these services, (request, response) from these services
	 * - on request -> artifacts.size = 0, , (request, response) sent by user
	 * 
	 * @author miso.distil.codeGenerator
	 */
	@Override
	protected List<Object> prepareService(Request req, Response res, List<? extends Persistent> artifacts) {
		List<Object> input = new ArrayList<Object>();
		System.out.println("Starting prepare service ComparePictures");

		// Create the input objects to your service and use (or not) the artifacts
		input.add(new Picture());
		
		System.out.println("Finishing prepare service ComparePictures");

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
		System.out.println("Starting execute service ComparePictures");
		if(!this.testInput(input))
			return output;

		// Take your inputs
		PersonalData personaldata = PersonalData.class.cast(input.get(0));
		// : do something!
		List<Picture> pictures = RecordDB.getDefault().search("source", personaldata.getSource(), false, Picture.class);
		pictures.addAll(RecordDB.getDefault().search("fileextension", personaldata.getFileextension(), false, Picture.class));
		
		// Create your outputs (do something!)
		output.add(pictures);
		System.out.println("Finishing execute service ComparePictures");

		return output;
	}
}
