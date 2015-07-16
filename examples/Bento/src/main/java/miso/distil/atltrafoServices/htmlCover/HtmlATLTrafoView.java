package miso.distil.atltrafoServices.htmlCover;

import spark.Request;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

import miso.carrascal.cloudModelServices.abstractServices.htmlCover.HtmlInterfaceView;
import miso.carrascal.cloudModelServices.abstractServices.htmlCover.HtmlFreeMarker;
import miso.carrascal.cloudModelServices.abstractServices.htmlCover.htmlObjects.*;

import miso.distil.atltrafoServices.basic.BasicATLTrafoParam;
import miso.distil.atltrafoServices.basic.BasicATLTrafoSpark;
import miso.distil.atltrafoServices.ATLTrafo;

public class HtmlATLTrafoView implements HtmlInterfaceView<ATLTrafo>{

	/**
	 * Auto-generated method to construct the information from an artifact
	 * 
	 * @author miso.distil.codeGenerator
	 */
	@Override
	public List<HtmlEntry> constructInfoReadOne(ATLTrafo atltrafo) {
		List<HtmlEntry> entries = new ArrayList<HtmlEntry>();
		entries.add(new HtmlEntry(atltrafo.getObjectname(), EntrySize.H3));
		entries.add(new HtmlEntry(atltrafo.getCreatedatString(), EntrySize.H4));
		entries.add(new HtmlEntry("FileSize (bytes): " + atltrafo.getFilesize().toString(), EntrySize.H4));
		entries.add(new HtmlEntry("ObjectId : " + atltrafo.getObjectid().toString(), EntrySize.H4));
		entries.add(new HtmlEntry("nameatl : " + atltrafo.getNameatl(), EntrySize.H5));
		entries.add(new HtmlEntry(HtmlATLTrafoLinks.getDownloadZipJsonLink(atltrafo) + " | " + HtmlATLTrafoLinks.getDownloadFileJsonLink(atltrafo), EntrySize.H5));
		entries.add(new HtmlEntry(HtmlATLTrafoLinks.getDeleteFormJsonLink(atltrafo), EntrySize.H5));

		return entries;
	}

	/**
	 * Auto-generated method to construct the information from an artifact's list
	 * 
	 * @author miso.distil.codeGenerator
	 */
	@Override
	public List<List<HtmlEntry>> constructInfoReadAll(List<ATLTrafo> atltrafos) {
		List<List<HtmlEntry>> multientries = new ArrayList<List<HtmlEntry>>();
			for(ATLTrafo atltrafo : atltrafos) {
				List<HtmlEntry> entries = new ArrayList<HtmlEntry>();
				entries.add(new HtmlEntry(HtmlATLTrafoLinks.getReadHtmlLink(atltrafo), EntrySize.H3));
				entries.add(new HtmlEntry(atltrafo.getCreatedatString(), EntrySize.H4));
				entries.add(new HtmlEntry(HtmlATLTrafoLinks.getReadJsonLink(atltrafo), EntrySize.H5));
				entries.add(new HtmlEntry(HtmlATLTrafoLinks.getDeleteFormJsonLink(atltrafo), EntrySize.H5));
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

		HtmlForm form = new HtmlForm(HtmlATLTrafoSpark.SearchHTML, "atltrafo-search-form", HtmlFreeMarker.ENCTYPE_DEFAULT, "Search", "GET");
		viewObjects.put(HtmlFreeMarker.FORM, form);

		List<HtmlText> texts = new ArrayList<HtmlText>();
		texts.add(new HtmlText(BasicATLTrafoParam.Search_query, "", "Search (name)", "search", "Enter where do you want to search"));
		texts.add(new HtmlText(BasicATLTrafoParam.Search_value, "", "Search (value)", "search", "Enter what do you want to search"));
		viewObjects.put(HtmlFreeMarker.TEXTS, texts);

		List<HtmlRadio> radios = new ArrayList<HtmlRadio>();
		radios.add(new HtmlRadio(BasicATLTrafoParam.Synonyms_query, "Synonyms (name)", "synonyms", true));
		radios.add(new HtmlRadio(BasicATLTrafoParam.Synonyms_value, "Synonyms (value)", "synonyms", true));
		viewObjects.put(HtmlFreeMarker.RADIOS, radios);

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

		HtmlForm form = new HtmlForm(BasicATLTrafoSpark.UploadJson, "atltrafo-upload-form", HtmlFreeMarker.ENCTYPE_FILE, "Upload", "POST");
		viewObjects.put(HtmlFreeMarker.FORM, form);

		List<HtmlText> texts = new ArrayList<HtmlText>();
		viewObjects.put(HtmlFreeMarker.TEXTS, texts);

		List<HtmlRadio> radios = new ArrayList<HtmlRadio>();
		viewObjects.put(HtmlFreeMarker.RADIOS, radios);

		List<HtmlFile> file = new ArrayList<HtmlFile>();
		file.add(new HtmlFile(BasicATLTrafoParam.File, "Choose your atltrafo", "file"));
		viewObjects.put(HtmlFreeMarker.FILE, file);

		return viewObjects;
	}
}
