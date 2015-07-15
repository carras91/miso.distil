package miso.distil.modelServices;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.List;

import spark.Request;
import spark.Response;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletException;
import javax.servlet.http.Part;

import miso.carrascal.cloudModelServices.abstractServices.RecordDB;
import miso.carrascal.cloudModelServices.abstractServices.basic.BasicAbstractJson;

import miso.distil.modelServices.Model;
import miso.distil.modelServices.basic.BasicModelCodes;
import miso.distil.modelServices.basic.BasicModelParam;

/**
 * Auto-generated custom json methods
 * 
 * @author miso.distil.codeGenerator
 */
public class ModelJson extends BasicAbstractJson {

	/**
	 * Auto-generated empty constructor
	 * 
	 * @author miso.distil.codeGenerator
	 */
	public ModelJson() {
		super(Model.class);	
	}

	/**
	 * Auto-generated method to cusomice the update method
	 * 
	 * @author miso.distil.codeGenerator
	 */
	@Override
	public Object postUpdate(Request req, Response res) {
		// Basic Params
		Map<String, String> map = parseRequest(req, BasicModelParam.values());
		String id = map.get(BasicModelParam.IdPost);

		// Required params

		try {
		} catch(Exception e) {
			e.printStackTrace();
			return BasicModelCodes.Param_error;
		}

		// Read old Model and his InputStream
		Model oldModel = (Model) RecordDB.getDefault().readOne(id, classType);
		InputStream IS = RecordDB.getDefault().getInputStream(id, classType);
		if(oldModel == null || IS == null) {
			return BasicModelCodes.DB_notfound;
		}

		// Not required params and artifact's id
		// TODO : complete these params!
		String nameModel = null;
		List<String> type = null;

		//Composed params
		
		// Create new Model
		Model newModel = new Model(oldModel.getObjectName(), oldModel.getFileSize(), nameModel, type);

		// Save new Model and delete old Model
		if(RecordDB.getDefault().save(newModel, IS)) {
			if(!RecordDB.getDefault().delete(id, classType)) {
				return BasicModelCodes.DB_notfound;
			} else {
				return newModel;
			}
		} else {
			return BasicModelCodes.DB_notupdated;
		}
	}

	/**
	 * Auto-generated method to cusomice the upload method
	 * 
	 * @author miso.distil.codeGenerator
	 */
	@Override
	public Object postUpload(Request req, Response res) {
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
				return BasicModelCodes.Param_emptyfile;
			}
			if(fileName.isEmpty() ) {
				return BasicModelCodes.Param_emptyfile;
			}

			// Not required params and artifact's id
			// TODO : complete these params!
			String nameModel = null;
			List<String> type = null;

			//Composed params

			// Create new Model
			Model model = new Model(fileName, fileSize, nameModel, type);

			if(!RecordDB.getDefault().save(model, fileContent)) {
				return BasicModelCodes.DB_notuploaded;
			}

			return model;

		} catch (IOException e) {
			e.printStackTrace();
			return BasicModelCodes.Param_corruptfile;
		} catch (ServletException e) {
			e.printStackTrace();
			return BasicModelCodes.Param_corruptfile;
		} catch (Exception e) {
			e.printStackTrace();
			return BasicModelCodes.Param_error;
		}
	}
}
