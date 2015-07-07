package miso.carrascal.cloudModelServices.ecoreServices.basic;

import miso.carrascal.cloudModelServices.abstractServices.basic.BasicAbstractCodes;

public class BasicEcoreCodes extends BasicAbstractCodes {

	public static String Param_emptyname = "ParameterError : Name is empty";
	public static String Param_emptyfilename = "ParameterError : Filename is empty";
	public static String Param_emptyfile = "ParameterError : File or filename not found";
	public static String Param_filenotfound = "ParameterError : File not found";
	public static String Param_corruptfile = "ParameterError : Corrupt file";
	
	public static String DB_notupdated = "DataBaseError : Ecore not updated";
	public static String DB_notuploaded = "DataBaseError : Ecore not uploaded";
	
	public static String Regis_fail = "RegisterError : Ecore is not registered (but uploaded)";
	
	public static String Search_empty = "Your search has no results. Try again";
	public static String Ecore_notfound = "Ecore not found. Try again later";
	
}
