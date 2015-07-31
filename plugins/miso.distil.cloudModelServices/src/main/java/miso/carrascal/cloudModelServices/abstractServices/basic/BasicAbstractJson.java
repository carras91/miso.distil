package miso.carrascal.cloudModelServices.abstractServices.basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import miso.carrascal.cloudModelServices.abstractServices.Persistent;
import miso.carrascal.cloudModelServices.abstractServices.RecordDB;
import miso.carrascal.cloudModelServices.utils.RecordDownload;
import spark.Request;
import spark.Response;

public abstract class BasicAbstractJson<T extends Persistent> implements BasicInterfaceJson<T> {
	
	protected Class<T> classType;
	
	public BasicAbstractJson(Class<T> classType) {
		 this.classType = classType;
	}

	public T postDelete(Request req, Response res) {
		HashMap<String, String> map = parseRequest(req, BasicAbstractParam.values());
		String id = map.get(BasicAbstractParam.IdPost);
		T delete = RecordDB.getDefault().readOne(id, classType);

		RecordDB.getDefault().delete(id, classType);
		return delete;
	}
	
	public T getRead(Request req, Response res) {
		HashMap<String, String> map = parseRequest(req, BasicAbstractParam.values());
		String id = map.get(BasicAbstractParam.IdGet);
		
		return RecordDB.getDefault().readOne(id, classType);
	}
	
	public ArrayList<T> getReadAll(Request req, Response res) {
		return RecordDB.getDefault().readAll(classType); 
	}
	
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
		
	public ArrayList<T> getSearch(Request req, Response res) {	
		HashMap<String, String> map = parseRequest(req, BasicAbstractParam.values());
		String search_query = map.get(BasicAbstractParam.Search_query).toLowerCase();
		String search_value = map.get(BasicAbstractParam.Search_value).toLowerCase();
	    Boolean search_syonyms = map.get(BasicAbstractParam.Search_synonyms).equalsIgnoreCase("true");

		return RecordDB.getDefault().search(search_query, search_value, search_syonyms, classType);
	}
	
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
