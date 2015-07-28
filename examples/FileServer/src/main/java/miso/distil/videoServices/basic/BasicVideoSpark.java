package miso.distil.videoServices.basic;

import static spark.Spark.post;
import static spark.Spark.get;

import miso.distil.videoServices.VideoJson;

import miso.carrascal.cloudModelServices.abstractServices.basic.JsonTransformer;
import miso.carrascal.cloudModelServices.abstractServices.basic.BasicInterfaceSpark;

/**
 * Auto-generated spark server
 * 
 * @author miso.distil.codeGenerator
 */
public final class BasicVideoSpark implements BasicInterfaceSpark {

	// URL's
	public static String ReadJson = "/json/video/read/";
	public static String ReadIdJson = ReadJson + BasicVideoParam.IdGet;
	public static String ReadAllJson = "/json/video/all";
	public static String SearchJson = "/json/video/search";
	public static String UploadJson = "/json/video/upload";
	public static String DeleteJson = "/json/video/delete";
	public static String DownloadZipJson = "/json/video/download/zip/";
	public static String DownloadZipIdJson = DownloadZipJson + BasicVideoParam.IdGet;
	public static String DownloadFileJson = "/json/video/download/file/";
	public static String DownloadFileIdJson = DownloadFileJson + BasicVideoParam.IdGet;

	/**
	 * Auto-generated spark service. It initializes all url's
	 * 
	 * @author miso.distil.codeGenerator
	 */
	@Override
	public void runService() {

		VideoJson Json = new VideoJson();

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
