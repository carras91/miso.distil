package miso.distil.bentoServices.basic;

import static spark.Spark.post;
import static spark.Spark.get;

import miso.distil.bentoServices.BentoJson;

import miso.carrascal.cloudModelServices.abstractServices.basic.JsonTransformer;
import miso.carrascal.cloudModelServices.abstractServices.basic.BasicInterfaceSpark;

/**
 * Auto-generated spark server.
 * 
 * @author miso.distil.codeGenerator.
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
	public static String DownloadJson = "/json/bento/download/zip/";
	public static String DownloadIdJson = DownloadJson + BasicBentoParam.IdGet;

	/**
	 * Auto-generated spark service. It initializes all url's.
	 */
	@Override
	public void runService() {

		BentoJson Json = new BentoJson();

		get(ReadIdJson, "application/json",
			(request, response) -> {
				Object obj = Json.getRead(request, response);
				response.body((new JsonTransformer()).render(obj));
				return obj;
			}, new JsonTransformer());

		get(ReadAllJson, "application/json",
			(request, response) -> {
				Object obj = Json.getReadAll(request, response);
				response.body((new JsonTransformer()).render(obj));
				return obj;
			}, new JsonTransformer());

		get(SearchJson, "application/json",
			(request, response) -> {
				Object obj = Json.getSearch(request, response);
				response.body((new JsonTransformer()).render(obj));
				return obj;
			}, new JsonTransformer());

		post(UpdateJson, "application/json",
			(request, response) -> {
				Object obj = Json.postUpdate(request, response);
				response.body((new JsonTransformer()).render(obj));
				return obj;
			}, new JsonTransformer());

		post(UploadJson, "application/json",
			(request, response) -> {
				Object obj = Json.postUpload(request, response);
				response.body((new JsonTransformer()).render(obj));
				return obj;
			}, new JsonTransformer());

		post(DeleteJson, "application/json",
			(request, response) -> {
				Object obj = Json.postDelete(request, response);
				response.body((new JsonTransformer()).render(obj));
				return obj;
			}, new JsonTransformer());

		get(DownloadIdJson, "application/json",
			(request, response) -> {
				Object obj = Json.getDownload(request, response);
				response.body((new JsonTransformer()).render(obj));
				return obj;
			}, new JsonTransformer());
	}
}
