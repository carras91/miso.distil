package miso.carrascal.cloudModelServices.abstractServices;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public interface InterfaceDB {

	public Boolean save(Persistent artifact, InputStream inputStream);
	
	public Boolean delete(String id, Class<? extends Persistent> classType);
	
	public Persistent readOne(String id, Class<? extends Persistent> classType);
	
	public InputStream getInputStream(String id, Class<? extends Persistent> classType);
	
	public ArrayList<? extends Persistent> readAll(Class<? extends Persistent> classType);

	public ArrayList<? extends Persistent> search(String query, String value, Boolean synonymes, Class<? extends Persistent> classType);
	
	public List<String> getSynonymes(String query);

	public long count();
	
	public long count(Class<? extends Persistent> classType);
	
	public int maxSaveSize(); 
}