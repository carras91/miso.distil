package miso.distil.documentServices.htmlCover;

import spark.Request;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

import miso.carrascal.cloudModelServices.abstractServices.htmlCover.HtmlInterfaceView;
import miso.carrascal.cloudModelServices.abstractServices.htmlCover.HtmlFreeMarker;
import miso.carrascal.cloudModelServices.abstractServices.htmlCover.htmlObjects.*;
import miso.carrascal.cloudModelServices.utils.Utils;

import miso.distil.documentServices.basic.BasicDocumentParam;
import miso.distil.documentServices.basic.BasicDocumentSpark;
import miso.distil.documentServices.Document;

public class HtmlDocumentView implements HtmlInterfaceView<Document>{

	/**
	 * Auto-generated method to construct the information from an artifact
	 * 
	 * @author miso.distil.codeGenerator
	 */
	@Override
	public List<HtmlEntry> constructInfoReadOne(Document document) {
		List<HtmlEntry> entries = new ArrayList<HtmlEntry>();
		entries.add(new HtmlEntry(document.getFilename(), EntrySize.H3));
		entries.add(new HtmlEntry(document.getCreatedatString(), EntrySize.H4));
		entries.add(new HtmlEntry("FileSize (bytes): " + document.getFilesize().toString(), EntrySize.H4));
		entries.add(new HtmlEntry("ObjectId : " + document.getObjectid().toString(), EntrySize.H4));
		entries.add(new HtmlEntry("author_docinfo : " + document.getDocinfo().getAuthor(), EntrySize.H5));
		entries.add(new HtmlEntry("source_docinfo : " + document.getDocinfo().getSource(), EntrySize.H5));
		entries.add(new HtmlEntry("tags_docinfo : " + Utils.listToString(document.getDocinfo().getTags()), EntrySize.H5));				
		entries.add(new HtmlEntry("fileextension_docinfo : " + document.getDocinfo().getFileextension(), EntrySize.H5));
		entries.add(new HtmlEntry("coauthors : " + Utils.listToString(document.getCoauthors()), EntrySize.H5));				
		entries.add(new HtmlEntry(HtmlDocumentLinks.getDownloadZipJsonLink(document) + " | " + HtmlDocumentLinks.getDownloadFileJsonLink(document), EntrySize.H5));
		entries.add(new HtmlEntry(HtmlDocumentLinks.getUpdateHtmlLink(document), EntrySize.H5));
		entries.add(new HtmlEntry(HtmlDocumentLinks.getDeleteFormJsonLink(document), EntrySize.H5));

		return entries;
	}

