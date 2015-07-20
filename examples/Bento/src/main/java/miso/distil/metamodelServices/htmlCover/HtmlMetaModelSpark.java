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
 * Auto-generated html spark server
 * 
 * @author miso.distil.codeGenerator
 */
public final class HtmlMetaModelSpark implements BasicInterfaceSpark {

	// URL's
	public static String SearchFormHTML = "/html/metamodel/search/form";
	public static String SearchHTML = "/html/metamodel/search";
	public static String UploadFormHTML = "/html/metamodel/upload";

	/**
	 * Auto-generated html spark service. It initializes all html url's
	 * 
	 * @author miso.distil.codeGenerator
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
	 * Auto-generated layout service. It add's to the html layout some permanents links
	 * 
	 * @author miso.distil.codeGenerator
	 */
	private void addLayout() {
		List<HtmlSelectBox> layouts = new ArrayList<HtmlSelectBox>();
		layouts.add(new HtmlSelectBox("Upload metamodel" , UploadFormHTML));
		layouts.add(new HtmlSelectBox("Search metamodel" , SearchFormHTML));
		HtmlFreeMarker.addLayout("MetaModel", layouts);
	}

	private static HtmlMetaModelJson HTML = new HtmlMetaModelJson(new CustomMetaModelHtml());

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
