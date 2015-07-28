package miso.carrascal.cloudModelServices.abstractServices.basic;

import java.util.ArrayList;
import java.util.List;

public class BasicAbstractParam {
	
	public static String IdGet = ":ID";
	public static String IdPost = "ID";
	public static String File = "FILE";
	public static String Search_query = "SEARCHQUERY";
	public static String Search_value = "SEARCHVALUE";
	public static String Search_synonyms = "SEARCHSYNONYMS";
	
	private static List<String> values = new ArrayList<String>();
	public static List<String> values() {
		if(values.isEmpty()) {
			values.add(IdGet);
			values.add(IdPost);
			values.add(File);
			values.add(Search_query);
			values.add(Search_value);
			values.add(Search_synonyms);
		}
		return values;
	}
}