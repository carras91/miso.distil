package miso.distil.documentServices.basic;

import static spark.Spark.post;
import static spark.Spark.get;

import miso.distil.documentServices.DocumentJson;

import miso.carrascal.cloudModelServices.abstractServices.basic.JsonTransformer;
import miso.carrascal.cloudModelServices.abstractServices.basic.BasicInterfaceSpark;

/**
 * Auto-generated spark server
 * 
 * @author miso.distil.codeGenerator
 */
public final class BasicDocumentSpark implements BasicInterfaceSpark {

	// URL's
	public static String ReadJson = "/json/document/read/";
	public static String ReadIdJson = ReadJson + BasicDocumentParam.IdGet;
	public static String ReadAllJson = "/json/document/all";
	public static String SearchJson = "/json/document/search";
	public static String UpdateJson = "/json/document/update";
	public static String UploadJson = "/json/document/upload";
	public static String DeleteJson = "/json/document/delete";
	public static String DownloadZipJson = "/json/document/download/zip/";
	public static String DownloadZipIdJson = DownloadZipJson + BasicDocumentParam.IdGet;
	public static String DownloadFileJson = "/json/document/download/file/";
	public static String DownloadFileIdJson = DownloadFileJson + BasicDocumentParam.IdGet;

	/**
	 * Auto-generated spark service. It initializes all url's
	 * 
	 * @author miso.distil.codeGenerator
	 */
	@Override
	public void runService() {

		DocumentJson Json = new DocumentJson();

		get(ReadIdJson, "application/json",
			(request, response) -> Json.getRead(request, response), 
			new JsonTransformer());

		get(ReadAllJson, "application/json",
			(request, response) -> Json.getReadAll(request, response),
			new JsonTransformer());

		get(SearchJson, "application/json",
			(request, response) -> Json.getSearch(request, response), 
			new JsonTransformer());

		post(UpdateJson, "application/json",
			(request, response) -> Json.postUpdate(request, response), 
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
