package miso.carrascal.cloudModelServices.abstractServices;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public interface InterfaceDB {

	public Boolean save(AbstractPersistentClass artifact, InputStream inputStream);
	
	public Boolean delete(String id, Class<? extends AbstractPersistentClass> classType);
	
	public AbstractPersistentClass readOne(String id, Class<? extends AbstractPersistentClass> classType);
	
	public InputStream getInputStream(String id, Class<? extends AbstractPersistentClass> classType);
	
	public ArrayList<? extends AbstractPersistentClass> readAll(Class<? extends AbstractPersistentClass> classType);

	public ArrayList<? extends AbstractPersistentClass> search(String attribute, Boolean synonymes_att, String value, Boolean synonymes_val, Class<? extends AbstractPersistentClass> classType);

	public ArrayList<? extends AbstractPersistentClass> searchTag(String tag, Boolean synonymes, Class<? extends AbstractPersistentClass> classType);
	
	public List<String> getSynonymes(String query);

	public long count();
	
	public long count(Class<? extends AbstractPersistentClass> classType);
	
	public int maxSaveSize(); 
}