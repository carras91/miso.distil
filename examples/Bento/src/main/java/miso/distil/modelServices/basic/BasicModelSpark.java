package miso.distil.modelServices.basic;

import static spark.Spark.post;
import static spark.Spark.get;

import miso.distil.modelServices.ModelJson;

import miso.carrascal.cloudModelServices.abstractServices.basic.JsonTransformer;
import miso.carrascal.cloudModelServices.abstractServices.basic.BasicInterfaceSpark;

/**
 * Auto-generated spark server.
 * 
 * @author miso.distil.codeGenerator.
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
	public static String DownloadJson = "/json/model/download/zip/";
	public static String DownloadIdJson = DownloadJson + BasicModelParam.IdGet;

	/**
	 * Auto-generated spark service. It initializes all url's.
	 */
	@Override
	public void runService() {

		ModelJson Json = new ModelJson();

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
