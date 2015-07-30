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
import miso.distil.metamodelServices.basic.BasicMetaModelCodes;
import miso.distil.metamodelServices.basic.BasicMetaModelParam;

/**
 * Auto-generated custom json methods
 * 
 * @author miso.distil.codeGenerator
 */
public class MetaModelJson extends BasicAbstractJson<MetaModel> {

	/**
	 * Auto-generated empty constructor
	 * 
	 * @author miso.distil.codeGenerator
	 */
	 public MetaModelJson() {
	 	super(MetaModel.class);	
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
			Part filePart = req.raw().getPart(BasicMetaModelParam.File);
		    String fileName = getFileName(filePart);
			long fileSize = filePart.getSize();
		    InputStream fileContent = filePart.getInputStream();

			// Required params

			if(fileContent == null || fileName == null) {
				return BasicMetaModelCodes.Param_emptyfile;
			}
			if(fileName.isEmpty() || !fileName.endsWith(".ecore")) {
				return BasicMetaModelCodes.Param_emptyfile;
			}
			// Not required params and artifact's id
			// complete these params!
			String uri = "URI";

			//Composed params

			// Create new MetaModel
			MetaModel metamodel = new MetaModel(fileName, fileSize, uri);

			if(!RecordDB.getDefault().save(metamodel, fileContent)) {
				return BasicMetaModelCodes.DB_notuploaded;
			}

			return metamodel;

		} catch (IOException e) {
			e.printStackTrace();
			return BasicMetaModelCodes.Param_corruptfile;
		} catch (ServletException e) {
			e.printStackTrace();
			return BasicMetaModelCodes.Param_corruptfile;
		} catch (Exception e) {
			e.printStackTrace();
			return BasicMetaModelCodes.Param_error;
		}
	}
}
