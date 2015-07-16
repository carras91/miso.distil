package miso.distil.modelServices.htmlCover;

import static spark.Spark.get;
import spark.template.freemarker.FreeMarkerEngine;

import java.util.ArrayList;
import java.util.List;

import miso.carrascal.cloudModelServices.abstractServices.basic.BasicInterfaceSpark;
import miso.carrascal.cloudModelServices.abstractServices.htmlCover.HtmlFreeMarker;
import miso.carrascal.cloudModelServices.abstractServices.htmlCover.htmlObjects.HtmlLayout;

import miso.distil.modelServices.basic.BasicModelParam;
import miso.distil.modelServices.CustomModelHtml;
import miso.distil.modelServices.htmlCover.HtmlModelJson;

/**
 * Auto-generated html spark server
 * 
 * @author miso.distil.codeGenerator
 */
public final class HtmlModelSpark implements BasicInterfaceSpark {

	// URL's
	public static String ReadHTML = "/html/model/read/";
	public static String ReadIdHTML = ReadHTML + BasicModelParam.IdGet;
	public static String ReadAllHTML = "/html/model/all";
	public static String SearchHTML = "/html/model/search";
	public static String SearchFormHTML = "/html/model/search/form";
	public static String UpdateFormHTML = "/html/model/update/";
	public static String UpdateFormIdHTML = UpdateFormHTML + BasicModelParam.IdGet;
	public static String UploadFormHTML = "/html/model/upload";

	/**
	 * Auto-generated html spark service. It initializes all html url's
	 * 
	 * @author miso.distil.codeGenerator
	 */
	@Override
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

	/**
	 * Auto-generated layout service. It add's to the html layout some permanents links
	 * 
	 * @author miso.distil.codeGenerator
	 */
	private void addLayout() {
		List<HtmlLayout> layouts = new ArrayList<HtmlLayout>();
		layouts.add(new HtmlLayout("Read all models" , ReadAllHTML));
		layouts.add(new HtmlLayout("Upload model" , UploadFormHTML));
		layouts.add(new HtmlLayout("Search model" , SearchFormHTML));
		HtmlFreeMarker.addLayout("Model", layouts);
	}

	private static HtmlModelJson HTML = new HtmlModelJson(new CustomModelHtml());

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
	 * Auto-generated method to overwrite the update form
	 * 
	 * @author miso.distil.codeGenerator
	 */
	public static void overWriteUpdateForm() {
		get(UpdateFormIdHTML,
			(request, response) -> HTML.getUpdateForm(request, response), 
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
