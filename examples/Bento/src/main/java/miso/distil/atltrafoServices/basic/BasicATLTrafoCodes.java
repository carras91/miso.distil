package miso.distil.atltrafoServices.basic;

import miso.carrascal.cloudModelServices.abstractServices.basic.BasicAbstractCodes;

/**
 * Auto-generated error codes
 * 
 * @author miso.distil.codeGenerator
 */
public class BasicATLTrafoCodes extends BasicAbstractCodes {

	public static String Param_error = "ParameterError : Parameter is incorrect";

	// Parameters errors
	public static String Param_nameatl = "ParameterError : nameatl is incorrect";

	public static String Param_emptyfilename = "ParameterError : Filename is empty";
	public static String Param_emptyfile = "ParameterError : File or filename not found";
	public static String Param_filenotfound = "ParameterError : File not found";
	public static String Param_corruptfile = "ParameterError : Corrupt file";

	public static String DB_notupdated = "DataBaseError : ATLTrafo not updated";
	public static String DB_notuploaded = "DataBaseError : ATLTrafo not uploaded";

	public static String Search_empty = "Your search has no results. Try again";
	public static String ATLTrafo_notfound = "ATLTrafo not found. Try again later";
}
