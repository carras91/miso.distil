package miso.carrascal.cloudModelServices.examples.modelServices.htmlCover;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import miso.carrascal.cloudModelServices.abstractServices.Persistent;
import miso.carrascal.cloudModelServices.abstractServices.htmlCover.HtmlFreeMarker;
import miso.carrascal.cloudModelServices.abstractServices.htmlCover.HtmlInterfaceJson;
import miso.carrascal.cloudModelServices.examples.modelServices.Model;
import miso.carrascal.cloudModelServices.examples.modelServices.basic.BasicModelCodes;
import miso.carrascal.cloudModelServices.examples.modelServices.basic.BasicModelJson;
import spark.ModelAndView;
import spark.Request;
import spark.Response;

public class HtmlModelJson implements HtmlInterfaceJson {
	
	private BasicModelJson JSON = new BasicModelJson();
	private HtmlModelView View = new HtmlModelView();

	@Override
	public ModelAndView getRead(Request req, Response res) {
		Map<String, Object> viewObjects = new HashMap<String, Object>();
		
		Model model = (Model) JSON.getRead(req, res);
		if(model == null) {
			viewObjects.put(HtmlFreeMarker.ERROR, BasicModelCodes.Model_notfound);
		} else {
			viewObjects.put(HtmlFreeMarker.ENTRIES, View.constructInfoReadOne(model));
		}
		viewObjects.put(HtmlFreeMarker.TEMPLATE, HtmlFreeMarker.READ_HTML);
        return HtmlFreeMarker.closeHtml(viewObjects);
	}

	@Override
	public ModelAndView getReadAll(Request req, Response res) {
		Map<String, Object> viewObjects = new HashMap<String, Object>();
		
		ArrayList<Model> models = new ArrayList<Model>();
		for(Persistent model : JSON.getReadAll(req, res)) {
			models.add((Model)model);
		}
		viewObjects.put(HtmlFreeMarker.MULTI_ENTRIES, View.constructInfoReadAll(models));
		viewObjects.put(HtmlFreeMarker.COUNT, models.size());
		viewObjects.put(HtmlFreeMarker.TEMPLATE, HtmlFreeMarker.LIST_HTML);
        return HtmlFreeMarker.closeHtml(viewObjects);
	}

	@Override
	public ModelAndView getSearchForm() {
		Map<String, Object> viewObjects = View.constructSearchForm();
		viewObjects.put(HtmlFreeMarker.TEMPLATE, HtmlFreeMarker.FORM_HTML); 
        return HtmlFreeMarker.closeHtml(viewObjects);
	}

	@Override
	public ModelAndView getSearch(Request req, Response res) {	
		Map<String, Object> viewObjects;
				
		ArrayList<Model> models = new ArrayList<Model>();
		for(Persistent model : JSON.getSearch(req, res)) {
			models.add((Model)model);
		}

		if(models.isEmpty()) {
			viewObjects = View.constructSearchForm();
			viewObjects.put(HtmlFreeMarker.TEMPLATE, HtmlFreeMarker.FORM_HTML); 
			viewObjects.put(HtmlFreeMarker.EMPTY, BasicModelCodes.Search_empty);
		} else {	
			viewObjects = new HashMap<String, Object>();
			viewObjects.put(HtmlFreeMarker.MULTI_ENTRIES, View.constructInfoReadAll(models));
			viewObjects.put(HtmlFreeMarker.COUNT, models.size());
			viewObjects.put(HtmlFreeMarker.SYNONYMS_QUERY, JSON.getSynonymesQuery(req, res));
			viewObjects.put(HtmlFreeMarker.SYNONYMS_VALUE, JSON.getSynonymesValue(req, res));
			viewObjects.put(HtmlFreeMarker.TEMPLATE, HtmlFreeMarker.LIST_HTML);
        }
        return HtmlFreeMarker.closeHtml(viewObjects);
	}

	@Override
	public ModelAndView getUpdateForm(Request req, Response res) {
		Map<String, Object> viewObjects = new HashMap<String, Object>();
		
		Model model = (Model) JSON.getRead(req, res);
		if(model == null) {
			viewObjects.put(HtmlFreeMarker.ERROR, BasicModelCodes.Search_empty);
		} else {
			viewObjects = View.constructUpdateForm(model);
		}

		viewObjects.put(HtmlFreeMarker.TEMPLATE, HtmlFreeMarker.FORM_HTML);
        return HtmlFreeMarker.closeHtml(viewObjects);
	}

	@Override
	public ModelAndView getUploadForm(Request req, Response res) {
		Map<String, Object> viewObjects = View.constructUploadForm(req);
		viewObjects.put(HtmlFreeMarker.TEMPLATE, HtmlFreeMarker.FORM_HTML); 
        return HtmlFreeMarker.closeHtml(viewObjects);
	}
}
