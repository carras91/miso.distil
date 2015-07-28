package miso.distil.videoServices.basic;

import miso.carrascal.cloudModelServices.abstractServices.basic.BasicAbstractCodes;

/**
 * Auto-generated error codes
 * 
 * @author miso.distil.codeGenerator
 */
public class BasicVideoCodes extends BasicAbstractCodes {

	public static String Param_error = "ParameterError : Parameter is incorrect";

	// Parameters errors
	public static String Param_author_videoinfo = "ParameterError : author_videoinfo is incorrect";
	public static String Param_source_videoinfo = "ParameterError : source_videoinfo is incorrect";
	public static String Param_tags_videoinfo = "ParameterError : tags_videoinfo is incorrect";
	public static String Param_fileextension_videoinfo = "ParameterError : fileextension_videoinfo is incorrect";
	public static String Param_videoinfo = "ParameterError : videoinfo is incorrect";
	public static String Param_length = "ParameterError : length is incorrect";

	public static String Param_emptyfilename = "ParameterError : Filename is empty";
	public static String Param_emptyfile = "ParameterError : File or filename not found";
	public static String Param_filenotfound = "ParameterError : File not found";
	public static String Param_corruptfile = "ParameterError : Corrupt file";

	public static String DB_notupdated = "DataBaseError : Video not updated";
	public static String DB_notuploaded = "DataBaseError : Video not uploaded";

	public static String Search_empty = "Your search has no results. Try again";
	public static String Video_notfound = "Video not found. Try again later";
}
