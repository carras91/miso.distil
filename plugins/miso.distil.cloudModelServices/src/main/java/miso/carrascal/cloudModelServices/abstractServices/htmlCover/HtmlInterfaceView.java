package miso.carrascal.cloudModelServices.abstractServices.htmlCover;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import miso.carrascal.cloudModelServices.abstractServices.Persistent;
import miso.carrascal.cloudModelServices.abstractServices.htmlCover.htmlObjects.HtmlEntry;

/**
 * Interface to implement html views.
 * @author Carlos Carrascal.
 *
 * @param <T> type of artifact to work with.
 */
public interface HtmlInterfaceView<T extends Persistent> {
	
	/**
	 * Create information to read in one object.
	 * 
	 * @param object Artifact to read.
	 * @return list with entries to show in html.
	 */
	default public List<HtmlEntry> constructInfoReadOne(T object) {
		return new ArrayList<HtmlEntry>();
	}
	
	/**
	 * Create information to read in a list of objects.
	 * 
	 * @param objects Artifacts to read.
	 * @return list with lists of entries to show in html.
	 */
	default public List<List<HtmlEntry>> constructInfoReadAll(List<T> objects) {
		return new ArrayList<List<HtmlEntry>>();
	}
	
	/**
	 * Create search html form.
	 * 
	 * @return special map of SPARK to show objects in HTML.
	 */
	default public Map<String, Object> constructSearchForm() {
		return new HashMap<String, Object>();
	}

	/**
	 * Create update html form.
	 * 
	 * @param object Artifact to update.
	 * @return special map of SPARK to show objects in HTML.
	 */
	default public Map<String, Object> constructUpdateForm(T object) {
		return new HashMap<String, Object>();
	}
	
	/**
	 * Create upload html form.
	 * 
	 * @return special map of SPARK to show objects in HTML.
	 */
	default public Map<String, Object> constructUploadForm() { 
		return new HashMap<String, Object>();
	}
}
