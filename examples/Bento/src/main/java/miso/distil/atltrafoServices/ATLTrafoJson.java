package miso.distil.atltrafoServices;

import java.io.IOException;
import java.io.InputStream;

import spark.Request;
import spark.Response;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletException;
import javax.servlet.http.Part;

import miso.carrascal.cloudModelServices.abstractServices.RecordDB;
import miso.carrascal.cloudModelServices.abstractServices.basic.BasicAbstractJson;
import miso.distil.atltrafoServices.ATLTrafo;
import miso.distil.atltrafoServices.basic.BasicATLTrafoParam;

/**
 * Auto-generated custom json methods.
 * 
 * @author miso.distil.codeGenerator.
 */
public class ATLTrafoJson extends BasicAbstractJson<ATLTrafo> {

	 /**
	 * Auto-generated empty constructor.
	 */
	 public ATLTrafoJson() {
	 	super(ATLTrafo.class);	
	 }

	/**
	 * Auto-generated method to cusomice the upload method
	 * 
	 * @param req Spark request.
	 * @param res Spark response.
	 * @return ATLTrafo uploaded or null if error.
	 */
	@Override
	public ATLTrafo postUpload(Request req, Response res) {
		// There is a file
		MultipartConfigElement multipartConfigElement = new MultipartConfigElement("/tmp");
		req.raw().setAttribute("org.eclipse.multipartConfig", multipartConfigElement);

		try {
			// File Information
			Part filePart = req.raw().getPart(BasicATLTrafoParam.File);
		    String fileName = getFileName(filePart);
			long fileSize = filePart.getSize();
		    InputStream fileContent = filePart.getInputStream();

			// Required params

			if(fileContent == null || fileName == null) {
				return null;
			}
			if(fileName.isEmpty() || !fileName.endsWith(".atl")) {
				return null;
			}

			// Not required params and artifact's id
			// complete these params!
			String nameatl = "nameAtl";

			//Composed params

			// Create new ATLTrafo
			ATLTrafo atltrafo = new ATLTrafo(fileName, fileSize, nameatl);

			if(!RecordDB.getDefault().save(atltrafo, fileContent)) {
				return null;
			}

			return atltrafo;

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
