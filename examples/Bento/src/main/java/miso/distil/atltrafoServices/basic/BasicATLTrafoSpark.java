package miso.distil.atltrafoServices.basic;

import static spark.Spark.post;
import static spark.Spark.get;

import miso.distil.atltrafoServices.ATLTrafoJson;

import miso.carrascal.cloudModelServices.abstractServices.basic.JsonTransformer;
import miso.carrascal.cloudModelServices.abstractServices.basic.BasicInterfaceSpark;

/**
 * Auto-generated spark server
 * 
 * @author miso.distil.codeGenerator
 */
public final class BasicATLTrafoSpark implements BasicInterfaceSpark {

	// URL's
	public static String SearchJson = "/json/atltrafo/search";
	public static String UploadJson = "/json/atltrafo/upload";
	public static String DeleteJson = "/json/atltrafo/delete";
	public static String DownloadZipJson = "/json/atltrafo/download/zip/";
	public static String DownloadZipIdJson = DownloadZipJson + BasicATLTrafoParam.IdGet;
	public static String DownloadFileJson = "/json/atltrafo/download/file/";
	public static String DownloadFileIdJson = DownloadFileJson + BasicATLTrafoParam.IdGet;

	/**
	 * Auto-generated spark service. It initializes all url's
	 * 
	 * @author miso.distil.codeGenerator
	 */
	@Override
	public void runService() {

		ATLTrafoJson Json = new ATLTrafoJson();

		get(SearchJson, "application/json",
			(request, response) -> Json.getSearch(request, response), 
			new JsonTransformer());

		post(UploadJson, "application/json",
			(request, response) -> Json.postUpload(request, response),
			new JsonTransformer());

		post(DeleteJson, "application/json",
			(request, response) -> Json.postDelete(request, response),
			new JsonTransformer());

		get(DownloadZipIdJson, "application/json",
			(request, response) -> Json.getDownloadZip(request, response),
			new JsonTransformer());

		get(DownloadFileIdJson, "application/json",
			(request, response) -> Json.getDownloadFile(request, response),
			new JsonTransformer());
	}
}
