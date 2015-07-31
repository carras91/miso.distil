package miso.distil.atltrafoServices.htmlCover;

import spark.ModelAndView;
import spark.Request;
import spark.Response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import miso.carrascal.cloudModelServices.abstractServices.htmlCover.HtmlInterfaceJson;
import miso.carrascal.cloudModelServices.abstractServices.htmlCover.HtmlFreeMarker;
import miso.carrascal.cloudModelServices.abstractServices.htmlCover.HtmlInterfaceView;
import miso.carrascal.cloudModelServices.utils.Utils;

import miso.distil.atltrafoServices.ATLTrafoJson;
import miso.distil.atltrafoServices.CustomATLTrafoHtml;
import miso.distil.atltrafoServices.ATLTrafo;

/**
 * Auto-generated html methods.
 * 
 * @author miso.distil.codeGenerator.
 */
public class HtmlATLTrafoJson implements HtmlInterfaceJson {

	private ATLTrafoJson Json = new ATLTrafoJson();
	private HtmlATLTrafoView View = new HtmlATLTrafoView();
	private HtmlInterfaceView<ATLTrafo> customView;

	/**
	 * Auto-generated empty constructor. To use auto-generated HtmlATLTrafoView.
	 */
	public HtmlATLTrafoJson() {
		customView = View;
	}

	/**
	 * Auto-generated constructor with a custom view.
	 * 
	 * @param View Custom View.
	 */
	public HtmlATLTrafoJson(CustomATLTrafoHtml View) {
		customView = View;
	}

	/**
	 * Auto-generated method to construct the search form.
	 * 
	 * @return special structure for SPARK.
	 */
	@Override
	public ModelAndView getSearchForm() {
		Map<String, Object> viewObjects = new HashMap<String, Object>();
		viewObjects = View.constructSearchForm();
		viewObjects.put(HtmlFreeMarker.TEMPLATE, HtmlFreeMarker.FORM_HTML); 
	
		return HtmlFreeMarker.closeHtml(viewObjects);
	}

	/**
	 * Auto-generated method to read the information from the result list of a search.
	 * 
	 * @param req Spark request.
	 * @param res Spark response.
	 * @return special structure for SPARK.
	 */
	@Override
	public ModelAndView getSearch(Request req, Response res) {	
		Map<String, Object> viewObjects = new HashMap<String, Object>();

		ArrayList<ATLTrafo> atltrafos = new ArrayList<ATLTrafo>();
		atltrafos.addAll(Json.getSearch(req, res));
		if(atltrafos.isEmpty()) {
			viewObjects = View.constructSearchForm();
			viewObjects.put(HtmlFreeMarker.TEMPLATE, HtmlFreeMarker.FORM_HTML); 
			viewObjects.put(HtmlFreeMarker.EMPTY, "ATLTrafo not found in data base");
			viewObjects.put(HtmlFreeMarker.SYNONYMS_VALUES, Utils.listToString(Json.getSynonymsValue(req, res)));
		} else {	
			viewObjects = new HashMap<String, Object>();
			viewObjects.put(HtmlFreeMarker.MULTI_ENTRIES, customView.constructInfoReadAll(atltrafos));
			viewObjects.put(HtmlFreeMarker.COUNT, atltrafos.size());
			viewObjects.put(HtmlFreeMarker.SYNONYMS_VALUES, Utils.listToString(Json.getSynonymsValue(req, res)));
			viewObjects.put(HtmlFreeMarker.TEMPLATE, HtmlFreeMarker.LIST_HTML);
		}

		return HtmlFreeMarker.closeHtml(viewObjects);
	}

	/**
	 * Auto-generated method to construct the upload form.
	 * 
	 * @param req Spark request.
	 * @param res Spark response.
	 * @return special structure for SPARK.
	 */
	@Override
	public ModelAndView getUploadForm(Request req, Response res) {
		Map<String, Object> viewObjects = new HashMap<String, Object>();
		viewObjects = customView.constructUploadForm();
		viewObjects.put(HtmlFreeMarker.TEMPLATE, HtmlFreeMarker.FORM_HTML); 

		return HtmlFreeMarker.closeHtml(viewObjects);
	}

}
