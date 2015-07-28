package miso.distil.bentoServices.htmlCover;

import spark.ModelAndView;
import spark.Request;
import spark.Response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import miso.carrascal.cloudModelServices.abstractServices.htmlCover.HtmlInterfaceJson;

import miso.carrascal.cloudModelServices.abstractServices.Persistent;
import miso.carrascal.cloudModelServices.abstractServices.htmlCover.HtmlFreeMarker;
import miso.carrascal.cloudModelServices.abstractServices.htmlCover.HtmlInterfaceView;
import miso.carrascal.cloudModelServices.utils.Utils;

import miso.distil.bentoServices.basic.BasicBentoCodes;
import miso.distil.bentoServices.BentoJson;
import miso.distil.bentoServices.CustomBentoHtml;
import miso.distil.bentoServices.Bento;

/**
 * Auto-generated html methods
 * 
 * @author miso.distil.codeGenerator
 */
public class HtmlBentoJson implements HtmlInterfaceJson {

	private BentoJson Json = new BentoJson();
	private HtmlBentoView View = new HtmlBentoView();
	private HtmlInterfaceView<Bento> customView;

	/**
	 * Auto-generated empty constructor
	 * 
	 * @author miso.distil.codeGenerator
	 */
	public HtmlBentoJson() {
		customView = View;
	}

	/**
	 * Auto-generated constructor with a custom view
	 * 
	 * @author miso.distil.codeGenerator
	 */
	public HtmlBentoJson(CustomBentoHtml View) {
		customView = View;
	}

	/**
	 * Auto-generated method to read the information from an artifact
	 * 
	 * @author miso.distil.codeGenerator
	 */
	@Override
	public ModelAndView getRead(Request req, Response res) {
		Map<String, Object> viewObjects = new HashMap<String, Object>();

		Bento bento = (Bento) Json.getRead(req, res);
		if(bento == null) {
			viewObjects.put(HtmlFreeMarker.ERROR, BasicBentoCodes.DB_notfound);
		} else {
			viewObjects.put(HtmlFreeMarker.ENTRIES, customView.constructInfoReadOne(bento));
		}
		viewObjects.put(HtmlFreeMarker.TEMPLATE, HtmlFreeMarker.READ_HTML);

		return HtmlFreeMarker.closeHtml(viewObjects);
	}

	/**
	 * Auto-generated method to read the information from an artifact's list
	 * 
	 * @author miso.distil.codeGenerator
	 */
	@Override
	public ModelAndView getReadAll(Request req, Response res) {
		Map<String, Object> viewObjects = new HashMap<String, Object>();

		ArrayList<Bento> bentos = new ArrayList<Bento>();
		for(Persistent bento : Json.getReadAll(req, res)) {
			bentos.add((Bento)bento);
		}
		viewObjects.put(HtmlFreeMarker.MULTI_ENTRIES, customView.constructInfoReadAll(bentos));
		viewObjects.put(HtmlFreeMarker.COUNT, bentos.size());
		viewObjects.put(HtmlFreeMarker.TEMPLATE, HtmlFreeMarker.LIST_HTML);

		return HtmlFreeMarker.closeHtml(viewObjects);
	}

	/**
	 * Auto-generated method to construct the search form
	 * 
	 * @author miso.distil.codeGenerator
	 */
	@Override
	public ModelAndView getSearchForm() {
		Map<String, Object> viewObjects = new HashMap<String, Object>();
		viewObjects = View.constructSearchForm();
		viewObjects.put(HtmlFreeMarker.TEMPLATE, HtmlFreeMarker.FORM_HTML); 
	
		return HtmlFreeMarker.closeHtml(viewObjects);
	}

	/**
	 * Auto-generated method to read the information from the result list of a search
	 * 
	 * @author miso.distil.codeGenerator
	 */
	@Override
	public ModelAndView getSearch(Request req, Response res) {	
		Map<String, Object> viewObjects = new HashMap<String, Object>();

		ArrayList<Bento> bentos = new ArrayList<Bento>();
		for(Persistent bento : Json.getSearch(req, res)) {
			bentos.add((Bento)bento);
		}
		if(bentos.isEmpty()) {
			viewObjects = View.constructSearchForm();
			viewObjects.put(HtmlFreeMarker.TEMPLATE, HtmlFreeMarker.FORM_HTML); 
			viewObjects.put(HtmlFreeMarker.EMPTY, BasicBentoCodes.Bento_notfound);
			viewObjects.put(HtmlFreeMarker.SYNONYMS_VALUES, Utils.listToString(Json.getSynonymsValue(req, res)));
		} else {	
			viewObjects = new HashMap<String, Object>();
			viewObjects.put(HtmlFreeMarker.MULTI_ENTRIES, customView.constructInfoReadAll(bentos));
			viewObjects.put(HtmlFreeMarker.COUNT, bentos.size());
			viewObjects.put(HtmlFreeMarker.SYNONYMS_VALUES, Utils.listToString(Json.getSynonymsValue(req, res)));
			viewObjects.put(HtmlFreeMarker.TEMPLATE, HtmlFreeMarker.LIST_HTML);
		}

		return HtmlFreeMarker.closeHtml(viewObjects);
	}

	/**
	 * Auto-generated method to construct the update form
	 * 
	 * @author miso.distil.codeGenerator
	 */
	@Override
	public ModelAndView getUpdateForm(Request req, Response res) {
		Map<String, Object> viewObjects = new HashMap<String, Object>();

		Bento bento = (Bento) Json.getRead(req, res);
		if(bento == null) {
			viewObjects.put(HtmlFreeMarker.ERROR, BasicBentoCodes.Bento_notfound);
		} else {
			viewObjects = customView.constructUpdateForm(bento);
		}
		viewObjects.put(HtmlFreeMarker.TEMPLATE, HtmlFreeMarker.FORM_HTML);

		return HtmlFreeMarker.closeHtml(viewObjects);
	}

	/**
	 * Auto-generated method to construct the upload form
	 * 
	 * @author miso.distil.codeGenerator
	 */
	@Override
	public ModelAndView getUploadForm(Request req, Response res) {
		Map<String, Object> viewObjects = new HashMap<String, Object>();
		viewObjects = customView.constructUploadForm(req);
		viewObjects.put(HtmlFreeMarker.TEMPLATE, HtmlFreeMarker.FORM_HTML); 

		return HtmlFreeMarker.closeHtml(viewObjects);
	}

}
