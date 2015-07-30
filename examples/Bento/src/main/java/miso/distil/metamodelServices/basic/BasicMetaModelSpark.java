package miso.distil.metamodelServices.basic;

import static spark.Spark.post;
import static spark.Spark.get;

import miso.distil.metamodelServices.MetaModelJson;

import miso.carrascal.cloudModelServices.abstractServices.basic.JsonTransformer;
import miso.carrascal.cloudModelServices.abstractServices.basic.BasicInterfaceSpark;

/**
 * Auto-generated spark server
 * 
 * @author miso.distil.codeGenerator
 */
public final class BasicMetaModelSpark implements BasicInterfaceSpark {

	// URL's
	public static String SearchJson = "/json/metamodel/search";
	public static String UploadJson = "/json/metamodel/upload";
	public static String DeleteJson = "/json/metamodel/delete";
	public static String DownloadJson = "/json/metamodel/download/zip/";
	public static String DownloadIdJson = DownloadJson + BasicMetaModelParam.IdGet;

	/**
	 * Auto-generated spark service. It initializes all url's
	 * 
	 * @author miso.distil.codeGenerator
	 */
	@Override
	public void runService() {

		MetaModelJson Json = new MetaModelJson();

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
