package miso.distil.modelServices.htmlCover;

import spark.Request;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

import miso.carrascal.cloudModelServices.abstractServices.htmlCover.HtmlInterfaceView;
import miso.carrascal.cloudModelServices.abstractServices.htmlCover.HtmlFreeMarker;
import miso.carrascal.cloudModelServices.abstractServices.htmlCover.htmlObjects.*;

import miso.distil.modelServices.basic.BasicModelParam;
import miso.distil.modelServices.basic.BasicModelSpark;
import miso.distil.modelServices.Model;

public class HtmlModelView implements HtmlInterfaceView<Model>{

	/**
	 * Auto-generated method to construct the information from an artifact
	 * 
	 * @author miso.distil.codeGenerator
	 */
	@Override
	public List<HtmlEntry> constructInfoReadOne(Model model) {
		List<HtmlEntry> entries = new ArrayList<HtmlEntry>();
		entries.add(new HtmlEntry(model.getObjectname(), EntrySize.H3));
		entries.add(new HtmlEntry(model.getCreatedatString(), EntrySize.H4));
		entries.add(new HtmlEntry("FileSize (bytes): " + model.getFilesize().toString(), EntrySize.H4));
		entries.add(new HtmlEntry("ObjectId : " + model.getObjectid().toString(), EntrySize.H4));
		entries.add(new HtmlEntry("namemodel : " + model.getNamemodel(), EntrySize.H5));
		entries.add(new HtmlEntry("type : " + model.getType(), EntrySize.H5));
		entries.add(new HtmlEntry(HtmlModelLinks.getDownloadZipJsonLink(model) + " | " + HtmlModelLinks.getDownloadFileJsonLink(model), EntrySize.H5));
		entries.add(new HtmlEntry(HtmlModelLinks.getUpdateHtmlLink(model), EntrySize.H5));
		entries.add(new HtmlEntry(HtmlModelLinks.getDeleteFormJsonLink(model), EntrySize.H5));

		return entries;
	}

	/**
	 * Auto-generated method to construct the information from an artifact's list
	 * 
	 * @author miso.distil.codeGenerator
	 */
	@Override
	public List<List<HtmlEntry>> constructInfoReadAll(List<Model> models) {
		List<List<HtmlEntry>> multientries = new ArrayList<List<HtmlEntry>>();
			for(Model model : models) {
				List<HtmlEntry> entries = new ArrayList<HtmlEntry>();
				entries.add(new HtmlEntry(HtmlModelLinks.getReadHtmlLink(model), EntrySize.H3));
				entries.add(new HtmlEntry(model.getCreatedatString(), EntrySize.H4));
				entries.add(new HtmlEntry(HtmlModelLinks.getReadJsonLink(model), EntrySize.H5));
				entries.add(new HtmlEntry(HtmlModelLinks.getUpdateHtmlLink(model), EntrySize.H5));
				entries.add(new HtmlEntry(HtmlModelLinks.getDeleteFormJsonLink(model), EntrySize.H5));
				multientries.add(entries);
			}

		return multientries;
	}

	/**
	 * Auto-generated method to construct the search form
	 * 
	 * @author miso.distil.codeGenerator
	 */
	@Override
	public Map<String, Object> constructSearchForm() {
		Map<String, Object> viewObjects = new HashMap<String, Object>();

		HtmlForm form = new HtmlForm(HtmlModelSpark.SearchHTML, "model-search-form", HtmlFreeMarker.ENCTYPE_DEFAULT, "Search", "GET");
		viewObjects.put(HtmlFreeMarker.FORM, form);
		
		Map<String, List<HtmlSelectBox>> selectbox = new HashMap<String, List<HtmlSelectBox>>();
		List<HtmlSelectBox> boxes = new ArrayList<HtmlSelectBox>();
		boxes.add(new HtmlSelectBox("namemodel", "namemodel"));
		boxes.add(new HtmlSelectBox("type", "type"));
		selectbox.put(BasicModelParam.Search_query, boxes);
		viewObjects.put(HtmlFreeMarker.SELECTBOX, selectbox);

		List<HtmlText> texts = new ArrayList<HtmlText>();
		texts.add(new HtmlText(BasicModelParam.Search_value, "", "Value", "search", "Enter what do you want to search"));
		viewObjects.put(HtmlFreeMarker.TEXTS, texts);

		List<HtmlRadio> radios = new ArrayList<HtmlRadio>();
		radios.add(new HtmlRadio(BasicModelParam.Search_synonyms, "Synonyms", "synonyms", true));
		viewObjects.put(HtmlFreeMarker.RADIOS, radios);

		return viewObjects;
	}

	/**
	 * Auto-generated method to construct the update form
	 * 
	 * @author miso.distil.codeGenerator
	 */
	@Override
	public Map<String, Object> constructUpdateForm(Model model) {
		Map<String, Object> viewObjects = new HashMap<String, Object>();
		HtmlForm form = new HtmlForm(BasicModelSpark.UpdateJson, "model-update-form", HtmlFreeMarker.ENCTYPE_DEFAULT, "Update", "POST");
		viewObjects.put(HtmlFreeMarker.FORM, form);

		List<HtmlText> texts = new ArrayList<HtmlText>();
		viewObjects.put(HtmlFreeMarker.TEXTS, texts);

		List<HtmlRadio> radios = new ArrayList<HtmlRadio>();
		viewObjects.put(HtmlFreeMarker.RADIOS, radios);

		List<HtmlHidden> hiddens = new ArrayList<HtmlHidden>();
		hiddens.add(new HtmlHidden(BasicModelParam.IdPost, model.getObjectid()));
		viewObjects.put(HtmlFreeMarker.HIDDENS, hiddens);
		return viewObjects;
	}

	/**
	 * Auto-generated method to construct the upload form
	 * 
	 * @author miso.distil.codeGenerator
	 */
	@Override
	public Map<String, Object> constructUploadForm(Request req) {
		Map<String, Object> viewObjects = new HashMap<String, Object>();

		HtmlForm form = new HtmlForm(BasicModelSpark.UploadJson, "model-upload-form", HtmlFreeMarker.ENCTYPE_FILE, "Upload", "POST");
		viewObjects.put(HtmlFreeMarker.FORM, form);

		List<HtmlText> texts = new ArrayList<HtmlText>();
		viewObjects.put(HtmlFreeMarker.TEXTS, texts);

		List<HtmlRadio> radios = new ArrayList<HtmlRadio>();
		viewObjects.put(HtmlFreeMarker.RADIOS, radios);

		List<HtmlFile> file = new ArrayList<HtmlFile>();
		file.add(new HtmlFile(BasicModelParam.File, "Choose your model", "file"));
		viewObjects.put(HtmlFreeMarker.FILE, file);

		return viewObjects;
	}
}
