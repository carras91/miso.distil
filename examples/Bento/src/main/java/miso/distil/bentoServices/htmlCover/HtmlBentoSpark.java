package miso.distil.bentoServices.htmlCover;

import static spark.Spark.get;
import spark.template.freemarker.FreeMarkerEngine;

import java.util.ArrayList;
import java.util.List;

import miso.carrascal.cloudModelServices.abstractServices.basic.BasicInterfaceSpark;
import miso.carrascal.cloudModelServices.abstractServices.htmlCover.HtmlFreeMarker;
import miso.carrascal.cloudModelServices.abstractServices.htmlCover.htmlObjects.HtmlSelectBox;

import miso.distil.bentoServices.basic.BasicBentoParam;
import miso.distil.bentoServices.CustomBentoHtml;
import miso.distil.bentoServices.htmlCover.HtmlBentoJson;

/**
 * Auto-generated html spark server.
 * 
 * @author miso.distil.codeGenerator.
 */
public final class HtmlBentoSpark implements BasicInterfaceSpark {

	/**
	 * Read html url.
	 */
	public static String ReadHTML = "/html/bento/read/";
	/**
	 * Read html with id url.
	 */
	public static String ReadIdHTML = ReadHTML + BasicBentoParam.IdGet;
	/**
	 * Read all html url.
	 */
	public static String ReadAllHTML = "/html/bento/all";
	/**
	 * Search html url.
	 */
	public static String SearchHTML = "/html/bento/search";
	/**
	 * Get search form html url.
	 */
	public static String SearchFormHTML = "/html/bento/search/form";
	/**
	 * Get update form html url.
	 */
	public static String UpdateFormHTML = "/html/bento/update/";
	/**
	 * Get update form html with id url.
	 */
	public static String UpdateFormIdHTML = UpdateFormHTML + BasicBentoParam.IdGet;
	/**
	 * Get upload form html url.
	 */
	public static String UploadFormHTML = "/html/bento/upload";

	/**
	 * Auto-generated html spark service. It initializes all html url's.
	 */
	@Override
	public void runService() {

		HtmlBentoJson HTML = new HtmlBentoJson();

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
	 * Auto-generated layout service. It add's to the html layout some permanents links.
	 */
	private void addLayout() {
		List<HtmlSelectBox> layouts = new ArrayList<HtmlSelectBox>();
		layouts.add(new HtmlSelectBox("Read all bentos" , ReadAllHTML));
		layouts.add(new HtmlSelectBox("Upload bento" , UploadFormHTML));
		layouts.add(new HtmlSelectBox("Search bento" , SearchFormHTML));
		HtmlFreeMarker.addLayout("Bento", layouts);
	}

	/**
	 * HtmlBentoJson with CustomBentoHtml to overwrite html services.
	 */
	private static HtmlBentoJson HTML = new HtmlBentoJson(new CustomBentoHtml());

	/**
	 * Auto-generated method to overwrite the information from an artifact.
	 */
	public static void overWriteInfoReadOne() {
		get(ReadIdHTML,
			(request, response) -> HTML.getRead(request, response), 
			new FreeMarkerEngine());
	}

	/**
	 * Auto-generated method to overwrite the information from an artifact's list.
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
	 * Auto-generated method to overwrite the search form.
	 */
	public static void overWriteSearchForm() {
		get(SearchFormHTML,
			(request, response) -> HTML.getSearchForm(), 
			new FreeMarkerEngine());
	}

	/**
	 * Auto-generated method to overwrite the update form.
	 */
	public static void overWriteUpdateForm() {
		get(UpdateFormIdHTML,
			(request, response) -> HTML.getUpdateForm(request, response), 
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
