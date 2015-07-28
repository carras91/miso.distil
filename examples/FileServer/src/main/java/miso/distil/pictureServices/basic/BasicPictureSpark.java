package miso.distil.pictureServices.basic;

import static spark.Spark.post;
import static spark.Spark.get;

import miso.distil.pictureServices.PictureJson;

import miso.carrascal.cloudModelServices.abstractServices.basic.JsonTransformer;
import miso.carrascal.cloudModelServices.abstractServices.basic.BasicInterfaceSpark;

/**
 * Auto-generated spark server
 * 
 * @author miso.distil.codeGenerator
 */
public final class BasicPictureSpark implements BasicInterfaceSpark {

	// URL's
	public static String ReadJson = "/json/picture/read/";
	public static String ReadIdJson = ReadJson + BasicPictureParam.IdGet;
	public static String ReadAllJson = "/json/picture/all";
	public static String SearchJson = "/json/picture/search";
	public static String UploadJson = "/json/picture/upload";
	public static String DeleteJson = "/json/picture/delete";
	public static String DownloadZipJson = "/json/picture/download/zip/";
	public static String DownloadZipIdJson = DownloadZipJson + BasicPictureParam.IdGet;
	public static String DownloadFileJson = "/json/picture/download/file/";
	public static String DownloadFileIdJson = DownloadFileJson + BasicPictureParam.IdGet;

	/**
	 * Auto-generated spark service. It initializes all url's
	 * 
	 * @author miso.distil.codeGenerator
	 */
	@Override
	public void runService() {

		PictureJson Json = new PictureJson();

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
