package miso.distil.atltrafoServices;

import spark.Request;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

import miso.carrascal.cloudModelServices.abstractServices.htmlCover.HtmlInterfaceView;
import miso.carrascal.cloudModelServices.abstractServices.htmlCover.HtmlFreeMarker;
import miso.carrascal.cloudModelServices.abstractServices.htmlCover.htmlObjects.*;
import miso.carrascal.cloudModelServices.abstractServices.basic.BasicInterfaceSpark;

import miso.distil.atltrafoServices.basic.BasicATLTrafoParam;
import miso.distil.atltrafoServices.basic.BasicATLTrafoSpark;
import miso.distil.atltrafoServices.htmlCover.HtmlATLTrafoSpark;
import miso.distil.atltrafoServices.ATLTrafo;

/**
 * Auto-generated custom html spark server
 * 
 * @author miso.distil.codeGenerator
 */
public class CustomATLTrafoHtml implements HtmlInterfaceView<ATLTrafo>, BasicInterfaceSpark
{
	/**
	 * Auto-generated custom spark service. It overwrites some html URL's
	 * 
	 * @author miso.distil.codeGenerator
	 */
	@Override
	public void runService() {

		// To overwrite the default constructions of HTML
		// Be careful: you need to modify the method previously
		// HtmlATLTrafoSpark.overWriteSearchForm();
		// HtmlATLTrafoSpark.overWriteUploadForm();
	}

	/**
	 * Auto-generated method to customice the search form
	 * 
	 * @author miso.distil.codeGenerator
	 */
	@Override
	public Map<String, Object> constructSearchForm() {
		Map<String, Object> viewObjects = new HashMap<String, Object>(); 

		// You need to add first a Form
		HtmlForm form = new HtmlForm(HtmlATLTrafoSpark.SearchHTML, "atltrafo-search-form", HtmlFreeMarker.ENCTYPE_DEFAULT, "Search", "GET");
		viewObjects.put(HtmlFreeMarker.FORM, form);

		// Then, whatever you want in your Form: Text, Radio, Hidden, File
		List<HtmlText> texts = new ArrayList<HtmlText>();
		texts.add(new HtmlText(BasicATLTrafoParam.Search_query, "?", "Search (name)", "search", "Enter where do you want to search"));
		texts.add(new HtmlText(BasicATLTrafoParam.Search_value, "", "Search (value)", "search", "Enter what do you want to search"));
		// ..
		viewObjects.put(HtmlFreeMarker.TEXTS, texts);

		List<HtmlRadio> radios = new ArrayList<HtmlRadio>();
		radios.add(new HtmlRadio(BasicATLTrafoParam.Synonyms_query, "Synonyms (name)", "synonyms", true));
		radios.add(new HtmlRadio(BasicATLTrafoParam.Synonyms_value, "Synonyms (value)", "synonyms", true));
		// ..
		viewObjects.put(HtmlFreeMarker.RADIOS, radios);

		// ..

		return viewObjects;
	}

	/**
	 * Auto-generated method to customice the upload form
	 * 
	 * @author miso.distil.codeGenerator
	 */
	@Override
	public Map<String, Object> constructUploadForm(Request req) {
		Map<String, Object> viewObjects = new HashMap<String, Object>();

		// You need to add first a Form
		HtmlForm form = new HtmlForm(BasicATLTrafoSpark.UploadJson, "atltrafo-upload-form", HtmlFreeMarker.ENCTYPE_DEFAULT, "Upload", "POST");
		viewObjects.put(HtmlFreeMarker.FORM, form);

		// Then, whatever you want in your Form: Text, Radio, Hidden, File
		List<HtmlText> texts = new ArrayList<HtmlText>();
		// texts.add(new HtmlText(BasicATLTrafoParam.T, "", "T (t1,t2,t3,...)", "t", "Enter new t"));
		// ..
		viewObjects.put(HtmlFreeMarker.TEXTS, texts);

		// List<HtmlRadio> radios = new ArrayList<HtmlRadio>();
		// radios.add(new HtmlRadio(BasicATLTrafoParam.Bool, "Bool", "bool", true));
		// ..
		// viewObjects.put(HtmlFreeMarker.RADIOS, radios);

		List<HtmlHidden> hiddens = new ArrayList<HtmlHidden>();
		hiddens.add(new HtmlHidden(BasicATLTrafoParam.IdPost, "This is a secret!"));
		// ..
		viewObjects.put(HtmlFreeMarker.HIDDENS, hiddens);

		List<HtmlFile> file = new ArrayList<HtmlFile>();
		file.add(new HtmlFile(BasicATLTrafoParam.File, "Choose your atltrafo", "file"));
		// ..
		viewObjects.put(HtmlFreeMarker.FILE, file);

		return viewObjects;
	}
}
