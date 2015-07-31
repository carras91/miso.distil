package miso.distil.modelServices.htmlCover;

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

import miso.distil.modelServices.ModelJson;
import miso.distil.modelServices.CustomModelHtml;
import miso.distil.modelServices.Model;

/**
 * Auto-generated html methods.
 * 
 * @author miso.distil.codeGenerator.
 */
public class HtmlModelJson implements HtmlInterfaceJson {

	private ModelJson Json = new ModelJson();
	private HtmlModelView View = new HtmlModelView();
	private HtmlInterfaceView<Model> customView;

	/**
	 * Auto-generated empty constructor. To use auto-generated HtmlModelView.
	 */
	public HtmlModelJson() {
		customView = View;
	}

	/**
	 * Auto-generated constructor with a custom view.
	 * 
	 * @param View Custom View.
	 */
	public HtmlModelJson(CustomModelHtml View) {
		customView = View;
	}

	/**
	 * Auto-generated method to read the information from an artifact.
	 * 
	 * @param req Spark request.
	 * @param res Spark response.
	 * @return special structure for SPARK.
	 */
	@Override
	public ModelAndView getRead(Request req, Response res) {
		Map<String, Object> viewObjects = new HashMap<String, Object>();

		Model model = (Model) Json.getRead(req, res);
		if(model == null) {
			viewObjects.put(HtmlFreeMarker.ERROR, "Model not found in data base");
		} else {
			viewObjects.put(HtmlFreeMarker.ENTRIES, customView.constructInfoReadOne(model));
		}
		viewObjects.put(HtmlFreeMarker.TEMPLATE, HtmlFreeMarker.READ_HTML);

		return HtmlFreeMarker.closeHtml(viewObjects);
	}

	/**
	 * Auto-generated method to read the information from an artifact's list.
	 * 
	 * @param req Spark request.
	 * @param res Spark response.
	 * @return special structure for SPARK.
	 */
	@Override
	public ModelAndView getReadAll(Request req, Response res) {
		Map<String, Object> viewObjects = new HashMap<String, Object>();

		ArrayList<Model> models = new ArrayList<Model>();
		models.addAll(Json.getReadAll(req, res));
		viewObjects.put(HtmlFreeMarker.MULTI_ENTRIES, customView.constructInfoReadAll(models));
		viewObjects.put(HtmlFreeMarker.COUNT, models.size());
		viewObjects.put(HtmlFreeMarker.TEMPLATE, HtmlFreeMarker.LIST_HTML);

		return HtmlFreeMarker.closeHtml(viewObjects);
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

		ArrayList<Model> models = new ArrayList<Model>();
		models.addAll(Json.getSearch(req, res));
		if(models.isEmpty()) {
			viewObjects = View.constructSearchForm();
			viewObjects.put(HtmlFreeMarker.TEMPLATE, HtmlFreeMarker.FORM_HTML); 
			viewObjects.put(HtmlFreeMarker.EMPTY, "Model not found in data base");
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
	 * Auto-generated method to construct the update form.
	 * 
	 * @param req Spark request.
	 * @param res Spark response.
	 * @return special structure for SPARK.
	 */
	@Override
	public ModelAndView getUpdateForm(Request req, Response res) {
		Map<String, Object> viewObjects = new HashMap<String, Object>();

		Model model = (Model) Json.getRead(req, res);
		if(model == null) {
			viewObjects.put(HtmlFreeMarker.ERROR, "Model not found in data base");
		} else {
			viewObjects = customView.constructUpdateForm(model);
		}
		viewObjects.put(HtmlFreeMarker.TEMPLATE, HtmlFreeMarker.FORM_HTML);

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
