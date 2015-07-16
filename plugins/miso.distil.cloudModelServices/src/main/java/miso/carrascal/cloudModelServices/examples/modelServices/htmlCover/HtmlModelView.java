package miso.carrascal.cloudModelServices.examples.modelServices.htmlCover;

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
import miso.carrascal.cloudModelServices.examples.ecoreServices.basic.BasicEcoreParam;
import miso.carrascal.cloudModelServices.examples.modelServices.Model;
import miso.carrascal.cloudModelServices.examples.modelServices.basic.BasicModelParam;
import miso.carrascal.cloudModelServices.examples.modelServices.basic.BasicModelSpark;
import spark.Request;

public class HtmlModelView implements HtmlInterfaceView<Model> {
		
	@Override
	public List<HtmlEntry> constructInfoReadOne(Model model) {
		List<HtmlEntry> entries = new ArrayList<HtmlEntry>();
		entries.add(new HtmlEntry(model.getObjectname(), EntrySize.H3));
		entries.add(new HtmlEntry(HtmlModelLinks.getEcoreNameLink(model), EntrySize.H4));
		entries.add(new HtmlEntry(model.getAuthor(), EntrySize.H4));
		entries.add(new HtmlEntry(model.getCreatedatString(), EntrySize.H4));
		entries.add(new HtmlEntry(model.getSummary(), EntrySize.H4));
		entries.add(new HtmlEntry(model.getFilesize().toString(), EntrySize.H4));
		entries.add(new HtmlEntry(model.getObjectid().toString(), EntrySize.H4));
		entries.add(new HtmlEntry(model.getTagsString(), EntrySize.H4));
		entries.add(new HtmlEntry(HtmlModelLinks.getUpdateHtmlLink(model) + " | " + HtmlModelLinks.getDeleteFormJsonLink(model), EntrySize.H4));
		entries.add(new HtmlEntry(HtmlModelLinks.getDownloadZipJsonLink(model) + " | " + HtmlModelLinks.getDownloadFileJsonLink(model), EntrySize.H4));
		entries.add(new HtmlEntry(model.getFilterInfoJson(), EntrySize.P));
		return entries;
	}
	
	@Override
	public List<List<HtmlEntry>> constructInfoReadAll(List<Model> models) {
		List<List<HtmlEntry>> multientries = new ArrayList<List<HtmlEntry>>();
		
		for(Model model : models) {
			List<HtmlEntry> entries = new ArrayList<HtmlEntry>();
			entries.add(new HtmlEntry(HtmlModelLinks.getReadHtmlLink(model), EntrySize.H3));
			entries.add(new HtmlEntry(HtmlModelLinks.getEcoreNameLink(model), EntrySize.H4));
			entries.add(new HtmlEntry(model.getAuthor(), EntrySize.H4));
			entries.add(new HtmlEntry(model.getCreatedatString(), EntrySize.H4));
			entries.add(new HtmlEntry(model.getSummary(), EntrySize.H4));
			entries.add(new HtmlEntry(HtmlModelLinks.getReadJsonLink(model), EntrySize.H4));
			entries.add(new HtmlEntry(HtmlModelLinks.getUpdateHtmlLink(model) + " | " + HtmlModelLinks.getDeleteFormJsonLink(model), EntrySize.H4));
			multientries.add(entries);
		}
		return multientries;
	}
	
	@Override
	public Map<String, Object> constructSearchForm() {
		Map<String, Object> viewObjects = new HashMap<String, Object>();
		
		HtmlForm form = new HtmlForm(HtmlModelSpark.SearchHTML, "model-search-form", HtmlFreeMarker.ENCTYPE_DEFAULT, "Search", "GET");
		viewObjects.put(HtmlFreeMarker.FORM, form);
		
		List<HtmlText> texts = new ArrayList<HtmlText>();
		texts.add(new HtmlText(BasicEcoreParam.Search_query, "", "Search (name)", "search", "Enter where do you want to search"));
		texts.add(new HtmlText(BasicEcoreParam.Search_value, "", "Search (value)", "search", "Enter what do you want to search"));
		viewObjects.put(HtmlFreeMarker.TEXTS, texts);
		
		List<HtmlRadio> radios = new ArrayList<HtmlRadio>();
		radios.add(new HtmlRadio(BasicEcoreParam.Synonyms_query, "Synonyms (name)", "synonyms", true));
		radios.add(new HtmlRadio(BasicEcoreParam.Synonyms_value, "Synonyms (value)", "synonyms", true));
		viewObjects.put(HtmlFreeMarker.RADIOS, radios);
		
		return viewObjects;
	}
	
