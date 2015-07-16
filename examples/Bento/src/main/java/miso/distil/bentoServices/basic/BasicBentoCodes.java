package miso.distil.bentoServices.basic;

import miso.carrascal.cloudModelServices.abstractServices.basic.BasicAbstractCodes;

/**
 * Auto-generated error codes
 * 
 * @author miso.distil.codeGenerator
 */
public class BasicBentoCodes extends BasicAbstractCodes {

	public static String Param_error = "ParameterError : Parameter is incorrect";

	// Parameters errors
	public static String Param_inputconcepts = "ParameterError : inputconcepts is incorrect";
	public static String Param_outputconcepts = "ParameterError : outputconcepts is incorrect";
	public static String Param_atl = "ParameterError : atl is incorrect";
	public static String Param_tags = "ParameterError : tags is incorrect";

	public static String Param_emptyfilename = "ParameterError : Filename is empty";
	public static String Param_emptyfile = "ParameterError : File or filename not found";
	public static String Param_filenotfound = "ParameterError : File not found";
	public static String Param_corruptfile = "ParameterError : Corrupt file";

	public static String DB_notupdated = "DataBaseError : Bento not updated";
	public static String DB_notuploaded = "DataBaseError : Bento not uploaded";

	public static String Search_empty = "Your search has no results. Try again";
	public static String Bento_notfound = "Bento not found. Try again later";
}
