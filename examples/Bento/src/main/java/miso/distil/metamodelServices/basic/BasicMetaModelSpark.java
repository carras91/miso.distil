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
	public static String ReadJson = "/json/metamodel/read/";
	public static String ReadIdJson = ReadJson + BasicMetaModelParam.IdGet;
	public static String ReadAllJson = "/json/metamodel/all";
	public static String SearchJson = "/json/metamodel/search";
	public static String UploadJson = "/json/metamodel/upload";
	public static String DeleteJson = "/json/metamodel/delete";
	public static String DownloadZipJson = "/json/metamodel/download/zip/";
	public static String DownloadZipIdJson = DownloadZipJson + BasicMetaModelParam.IdGet;
	public static String DownloadFileJson = "/json/metamodel/download/file/";
	public static String DownloadFileIdJson = DownloadFileJson + BasicMetaModelParam.IdGet;

	/**
	 * Auto-generated spark service. It initializes all url's
	 * 
	 * @author miso.distil.codeGenerator
	 */
	@Override
	public void runService() {

		MetaModelJson Json = new MetaModelJson();

		get(ReadIdJson, "application/json",
			(request, response) -> Json.getRead(request, response), 
			new JsonTransformer());

		get(ReadAllJson, "application/json",
			(request, response) -> Json.getReadAll(request, response),
			new JsonTransformer());

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
