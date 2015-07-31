package miso.carrascal.cloudModelServices.abstractServices;

import java.util.ArrayList;
import java.util.List;

/**
 * Record to store data bases implementing {@link miso.carrascal.cloudModelServices.abstractServices.InterfaceDB InterfaceDB}.
 * 
 * @author Carlos Carrascal.
 */
public class RecordDB {
		
	/**
	 * Record.
	 */
	private static List<InterfaceDB> DBRecord = new ArrayList<InterfaceDB>();
	/**
	 * Postion inside DBRecord with the default database.
	 */
	private static Integer defaultPosition = 0;
	
	/**
	 * To register a new database. Repeated databases not allowed.
	 * 
	 * @param newDB New database.
	 * @return New database position.
	 */
	public static Integer register(InterfaceDB newDB) {
		if(!DBRecord.contains(newDB))
			DBRecord.add(newDB);
		return DBRecord.indexOf(newDB);
	}
	
	/**
	 * To get a stored database.
	 * 
	 * @param position Position of the database wanted.
	 * @return Null if not valid position, or the database wanted.
	 */
	public static InterfaceDB getDB(Integer position) {
		if(position < 0 || position > DBRecord.size())
			return null;
		else
			return DBRecord.get(position);
	}
	
	/**
	 * To set a new default database.
	 * 
	 * @param defaultDB New default database.
	 */
	public static void setDefault(InterfaceDB defaultDB) {
		defaultPosition = register(defaultDB);
	}
	
	/**
	 * To get the default database.
	 * 
	 * @return Null if not existing databases, or the default database.
	 */
	public static InterfaceDB getDefault() {
		if(!DBRecord.isEmpty())
			return DBRecord.get(defaultPosition);
		return null;
	}
	
	/**
	 * To delete a database.
	 * 
	 * @param DB Database to be deleted.
	 * @return True if database deleted, false if database is default.
	 */
	public static Boolean delete(InterfaceDB DB) {
		if(DBRecord.indexOf(DB) == defaultPosition)
			return false;
		return DBRecord.remove(DB);
	}
}