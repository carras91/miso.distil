package miso.carrascal.cloudModelServices;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.gridfs.GridFS;
import com.mongodb.gridfs.GridFSDBFile;
import com.mongodb.gridfs.GridFSInputFile;
import com.mongodb.util.JSON;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import miso.carrascal.cloudModelServices.abstractServices.Persistent;
import miso.carrascal.cloudModelServices.abstractServices.InterfaceDB;
import miso.carrascal.cloudModelServices.utils.DictionaryUtils;
import miso.carrascal.cloudModelServices.utils.NullArgumentException;

import org.bson.types.ObjectId;

import com.carrotsearch.sizeof.RamUsageEstimator;
 
public class MongoDB implements InterfaceDB {

	private MongoClientURI uri;
    private MongoClient client;
    private DB db;
    private HashMap<Class<? extends Persistent>, DBCollection> collections;
    private HashMap<Class<? extends Persistent>, GridFS> gridfs;
 
	public MongoDB(String mongoURI) throws Exception {
       	this.uri  = new MongoClientURI(mongoURI);
		this.client = new MongoClient(uri);
       	this.db = client.getDB(uri.getDatabase());
       	this.collections = new HashMap<Class<? extends Persistent>, DBCollection>();
       	this.gridfs = new HashMap<Class<? extends Persistent>, GridFS>();
    }
    
	private DBCollection getCollection(Class<? extends Persistent> classType) {
		if(collections.containsKey(classType)) {
			return collections.get(classType);
		} else {
			collections.put(classType, db.getCollection(classType.getName()));
	       	gridfs.put(classType, new GridFS(db, classType.getName()));
	       	return collections.get(classType);
		}		
	}
	
	private GridFS getGridFS(Class<? extends Persistent> classType) {
		if(gridfs.containsKey(classType)) {
			return gridfs.get(classType);
		} else {
			collections.put(classType, db.getCollection(classType.getName()));
	       	gridfs.put(classType, new GridFS(db, classType.getName()));
	       	return gridfs.get(classType);
		}		
	}
	
    @SuppressWarnings("deprecation")
    @Override
	public Boolean save(Persistent artifact, InputStream inputStream) {
    	if(artifact == null) {
			(new NullArgumentException()).printStackTrace();
    		return false;
    	}
	
        try {
        	for(Class<? extends Persistent> classType : collections.keySet()) {
            	if(!search("objectname", artifact.getObjectname(), false, classType).isEmpty())
            		return false;
        	}
        	
        	BasicDBObject object = (BasicDBObject)JSON.parse((new Gson()).toJson(artifact)); 
        	System.out.println("object size " + RamUsageEstimator.sizeOf(object) + " max " + client.getMaxBsonObjectSize());
        	if(RamUsageEstimator.sizeOf(object) >= client.getMaxBsonObjectSize()) {
        		return false;
        	}
        	
        	getCollection(artifact.getClass()).insert(object);
        	artifact.setObjectid(object.get("_id").toString());
        	if(inputStream != null) {
        		GridFSInputFile gfsFile = getGridFS(artifact.getClass()).createFile(inputStream);
        		gfsFile.setFilename(object.get("_id").toString());
        		gfsFile.save();
        	}
        } catch (Exception e) {
			e.printStackTrace();
        	return false;
        }

        return true;
    }

    @Override
    public Boolean delete(String id, Class<? extends Persistent> classType) {
    	if(id == null) {
			(new NullArgumentException()).printStackTrace();
			return false;
    	}
    	
    	DBCursor cursorDB;
    	try {
    		BasicDBObject query = new BasicDBObject("_id", new ObjectId(id));
            cursorDB = getCollection(classType).find(query);
    	} catch(Exception e) {
    		return false;
    	}
 
        try {
            if(cursorDB.hasNext()) {
                BasicDBObject doc = (BasicDBObject) cursorDB.next();
                getCollection(classType).remove(doc);
               	getGridFS(classType).remove(id);
 
                return true;
            } else {
                return false;
            }
        } finally {
        	cursorDB.close();
        }
    }

    @Override
	public Persistent readOne(String id, Class<? extends Persistent> classType) {
		if(id == null) {
			(new NullArgumentException()).printStackTrace();
			return null;
		}
		
		try {
	        BasicDBObject query = new BasicDBObject("_id", new ObjectId(id));
	        DBCursor cursorDB = getCollection(classType).find(query);      
	        ArrayList<? extends Persistent> list = processDBCursor(cursorDB, classType);
	        if(list.isEmpty()) {
	        	return null;
	        } else {
	        	return list.get(0);
	        }
		} catch(Exception e) {
			return null;
		}
        
    }

    @Override
    public ArrayList<? extends Persistent> readAll(Class<? extends Persistent> classType) {
    	if(classType == null) {
			(new NullArgumentException()).printStackTrace();
			return new ArrayList<Persistent>();
    	}
    	
        DBCursor cursorDB = getCollection(classType).find();   
        return processDBCursor(cursorDB, classType);
    }

    @Override
    public ArrayList<? extends Persistent> search(String query, String value, Boolean synomymes, Class<? extends Persistent> classType) {
		if(query == null || value == null || classType == null || synomymes == null) {
			(new NullArgumentException()).printStackTrace();
			return new ArrayList<Persistent>();
		}
		List<String> final_value = new ArrayList<String>();
		if(synomymes) {
			final_value.addAll(getSynonymes(value));
		} else {
			final_value.add(value);
		}
		
		ArrayList<Persistent> result = new ArrayList<Persistent>();	
		for(String val : final_value) {
			BasicDBObject objectQuery = new BasicDBObject(query, val);
			DBCursor cursorDB = getCollection(classType).find(objectQuery);
	    	result.addAll(processDBCursor(cursorDB, classType));
		}
	
        return result;
    }
    
    @Override
    public List<String> getSynonymes(String query) {
    	return DictionaryUtils.getSynonymes(query);
    }
    
    @SuppressWarnings("deprecation")
	private ArrayList<Persistent> processDBCursor(DBCursor cursorDB, Class<? extends Persistent> classType) {
    	ArrayList<Persistent> results = new ArrayList<Persistent>();
    	
    	if(cursorDB == null) {
			(new NullArgumentException()).printStackTrace();
			return results;
    	}
    	
        while(cursorDB.hasNext()) {
			try {
	            DBObject doc = cursorDB.next();
	            Persistent artifact = (Persistent) (new Gson()).fromJson(doc.toString(), classType);
				artifact.setObjectid(doc.get("_id").toString());
				results.add(artifact);
			} catch (JsonSyntaxException e) {
				e.printStackTrace();
				cursorDB.close();
				return results;
			}
        }
        cursorDB.close();
        return results;
    }

    @Override
	public InputStream getInputStream(String id, Class<? extends Persistent> classType) {
		if(id == null) {
			(new NullArgumentException()).printStackTrace();
			return null;
		}
		
         GridFSDBFile docFS = getGridFS(classType).findOne(id);
         if(docFS == null)
        	 return null;
         else
        	 return docFS.getInputStream();
    }

    @Override
    public long count() {
    	long count = 0;
    	for(DBCollection collection : collections.values())
    		count =+ collection.count();
    	return count;
    }

    @Override
    public long count(Class<? extends Persistent> classType) {
    	return getCollection(classType).count();
    }

    @Override
    public int maxSaveSize() {
    	return client.getMaxBsonObjectSize();
    }
 }