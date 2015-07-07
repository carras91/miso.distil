package miso.carrascal.cloudModelServices.ecoreServices.htmlCover;

import static spark.Spark.get;

import java.util.ArrayList;
import java.util.List;

import miso.carrascal.cloudModelServices.abstractServices.basic.BasicInterfaceSpark;
import miso.carrascal.cloudModelServices.abstractServices.htmlCover.HtmlFreeMarker;
import miso.carrascal.cloudModelServices.abstractServices.htmlCover.htmlObjects.HtmlLayout;
import miso.carrascal.cloudModelServices.ecoreServices.basic.BasicEcoreParam;
import spark.template.freemarker.FreeMarkerEngine;

public final class HtmlEcoreSpark implements BasicInterfaceSpark
{
	public static String ReadHTML = "/html/ecore/read/";
	public static String ReadIdHTML = ReadHTML + BasicEcoreParam.IdGet;
	public static String ReadAllHTML = "/html/ecore/all";
	public static String SearchFormHTML = "/html/ecore/search/form";
	public static String SearchHTML = "/html/ecore/search";
	public static String UpdateFormHTML = "/html/ecore/update/";
	public static String UpdateFormIdHTML = UpdateFormHTML + BasicEcoreParam.IdGet;
	public static String UploadFormHTML = "/html/ecore/upload";
	
	@Override
	public void runService() {
		
		HtmlEcoreJson HTML = new HtmlEcoreJson();
		    	   	
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
		layouts.add(new HtmlLayout("Read all ecores" , ReadAllHTML));
		layouts.add(new HtmlLayout("Upload ecore" , UploadFormHTML));
		layouts.add(new HtmlLayout("Search ecore" , SearchFormHTML));
		HtmlFreeMarker.addLayout("Ecore", layouts);		
	}
	
	
}
