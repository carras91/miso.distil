package miso.carrascal.cloudModelServices.examples.ecoreServices.htmlCover;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import miso.carrascal.cloudModelServices.abstractServices.filter.EType;
import miso.carrascal.cloudModelServices.abstractServices.htmlCover.HtmlFreeMarker;
import miso.carrascal.cloudModelServices.abstractServices.htmlCover.HtmlInterfaceView;
import miso.carrascal.cloudModelServices.abstractServices.htmlCover.htmlObjects.EntrySize;
import miso.carrascal.cloudModelServices.abstractServices.htmlCover.htmlObjects.HtmlEntry;
import miso.carrascal.cloudModelServices.abstractServices.htmlCover.htmlObjects.HtmlFile;
import miso.carrascal.cloudModelServices.abstractServices.htmlCover.htmlObjects.HtmlForm;
import miso.carrascal.cloudModelServices.abstractServices.htmlCover.htmlObjects.HtmlHidden;
import miso.carrascal.cloudModelServices.abstractServices.htmlCover.htmlObjects.HtmlRadio;
import miso.carrascal.cloudModelServices.abstractServices.htmlCover.htmlObjects.HtmlText;
import miso.carrascal.cloudModelServices.examples.ecoreServices.Ecore;
import miso.carrascal.cloudModelServices.examples.ecoreServices.basic.BasicEcoreParam;
import miso.carrascal.cloudModelServices.examples.ecoreServices.basic.BasicEcoreSpark;
import spark.Request;

public class HtmlEcoreView implements HtmlInterfaceView<Ecore> {

	@Override
	public List<HtmlEntry> constructInfoReadOne(Ecore ecore) {
		List<HtmlEntry> entries = new ArrayList<HtmlEntry>();
		entries.add(new HtmlEntry(ecore.getObjectName(), EntrySize.H3));
		entries.add(new HtmlEntry(ecore.getAuthor(), EntrySize.H4));
		entries.add(new HtmlEntry(ecore.getCreatedAtString(), EntrySize.H4));
		entries.add(new HtmlEntry(ecore.getSummary(), EntrySize.H4));
		entries.add(new HtmlEntry(ecore.getFileSize().toString(), EntrySize.H4));
		entries.add(new HtmlEntry(ecore.getObjectId().toString(), EntrySize.H4));
		entries.add(new HtmlEntry(ecore.getTagsString(), EntrySize.H4));
		entries.add(new HtmlEntry(ecore.getActive().toString(), EntrySize.H4));
		entries.add(new HtmlEntry(HtmlEcoreLinks.getDeleteFormJsonLink(ecore), EntrySize.H4));
		entries.add(new HtmlEntry(HtmlEcoreLinks.getDownloadZipJsonLink(ecore) + " | " + HtmlEcoreLinks.getDownloadFileJsonLink(ecore), EntrySize.H4));
		entries.add(new HtmlEntry(HtmlEcoreLinks.getUpdateHtmlLink(ecore), EntrySize.H4));
		entries.add(new HtmlEntry(ecore.getFilterInfoJson(), EntrySize.P));
		return entries;
	}

	@Override
	public List<List<HtmlEntry>> constructInfoReadAll(List<Ecore> ecores) {
		List<List<HtmlEntry>> multientries = new ArrayList<List<HtmlEntry>>();
		
		for(Ecore ecore : ecores) {
			List<HtmlEntry> entries = new ArrayList<HtmlEntry>();
			entries.add(new HtmlEntry(HtmlEcoreLinks.getReadHtmlLink(ecore), EntrySize.H3));
			entries.add(new HtmlEntry(ecore.getAuthor(), EntrySize.H4));
			entries.add(new HtmlEntry(ecore.getCreatedAtString(), EntrySize.H4));
			entries.add(new HtmlEntry(ecore.getSummary(), EntrySize.H4));
			entries.add(new HtmlEntry(HtmlEcoreLinks.getReadJsonLink(ecore), EntrySize.H4));
			entries.add(new HtmlEntry(HtmlEcoreLinks.getUpdateHtmlLink(ecore) + " | " + HtmlEcoreLinks.getDeleteFormJsonLink(ecore), EntrySize.H4));
			multientries.add(entries);
		}
		return multientries;
	}
	
	@Override
	public Map<String, Object> constructSearchForm() {
		Map<String, Object> viewObjects = new HashMap<String, Object>();
		
		HtmlForm form = new HtmlForm(HtmlEcoreSpark.SearchHTML, "ecore-search-form", HtmlFreeMarker.ENCTYPE_DEFAULT, "Search", "GET");
		viewObjects.put(HtmlFreeMarker.FORM, form);
		
		List<HtmlText> texts = new ArrayList<HtmlText>();
		texts.add(new HtmlText(BasicEcoreParam.Search_query, "", "Search (name)", "search", "Enter where do you want to search"));
		texts.add(new HtmlText(BasicEcoreParam.Search_value, "", "Search (value)", "search", "Enter what do you want to search"));
		viewObjects.put(HtmlFreeMarker.TEXTS, texts);
		
		List<HtmlRadio> radios = new ArrayList<HtmlRadio>();
		radios.add(new HtmlRadio(BasicEcoreParam.Active, "Only active ecores", "active", true));
		radios.add(new HtmlRadio(BasicEcoreParam.Synonyms_query, "Synonyms (name)", "synonyms", true));
		radios.add(new HtmlRadio(BasicEcoreParam.Synonyms_value, "Synonyms (value)", "synonyms", true));
		viewObjects.put(HtmlFreeMarker.RADIOS, radios);
		
		return viewObjects;
	}
	
