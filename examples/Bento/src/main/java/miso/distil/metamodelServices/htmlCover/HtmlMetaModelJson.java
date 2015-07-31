package miso.distil.metamodelServices.htmlCover;

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

import miso.distil.metamodelServices.MetaModelJson;
import miso.distil.metamodelServices.CustomMetaModelHtml;
import miso.distil.metamodelServices.MetaModel;

/**
 * Auto-generated html methods.
 * 
 * @author miso.distil.codeGenerator.
 */
public class HtmlMetaModelJson implements HtmlInterfaceJson {

	private MetaModelJson Json = new MetaModelJson();
	private HtmlMetaModelView View = new HtmlMetaModelView();
	private HtmlInterfaceView<MetaModel> customView;

	/**
	 * Auto-generated empty constructor. To use auto-generated HtmlMetaModelView.
	 */
	public HtmlMetaModelJson() {
		customView = View;
	}

	/**
	 * Auto-generated constructor with a custom view.
	 * 
	 * @param View Custom View.
	 */
	public HtmlMetaModelJson(CustomMetaModelHtml View) {
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

		ArrayList<MetaModel> metamodels = new ArrayList<MetaModel>();
		metamodels.addAll(Json.getSearch(req, res));
		if(metamodels.isEmpty()) {
			viewObjects = View.constructSearchForm();
			viewObjects.put(HtmlFreeMarker.TEMPLATE, HtmlFreeMarker.FORM_HTML); 
			viewObjects.put(HtmlFreeMarker.EMPTY, "MetaModel not found in data base");
			viewObjects.put(HtmlFreeMarker.SYNONYMS_VALUES, Utils.listToString(Json.getSynonymsValue(req, res)));
		} else {	
			viewObjects = new HashMap<String, Object>();
			viewObjects.put(HtmlFreeMarker.MULTI_ENTRIES, customView.constructInfoReadAll(metamodels));
			viewObjects.put(HtmlFreeMarker.COUNT, metamodels.size());
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
