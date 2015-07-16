package miso.distil.modelServices.basic;

import static spark.Spark.post;
import static spark.Spark.get;

import miso.distil.modelServices.ModelJson;

import miso.carrascal.cloudModelServices.abstractServices.basic.JsonTransformer;
import miso.carrascal.cloudModelServices.abstractServices.basic.BasicInterfaceSpark;

/**
 * Auto-generated spark server
 * 
 * @author miso.distil.codeGenerator
 */
public final class BasicModelSpark implements BasicInterfaceSpark {

	// URL's
	public static String ReadJson = "/json/model/read/";
	public static String ReadIdJson = ReadJson + BasicModelParam.IdGet;
	public static String ReadAllJson = "/json/model/all";
	public static String SearchJson = "/json/model/search";
	public static String UpdateJson = "/json/model/update";
	public static String UploadJson = "/json/model/upload";
	public static String DeleteJson = "/json/model/delete";
	public static String DownloadZipJson = "/json/model/download/zip/";
	public static String DownloadZipIdJson = DownloadZipJson + BasicModelParam.IdGet;
	public static String DownloadFileJson = "/json/model/download/file/";
	public static String DownloadFileIdJson = DownloadFileJson + BasicModelParam.IdGet;

	/**
	 * Auto-generated spark service. It initializes all url's
	 * 
	 * @author miso.distil.codeGenerator
	 */
	@Override
	public void runService() {

		ModelJson Json = new ModelJson();

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
