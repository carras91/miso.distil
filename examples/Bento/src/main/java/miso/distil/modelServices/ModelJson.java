package miso.distil.modelServices;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import spark.Request;
import spark.Response;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletException;
import javax.servlet.http.Part;

import miso.carrascal.cloudModelServices.abstractServices.RecordDB;
import miso.carrascal.cloudModelServices.abstractServices.basic.BasicAbstractJson;
import miso.distil.modelServices.Model;
import miso.distil.modelServices.basic.BasicModelParam;

/**
 * Auto-generated custom json methods.
 * 
 * @author miso.distil.codeGenerator.
 */
public class ModelJson extends BasicAbstractJson<Model> {

	 /**
	 * Auto-generated empty constructor.
	 */
	 public ModelJson() {
	 	super(Model.class);	
	 }

	/**
	 * Auto-generated method to cusomice the update method.
	 * 
	 * @param req Spark request.
	 * @param res Spark response.
	 * @return Model updated or null if error.
	 */
	@Override
	public Model postUpdate(Request req, Response res) {
		// Basic Params
		Map<String, String> map = parseRequest(req, BasicModelParam.values());
		String id = map.get(BasicModelParam.IdPost);

		// Required params

		try {
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}

		// Read old Model and his InputStream
		Model oldModel = RecordDB.getDefault().readOne(id, classType);
		InputStream IS = RecordDB.getDefault().getInputStream(id, classType);
		if(oldModel == null || IS == null) {
			return null;
		}

		// Not required params and artifact's id
		// complete these params!
		String namemodel = "model name or not model name (updated)";
		String type = "type (updated)";

		//Composed params
		
		// Create new Model
		Model newModel = new Model(oldModel.getFilename(), oldModel.getFilesize(), namemodel, type);

		// Save new Model and delete old Model
		if(RecordDB.getDefault().save(newModel, IS)) {
			if(!RecordDB.getDefault().delete(id, classType)) {
				return null;
			} else {
				return newModel;
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
	 * @return Model uploaded or null if error.
	 */
	@Override
	public Model postUpload(Request req, Response res) {
		// There is a file
		MultipartConfigElement multipartConfigElement = new MultipartConfigElement("/tmp");
		req.raw().setAttribute("org.eclipse.multipartConfig", multipartConfigElement);

		try {
			// File Information
			Part filePart = req.raw().getPart(BasicModelParam.File);
		    String fileName = getFileName(filePart);
			long fileSize = filePart.getSize();
		    InputStream fileContent = filePart.getInputStream();

			// Required params

			if(fileContent == null || fileName == null) {
				return null;
			}
			if(fileName.isEmpty() ) {
				return null;
			}

			// Not required params and artifact's id
			// complete these params!
			String namemodel = "model name or not model name";
			String type = "type";
			
			//Composed params

			// Create new Model
			Model model = new Model(fileName, fileSize, namemodel, type);

			if(!RecordDB.getDefault().save(model, fileContent)) {
				return null;
			}

			return model;

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
