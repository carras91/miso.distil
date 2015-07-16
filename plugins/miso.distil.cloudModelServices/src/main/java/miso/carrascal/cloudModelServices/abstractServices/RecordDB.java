package miso.carrascal.cloudModelServices.abstractServices;

import java.util.ArrayList;
import java.util.List;

public class RecordDB {
		
	private static List<InterfaceDB> DBRecord = new ArrayList<InterfaceDB>();
	private static Integer defaultPosition = 0;
	
	public static Integer register(InterfaceDB newDB) {
		if(!DBRecord.contains(newDB))
			DBRecord.add(newDB);
		return DBRecord.indexOf(newDB);
	}
	
	public static InterfaceDB getDB(Integer position) {
		if(position < 0 || position > DBRecord.size())
			return null;
		else
			return DBRecord.get(position);
	}
	
	public static void setDefault(InterfaceDB defaultDB) {
		defaultPosition = register(defaultDB);
	}
	
	public static InterfaceDB getDefault() {
		if(!DBRecord.isEmpty())
			return DBRecord.get(defaultPosition);
		return null;
	}
	
	public static Boolean delete(InterfaceDB DB) {
		if(DBRecord.indexOf(DB) == defaultPosition)
			return false;
		return DBRecord.remove(DB);
	}
}