package miso.distil.documentServices.basic;

import miso.carrascal.cloudModelServices.abstractServices.basic.BasicAbstractCodes;

/**
 * Auto-generated error codes
 * 
 * @author miso.distil.codeGenerator
 */
public class BasicDocumentCodes extends BasicAbstractCodes {

	public static String Param_error = "ParameterError : Parameter is incorrect";

	// Parameters errors
	public static String Param_author_docinfo = "ParameterError : author_docinfo is incorrect";
	public static String Param_source_docinfo = "ParameterError : source_docinfo is incorrect";
	public static String Param_tags_docinfo = "ParameterError : tags_docinfo is incorrect";
	public static String Param_fileextension_docinfo = "ParameterError : fileextension_docinfo is incorrect";
	public static String Param_docinfo = "ParameterError : docinfo is incorrect";
	public static String Param_coauthors = "ParameterError : coauthors is incorrect";
	public static String Param_isfinished = "ParameterError : isfinished is incorrect";

	public static String Param_emptyfilename = "ParameterError : Filename is empty";
	public static String Param_emptyfile = "ParameterError : File or filename not found";
	public static String Param_filenotfound = "ParameterError : File not found";
	public static String Param_corruptfile = "ParameterError : Corrupt file";

	public static String DB_notupdated = "DataBaseError : Document not updated";
	public static String DB_notuploaded = "DataBaseError : Document not uploaded";

	public static String Search_empty = "Your search has no results. Try again";
	public static String Document_notfound = "Document not found. Try again later";
}
