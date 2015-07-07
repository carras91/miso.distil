package miso.carrascal.cloudModelServices.abstractServices.htmlCover;

import static spark.Spark.modelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import spark.ModelAndView;
import miso.carrascal.cloudModelServices.abstractServices.htmlCover.htmlObjects.HtmlLayout;

public class HtmlFreeMarker {
	public static String FORM_HTML = "form.ftl.html";
	public static String READ_HTML = "read.ftl.html";
	public static String LIST_HTML = "list.ftl.html";
	
	public static String FORM = "FORM";
	public static String TEXTS = "TEXTS";
	public static String RADIOS = "RADIOS";
	public static String FILE = "FILES";
	public static String HIDDENS = "HIDDENS";
	public static String MULTI_ENTRIES = "MULTI_ENTRIES";
	public static String ENTRIES = "ENTRIES";
	
	public static String ENCTYPE_DEFAULT = "application/x-www-form-urlencoded";
	public static String ENCTYPE_FILE = "multipart/form-data";	

	public static String EMPTY = "EMPTY";
	public static String ERROR = "ERROR";
	public static String TEMPLATE = "TEMPLATE";
	public static String COUNT = "COUNT";
	public static String SYNONYMS_QUERY = "SYNONYMSQUERY";
	public static String SYNONYMS_VALUE = "SYNONYMSVALUE";
	
	private static String LAYOUTS = "LAYOUTS";
	private static String LAYOUT_HTML = "layout.ftl.html";
	private static Map<String, List<HtmlLayout>> layouts = new HashMap<String, List<HtmlLayout>>();
	public static void addLayout(String label, List<HtmlLayout> layout) {
		layouts.put(label, layout);
	}
	
	public static ModelAndView closeHtml(Map<String, Object> viewObjects) {
		viewObjects.put(LAYOUTS, layouts);
		return modelAndView(viewObjects, LAYOUT_HTML);				
	}
}

