package miso.distil.documentServices.htmlCover;

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

import miso.distil.documentServices.basic.BasicDocumentCodes;
import miso.distil.documentServices.DocumentJson;
import miso.distil.documentServices.CustomDocumentHtml;
import miso.distil.documentServices.Document;

/**
 * Auto-generated html methods
 * 
 * @author miso.distil.codeGenerator
 */
public class HtmlDocumentJson implements HtmlInterfaceJson {

	private DocumentJson Json = new DocumentJson();
	private HtmlDocumentView View = new HtmlDocumentView();
	private HtmlInterfaceView<Document> customView;

	/**
	 * Auto-generated empty constructor
	 * 
	 * @author miso.distil.codeGenerator
	 */
	public HtmlDocumentJson() {
		customView = View;
	}

	/**
	 * Auto-generated constructor with a custom view
	 * 
	 * @author miso.distil.codeGenerator
	 */
	public HtmlDocumentJson(CustomDocumentHtml View) {
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

		Document document = (Document) Json.getRead(req, res);
		if(document == null) {
			viewObjects.put(HtmlFreeMarker.ERROR, BasicDocumentCodes.DB_notfound);
		} else {
			viewObjects.put(HtmlFreeMarker.ENTRIES, customView.constructInfoReadOne(document));
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

		ArrayList<Document> documents = new ArrayList<Document>();
		documents.addAll(Json.getReadAll(req, res));
		viewObjects.put(HtmlFreeMarker.MULTI_ENTRIES, customView.constructInfoReadAll(documents));
		viewObjects.put(HtmlFreeMarker.COUNT, documents.size());
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

		ArrayList<Document> documents = new ArrayList<Document>();
		documents.addAll(Json.getSearch(req, res));
		if(documents.isEmpty()) {
			viewObjects = View.constructSearchForm();
			viewObjects.put(HtmlFreeMarker.TEMPLATE, HtmlFreeMarker.FORM_HTML); 
			viewObjects.put(HtmlFreeMarker.EMPTY, BasicDocumentCodes.Document_notfound);
			viewObjects.put(HtmlFreeMarker.SYNONYMS_VALUES, Utils.listToString(Json.getSynonymsValue(req, res)));
		} else {	
			viewObjects = new HashMap<String, Object>();
			viewObjects.put(HtmlFreeMarker.MULTI_ENTRIES, customView.constructInfoReadAll(documents));
			viewObjects.put(HtmlFreeMarker.COUNT, documents.size());
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

		Document document = (Document) Json.getRead(req, res);
		if(document == null) {
			viewObjects.put(HtmlFreeMarker.ERROR, BasicDocumentCodes.Document_notfound);
		} else {
			viewObjects = customView.constructUpdateForm(document);
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
