package miso.distil.videoServices.htmlCover;

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

import miso.distil.videoServices.basic.BasicVideoCodes;
import miso.distil.videoServices.VideoJson;
import miso.distil.videoServices.CustomVideoHtml;
import miso.distil.videoServices.Video;

/**
 * Auto-generated html methods
 * 
 * @author miso.distil.codeGenerator
 */
public class HtmlVideoJson implements HtmlInterfaceJson {

	private VideoJson Json = new VideoJson();
	private HtmlVideoView View = new HtmlVideoView();
	private HtmlInterfaceView<Video> customView;

	/**
	 * Auto-generated empty constructor
	 * 
	 * @author miso.distil.codeGenerator
	 */
	public HtmlVideoJson() {
		customView = View;
	}

	/**
	 * Auto-generated constructor with a custom view
	 * 
	 * @author miso.distil.codeGenerator
	 */
	public HtmlVideoJson(CustomVideoHtml View) {
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

		Video video = (Video) Json.getRead(req, res);
		if(video == null) {
			viewObjects.put(HtmlFreeMarker.ERROR, BasicVideoCodes.DB_notfound);
		} else {
			viewObjects.put(HtmlFreeMarker.ENTRIES, customView.constructInfoReadOne(video));
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

		ArrayList<Video> videos = new ArrayList<Video>();
		videos.addAll(Json.getReadAll(req, res));
		viewObjects.put(HtmlFreeMarker.MULTI_ENTRIES, customView.constructInfoReadAll(videos));
		viewObjects.put(HtmlFreeMarker.COUNT, videos.size());
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

		ArrayList<Video> videos = new ArrayList<Video>();
		videos.addAll(Json.getSearch(req, res));
		if(videos.isEmpty()) {
			viewObjects = View.constructSearchForm();
			viewObjects.put(HtmlFreeMarker.TEMPLATE, HtmlFreeMarker.FORM_HTML); 
			viewObjects.put(HtmlFreeMarker.EMPTY, BasicVideoCodes.Video_notfound);
			viewObjects.put(HtmlFreeMarker.SYNONYMS_VALUES, Utils.listToString(Json.getSynonymsValue(req, res)));
		} else {	
			viewObjects = new HashMap<String, Object>();
			viewObjects.put(HtmlFreeMarker.MULTI_ENTRIES, customView.constructInfoReadAll(videos));
			viewObjects.put(HtmlFreeMarker.COUNT, videos.size());
			viewObjects.put(HtmlFreeMarker.SYNONYMS_VALUES, Utils.listToString(Json.getSynonymsValue(req, res)));
			viewObjects.put(HtmlFreeMarker.TEMPLATE, HtmlFreeMarker.LIST_HTML);
		}

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
