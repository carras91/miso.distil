package miso.distil.modelServices;

import spark.Request;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

import miso.carrascal.cloudModelServices.abstractServices.htmlCover.HtmlInterfaceView;
import miso.carrascal.cloudModelServices.abstractServices.htmlCover.HtmlFreeMarker;
import miso.carrascal.cloudModelServices.abstractServices.htmlCover.htmlObjects.*;
import miso.carrascal.cloudModelServices.abstractServices.basic.BasicInterfaceSpark;

import miso.distil.modelServices.basic.BasicModelParam;
import miso.distil.modelServices.basic.BasicModelSpark;
import miso.distil.modelServices.htmlCover.HtmlModelSpark;
import miso.distil.modelServices.Model;

/**
 * Auto-generated custom html spark server
 * 
 * @author miso.distil.codeGenerator
 */
public class CustomModelHtml implements HtmlInterfaceView<Model>, BasicInterfaceSpark
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
		// HtmlModelSpark.overWriteInfoReadOne();
		// HtmlModelSpark.overWriteInfoReadAll();
		// HtmlModelSpark.overWriteSearchForm();
		// HtmlModelSpark.overWriteUpdateForm();
		// HtmlModelSpark.overWriteUploadForm();
	}

	/**
	 * Auto-generated method to customice the information from an artifact
	 * 
	 * @author miso.distil.codeGenerator
	 */
	@Override
	public List<HtmlEntry> constructInfoReadOne(Model model) {
		List<HtmlEntry> entries = new ArrayList<HtmlEntry>();
			// Add the information you want, line per line
			entries.add(new HtmlEntry(model.getObjectname(), EntrySize.H3));
			// ..
		return entries;
	}

	/**
	 * Auto-generated method to customice the information from an artifact's list
	 * 
	 * @author miso.distil.codeGenerator
	 */
	@Override
	public List<List<HtmlEntry>> constructInfoReadAll(List<Model> models) {
		List<List<HtmlEntry>> multientries = new ArrayList<List<HtmlEntry>>();
		// Add the information you want, line per line, from various Models
		for(Model model : models) {
			List<HtmlEntry> entries = new ArrayList<HtmlEntry>();
			entries.add(new HtmlEntry(model.getObjectname(), EntrySize.H4));
			// ..
			multientries.add(entries);
		}
		return multientries;
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
		HtmlForm form = new HtmlForm(HtmlModelSpark.SearchHTML, "model-search-form", HtmlFreeMarker.ENCTYPE_DEFAULT, "Search", "GET");
		viewObjects.put(HtmlFreeMarker.FORM, form);

		// Then, whatever you want in your Form: SelectBox, Text, Radio, Hidden, File
		Map<String, List<HtmlSelectBox>> selectbox = new HashMap<String, List<HtmlSelectBox>>();
		List<HtmlSelectBox> boxes = new ArrayList<HtmlSelectBox>();
		boxes.add(new HtmlSelectBox("Option 1", "Option1"));
		boxes.add(new HtmlSelectBox("Option 2", "Option2"));
		// ...
		selectbox.put(BasicModelParam.Search_query, boxes);
		// ...
		viewObjects.put(HtmlFreeMarker.SELECTBOX, selectbox);
							
		List<HtmlText> texts = new ArrayList<HtmlText>();
		texts.add(new HtmlText(BasicModelParam.Search_value, "", "Search (value)", "search", "Enter what do you want to search"));
		// ..
		viewObjects.put(HtmlFreeMarker.TEXTS, texts);

		List<HtmlRadio> radios = new ArrayList<HtmlRadio>();
		radios.add(new HtmlRadio(BasicModelParam.Search_synonyms, "Synonyms", "synonyms", true));
		// ..
		viewObjects.put(HtmlFreeMarker.RADIOS, radios);

		// ..

		return viewObjects;
	}

	/**
	 * Auto-generated method to customice the update form
	 * 
	 * @author miso.distil.codeGenerator
	 */
	@Override
	public Map<String, Object> constructUpdateForm(Model model) {
		Map<String, Object> viewObjects = new HashMap<String, Object>();

		// You need to add first a Form
		HtmlForm form = new HtmlForm(BasicModelSpark.UpdateJson, "model-update-form", HtmlFreeMarker.ENCTYPE_DEFAULT, "Update", "POST");
		viewObjects.put(HtmlFreeMarker.FORM, form);

		// Then, whatever you want in your Form: Text, Radio, Hidden, File
		List<HtmlText> texts = new ArrayList<HtmlText>();
		// texts.add(new HtmlText(BasicModelParam.T, model.getT(), "T (t1,t2,t3,...)", "t", ""));
		// ..
		viewObjects.put(HtmlFreeMarker.TEXTS, texts);

		// List<HtmlRadio> radios = new ArrayList<HtmlRadio>();
		// radios.add(new HtmlRadio(BasicModelParam.Bool, "Bool", "bool", true));
		// ..
		// viewObjects.put(HtmlFreeMarker.RADIOS, radios);

		List<HtmlHidden> hiddens = new ArrayList<HtmlHidden>();
		hiddens.add(new HtmlHidden(BasicModelParam.IdPost, model.getObjectid()));
		// ..
		viewObjects.put(HtmlFreeMarker.HIDDENS, hiddens);

		List<HtmlFile> file = new ArrayList<HtmlFile>();
		file.add(new HtmlFile(BasicModelParam.File, "Choose your model", "file"));
		// ..
		viewObjects.put(HtmlFreeMarker.FILE, file);

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
		HtmlForm form = new HtmlForm(BasicModelSpark.UploadJson, "model-upload-form", HtmlFreeMarker.ENCTYPE_DEFAULT, "Upload", "POST");
		viewObjects.put(HtmlFreeMarker.FORM, form);

		// Then, whatever you want in your Form: Text, Radio, Hidden, File
		List<HtmlText> texts = new ArrayList<HtmlText>();
		// texts.add(new HtmlText(BasicModelParam.T, "", "T (t1,t2,t3,...)", "t", "Enter new t"));
		// ..
		viewObjects.put(HtmlFreeMarker.TEXTS, texts);

		// List<HtmlRadio> radios = new ArrayList<HtmlRadio>();
		// radios.add(new HtmlRadio(BasicModelParam.Bool, "Bool", "bool", true));
		// ..
		// viewObjects.put(HtmlFreeMarker.RADIOS, radios);

		List<HtmlHidden> hiddens = new ArrayList<HtmlHidden>();
		hiddens.add(new HtmlHidden(BasicModelParam.IdPost, "This is a secret!"));
		// ..
		viewObjects.put(HtmlFreeMarker.HIDDENS, hiddens);

		List<HtmlFile> file = new ArrayList<HtmlFile>();
		file.add(new HtmlFile(BasicModelParam.File, "Choose your model", "file"));
		// ..
		viewObjects.put(HtmlFreeMarker.FILE, file);

		return viewObjects;
	}
}
