package miso.distil.metamodelServices.htmlCover;

import static spark.Spark.get;
import spark.template.freemarker.FreeMarkerEngine;

import java.util.ArrayList;
import java.util.List;

import miso.carrascal.cloudModelServices.abstractServices.basic.BasicInterfaceSpark;
import miso.carrascal.cloudModelServices.abstractServices.htmlCover.HtmlFreeMarker;
import miso.carrascal.cloudModelServices.abstractServices.htmlCover.htmlObjects.HtmlSelectBox;

import miso.distil.metamodelServices.CustomMetaModelHtml;
import miso.distil.metamodelServices.htmlCover.HtmlMetaModelJson;

/**
 * Auto-generated html spark server.
 * 
 * @author miso.distil.codeGenerator.
 */
public final class HtmlMetaModelSpark implements BasicInterfaceSpark {

	/**
	 * Get search form html url.
	 */
	public static String SearchFormHTML = "/html/metamodel/search/form";
	/**
	 * Search html url.
	 */
	public static String SearchHTML = "/html/metamodel/search";
	/**
	 * Get upload form html url.
	 */
	public static String UploadFormHTML = "/html/metamodel/upload";

	/**
	 * Auto-generated html spark service. It initializes all html url's.
	 */
	@Override
	public void runService() {

		HtmlMetaModelJson HTML = new HtmlMetaModelJson();

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
	 * Auto-generated layout service. It add's to the html layout some permanents links.
	 */
	private void addLayout() {
		List<HtmlSelectBox> layouts = new ArrayList<HtmlSelectBox>();
		layouts.add(new HtmlSelectBox("Upload metamodel" , UploadFormHTML));
		layouts.add(new HtmlSelectBox("Search metamodel" , SearchFormHTML));
		HtmlFreeMarker.addLayout("MetaModel", layouts);
	}

	/**
	 * HtmlMetaModelJson with CustomMetaModelHtml to overwrite html services.
	 */
	private static HtmlMetaModelJson HTML = new HtmlMetaModelJson(new CustomMetaModelHtml());

	/**
	 * Auto-generated method to overwrite the search form.
	 */
	public static void overWriteSearchForm() {
		get(SearchFormHTML,
			(request, response) -> HTML.getSearchForm(), 
			new FreeMarkerEngine());
	}

	/**
	 * Auto-generated method to overwrite the upload form.
	 */
	public static void overWriteUploadForm() {
		get(UploadFormHTML,
			(request, response) -> HTML.getUploadForm(request, response), 
			new FreeMarkerEngine());
	}
}
