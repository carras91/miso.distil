package miso.carrascal.cloudModelServices.examples.ecoreServices.basic;

import static spark.Spark.post;
import static spark.Spark.get;
import miso.carrascal.cloudModelServices.abstractServices.basic.BasicInterfaceSpark;
import miso.carrascal.cloudModelServices.abstractServices.basic.JsonTransformer;

public final class BasicEcoreSpark implements BasicInterfaceSpark
{
	public static String DeleteJSON = "/json/ecore/delete";
	public static String ReadJSON = "/json/ecore/read/";
	public static String ReadIdJSON = ReadJSON + BasicEcoreParam.IdGet;
	public static String ReadAllJSON = "/json/ecore/all";
	public static String SearchJSON = "/json/ecore/search";
	public static String UpdateJSON = "/json/ecore/update";
	public static String UploadJSON = "/json/ecore/upload";
	public static String DownloadZipJSON = "/json/ecore/download/zip/";
	public static String DownloadZipIdJSON = DownloadZipJSON + BasicEcoreParam.IdGet;
	public static String DownloadFileJSON = "/json/ecore/download/file/";
	public static String DownloadFileIdJSON = DownloadFileJSON + BasicEcoreParam.IdGet;
	
	@Override
	public void runService() {
		
		BasicEcoreJson JSON = new BasicEcoreJson();
		    	
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
