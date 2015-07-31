package miso.distil.metamodelServices;

import java.io.IOException;
import java.io.InputStream;

import spark.Request;
import spark.Response;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletException;
import javax.servlet.http.Part;

import miso.carrascal.cloudModelServices.abstractServices.RecordDB;
import miso.carrascal.cloudModelServices.abstractServices.basic.BasicAbstractJson;
import miso.distil.metamodelServices.MetaModel;
import miso.distil.metamodelServices.basic.BasicMetaModelParam;

/**
 * Auto-generated custom json methods.
 * 
 * @author miso.distil.codeGenerator.
 */
public class MetaModelJson extends BasicAbstractJson<MetaModel> {

	 /**
	 * Auto-generated empty constructor.
	 */
	 public MetaModelJson() {
	 	super(MetaModel.class);	
	 }

	/**
	 * Auto-generated method to cusomice the upload method
	 * 
	 * @param req Spark request.
	 * @param res Spark response.
	 * @return MetaModel uploaded or null if error.
	 */
	@Override
	public MetaModel postUpload(Request req, Response res) {
		// There is a file
		MultipartConfigElement multipartConfigElement = new MultipartConfigElement("/tmp");
		req.raw().setAttribute("org.eclipse.multipartConfig", multipartConfigElement);

		try {
			// File Information
			Part filePart = req.raw().getPart(BasicMetaModelParam.File);
		    String fileName = getFileName(filePart);
			long fileSize = filePart.getSize();
		    InputStream fileContent = filePart.getInputStream();

			// Required params

			if(fileContent == null || fileName == null) {
				return null;
			}
			if(fileName.isEmpty() || !fileName.endsWith(".ecore")) {
				return null;
			}

			// Not required params and artifact's id
			// complete these params!
			String uri = "URI";

			//Composed params

			// Create new MetaModel
			MetaModel metamodel = new MetaModel(fileName, fileSize, uri);

			if(!RecordDB.getDefault().save(metamodel, fileContent)) {
				return null;
			}

			return metamodel;

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
