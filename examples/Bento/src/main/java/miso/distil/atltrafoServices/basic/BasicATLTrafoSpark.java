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
	public static String DownloadJson = "/json/atltrafo/download/zip/";
	public static String DownloadIdJson = DownloadJson + BasicATLTrafoParam.IdGet;

	/**
	 * Auto-generated spark service. It initializes all url's
	 * 
	 * @author miso.distil.codeGenerator
	 */
	@Override
	public void runService() {

		ATLTrafoJson Json = new ATLTrafoJson();

		get(SearchJson, "application/json",
			(request, response) -> {
				Object obj = Json.getSearch(request, response);
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
