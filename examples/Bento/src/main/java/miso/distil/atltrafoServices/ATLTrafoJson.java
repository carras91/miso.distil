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
import miso.distil.atltrafoServices.basic.BasicATLTrafoCodes;
import miso.distil.atltrafoServices.basic.BasicATLTrafoParam;

/**
 * Auto-generated custom json methods
 * 
 * @author miso.distil.codeGenerator
 */
public class ATLTrafoJson extends BasicAbstractJson {

	/**
	 * Auto-generated empty constructor
	 * 
	 * @author miso.distil.codeGenerator
	 */
	public ATLTrafoJson() {
		super(ATLTrafo.class);	
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
			Part filePart = req.raw().getPart(BasicATLTrafoParam.File);
		    String fileName = getFileName(filePart);
			long fileSize = filePart.getSize();
		    InputStream fileContent = filePart.getInputStream();

			// Required params

			if(fileContent == null || fileName == null) {
				return BasicATLTrafoCodes.Param_emptyfile;
			}
			if(fileName.isEmpty() || !fileName.endsWith(".atl")) {
				return BasicATLTrafoCodes.Param_emptyfile;
			}

			// Not required params and artifact's id
			// TODO : complete these params!
			String nameATL = null;

			//Composed params

			// Create new ATLTrafo
			ATLTrafo atltrafo = new ATLTrafo(fileName, fileSize, nameATL);

			if(!RecordDB.getDefault().save(atltrafo, fileContent)) {
				return BasicATLTrafoCodes.DB_notuploaded;
			}

			return atltrafo;

		} catch (IOException e) {
			e.printStackTrace();
			return BasicATLTrafoCodes.Param_corruptfile;
		} catch (ServletException e) {
			e.printStackTrace();
			return BasicATLTrafoCodes.Param_corruptfile;
		} catch (Exception e) {
			e.printStackTrace();
			return BasicATLTrafoCodes.Param_error;
		}
	}
}
