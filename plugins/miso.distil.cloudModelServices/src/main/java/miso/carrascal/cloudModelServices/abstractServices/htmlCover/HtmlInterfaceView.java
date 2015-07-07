package miso.carrascal.cloudModelServices.abstractServices.htmlCover;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import spark.Request;
import miso.carrascal.cloudModelServices.abstractServices.AbstractPersistentClass;
import miso.carrascal.cloudModelServices.abstractServices.htmlCover.htmlObjects.HtmlEntry;

public interface HtmlInterfaceView<T extends AbstractPersistentClass> {
	
	default public List<HtmlEntry> constructInfoReadOne(T object) {
		return new ArrayList<HtmlEntry>();
	}
	
	default public List<List<HtmlEntry>> constructInfoReadAll(List<T> objects) {
		return new ArrayList<List<HtmlEntry>>();
	}
	
	default public Map<String, Object> constructSearchForm() {
		return new HashMap<String, Object>();
	}

	default public Map<String, Object> constructUpdateForm(T object) {
		return new HashMap<String, Object>();
	}
	
	default public Map<String, Object> constructUploadForm(Request req){ 
		return new HashMap<String, Object>();
	}
}
