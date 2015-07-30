package miso.carrascal.cloudModelServices.abstractServices;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Interface for all databases.
 * Important information: The keys for the objects are {id, classType} or their filenames. An id alone can be repeated, but an artifact with same id and classType, or with same filename are prohibited.
 * 
 * @author Carlos Carrascal
 */
public interface InterfaceDB {

	/**
	 * It stores a {@link miso.carrascal.cloudModelServices.abstractServices.Persistent Persistent} with an inputStream relationated.
	 * 
	 * @param <T> class extending Persistent.
	 * @param artifact Object extending {@link miso.carrascal.cloudModelServices.abstractServices.Persistent Persistent} to be stored.
	 * @param inputStream InputStream relationated to be stored.
	 * @return True if stored. False if NullPointerException() or any other Exception() found, or if {@link miso.carrascal.cloudModelServices.abstractServices.Persistent#getFilename() artifact.getFilename()} already stored.
	 */
	public <T extends Persistent> Boolean save(T artifact, InputStream inputStream);
	
	/**
	 * It deletes the artifact and the associated InputStream given by id.
	 * 
	 * @param <T> class extending Persistent.
	 * @param id Artifact's id to be deleted.
	 * @param classType Artifact's class to be deleted.
	 * @return True if both are deleted. False if NullPointerException() or any other Exception() found.
	 */
	public <T extends Persistent> Boolean delete(String id, Class<T> classType);
	
	/**
	 * It finds the artifact given by id.
	 * 
	 * @param <T> class extending Persistent.
	 * @param id Artifact's id to be found.
	 * @param classType Artifact's class to be found.
	 * @return The object or null if not found.
	 */
	public <T extends Persistent> T readOne(String id, Class<T> classType);
	
	/**
	 * It finds the associated InputStrem given by id.
	 * 
	 * @param <T> class extending Persistent.
	 * @param id Artifact's id to be found.
	 * @param classType Artifact's class to be found.
	 * @return The InputStream or null if not found.
	 */
	public <T extends Persistent> InputStream getInputStream(String id, Class<T> classType);
	
	/**
	 * It finds all artifacts with class classType.
	 * 
	 * @param <T> class extending Persistent.
	 * @param classType Artifact's class to be found.
	 * @return ArrayList with all classType artifacts found. Empty if NullPointerException() or any other Exception() found.
	 */
	public <T extends Persistent> ArrayList<T> readAll(Class<T> classType);

	/**
	 * To search "classType" artifacts with an attribute "query" with "value" inside it (also search "value" synonyms if Boolean true).
	 * 
	 * @param <T> class extending Persistent.
	 * @param query Attribute to be found.
	 * @param value Value to be found.
	 * @param synonyms True to enable search of "value" synonyms.
	 * @param classType Artifact's class to be found.
	 * @return ArrayList with all classType artifacts found. Empty if NullPointerException() or any other Exception() found.
	 */
	public <T extends Persistent> ArrayList<T> search(String query, String value, Boolean synonyms, Class<T> classType);
	
	/**
	 * To get the synonyms of query used if {@link #search(String, String, Boolean, Class) search} receives snynonyms = true.
	 * 
	 * @param query Word to be treated.
	 * @return List(String) with all the synonyms (including query). 
	 */
	public List<String> getSynonyms(String query);
}