	@Override
	public Map<String, Object> constructUpdateForm(Model model) {
		Map<String, Object> viewObjects = new HashMap<String, Object>();

		HtmlForm form = new HtmlForm(BasicModelSpark.UpdateJSON, "model-update-form", HtmlFreeMarker.ENCTYPE_DEFAULT, "Update", "POST");
		viewObjects.put(HtmlFreeMarker.FORM, form);
		
		List<HtmlText> texts = new ArrayList<HtmlText>();
		texts.add(new HtmlText(BasicModelParam.Author, model.getAuthor(), "Author", "author", ""));
		texts.add(new HtmlText(BasicModelParam.Summary, model.getSummary(), "Sumary", "summary", ""));
		texts.add(new HtmlText(BasicModelParam.Tags, model.getTagsString(), "Tags (tag1,tag2,tag3,...)", "tags", ""));
		viewObjects.put(HtmlFreeMarker.TEXTS, texts);
		
		List<HtmlRadio> radios = new ArrayList<HtmlRadio>();
		radios.add(new HtmlRadio(BasicModelParam.EClass, "Filter "+BasicModelParam.EClass, "filters", model.getFilters().get(EType.EClass)));
		radios.add(new HtmlRadio(BasicModelParam.ESuperType, "Filter "+BasicModelParam.ESuperType, "filters", model.getFilters().get(EType.ESuperType)));
		radios.add(new HtmlRadio(BasicModelParam.EAttribute, "Filter "+BasicModelParam.EAttribute, "filters", model.getFilters().get(EType.EAttribute)));
		radios.add(new HtmlRadio(BasicModelParam.EReference, "Filter "+BasicModelParam.EReference, "filters", model.getFilters().get(EType.EReference)));
		viewObjects.put(HtmlFreeMarker.RADIOS, radios);
		
		List<HtmlHidden> hiddens = new ArrayList<HtmlHidden>();
		hiddens.add(new HtmlHidden(BasicModelParam.IdPost, model.getObjectid()));
		viewObjects.put(HtmlFreeMarker.HIDDENS, hiddens);
		
		return viewObjects;
	}
	
	@Override
	public Map<String, Object> constructUploadForm(Request req) {
		Map<String, Object> viewObjects = new HashMap<String, Object>();

		HtmlForm form = new HtmlForm(BasicModelSpark.UploadJSON, "model-upload-form", HtmlFreeMarker.ENCTYPE_FILE, "Upload", "POST");
		viewObjects.put(HtmlFreeMarker.FORM, form);
		
		List<HtmlText> texts = new ArrayList<HtmlText>();
		texts.add(new HtmlText(BasicModelParam.Author, "", "Author", "author", "Enter new author"));
		texts.add(new HtmlText(BasicModelParam.Summary, "", "Sumary", "summary", "Enter new summary"));
		texts.add(new HtmlText(BasicModelParam.Tags, "", "Tags (tag1,tag2,tag3,...)", "tags", "Enter new tags"));
		texts.add(new HtmlText(BasicModelParam.EcoreId, "", "Id from related ecore", "tags", "Enter valid id"));
		viewObjects.put(HtmlFreeMarker.TEXTS, texts);
		
		List<HtmlRadio> radios = new ArrayList<HtmlRadio>();
		radios.add(new HtmlRadio(BasicModelParam.EClass, "Filter "+BasicModelParam.EClass, "filters", true));
		radios.add(new HtmlRadio(BasicModelParam.ESuperType, "Filter "+BasicModelParam.ESuperType, "filters", true));
		radios.add(new HtmlRadio(BasicModelParam.EAttribute, "Filter "+BasicModelParam.EAttribute, "filters", true));
		radios.add(new HtmlRadio(BasicModelParam.EReference, "Filter "+BasicModelParam.EReference, "filters", true));
		viewObjects.put(HtmlFreeMarker.RADIOS, radios);
		
		List<HtmlFile> file = new ArrayList<HtmlFile>();
		file.add(new HtmlFile(BasicModelParam.File, "Choose your model", "file"));
		viewObjects.put(HtmlFreeMarker.FILE, file);
		
		return viewObjects;
	}
}