	/**
	 * Auto-generated method to construct the information from an artifact's list
	 * 
	 * @author miso.distil.codeGenerator
	 */
	@Override
	public List<List<HtmlEntry>> constructInfoReadAll(List<Document> documents) {
		List<List<HtmlEntry>> multientries = new ArrayList<List<HtmlEntry>>();
			for(Document document : documents) {
				List<HtmlEntry> entries = new ArrayList<HtmlEntry>();
				entries.add(new HtmlEntry(HtmlDocumentLinks.getReadHtmlLink(document), EntrySize.H3));
				entries.add(new HtmlEntry(document.getCreatedatString(), EntrySize.H4));
				entries.add(new HtmlEntry(HtmlDocumentLinks.getReadJsonLink(document), EntrySize.H5));
				entries.add(new HtmlEntry(HtmlDocumentLinks.getUpdateHtmlLink(document), EntrySize.H5));
				entries.add(new HtmlEntry(HtmlDocumentLinks.getDeleteFormJsonLink(document), EntrySize.H5));
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

		HtmlForm form = new HtmlForm(HtmlDocumentSpark.SearchHTML, "document-search-form", HtmlFreeMarker.ENCTYPE_DEFAULT, "Search", "GET");
		viewObjects.put(HtmlFreeMarker.FORM, form);
		
		Map<String, List<HtmlSelectBox>> selectbox = new HashMap<String, List<HtmlSelectBox>>();
		List<HtmlSelectBox> boxes = new ArrayList<HtmlSelectBox>();
		boxes.add(new HtmlSelectBox("author_docinfo", "author_docinfo"));
		boxes.add(new HtmlSelectBox("source_docinfo", "source_docinfo"));
		boxes.add(new HtmlSelectBox("tags_docinfo", "tags_docinfo"));
		boxes.add(new HtmlSelectBox("fileextension_docinfo", "fileextension_docinfo"));
		boxes.add(new HtmlSelectBox("coauthors", "coauthors"));
		boxes.add(new HtmlSelectBox("isfinished", "isfinished"));
		selectbox.put(BasicDocumentParam.Search_query, boxes);
		viewObjects.put(HtmlFreeMarker.SELECTBOX, selectbox);

		List<HtmlText> texts = new ArrayList<HtmlText>();
		texts.add(new HtmlText(BasicDocumentParam.Search_value, "", "Value", "search", "Enter what do you want to search"));
		viewObjects.put(HtmlFreeMarker.TEXTS, texts);

		List<HtmlRadio> radios = new ArrayList<HtmlRadio>();
		radios.add(new HtmlRadio(BasicDocumentParam.Search_synonyms, "Synonyms", "synonyms", true));
		viewObjects.put(HtmlFreeMarker.RADIOS, radios);

		return viewObjects;
	}

	/**
	 * Auto-generated method to construct the update form
	 * 
	 * @author miso.distil.codeGenerator
	 */
	@Override
	public Map<String, Object> constructUpdateForm(Document document) {
		Map<String, Object> viewObjects = new HashMap<String, Object>();
		HtmlForm form = new HtmlForm(BasicDocumentSpark.UpdateJson, "document-update-form", HtmlFreeMarker.ENCTYPE_DEFAULT, "Update", "POST");
		viewObjects.put(HtmlFreeMarker.FORM, form);

		List<HtmlText> texts = new ArrayList<HtmlText>();
		texts.add(new HtmlText(BasicDocumentParam.Author_docinfo, document.getDocinfo().getAuthor(), "author_docinfo", "author", ""));
		texts.add(new HtmlText(BasicDocumentParam.Source_docinfo, document.getDocinfo().getSource(), "source_docinfo", "source", ""));
		texts.add(new HtmlText(BasicDocumentParam.Tags_docinfo, Utils.listToString(document.getDocinfo().getTags()), "tags_docinfo (tags1,tags2,...)", "tags", ""));
		viewObjects.put(HtmlFreeMarker.TEXTS, texts);

		List<HtmlRadio> radios = new ArrayList<HtmlRadio>();
		radios.add(new HtmlRadio(BasicDocumentParam.Isfinished, "isfinished", "isfinished", document.getIsfinished()));
		viewObjects.put(HtmlFreeMarker.RADIOS, radios);

		List<HtmlHidden> hiddens = new ArrayList<HtmlHidden>();
		hiddens.add(new HtmlHidden(BasicDocumentParam.IdPost, document.getObjectid()));
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

		HtmlForm form = new HtmlForm(BasicDocumentSpark.UploadJson, "document-upload-form", HtmlFreeMarker.ENCTYPE_FILE, "Upload", "POST");
		viewObjects.put(HtmlFreeMarker.FORM, form);

		List<HtmlText> texts = new ArrayList<HtmlText>();
		texts.add(new HtmlText(BasicDocumentParam.Author_docinfo, "", "author_docinfo", "author", "Enter valid String"));
		texts.add(new HtmlText(BasicDocumentParam.Source_docinfo, "", "source_docinfo", "source", "Enter valid String"));
		texts.add(new HtmlText(BasicDocumentParam.Tags_docinfo, "", "tags_docinfo (tags1,tags2,...)", "tags", "Enter new list of valid String"));
		viewObjects.put(HtmlFreeMarker.TEXTS, texts);

		List<HtmlRadio> radios = new ArrayList<HtmlRadio>();
		radios.add(new HtmlRadio(BasicDocumentParam.Isfinished, "isfinished", "isfinished", true));
		viewObjects.put(HtmlFreeMarker.RADIOS, radios);

		List<HtmlFile> file = new ArrayList<HtmlFile>();
		file.add(new HtmlFile(BasicDocumentParam.File, "Choose your document", "file"));
		viewObjects.put(HtmlFreeMarker.FILE, file);

		return viewObjects;
	}
}
