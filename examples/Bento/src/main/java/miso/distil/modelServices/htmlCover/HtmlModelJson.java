package miso.distil.modelServices.htmlCover;

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

import miso.distil.modelServices.basic.BasicModelCodes;
import miso.distil.modelServices.ModelJson;
import miso.distil.modelServices.CustomModelHtml;
import miso.distil.modelServices.Model;

/**
 * Auto-generated html methods
 * 
 * @author miso.distil.codeGenerator
 */
public class HtmlModelJson implements HtmlInterfaceJson {

	private ModelJson Json = new ModelJson();
	private HtmlModelView View = new HtmlModelView();
	private HtmlInterfaceView<Model> customView;

	/**
	 * Auto-generated empty constructor
	 * 
	 * @author miso.distil.codeGenerator
	 */
	public HtmlModelJson() {
		customView = View;
	}

	/**
	 * Auto-generated constructor with a custom view
	 * 
	 * @author miso.distil.codeGenerator
	 */
	public HtmlModelJson(CustomModelHtml View) {
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

		Model model = (Model) Json.getRead(req, res);
		if(model == null) {
			viewObjects.put(HtmlFreeMarker.ERROR, BasicModelCodes.DB_notfound);
		} else {
			viewObjects.put(HtmlFreeMarker.ENTRIES, customView.constructInfoReadOne(model));
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

		ArrayList<Model> models = new ArrayList<Model>();
		for(Persistent model : Json.getReadAll(req, res)) {
			models.add((Model)model);
		}
		viewObjects.put(HtmlFreeMarker.MULTI_ENTRIES, customView.constructInfoReadAll(models));
		viewObjects.put(HtmlFreeMarker.COUNT, models.size());
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

		ArrayList<Model> models = new ArrayList<Model>();
		for(Persistent model : Json.getSearch(req, res)) {
			models.add((Model)model);
		}
		if(models.isEmpty()) {
			viewObjects = View.constructSearchForm();
			viewObjects.put(HtmlFreeMarker.TEMPLATE, HtmlFreeMarker.FORM_HTML); 
			viewObjects.put(HtmlFreeMarker.EMPTY, BasicModelCodes.Model_notfound);
			viewObjects.put(HtmlFreeMarker.SYNONYMS_VALUES, Utils.listToString(Json.getSynonymsValue(req, res)));
		} else {	
			viewObjects = new HashMap<String, Object>();
			viewObjects.put(HtmlFreeMarker.MULTI_ENTRIES, customView.constructInfoReadAll(models));
			viewObjects.put(HtmlFreeMarker.COUNT, models.size());
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

		Model model = (Model) Json.getRead(req, res);
		if(model == null) {
			viewObjects.put(HtmlFreeMarker.ERROR, BasicModelCodes.Model_notfound);
		} else {
			viewObjects = customView.constructUpdateForm(model);
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
