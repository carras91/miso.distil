package miso.distil.modelServices.basic;

import miso.carrascal.cloudModelServices.abstractServices.basic.BasicAbstractCodes;

/**
 * Auto-generated error codes
 * 
 * @author miso.distil.codeGenerator
 */
public class BasicModelCodes extends BasicAbstractCodes {

	public static String Param_error = "ParameterError : Parameter is incorrect";

	// Parameters errors
	public static String Param_namemodel = "ParameterError : namemodel is incorrect";
	public static String Param_type = "ParameterError : type is incorrect";

	public static String Param_emptyfilename = "ParameterError : Filename is empty";
	public static String Param_emptyfile = "ParameterError : File or filename not found";
	public static String Param_filenotfound = "ParameterError : File not found";
	public static String Param_corruptfile = "ParameterError : Corrupt file";

	public static String DB_notupdated = "DataBaseError : Model not updated";
	public static String DB_notuploaded = "DataBaseError : Model not uploaded";

	public static String Search_empty = "Your search has no results. Try again";
	public static String Model_notfound = "Model not found. Try again later";
}
