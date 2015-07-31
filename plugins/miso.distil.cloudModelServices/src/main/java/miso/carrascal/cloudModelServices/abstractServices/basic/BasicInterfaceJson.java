package miso.carrascal.cloudModelServices.abstractServices.basic;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.Part;

import miso.carrascal.cloudModelServices.abstractServices.Persistent;
import spark.Request;
import spark.Response;

/**
 * Interface to be completed by user.
 * 
 * @author Carlos Carrascal.
 *
 * @param <T> Type of artifact.
 */
public interface BasicInterfaceJson<T extends Persistent> {
	
	/**
	 * Method to upload an artifact.
	 * 
	 * @param req Spark request.
	 * @param res Spark response.
	 * @return Artifact uploaded. If error, null.
	 */
	default public T postUpload(Request req, Response res) {
		return null;
	}
	
	/**
	 * Method to update an artifact.
	 * 
	 * @param req Spark request.
	 * @param res Spark response.
	 * @return Artifact updated. If error, null.
	 */
	default public T postUpdate(Request req, Response res) {
		return null;
	}
	
	/**
	 * Method parse the request and find all parameters.
	 * 
	 * @param req Spark request.
	 * @param parameters list of parameters to find.
	 * @return hashmap(parameter, result).
	 */
	default public HashMap<String, String> parseRequest(Request req, List<String> parameters) {
		HashMap<String, String> map = new HashMap<String, String>();
		
		if(req == null) {
			(new NullPointerException()).printStackTrace();
			return map;
		}
		
		for(String parameter : parameters) {
			String result = "";
			if(parameter.startsWith(":")) {
				result = req.params(parameter);
			} else {
				result = req.queryParams(parameter);
			}

			if(result == null)
				result = "";
				
			map.put(parameter, result);
		}
		return map;
	}
	
	/**
	 * Method to find the name of a file.
	 * 
	 * @param part part with file.
	 * @return file name.
	 */
	default String getFileName(final Part part) {
	    for (String content : part.getHeader("content-disposition").split(";")) {
	        if (content.trim().startsWith("filename")) {
	            return content.substring(
	                    content.indexOf('=') + 1).trim().replace("\"", "");
	        }
	    }
	    return null;
	}
}
