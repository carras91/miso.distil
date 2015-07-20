package miso.carrascal.cloudModelServices.abstractServices.basic;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import miso.carrascal.cloudModelServices.abstractServices.Persistent;
import miso.carrascal.cloudModelServices.abstractServices.RecordDB;
import miso.carrascal.cloudModelServices.utils.DownloadUtils;
import spark.Request;
import spark.Response;

public abstract class BasicAbstractJson implements BasicInterfaceJson {
	
	protected Class<? extends Persistent> classType;
	
	public BasicAbstractJson(Class<? extends Persistent> classType) {
		 this.classType = classType;
	}
	
	public String postDelete(Request req, Response res) {
		HashMap<String, String> map = parseRequest(req, BasicAbstractParam.values());
		String id = map.get(BasicAbstractParam.IdPost);

		if(!RecordDB.getDefault().delete(id, classType)) {
			return BasicAbstractCodes.DB_notfound; 
		}
		
		return BasicAbstractCodes.OK;
	}
	
	public Persistent getRead(Request req, Response res) {
		HashMap<String, String> map = parseRequest(req, BasicAbstractParam.values());
		String id = map.get(BasicAbstractParam.IdGet);
		
		return RecordDB.getDefault().readOne(id, classType);
	}
	
	public ArrayList<? extends Persistent> getReadAll(Request req, Response res) {
		return RecordDB.getDefault().readAll(classType); 
	}
	
	public List<String> getSynonymesValue(Request req, Response res) {
		HashMap<String, String> map = parseRequest(req, BasicAbstractParam.values());
		String search_value = map.get(BasicAbstractParam.Search_value).toLowerCase();
	    Boolean search_synonyms = map.get(BasicAbstractParam.Search_synonyms).equalsIgnoreCase("true");
	    
		List<String> result = new ArrayList<String>();
		
		if(search_synonyms) {
			result = RecordDB.getDefault().getSynonymes(search_value);
		} else {
			result.add(search_value);
		}
		
		return result;
	}
		
	public ArrayList<? extends Persistent> getSearch(Request req, Response res) {	
		HashMap<String, String> map = parseRequest(req, BasicAbstractParam.values());
		String search_query = map.get(BasicAbstractParam.Search_query).toLowerCase();
		String search_value = map.get(BasicAbstractParam.Search_value).toLowerCase();
	    Boolean search_syonyms = map.get(BasicAbstractParam.Search_synonyms).equalsIgnoreCase("true");

		return RecordDB.getDefault().search(search_query, search_value, search_syonyms, classType);
	}

	public String getDownloadZip(Request req, Response res) { 
		HashMap<String, String> map = parseRequest(req, BasicAbstractParam.values());
		String id = map.get(BasicAbstractParam.IdGet);
		
		Persistent object = RecordDB.getDefault().readOne(id, classType);
		if(object == null) {
			return BasicAbstractCodes.DB_notfound;
		}
		
		try {
			DownloadUtils.downloadZip(res.raw(), RecordDB.getDefault().getInputStream(id, classType), object.getObjectname(), object.getObjectname());
		    return BasicAbstractCodes.OK;
		    
		} catch (IOException e) {
			e.printStackTrace();
		    return BasicAbstractCodes.DB_corrupt;
		}
	}
	
	public String getDownloadFile(Request req, Response res) {
		HashMap<String, String> map = parseRequest(req, BasicAbstractParam.values());
		String id = map.get(BasicAbstractParam.IdGet);
		
		Persistent object = RecordDB.getDefault().readOne(id, classType);
		if(object == null) {
			return BasicAbstractCodes.DB_notfound;
		}
		
		try {
			DownloadUtils.downloadFile(res.raw(), RecordDB.getDefault().getInputStream(id, classType), object.getObjectname());
		    return BasicAbstractCodes.OK;
		    
		} catch (IOException e) {
			e.printStackTrace();
		    return BasicAbstractCodes.DB_corrupt;
		}
	}
}
