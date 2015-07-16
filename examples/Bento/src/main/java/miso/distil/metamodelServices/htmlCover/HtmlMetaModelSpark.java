package miso.distil.metamodelServices.htmlCover;

import static spark.Spark.get;
import spark.template.freemarker.FreeMarkerEngine;

import java.util.ArrayList;
import java.util.List;

import miso.carrascal.cloudModelServices.abstractServices.basic.BasicInterfaceSpark;
import miso.carrascal.cloudModelServices.abstractServices.htmlCover.HtmlFreeMarker;
import miso.carrascal.cloudModelServices.abstractServices.htmlCover.htmlObjects.HtmlLayout;

import miso.distil.metamodelServices.basic.BasicMetaModelParam;
import miso.distil.metamodelServices.CustomMetaModelHtml;
import miso.distil.metamodelServices.htmlCover.HtmlMetaModelJson;

/**
 * Auto-generated html spark server
 * 
 * @author miso.distil.codeGenerator
 */
public final class HtmlMetaModelSpark implements BasicInterfaceSpark {

	// URL's
	public static String ReadHTML = "/html/metamodel/read/";
	public static String ReadIdHTML = ReadHTML + BasicMetaModelParam.IdGet;
	public static String ReadAllHTML = "/html/metamodel/all";
	public static String SearchHTML = "/html/metamodel/search";
	public static String SearchFormHTML = "/html/metamodel/search/form";
	public static String UploadFormHTML = "/html/metamodel/upload";

	/**
	 * Auto-generated html spark service. It initializes all html url's
	 * 
	 * @author miso.distil.codeGenerator
	 */
	@Override
	public void runService() {

		HtmlMetaModelJson HTML = new HtmlMetaModelJson();

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
		layouts.add(new HtmlLayout("Read all metamodels" , ReadAllHTML));
		layouts.add(new HtmlLayout("Upload metamodel" , UploadFormHTML));
		layouts.add(new HtmlLayout("Search metamodel" , SearchFormHTML));
		HtmlFreeMarker.addLayout("MetaModel", layouts);
	}

	private static HtmlMetaModelJson HTML = new HtmlMetaModelJson(new CustomMetaModelHtml());

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
