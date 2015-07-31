package miso.carrascal.cloudModelServices.abstractServices.htmlCover;

import java.util.HashMap;

import spark.ModelAndView;
import spark.Request;
import spark.Response;

/**
 * Interface to implement html service executions.
 * 
 * @author Carlos Carrascal.
 */
public interface HtmlInterfaceJson {
	
	/**
	 * To read information from an artifact.
	 *  
	 * @param req Spark request.
	 * @param res Spark response.
	 * @return special structure for SPARK.
	 */
	default public ModelAndView getRead(Request req, Response res) {
        return HtmlFreeMarker.closeHtml(new HashMap<String, Object>());
	}
	
	/**
	 * To read information from multiple artifacts.
	 * 
	 * @param req Spark request.
	 * @param res Spark response.
	 * @return special structure for SPARK.
	 */
	default public ModelAndView getReadAll(Request req, Response res) {
        return HtmlFreeMarker.closeHtml(new HashMap<String, Object>());
	}
	
	/**
	 * To create the search html form.
	 * 
	 * @return special structure for SPARK.
	 */
	default public ModelAndView getSearchForm() {
        return HtmlFreeMarker.closeHtml(new HashMap<String, Object>());
	}
	
	/**
	 * To read information from a search into de data base.
	 * 
	 * @param req Spark request.
	 * @param res Spark response.
	 * @return special structure for SPARK.
	 */
	default public ModelAndView getSearch(Request req, Response res) {
        return HtmlFreeMarker.closeHtml(new HashMap<String, Object>());
	}
	
	/**
	 * To create the update html form.
	 * 
	 * @param req Spark request.
	 * @param res Spark response.
	 * @return special structure for SPARK.
	 */
	default public ModelAndView getUpdateForm(Request req, Response res) {
        return HtmlFreeMarker.closeHtml(new HashMap<String, Object>());
	}
	
	/**
	 * To create the upload html form.
	 * 
	 * @param req Spark request.
	 * @param res Spark response.
	 * @return special structure for SPARK.
	 */
	default public ModelAndView getUploadForm(Request req, Response res) {
        return HtmlFreeMarker.closeHtml(new HashMap<String, Object>());
	}
}
