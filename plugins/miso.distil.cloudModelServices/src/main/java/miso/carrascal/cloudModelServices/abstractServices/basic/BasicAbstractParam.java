package miso.carrascal.cloudModelServices.abstractServices.basic;

import java.util.ArrayList;
import java.util.List;

import miso.carrascal.cloudModelServices.abstractServices.filter.EType;

public class BasicAbstractParam {
	
	public static String IdGet = ":ID";
	public static String IdPost = "ID";
	public static String File = "FILE";
	public static String Search_query = "SEARCHQUERY";
	public static String Search_value = "SEARCHVALUE";
	public static String Search_synonyms = "SEARCHSYNONYMS";
	
	public static String EClass = EType.EClass.toString();
	public static String ESuperType = EType.ESuperType.toString();
	public static String EAttribute = EType.EAttribute.toString();
	public static String EInterface = EType.EInterface.toString();
	public static String EAbstract = EType.EAbstract.toString();
	public static String EReference = EType.EReference.toString();
	
	private static List<String> values = new ArrayList<String>();
	public static List<String> values() {
		if(values.isEmpty()) {
			values.add(IdGet);
			values.add(IdPost);
			values.add(File);
			values.add(Search_query);
			values.add(Search_value);
			values.add(Search_synonyms);
			values.add(EClass);
			values.add(EAttribute);
			values.add(ESuperType);
			values.add(EInterface);
			values.add(EAbstract);
			values.add(EReference);
		}
		return values;
	}
}