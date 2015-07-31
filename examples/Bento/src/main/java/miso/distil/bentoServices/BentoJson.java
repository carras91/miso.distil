package miso.distil.bentoServices;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;

import spark.Request;
import spark.Response;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletException;
import javax.servlet.http.Part;

import miso.carrascal.cloudModelServices.abstractServices.RecordDB;
import miso.carrascal.cloudModelServices.abstractServices.basic.BasicAbstractJson;
import miso.distil.bentoServices.Bento;
import miso.distil.bentoServices.basic.BasicBentoParam;

/**
 * Auto-generated custom json methods.
 * 
 * @author miso.distil.codeGenerator.
 */
public class BentoJson extends BasicAbstractJson<Bento> {

	 /**
	 * Auto-generated empty constructor.
	 */
	 public BentoJson() {
	 	super(Bento.class);	
	 }

	/**
	 * Auto-generated method to cusomice the update method.
	 * 
	 * @param req Spark request.
	 * @param res Spark response.
	 * @return Bento updated or null if error.
	 */
	@Override
	public Bento postUpdate(Request req, Response res) {
		// Basic Params
		Map<String, String> map = parseRequest(req, BasicBentoParam.values());
		String id = map.get(BasicBentoParam.IdPost);

		// Required params

		try {
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}

		// Read old Bento and his InputStream
		Bento oldBento = RecordDB.getDefault().readOne(id, classType);
		InputStream IS = RecordDB.getDefault().getInputStream(id, classType);
		if(oldBento == null || IS == null) {
			return null;
		}

		// Not required params and artifact's id
		// complete these params!
		List<String> inputconcepts = new ArrayList<String>();
		inputconcepts.add("i am inputConcept updated");
		List<String> outputconcepts = new ArrayList<String>();
		outputconcepts.add("i am outputConcept updated");
		List<String> atl = new ArrayList<String>();
		atl.add("i am atl updated");
		List<String> tags = new ArrayList<String>();
		tags.add("i am tag updated");

		//Composed params
		
		// Create new Bento
		Bento newBento = new Bento(oldBento.getFilename(), oldBento.getFilesize(), inputconcepts, outputconcepts, atl, tags);

		// Save new Bento and delete old Bento
		if(RecordDB.getDefault().save(newBento, IS)) {
			if(!RecordDB.getDefault().delete(id, classType)) {
				return null;
			} else {
				return newBento;
			}
		} else {
			return null;
		}
	}

	/**
	 * Auto-generated method to cusomice the upload method
	 * 
	 * @param req Spark request.
	 * @param res Spark response.
	 * @return Bento uploaded or null if error.
	 */
	@Override
	public Bento postUpload(Request req, Response res) {
		// There is a file
		MultipartConfigElement multipartConfigElement = new MultipartConfigElement("/tmp");
		req.raw().setAttribute("org.eclipse.multipartConfig", multipartConfigElement);

		try {
			// File Information
			Part filePart = req.raw().getPart(BasicBentoParam.File);
		    String fileName = getFileName(filePart);
			long fileSize = filePart.getSize();
		    InputStream fileContent = filePart.getInputStream();

			// Required params

			if(fileContent == null || fileName == null) {
				return null;
			}
			if(fileName.isEmpty() || !fileName.endsWith(".bentoz")) {
				return null;
			}

			// Not required params and artifact's id
			// complete these params!
			List<String> inputconcepts = new ArrayList<String>();
			inputconcepts.add("i am inputConcept");
			List<String> outputconcepts = new ArrayList<String>();
			outputconcepts.add("i am outputConcept");
			List<String> atl = new ArrayList<String>();
			atl.add("i am atl");
			List<String> tags = new ArrayList<String>();
			tags.add("i am tag");

			//Composed params

			// Create new Bento
			Bento bento = new Bento(fileName, fileSize, inputconcepts, outputconcepts, atl, tags);

			if(!RecordDB.getDefault().save(bento, fileContent)) {
				return null;
			}

			return bento;

		} catch (IOException e) {
			e.printStackTrace();
			return null;
		} catch (ServletException e) {
			e.printStackTrace();
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
