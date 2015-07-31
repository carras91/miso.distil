package miso.carrascal.cloudModelServices.abstractServices.basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import miso.carrascal.cloudModelServices.abstractServices.Persistent;
import miso.carrascal.cloudModelServices.abstractServices.RecordDB;
import miso.carrascal.cloudModelServices.utils.RecordDownload;
import spark.Request;
import spark.Response;

/**
 * Interface with basic services. Not to be overwrited!.
 * It uses RecordDB.getDefault() methods.
 * 
 * @author Carlos Carrascal.
 *
 * @param <T> Type of artifact.
 */
public abstract class BasicAbstractJson<T extends Persistent> implements BasicInterfaceJson<T> {
	
	/**
	 * Class of artifact.
	 */
	protected Class<T> classType;
	
	/**
	 * Constructor. 
	 * 
	 * @param classType Class of artifact to be treated.
	 */
	public BasicAbstractJson(Class<T> classType) {
		 this.classType = classType;
	}

	/**
	 * Method to delete an artifact with BasicAbstractParam.IdPost inside request.
	 * 
	 * @param req Spark post request.
	 * @param res Spark response.
	 * @return Artifact deleted. If error, null.
	 */
	public T postDelete(Request req, Response res) {
		HashMap<String, String> map = parseRequest(req, BasicAbstractParam.values());
		String id = map.get(BasicAbstractParam.IdPost);
		T delete = RecordDB.getDefault().readOne(id, classType);

		RecordDB.getDefault().delete(id, classType);
		return delete;
	}
	
	/**
	 * Method to read an artifact with BasicAbstractParam.IdPost inside request.
	 * 
	 * @param req Spark get request.
	 * @param res Spark response.
	 * @return Artifact read. If error, null.
	 */
	public T getRead(Request req, Response res) {
		HashMap<String, String> map = parseRequest(req, BasicAbstractParam.values());
		String id = map.get(BasicAbstractParam.IdGet);
		
		return RecordDB.getDefault().readOne(id, classType);
	}
	
	/**
	 * Method to read all artifacts in the database.
	 * 
	 * @param req Spark get request.
	 * @param res Spark response.
	 * @return List of artifacts read. If error, null.
	 */
	public ArrayList<T> getReadAll(Request req, Response res) {
		return RecordDB.getDefault().readAll(classType); 
	}
	
	/**
	 * Method to get the synonyms of BasicAbstractParam.Search_value inside request.
	 * 
	 * @param req Spark get request.
	 * @param res Spark response.
	 * @return List of synonyms.
	 */
	public List<String> getSynonymsValue(Request req, Response res) {
		HashMap<String, String> map = parseRequest(req, BasicAbstractParam.values());
		String search_value = map.get(BasicAbstractParam.Search_value).toLowerCase();
	    Boolean search_synonyms = map.get(BasicAbstractParam.Search_synonyms).equalsIgnoreCase("true");
	    
		List<String> result = new ArrayList<String>();
		
		if(search_synonyms) {
			result = RecordDB.getDefault().getSynonyms(search_value);
		} else {
			result.add(search_value);
		}
		
		return result;
	}
		
	/**
	 * Method to search the artifacts by BasicAbstractParam.Search_query with value BasicAbstractParam.Search_value, using synonyms given by BasicAbstractParam.Search_synonyms.
	 * 
	 * @param req Spark get request.
	 * @param res Spark response.
	 * @return List of artifacts found.
	 */
	public ArrayList<T> getSearch(Request req, Response res) {	
		HashMap<String, String> map = parseRequest(req, BasicAbstractParam.values());
		String search_query = map.get(BasicAbstractParam.Search_query).toLowerCase();
		String search_value = map.get(BasicAbstractParam.Search_value).toLowerCase();
	    Boolean search_syonyms = map.get(BasicAbstractParam.Search_synonyms).equalsIgnoreCase("true");

		return RecordDB.getDefault().search(search_query, search_value, search_syonyms, classType);
	}
	
	/**
	 * Method to download an artifact with BasicAbstractParam.IdGet inside request.
	 * 
	 * @param req Spark get request.
	 * @param res Spark response.
	 * @return Artifact downloaded. If error, null.
	 */
	public T getDownload(Request req, Response res) {
		HashMap<String, String> map = parseRequest(req, BasicAbstractParam.values());
		String id = map.get(BasicAbstractParam.IdGet);
		
		T object = RecordDB.getDefault().readOne(id, classType);
		if(object == null) {
			try {
				return classType.newInstance();
			} catch (InstantiationException | IllegalAccessException e) {
				e.printStackTrace();
				return null;
			}
		}
		
		RecordDownload.addDownload(res, RecordDB.getDefault().getInputStream(id, classType), object.getFilename());
		return object;
	}
}
