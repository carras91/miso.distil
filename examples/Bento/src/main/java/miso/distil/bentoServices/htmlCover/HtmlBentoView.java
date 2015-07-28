package miso.distil.bentoServices.htmlCover;

import spark.Request;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

import miso.carrascal.cloudModelServices.abstractServices.htmlCover.HtmlInterfaceView;
import miso.carrascal.cloudModelServices.abstractServices.htmlCover.HtmlFreeMarker;
import miso.carrascal.cloudModelServices.abstractServices.htmlCover.htmlObjects.*;
import miso.carrascal.cloudModelServices.utils.Utils;

import miso.distil.bentoServices.basic.BasicBentoParam;
import miso.distil.bentoServices.basic.BasicBentoSpark;
import miso.distil.bentoServices.Bento;

public class HtmlBentoView implements HtmlInterfaceView<Bento>{

	/**
	 * Auto-generated method to construct the information from an artifact
	 * 
	 * @author miso.distil.codeGenerator
	 */
	@Override
	public List<HtmlEntry> constructInfoReadOne(Bento bento) {
		List<HtmlEntry> entries = new ArrayList<HtmlEntry>();
		entries.add(new HtmlEntry(bento.getFilename(), EntrySize.H3));
		entries.add(new HtmlEntry(bento.getCreatedatString(), EntrySize.H4));
		entries.add(new HtmlEntry("FileSize (bytes): " + bento.getFilesize().toString(), EntrySize.H4));
		entries.add(new HtmlEntry("ObjectId : " + bento.getObjectid().toString(), EntrySize.H4));
		entries.add(new HtmlEntry("inputconcepts : " + Utils.listToString(bento.getInputconcepts()), EntrySize.H5));				
		entries.add(new HtmlEntry("outputconcepts : " + Utils.listToString(bento.getOutputconcepts()), EntrySize.H5));				
		entries.add(new HtmlEntry("atl : " + Utils.listToString(bento.getAtl()), EntrySize.H5));				
		entries.add(new HtmlEntry("tags : " + Utils.listToString(bento.getTags()), EntrySize.H5));				
		entries.add(new HtmlEntry(HtmlBentoLinks.getDownloadZipJsonLink(bento) + " | " + HtmlBentoLinks.getDownloadFileJsonLink(bento), EntrySize.H5));
		entries.add(new HtmlEntry(HtmlBentoLinks.getUpdateHtmlLink(bento), EntrySize.H5));
		entries.add(new HtmlEntry(HtmlBentoLinks.getDeleteFormJsonLink(bento), EntrySize.H5));

		return entries;
	}

	/**
	 * Auto-generated method to construct the information from an artifact's list
	 * 
	 * @author miso.distil.codeGenerator
	 */
	@Override
	public List<List<HtmlEntry>> constructInfoReadAll(List<Bento> bentos) {
		List<List<HtmlEntry>> multientries = new ArrayList<List<HtmlEntry>>();
			for(Bento bento : bentos) {
				List<HtmlEntry> entries = new ArrayList<HtmlEntry>();
				entries.add(new HtmlEntry(HtmlBentoLinks.getReadHtmlLink(bento), EntrySize.H3));
				entries.add(new HtmlEntry(bento.getCreatedatString(), EntrySize.H4));
				entries.add(new HtmlEntry(HtmlBentoLinks.getReadJsonLink(bento), EntrySize.H5));
				entries.add(new HtmlEntry(HtmlBentoLinks.getUpdateHtmlLink(bento), EntrySize.H5));
				entries.add(new HtmlEntry(HtmlBentoLinks.getDeleteFormJsonLink(bento), EntrySize.H5));
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

		HtmlForm form = new HtmlForm(HtmlBentoSpark.SearchHTML, "bento-search-form", HtmlFreeMarker.ENCTYPE_DEFAULT, "Search", "GET");
		viewObjects.put(HtmlFreeMarker.FORM, form);
		
		Map<String, List<HtmlSelectBox>> selectbox = new HashMap<String, List<HtmlSelectBox>>();
		List<HtmlSelectBox> boxes = new ArrayList<HtmlSelectBox>();
		boxes.add(new HtmlSelectBox("inputconcepts", "inputconcepts"));
		boxes.add(new HtmlSelectBox("outputconcepts", "outputconcepts"));
		boxes.add(new HtmlSelectBox("atl", "atl"));
		boxes.add(new HtmlSelectBox("tags", "tags"));
		selectbox.put(BasicBentoParam.Search_query, boxes);
		viewObjects.put(HtmlFreeMarker.SELECTBOX, selectbox);

		List<HtmlText> texts = new ArrayList<HtmlText>();
		texts.add(new HtmlText(BasicBentoParam.Search_value, "", "Value", "search", "Enter what do you want to search"));
		viewObjects.put(HtmlFreeMarker.TEXTS, texts);

		List<HtmlRadio> radios = new ArrayList<HtmlRadio>();
		radios.add(new HtmlRadio(BasicBentoParam.Search_synonyms, "Synonyms", "synonyms", true));
		viewObjects.put(HtmlFreeMarker.RADIOS, radios);

		return viewObjects;
	}

	/**
	 * Auto-generated method to construct the update form
	 * 
	 * @author miso.distil.codeGenerator
	 */
	@Override
	public Map<String, Object> constructUpdateForm(Bento bento) {
		Map<String, Object> viewObjects = new HashMap<String, Object>();
		HtmlForm form = new HtmlForm(BasicBentoSpark.UpdateJson, "bento-update-form", HtmlFreeMarker.ENCTYPE_DEFAULT, "Update", "POST");
		viewObjects.put(HtmlFreeMarker.FORM, form);

		List<HtmlText> texts = new ArrayList<HtmlText>();
		viewObjects.put(HtmlFreeMarker.TEXTS, texts);

		List<HtmlRadio> radios = new ArrayList<HtmlRadio>();
		viewObjects.put(HtmlFreeMarker.RADIOS, radios);

		List<HtmlHidden> hiddens = new ArrayList<HtmlHidden>();
		hiddens.add(new HtmlHidden(BasicBentoParam.IdPost, bento.getObjectid()));
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

		HtmlForm form = new HtmlForm(BasicBentoSpark.UploadJson, "bento-upload-form", HtmlFreeMarker.ENCTYPE_FILE, "Upload", "POST");
		viewObjects.put(HtmlFreeMarker.FORM, form);

		List<HtmlText> texts = new ArrayList<HtmlText>();
		viewObjects.put(HtmlFreeMarker.TEXTS, texts);

		List<HtmlRadio> radios = new ArrayList<HtmlRadio>();
		viewObjects.put(HtmlFreeMarker.RADIOS, radios);

		List<HtmlFile> file = new ArrayList<HtmlFile>();
		file.add(new HtmlFile(BasicBentoParam.File, "Choose your bento", "file"));
		viewObjects.put(HtmlFreeMarker.FILE, file);

		return viewObjects;
	}
}
