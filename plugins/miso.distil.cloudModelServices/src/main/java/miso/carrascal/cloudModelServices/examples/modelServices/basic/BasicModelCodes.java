package miso.carrascal.cloudModelServices.examples.modelServices.basic;

import miso.carrascal.cloudModelServices.abstractServices.basic.BasicAbstractCodes;

public class BasicModelCodes extends BasicAbstractCodes{

	public static String Param_emptyname = "ParameterError : Name is empty";
	public static String Param_emptyfilename = "ParameterError : Filename is empty or not .ecore";
	public static String Param_emptyfile = "ParameterError : File or filename not found";
	public static String Param_filenotfound = "ParameterError : File not found";
	public static String Param_corruptfile = "ParameterError : Corrupt file";
	
	public static String DB_notupdated = "DataBaseError : Model not updated";
	public static String DB_notuploaded = "DataBaseError : Model not uploaded";
	public static String DB_ecorenotfound = "DataBaseError : Problem recovering associated ecore";

	public static String Regis_fail = "RegisterError : Ecore is not registered";
	public static String Pack_fail = "PackageError : Package is not registered or wrong";
	
	public static String Search_empty = "Your search has no results. Try again";
	public static String Model_notfound = "Model not found. Try again later";
	
}
