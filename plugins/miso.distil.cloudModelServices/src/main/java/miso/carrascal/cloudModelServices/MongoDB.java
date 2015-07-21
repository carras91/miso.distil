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

import org.bson.types.ObjectId;

import com.carrotsearch.sizeof.RamUsageEstimator;
 
/**
 * Custom implementation of and non-relational mongo database.
 * It uses com.mongodb.gridfs.GridFS to store files.
 * It creates one com.mongodb.DBCollection for each {@link miso.carrascal.cloudModelServices.abstractServices.Persistent Persistent} class stored.
 * 
 * @author Carlos Carrascal
 */
public class MongoDB implements InterfaceDB {

	/**
	 * URI from a mongo client.
	 */
	private MongoClientURI uri;
    /**
     * Client from mongo.
     */
    private MongoClient client;
    /**
     * DataBase.
     */
    private DB db;
    /**
     * One collection for each {@link miso.carrascal.cloudModelServices.abstractServices.Persistent Persistent} class.
     */
    private HashMap<Class<? extends Persistent>, DBCollection> collections;
    /**
     * One gridfs for each {@link miso.carrascal.cloudModelServices.abstractServices.Persistent Persistent} class.
     */
    private HashMap<Class<? extends Persistent>, GridFS> gridfs;
 
	/**
	 * MongoDB constructor.
	 * 
	 * @param mongoURI Valid URI. Example: "mongodb://[username]:[password]@[host]:[port1]/[database]".
	 * @throws Exception If mongoURI not valid.
	 */
	public MongoDB(String mongoURI) throws Exception {
       	this.uri  = new MongoClientURI(mongoURI);
		this.client = new MongoClient(uri);
       	this.db = client.getDB(uri.getDatabase());
       	this.collections = new HashMap<Class<? extends Persistent>, DBCollection>();
       	this.gridfs = new HashMap<Class<? extends Persistent>, GridFS>();
    }
    
	/**
	 * Get a collection for classType, or create a new one.
	 * 
	 * @param classType Class of the object to be stored.
	 * @return The DBCollection associated.
	 */
	private DBCollection getCollection(Class<? extends Persistent> classType) {
		if(collections.containsKey(classType)) {
			return collections.get(classType);
		} else {
			collections.put(classType, db.getCollection(classType.getName()));
	       	gridfs.put(classType, new GridFS(db, classType.getName()));
	       	return collections.get(classType);
		}		
	}
	
	/**
	 * Get a gridfs for classType, or create a new one.
	 * 
	 * @param classType Class of the object to be stored.
	 * @return The GridFS associated. 
	 */
	private GridFS getGridFS(Class<? extends Persistent> classType) {
		if(gridfs.containsKey(classType)) {
			return gridfs.get(classType);
		} else {
			collections.put(classType, db.getCollection(classType.getName()));
	       	gridfs.put(classType, new GridFS(db, classType.getName()));
	       	return gridfs.get(classType);
		}		
	}
	
    /* (non-Javadoc)
     * @see miso.carrascal.cloudModelServices.abstractServices.InterfaceDB#save(miso.carrascal.cloudModelServices.abstractServices.Persistent, java.io.InputStream)
     */
    @SuppressWarnings("deprecation")
    @Override
	public Boolean save(Persistent artifact, InputStream inputStream) {
    	if(artifact == null) {
			(new NullPointerException()).printStackTrace();
    		return false;
    	}
	
        try {
        	for(Class<? extends Persistent> classType : collections.keySet()) {
            	if(!search("filename", artifact.getFilename(), false, classType).isEmpty())
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

    /* (non-Javadoc)
     * @see miso.carrascal.cloudModelServices.abstractServices.InterfaceDB#delete(java.lang.String, java.lang.Class)
     */
    @Override
    public Boolean delete(String id, Class<? extends Persistent> classType) {
    	if(id == null) {
			(new NullPointerException()).printStackTrace();
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

    /* (non-Javadoc)
     * @see miso.carrascal.cloudModelServices.abstractServices.InterfaceDB#readOne(java.lang.String, java.lang.Class)
     */
    @Override
	public Persistent readOne(String id, Class<? extends Persistent> classType) {
		if(id == null) {
			(new NullPointerException()).printStackTrace();
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

    /* (non-Javadoc)
     * @see miso.carrascal.cloudModelServices.abstractServices.InterfaceDB#readAll(java.lang.Class)
     */
    @Override
    public ArrayList<? extends Persistent> readAll(Class<? extends Persistent> classType) {
    	if(classType == null) {
			(new NullPointerException()).printStackTrace();
			return new ArrayList<Persistent>();
    	}
    	
        DBCursor cursorDB = getCollection(classType).find();   
        return processDBCursor(cursorDB, classType);
    }

    /* (non-Javadoc)
     * @see miso.carrascal.cloudModelServices.abstractServices.InterfaceDB#search(java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Class)
     */
    @Override
    public ArrayList<? extends Persistent> search(String query, String value, Boolean synomyms, Class<? extends Persistent> classType) {
		if(query == null || value == null || classType == null || synomyms == null) {
			(new NullPointerException()).printStackTrace();
			return new ArrayList<Persistent>();
		}
		List<String> final_value = new ArrayList<String>();
		if(synomyms) {
			final_value.addAll(getSynonyms(value));
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
    
    /* (non-Javadoc)
     * @see miso.carrascal.cloudModelServices.abstractServices.InterfaceDB#getSynonyms(java.lang.String)
     */
    @Override
    public List<String> getSynonyms(String query) {
    	return DictionaryUtils.getSynonyms(query);
    }
    
    /**
     * Go through cursorDB and transforms the search results into classType class.
     * 
     * @param cursorDB DBCursor to get through
     * @param classType Class of the object to be converted.
     * @return ArrayList({@link miso.carrascal.cloudModelServices.abstractServices.Persistent Persistent}) with the results. Empty if NullPointerException().
     */
    @SuppressWarnings("deprecation")
	private ArrayList<Persistent> processDBCursor(DBCursor cursorDB, Class<? extends Persistent> classType) {
    	ArrayList<Persistent> results = new ArrayList<Persistent>();
    	
    	if(cursorDB == null) {
			(new NullPointerException()).printStackTrace();
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

    /* (non-Javadoc)
     * @see miso.carrascal.cloudModelServices.abstractServices.InterfaceDB#getInputStream(java.lang.String, java.lang.Class)
     */
    @Override
	public InputStream getInputStream(String id, Class<? extends Persistent> classType) {
		if(id == null) {
			(new NullPointerException()).printStackTrace();
			return null;
		}
		
         GridFSDBFile docFS = getGridFS(classType).findOne(id);
         if(docFS == null)
        	 return null;
         else
        	 return docFS.getInputStream();
    }
 }