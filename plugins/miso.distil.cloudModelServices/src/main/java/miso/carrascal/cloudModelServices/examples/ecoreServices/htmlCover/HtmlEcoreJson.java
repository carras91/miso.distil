package miso.carrascal.cloudModelServices.examples.ecoreServices.htmlCover;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import miso.carrascal.cloudModelServices.abstractServices.AbstractPersistentClass;
import miso.carrascal.cloudModelServices.abstractServices.htmlCover.HtmlFreeMarker;
import miso.carrascal.cloudModelServices.abstractServices.htmlCover.HtmlInterfaceJson;
import miso.carrascal.cloudModelServices.examples.ecoreServices.Ecore;
import miso.carrascal.cloudModelServices.examples.ecoreServices.basic.BasicEcoreCodes;
import miso.carrascal.cloudModelServices.examples.ecoreServices.basic.BasicEcoreJson;
import spark.ModelAndView;
import spark.Request;
import spark.Response;

public class HtmlEcoreJson implements HtmlInterfaceJson {

	private BasicEcoreJson JSON = new BasicEcoreJson();
	private HtmlEcoreView View = new HtmlEcoreView();

	@Override
	public ModelAndView getRead(Request req, Response res) {
		Map<String, Object> viewObjects = new HashMap<String, Object>();
		
		Ecore ecore = (Ecore) JSON.getRead(req, res);
		if(ecore == null) {
			viewObjects.put(HtmlFreeMarker.ERROR, BasicEcoreCodes.DB_notfound);
		} else {
			viewObjects.put(HtmlFreeMarker.ENTRIES, View.constructInfoReadOne(ecore));
		}
		viewObjects.put(HtmlFreeMarker.TEMPLATE, HtmlFreeMarker.READ_HTML);
		return HtmlFreeMarker.closeHtml(viewObjects);
	}

	@Override
	public ModelAndView getReadAll(Request req, Response res) {
		Map<String, Object> viewObjects = new HashMap<String, Object>();
		
		ArrayList<Ecore> ecores = new ArrayList<Ecore>();
		for(AbstractPersistentClass ecore : JSON.getReadAll(req, res)) {
			ecores.add((Ecore)ecore);
		}
		viewObjects.put(HtmlFreeMarker.MULTI_ENTRIES, View.constructInfoReadAll(ecores));
		viewObjects.put(HtmlFreeMarker.COUNT, ecores.size());
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
				
		ArrayList<Ecore> ecores = JSON.getSearch(req, res);
		if(ecores.isEmpty()) {
			viewObjects = View.constructSearchForm();
			viewObjects.put(HtmlFreeMarker.TEMPLATE, HtmlFreeMarker.FORM_HTML); 
			viewObjects.put(HtmlFreeMarker.EMPTY, BasicEcoreCodes.Ecore_notfound);
		} else {	
			viewObjects = new HashMap<String, Object>();
			viewObjects.put(HtmlFreeMarker.MULTI_ENTRIES, View.constructInfoReadAll(ecores));
			viewObjects.put(HtmlFreeMarker.COUNT, ecores.size());
			viewObjects.put(HtmlFreeMarker.SYNONYMS_QUERY, JSON.getSynonymesQuery(req, res));
			viewObjects.put(HtmlFreeMarker.SYNONYMS_VALUE, JSON.getSynonymesValue(req, res));
			viewObjects.put(HtmlFreeMarker.TEMPLATE, HtmlFreeMarker.LIST_HTML);
        }
		return HtmlFreeMarker.closeHtml(viewObjects);
	}

	@Override
	public ModelAndView getUpdateForm(Request req, Response res) {
		Map<String, Object> viewObjects = new HashMap<String, Object>();

		Ecore ecore = (Ecore) JSON.getRead(req, res);
		if(ecore == null) {
			viewObjects.put(HtmlFreeMarker.ERROR, BasicEcoreCodes.Ecore_notfound);
		} else {
			viewObjects = View.constructUpdateForm(ecore);
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
