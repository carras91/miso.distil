package miso.distil.bentoServices;

import spark.Request;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

import miso.carrascal.cloudModelServices.abstractServices.htmlCover.HtmlInterfaceView;
import miso.carrascal.cloudModelServices.abstractServices.htmlCover.HtmlFreeMarker;
import miso.carrascal.cloudModelServices.abstractServices.htmlCover.htmlObjects.*;
import miso.carrascal.cloudModelServices.abstractServices.basic.BasicInterfaceSpark;

import miso.distil.bentoServices.basic.BasicBentoParam;
import miso.distil.bentoServices.basic.BasicBentoSpark;
import miso.distil.bentoServices.htmlCover.HtmlBentoSpark;
import miso.distil.bentoServices.Bento;

/**
 * Auto-generated custom html spark server
 * 
 * @author miso.distil.codeGenerator
 */
public class CustomBentoHtml implements HtmlInterfaceView<Bento>, BasicInterfaceSpark
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
		// HtmlBentoSpark.overWriteInfoReadOne();
		// HtmlBentoSpark.overWriteInfoReadAll();
		// HtmlBentoSpark.overWriteSearchForm();
		// HtmlBentoSpark.overWriteUpdateForm();
		// HtmlBentoSpark.overWriteUploadForm();
	}

	/**
	 * Auto-generated method to customice the information from an artifact
	 * 
	 * @author miso.distil.codeGenerator
	 */
	@Override
	public List<HtmlEntry> constructInfoReadOne(Bento bento) {
		List<HtmlEntry> entries = new ArrayList<HtmlEntry>();
			// Add the information you want, line per line
			entries.add(new HtmlEntry(bento.getObjectName(), EntrySize.H3));
			// ..
		return entries;
	}

	/**
	 * Auto-generated method to customice the information from an artifact's list
	 * 
	 * @author miso.distil.codeGenerator
	 */
	@Override
	public List<List<HtmlEntry>> constructInfoReadAll(List<Bento> bentos) {
		List<List<HtmlEntry>> multientries = new ArrayList<List<HtmlEntry>>();
		// Add the information you want, line per line, from various Bentos
		for(Bento bento : bentos) {
			List<HtmlEntry> entries = new ArrayList<HtmlEntry>();
			entries.add(new HtmlEntry(bento.getObjectName(), EntrySize.H4));
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
		HtmlForm form = new HtmlForm(HtmlBentoSpark.SearchHTML, "bento-search-form", HtmlFreeMarker.ENCTYPE_DEFAULT, "Search", "GET");
		viewObjects.put(HtmlFreeMarker.FORM, form);

		// Then, whatever you want in your Form: Text, Radio, Hidden, File
		List<HtmlText> texts = new ArrayList<HtmlText>();
		texts.add(new HtmlText(BasicBentoParam.Search_query, "", "Search (name)", "search", "Enter where do you want to search"));
		texts.add(new HtmlText(BasicBentoParam.Search_value, "", "Search (value)", "search", "Enter what do you want to search"));
		// ..
		viewObjects.put(HtmlFreeMarker.TEXTS, texts);

		List<HtmlRadio> radios = new ArrayList<HtmlRadio>();
		radios.add(new HtmlRadio(BasicBentoParam.Synonyms_query, "Synonyms (name)", "synonyms", true));
		radios.add(new HtmlRadio(BasicBentoParam.Synonyms_value, "Synonyms (value)", "synonyms", true));
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
	public Map<String, Object> constructUpdateForm(Bento bento) {
		Map<String, Object> viewObjects = new HashMap<String, Object>();

		// You need to add first a Form
		HtmlForm form = new HtmlForm(BasicBentoSpark.UpdateJson, "bento-update-form", HtmlFreeMarker.ENCTYPE_DEFAULT, "Update", "POST");
		viewObjects.put(HtmlFreeMarker.FORM, form);

		// Then, whatever you want in your Form: Text, Radio, Hidden, File
		List<HtmlText> texts = new ArrayList<HtmlText>();
		// texts.add(new HtmlText(BasicBentoParam.T, bento.getT(), "T (t1,t2,t3,...)", "t", ""));
		// ..
		viewObjects.put(HtmlFreeMarker.TEXTS, texts);

		// List<HtmlRadio> radios = new ArrayList<HtmlRadio>();
		// radios.add(new HtmlRadio(BasicBentoParam.Bool, "Bool", "bool", true));
		// ..
		// viewObjects.put(HtmlFreeMarker.RADIOS, radios);

		List<HtmlHidden> hiddens = new ArrayList<HtmlHidden>();
		hiddens.add(new HtmlHidden(BasicBentoParam.IdPost, bento.getObjectId()));
		// ..
		viewObjects.put(HtmlFreeMarker.HIDDENS, hiddens);

		List<HtmlFile> file = new ArrayList<HtmlFile>();
		file.add(new HtmlFile(BasicBentoParam.File, "Choose your bento", "file"));
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
		HtmlForm form = new HtmlForm(BasicBentoSpark.UploadJson, "bento-upload-form", HtmlFreeMarker.ENCTYPE_DEFAULT, "Upload", "POST");
		viewObjects.put(HtmlFreeMarker.FORM, form);

		// Then, whatever you want in your Form: Text, Radio, Hidden, File
		List<HtmlText> texts = new ArrayList<HtmlText>();
		// texts.add(new HtmlText(BasicBentoParam.T, "", "T (t1,t2,t3,...)", "t", "Enter new t"));
		// ..
		viewObjects.put(HtmlFreeMarker.TEXTS, texts);

		// List<HtmlRadio> radios = new ArrayList<HtmlRadio>();
		// radios.add(new HtmlRadio(BasicBentoParam.Bool, "Bool", "bool", true));
		// ..
		// viewObjects.put(HtmlFreeMarker.RADIOS, radios);

		List<HtmlHidden> hiddens = new ArrayList<HtmlHidden>();
		hiddens.add(new HtmlHidden(BasicBentoParam.IdPost, "This is a secret!"));
		// ..
		viewObjects.put(HtmlFreeMarker.HIDDENS, hiddens);

		List<HtmlFile> file = new ArrayList<HtmlFile>();
		file.add(new HtmlFile(BasicBentoParam.File, "Choose your bento", "file"));
		// ..
		viewObjects.put(HtmlFreeMarker.FILE, file);

		return viewObjects;
	}
}
