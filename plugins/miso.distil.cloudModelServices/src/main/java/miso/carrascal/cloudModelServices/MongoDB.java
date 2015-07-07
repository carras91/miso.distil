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
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import miso.carrascal.cloudModelServices.abstractServices.AbstractPersistentClass;
import miso.carrascal.cloudModelServices.abstractServices.InterfaceDB;
import miso.carrascal.cloudModelServices.utils.DictionaryUtils;
import miso.carrascal.cloudModelServices.utils.NullArgumentException;

import org.bson.types.ObjectId;

import com.carrotsearch.sizeof.RamUsageEstimator;
 
public class MongoDB implements InterfaceDB {

	private MongoClientURI uri;
    private MongoClient client;
    private DB db;
    private HashMap<Class<? extends AbstractPersistentClass>, DBCollection> collections;
    private HashMap<Class<? extends AbstractPersistentClass>, GridFS> gridfs;
 
	public MongoDB(String mongoURI) {
        try {
           	this.uri  = new MongoClientURI(mongoURI);
			this.client = new MongoClient(uri);
	       	this.db = client.getDB(uri.getDatabase());
	       	this.collections = new HashMap<Class<? extends AbstractPersistentClass>, DBCollection>();
	       	this.gridfs = new HashMap<Class<? extends AbstractPersistentClass>, GridFS>();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
    }
    
	private DBCollection getCollection(Class<? extends AbstractPersistentClass> classType) {
		if(collections.containsKey(classType)) {
			return collections.get(classType);
		} else {
			collections.put(classType, db.getCollection(classType.getName()));
	       	gridfs.put(classType, new GridFS(db, classType.getName()));
	       	return collections.get(classType);
		}		
	}
	
	private GridFS getGridFS(Class<? extends AbstractPersistentClass> classType) {
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
	public Boolean save(AbstractPersistentClass artifact, InputStream inputStream) {
    	if(artifact == null) {
			(new NullArgumentException()).printStackTrace();
    		return false;
    	}
	
        try {
        	for(Class<? extends AbstractPersistentClass> classType : collections.keySet()) {
            	if(!search("objectName", false, artifact.getObjectName(), false, classType).isEmpty())
            		return false;
        	}
        	
        	BasicDBObject object = (BasicDBObject)JSON.parse((new Gson()).toJson(artifact)); 
        	System.out.println("object size " + RamUsageEstimator.sizeOf(object) + " max " + client.getMaxBsonObjectSize());
        	if(RamUsageEstimator.sizeOf(object) >= client.getMaxBsonObjectSize()) {
        		return false;
        	}
        	
        	getCollection(artifact.getClass()).insert(object);
        	artifact.setObjectId(object.get("_id").toString());
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
    public Boolean delete(String id, Class<? extends AbstractPersistentClass> classType) {
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
	public AbstractPersistentClass readOne(String id, Class<? extends AbstractPersistentClass> classType) {
		if(id == null) {
			(new NullArgumentException()).printStackTrace();
			return null;
		}
		
		try {
	        BasicDBObject query = new BasicDBObject("_id", new ObjectId(id));
	        DBCursor cursorDB = getCollection(classType).find(query);      
	        ArrayList<? extends AbstractPersistentClass> list = processDBCursor(cursorDB, classType);
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
    public ArrayList<? extends AbstractPersistentClass> readAll(Class<? extends AbstractPersistentClass> classType) {
    	if(classType == null) {
			(new NullArgumentException()).printStackTrace();
			return new ArrayList<AbstractPersistentClass>();
    	}
    	
        DBCursor cursorDB = getCollection(classType).find();   
        return processDBCursor(cursorDB, classType);
    }

    @Override
    public ArrayList<? extends AbstractPersistentClass> search(String attribute, Boolean synomymes_att, String value, Boolean synomymes_val, Class<? extends AbstractPersistentClass> classType) {
		if(attribute == null || value == null || classType == null || synomymes_att == null || synomymes_val == null) {
			(new NullArgumentException()).printStackTrace();
			return new ArrayList<AbstractPersistentClass>();
		}
		List<String> final_attribute = new ArrayList<String>();
		if(synomymes_att) {
			final_attribute.addAll(getSynonymes(attribute));
		} else {
			final_attribute.add(attribute);
		}
		List<String> final_value = new ArrayList<String>();
		if(synomymes_val) {
			final_value.addAll(getSynonymes(value));
		} else {
			final_value.add(value);
		}
		
		ArrayList<AbstractPersistentClass> result = new ArrayList<AbstractPersistentClass>();	
		for(String att : final_attribute) {
			for(String val : final_value) {
				BasicDBObject query = new BasicDBObject(att, val);
				DBCursor cursorDB = getCollection(classType).find(query);
		    	result.addAll(processDBCursor(cursorDB, classType));
			}
		}			
        return result;
    }

    @Override
    public ArrayList<? extends AbstractPersistentClass> searchTag(String tag, Boolean synonymes, Class<? extends AbstractPersistentClass> classType) {
		if(tag == null || classType == null || synonymes == null) {
			(new NullArgumentException()).printStackTrace();
			return new ArrayList<AbstractPersistentClass>();
		}
		BasicDBObject query;
		if(synonymes) {
	    	query = new BasicDBObject("tags", new BasicDBObject("$in", getSynonymes(tag)));
		} else {
	    	query = new BasicDBObject("tags", tag);
		}
        DBCursor cursorDB = getCollection(classType).find(query);  
        return processDBCursor(cursorDB, classType);
    }
    
    @Override
    public List<String> getSynonymes(String query) {
    	return DictionaryUtils.getSynonymes(query);
    }
    
    @SuppressWarnings("deprecation")
	private ArrayList<AbstractPersistentClass> processDBCursor(DBCursor cursorDB, Class<? extends AbstractPersistentClass> classType) {
    	ArrayList<AbstractPersistentClass> results = new ArrayList<AbstractPersistentClass>();
    	
    	if(cursorDB == null) {
			(new NullArgumentException()).printStackTrace();
			return results;
    	}
    	
        while(cursorDB.hasNext()) {
			try {
	            DBObject doc = cursorDB.next();
	            AbstractPersistentClass artifact = (AbstractPersistentClass) (new Gson()).fromJson(doc.toString(), classType);
				artifact.setObjectId(doc.get("_id").toString());
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
	public InputStream getInputStream(String id, Class<? extends AbstractPersistentClass> classType) {
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
    public long count(Class<? extends AbstractPersistentClass> classType) {
    	return getCollection(classType).count();
    }

    @Override
    public int maxSaveSize() {
    	return client.getMaxBsonObjectSize();
    }
 }