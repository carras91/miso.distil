package miso.carrascal.cloudModelServices.abstractServices.htmlCover;

import java.util.HashMap;

import spark.ModelAndView;
import spark.Request;
import spark.Response;

public interface HtmlInterfaceJson {
	
	default public ModelAndView getRead(Request req, Response res) {
        return HtmlFreeMarker.closeHtml(new HashMap<String, Object>());
	}
	
	default public ModelAndView getReadAll(Request req, Response res) {
        return HtmlFreeMarker.closeHtml(new HashMap<String, Object>());
	}
	
	default public ModelAndView getSearchForm() {
        return HtmlFreeMarker.closeHtml(new HashMap<String, Object>());
	}
	
	default public ModelAndView getSearch(Request req, Response res) {
        return HtmlFreeMarker.closeHtml(new HashMap<String, Object>());
	}
	
	default public ModelAndView getUpdateForm(Request req, Response res) {
        return HtmlFreeMarker.closeHtml(new HashMap<String, Object>());
	}
	
	default public ModelAndView getUploadForm(Request req, Response res) {
        return HtmlFreeMarker.closeHtml(new HashMap<String, Object>());
	}
}