	@Override
	public Map<String, Object> constructUpdateForm(Ecore ecore) {
		Map<String, Object> viewObjects = new HashMap<String, Object>();
		
		HtmlForm form = new HtmlForm(BasicEcoreSpark.UpdateJSON, "ecore-update-form", HtmlFreeMarker.ENCTYPE_DEFAULT, "Update", "POST");
		viewObjects.put(HtmlFreeMarker.FORM, form);
		
		List<HtmlText> texts = new ArrayList<HtmlText>();
		texts.add(new HtmlText(BasicEcoreParam.Author, ecore.getAuthor(), "Author", "author", ""));
		texts.add(new HtmlText(BasicEcoreParam.Summary, ecore.getSummary(), "Sumary", "summary", ""));
		texts.add(new HtmlText(BasicEcoreParam.Tags, ecore.getTagsString(), "Tags (tag1,tag2,tag3,...)", "tags", ""));
		viewObjects.put(HtmlFreeMarker.TEXTS, texts);
		
		List<HtmlRadio> radios = new ArrayList<HtmlRadio>();
		radios.add(new HtmlRadio(BasicEcoreParam.Active, "Active", "active", ecore.getActive()));
		radios.add(new HtmlRadio(BasicEcoreParam.EClass, "Filter "+BasicEcoreParam.EClass, "filters", ecore.getFilters().get(EType.EClass)));
		radios.add(new HtmlRadio(BasicEcoreParam.EAbstract, "Filter "+BasicEcoreParam.EAbstract, "filters", ecore.getFilters().get(EType.EAbstract)));
		radios.add(new HtmlRadio(BasicEcoreParam.EInterface, "Filter "+BasicEcoreParam.EInterface, "filters", ecore.getFilters().get(EType.EInterface)));
		radios.add(new HtmlRadio(BasicEcoreParam.EAttribute, "Filter "+BasicEcoreParam.EAttribute, "filters", ecore.getFilters().get(EType.EAttribute)));
		radios.add(new HtmlRadio(BasicEcoreParam.EReference, "Filter "+BasicEcoreParam.EReference, "filters", ecore.getFilters().get(EType.EReference)));
		viewObjects.put(HtmlFreeMarker.RADIOS, radios);
		
		List<HtmlHidden> hiddens = new ArrayList<HtmlHidden>();
		hiddens.add(new HtmlHidden(BasicEcoreParam.IdPost, ecore.getObjectId()));
		viewObjects.put(HtmlFreeMarker.HIDDENS, hiddens);
		
		return viewObjects;
	}

	@Override
	public Map<String, Object> constructUploadForm(Request req) {
		Map<String, Object> viewObjects = new HashMap<String, Object>();
		
		HtmlForm form = new HtmlForm(BasicEcoreSpark.UploadJSON, "ecore-upload-form", HtmlFreeMarker.ENCTYPE_FILE, "Upload", "POST");
		viewObjects.put(HtmlFreeMarker.FORM, form);
		
		List<HtmlText> texts = new ArrayList<HtmlText>();
		texts.add(new HtmlText(BasicEcoreParam.Author, "", "Author", "author", "Enter new author"));
		texts.add(new HtmlText(BasicEcoreParam.Summary, "", "Sumary", "summary", "Enter new summary"));
		texts.add(new HtmlText(BasicEcoreParam.Tags, "", "Tags (tag1,tag2,tag3,...)", "tags", "Enter new tags"));
		viewObjects.put(HtmlFreeMarker.TEXTS, texts);
		
		List<HtmlRadio> radios = new ArrayList<HtmlRadio>();
		radios.add(new HtmlRadio(BasicEcoreParam.Active, "Active", "active", true));
		radios.add(new HtmlRadio(BasicEcoreParam.EClass, "Filter "+BasicEcoreParam.EClass, "filters", true));
		radios.add(new HtmlRadio(BasicEcoreParam.EAbstract, "Filter "+BasicEcoreParam.EAbstract, "filters", true));
		radios.add(new HtmlRadio(BasicEcoreParam.EInterface, "Filter "+BasicEcoreParam.EInterface, "filters", true));
		radios.add(new HtmlRadio(BasicEcoreParam.EAttribute, "Filter "+BasicEcoreParam.EAttribute, "filters", true));
		radios.add(new HtmlRadio(BasicEcoreParam.EReference, "Filter "+BasicEcoreParam.EReference, "filters", true));
		viewObjects.put(HtmlFreeMarker.RADIOS, radios);
		
		List<HtmlFile> file = new ArrayList<HtmlFile>();
		file.add(new HtmlFile(BasicEcoreParam.File, "Choose your ecore", "file"));
		viewObjects.put(HtmlFreeMarker.FILE, file);
		
		return viewObjects;
	}
}
