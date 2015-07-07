package miso.carrascal.cloudModelServices.modelServices.basic;

import static spark.Spark.post;
import static spark.Spark.get;
import miso.carrascal.cloudModelServices.abstractServices.basic.JsonTransformer;

public final class BasicModelSpark
{
	public static String DeleteJSON = "/json/model/delete";
	public static String ReadJSON = "/json/model/read/";
	public static String ReadIdJSON = ReadJSON + BasicModelParam.IdGet;
	public static String ReadAllJSON = "/json/model/all";
	public static String SearchJSON = "/json/model/search";
	public static String UpdateJSON = "/json/model/update";
	public static String UploadJSON = "/json/model/upload";
	public static String DownloadZipJSON = "/json/model/download/zip/";
	public static String DownloadZipIdJSON = DownloadZipJSON + BasicModelParam.IdGet;
	public static String DownloadFileJSON = "/json/model/download/file/";
	public static String DownloadFileIdJSON = DownloadFileJSON + BasicModelParam.IdGet;
	
	//@Override
	public void runService() {
		
		BasicModelJson JSON = new BasicModelJson();
    	
    	post(DeleteJSON, "application/json",
    			(request, response) -> JSON.postDelete(request, response),
    			new JsonTransformer());
    	
    	get(ReadIdJSON, "application/json",
    			(request, response) -> JSON.getRead(request, response), 
    			new JsonTransformer());
    	
    	get(ReadAllJSON, "application/json",
    			(request, response) -> JSON.getReadAll(request, response),
    			new JsonTransformer());
    	
    	get(SearchJSON, "application/json",
    			(request, response) -> JSON.getSearch(request, response), 
    			new JsonTransformer());
			
		post(UpdateJSON, "application/json",
				(request, response) -> JSON.postUpdate(request, response), 
				new JsonTransformer());
			
		post(UploadJSON, "application/json",
				(request, response) -> JSON.postUpload(request, response),
				new JsonTransformer());
		
		get(DownloadZipIdJSON, "application/json",
	    		(request, response) -> JSON.getDownloadZip(request, response),
				new JsonTransformer());
	    		
	    get(DownloadFileIdJSON, "application/json",
	    		(request, response) -> JSON.getDownloadFile(request, response),
				new JsonTransformer());
	}
}
