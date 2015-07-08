package miso.carrascal.cloudModelServices.examples.modelServices.htmlCover;

import static spark.Spark.get;

import java.util.ArrayList;
import java.util.List;

import miso.carrascal.cloudModelServices.abstractServices.htmlCover.HtmlFreeMarker;
import miso.carrascal.cloudModelServices.abstractServices.htmlCover.htmlObjects.HtmlLayout;
import miso.carrascal.cloudModelServices.examples.modelServices.basic.BasicModelParam;
import miso.carrascal.cloudModelServices.examples.modelServices.htmlCover.HtmlModelJson;
import spark.template.freemarker.FreeMarkerEngine;

public final class HtmlModelSpark
{
	public static String ReadHTML = "/html/model/read/";
	public static String ReadIdHTML = ReadHTML + BasicModelParam.IdGet;
	public static String ReadAllHTML = "/html/model/all";
	public static String SearchFormHTML = "/html/model/search/form";
	public static String SearchHTML = "/html/model/search";
	public static String UpdateFormHTML = "/html/model/update/";
	public static String UpdateFormIdHTML = UpdateFormHTML + BasicModelParam.IdGet;
	public static String UploadFormHTML = "/html/model/upload";
	
	//@Override
	public void runService() {
		
		HtmlModelJson HTML = new HtmlModelJson();
    	    	
    	get(ReadIdHTML,
    			(request, response) -> HTML.getRead(request, response), 
    			new FreeMarkerEngine());
    	
    	get(ReadAllHTML,
    			(request, response) -> HTML.getReadAll(request, response),
    			new FreeMarkerEngine());
    	
    	get(SearchFormHTML,
    			(request, response) -> HTML.getSearchForm(), 
    			new FreeMarkerEngine());
    	
    	get(SearchHTML,
    			(request, response) -> HTML.getSearch(request, response), 
    			new FreeMarkerEngine());
    	
    	get(UpdateFormIdHTML,
				(request, response) -> HTML.getUpdateForm(request, response), 
				new FreeMarkerEngine());
		
		get(UploadFormHTML,
				(request, response) -> HTML.getUploadForm(request, response),
				new FreeMarkerEngine());
		
		this.addLayout();
	}
	
	private void addLayout() {
		List<HtmlLayout> layouts = new ArrayList<HtmlLayout>();
		layouts.add(new HtmlLayout("Read all models" , ReadAllHTML));
		layouts.add(new HtmlLayout("Upload model" , UploadFormHTML));
		layouts.add(new HtmlLayout("Search model" , SearchFormHTML));
		HtmlFreeMarker.addLayout("Model", layouts);
	}
}
