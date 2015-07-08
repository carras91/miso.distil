package miso.carrascal.cloudModelServices.abstractServices.basic;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import miso.carrascal.cloudModelServices.abstractServices.AbstractPersistentClass;
import miso.carrascal.cloudModelServices.abstractServices.RecordDB;
import miso.carrascal.cloudModelServices.utils.DownloadUtils;
import spark.Request;
import spark.Response;

public abstract class BasicAbstractJson implements BasicInterfaceJson {
	
	protected Class<? extends AbstractPersistentClass> classType;
	
	public BasicAbstractJson(Class<? extends AbstractPersistentClass> classType) {
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
	
	public AbstractPersistentClass getRead(Request req, Response res) {
		HashMap<String, String> map = parseRequest(req, BasicAbstractParam.values());
		String id = map.get(BasicAbstractParam.IdGet);
		
		return RecordDB.getDefault().readOne(id, classType);
	}
	
	public ArrayList<? extends AbstractPersistentClass> getReadAll(Request req, Response res) {
		return RecordDB.getDefault().readAll(classType); 
	}
	
	public List<String> getSynonymesQuery(Request req, Response res) {
		HashMap<String, String> map = parseRequest(req, BasicAbstractParam.values());
		String search_query = map.get(BasicAbstractParam.Search_query).toLowerCase();
	    Boolean synonyms_query = map.get(BasicAbstractParam.Synonyms_query).equalsIgnoreCase("true");
		
	    List<String> result = new ArrayList<String>();
		
		if(synonyms_query) {
			result = RecordDB.getDefault().getSynonymes(search_query);
		} else {
			result.add(search_query);
		}
		return result;
	}
	
	public List<String> getSynonymesValue(Request req, Response res) {
		HashMap<String, String> map = parseRequest(req, BasicAbstractParam.values());
		String search_value = map.get(BasicAbstractParam.Search_value).toLowerCase();
	    Boolean synonyms_value = map.get(BasicAbstractParam.Synonyms_value).equalsIgnoreCase("true");
	    
		List<String> result = new ArrayList<String>();
		
		if(synonyms_value) {
			result = RecordDB.getDefault().getSynonymes(search_value);
		} else {
			result.add(search_value);
		}
		return result;
	}
		
	public ArrayList<? extends AbstractPersistentClass> getSearch(Request req, Response res) {	
		HashMap<String, String> map = parseRequest(req, BasicAbstractParam.values());
		String search_query = map.get(BasicAbstractParam.Search_query).toLowerCase();
		String search_value = map.get(BasicAbstractParam.Search_value).toLowerCase();
	    Boolean synonyms_query = map.get(BasicAbstractParam.Synonyms_query).equalsIgnoreCase("true");
	    Boolean synonyms_value = map.get(BasicAbstractParam.Synonyms_value).equalsIgnoreCase("true");
	    
	    ArrayList<? extends AbstractPersistentClass> objects;
		if(search_query.equalsIgnoreCase("tags")) {
			objects = RecordDB.getDefault().searchTag(search_value, synonyms_query, classType);
		} else {
			objects = RecordDB.getDefault().search(search_query, synonyms_query, search_value, synonyms_value, classType);
		}
		
        return objects;
	}

	public String getDownloadZip(Request req, Response res) {
		HashMap<String, String> map = parseRequest(req, BasicAbstractParam.values());
		String id = map.get(BasicAbstractParam.IdGet);
		
		AbstractPersistentClass object = RecordDB.getDefault().readOne(id, classType);
		if(object == null) {
			return BasicAbstractCodes.DB_notfound;
		}
		
		try {
			DownloadUtils.downloadZip(res.raw(), RecordDB.getDefault().getInputStream(id, classType), object.getObjectName(), object.getObjectName());
		    return BasicAbstractCodes.OK;
		    
		} catch (IOException e) {
			e.printStackTrace();
		    return BasicAbstractCodes.DB_corrupt;
		}
	}
	
	public String getDownloadFile(Request req, Response res) {
		HashMap<String, String> map = parseRequest(req, BasicAbstractParam.values());
		String id = map.get(BasicAbstractParam.IdGet);
		
		AbstractPersistentClass object = RecordDB.getDefault().readOne(id, classType);
		if(object == null) {
			return BasicAbstractCodes.DB_notfound;
		}
		
		try {
			DownloadUtils.downloadFile(res.raw(), RecordDB.getDefault().getInputStream(id, classType), object.getObjectName());
		    return BasicAbstractCodes.OK;
		    
		} catch (IOException e) {
			e.printStackTrace();
		    return BasicAbstractCodes.DB_corrupt;
		}
	}
}