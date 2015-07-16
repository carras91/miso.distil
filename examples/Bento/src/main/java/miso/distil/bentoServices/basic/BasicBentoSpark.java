package miso.distil.bentoServices.basic;

import static spark.Spark.post;
import static spark.Spark.get;

import miso.distil.bentoServices.BentoJson;

import miso.carrascal.cloudModelServices.abstractServices.basic.JsonTransformer;
import miso.carrascal.cloudModelServices.abstractServices.basic.BasicInterfaceSpark;

/**
 * Auto-generated spark server
 * 
 * @author miso.distil.codeGenerator
 */
public final class BasicBentoSpark implements BasicInterfaceSpark {

	// URL's
	public static String ReadJson = "/json/bento/read/";
	public static String ReadIdJson = ReadJson + BasicBentoParam.IdGet;
	public static String ReadAllJson = "/json/bento/all";
	public static String SearchJson = "/json/bento/search";
	public static String UpdateJson = "/json/bento/update";
	public static String UploadJson = "/json/bento/upload";
	public static String DeleteJson = "/json/bento/delete";
	public static String DownloadZipJson = "/json/bento/download/zip/";
	public static String DownloadZipIdJson = DownloadZipJson + BasicBentoParam.IdGet;
	public static String DownloadFileJson = "/json/bento/download/file/";
	public static String DownloadFileIdJson = DownloadFileJson + BasicBentoParam.IdGet;

	/**
	 * Auto-generated spark service. It initializes all url's
	 * 
	 * @author miso.distil.codeGenerator
	 */
	@Override
	public void runService() {

		BentoJson Json = new BentoJson();

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
