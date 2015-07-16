package miso.distil.atltrafoServices.htmlCover;

import static spark.Spark.get;
import spark.template.freemarker.FreeMarkerEngine;

import java.util.ArrayList;
import java.util.List;

import miso.carrascal.cloudModelServices.abstractServices.basic.BasicInterfaceSpark;
import miso.carrascal.cloudModelServices.abstractServices.htmlCover.HtmlFreeMarker;
import miso.carrascal.cloudModelServices.abstractServices.htmlCover.htmlObjects.HtmlLayout;

import miso.distil.atltrafoServices.basic.BasicATLTrafoParam;
import miso.distil.atltrafoServices.CustomATLTrafoHtml;
import miso.distil.atltrafoServices.htmlCover.HtmlATLTrafoJson;

/**
 * Auto-generated html spark server
 * 
 * @author miso.distil.codeGenerator
 */
public final class HtmlATLTrafoSpark implements BasicInterfaceSpark {

	// URL's
	public static String ReadHTML = "/html/atltrafo/read/";
	public static String ReadIdHTML = ReadHTML + BasicATLTrafoParam.IdGet;
	public static String ReadAllHTML = "/html/atltrafo/all";
	public static String SearchHTML = "/html/atltrafo/search";
	public static String SearchFormHTML = "/html/atltrafo/search/form";
	public static String UploadFormHTML = "/html/atltrafo/upload";

	/**
	 * Auto-generated html spark service. It initializes all html url's
	 * 
	 * @author miso.distil.codeGenerator
	 */
	@Override
	public void runService() {

		HtmlATLTrafoJson HTML = new HtmlATLTrafoJson();

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

		get(UploadFormHTML,
			(request, response) -> HTML.getUploadForm(request, response),
			new FreeMarkerEngine());

		this.addLayout();
	}

	/**
	 * Auto-generated layout service. It add's to the html layout some permanents links
	 * 
	 * @author miso.distil.codeGenerator
	 */
	private void addLayout() {
		List<HtmlLayout> layouts = new ArrayList<HtmlLayout>();
		layouts.add(new HtmlLayout("Read all atltrafos" , ReadAllHTML));
		layouts.add(new HtmlLayout("Upload atltrafo" , UploadFormHTML));
		layouts.add(new HtmlLayout("Search atltrafo" , SearchFormHTML));
		HtmlFreeMarker.addLayout("ATLTrafo", layouts);
	}

	private static HtmlATLTrafoJson HTML = new HtmlATLTrafoJson(new CustomATLTrafoHtml());

	/**
	 * Auto-generated method to overwrite the information from an artifact
	 * 
	 * @author miso.distil.codeGenerator
	 */
	public static void overWriteInfoReadOne() {
		get(ReadIdHTML,
			(request, response) -> HTML.getRead(request, response), 
			new FreeMarkerEngine());
	}

	/**
	 * Auto-generated method to overwrite the information from an artifact's list
	 * 
	 * @author miso.distil.codeGenerator
	 */
	public static void overWriteInfoReadAll() {
		get(ReadAllHTML,
			(request, response) -> HTML.getReadAll(request, response), 
			new FreeMarkerEngine());

		get(SearchHTML,
			(request, response) -> HTML.getSearch(request, response), 
			new FreeMarkerEngine());
	}

	/**
	 * Auto-generated method to overwrite the search form
	 * 
	 * @author miso.distil.codeGenerator
	 */
	public static void overWriteSearchForm() {
		get(SearchFormHTML,
			(request, response) -> HTML.getSearchForm(), 
			new FreeMarkerEngine());
	}

	/**
	 * Auto-generated method to overwrite the upload form
	 * 
	 * @author miso.distil.codeGenerator
	 */
	public static void overWriteUploadForm() {
		get(UploadFormHTML,
			(request, response) -> HTML.getUploadForm(request, response), 
			new FreeMarkerEngine());
	}
}
