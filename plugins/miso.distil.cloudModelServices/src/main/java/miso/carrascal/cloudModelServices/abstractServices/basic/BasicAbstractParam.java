package miso.carrascal.cloudModelServices.abstractServices.basic;

import java.util.ArrayList;
import java.util.List;

/**
 * Parameters.
 * 
 * @author Carlos Carrascal
 */
public class BasicAbstractParam {
	
	/**
	 * Id inside get request.
	 */
	public static String IdGet = ":ID";
	/**
	 * Id inside post request.
	 */
	public static String IdPost = "ID";
	/**
	 * File inside form.
	 */
	public static String File = "FILE";
	/**
	 * Query.
	 */
	public static String Search_query = "SEARCHQUERY";
	/**
	 * Value.
	 */
	public static String Search_value = "SEARCHVALUE";
	/**
	 * Synonyms (boolean).
	 */
	public static String Search_synonyms = "SEARCHSYNONYMS";
	
	/**
	 * List of all params.
	 */
	private static List<String> values = new ArrayList<String>();
	/**
	 * List of all params.
	 * 
	 * @return list with all params.
	 */
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