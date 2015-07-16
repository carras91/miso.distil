package miso.distil.metamodelServices.htmlCover;

import spark.Request;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

import miso.carrascal.cloudModelServices.abstractServices.htmlCover.HtmlInterfaceView;
import miso.carrascal.cloudModelServices.abstractServices.htmlCover.HtmlFreeMarker;
import miso.carrascal.cloudModelServices.abstractServices.htmlCover.htmlObjects.*;

import miso.distil.metamodelServices.basic.BasicMetaModelParam;
import miso.distil.metamodelServices.basic.BasicMetaModelSpark;
import miso.distil.metamodelServices.MetaModel;

public class HtmlMetaModelView implements HtmlInterfaceView<MetaModel>{

	/**
	 * Auto-generated method to construct the information from an artifact
	 * 
	 * @author miso.distil.codeGenerator
	 */
	@Override
	public List<HtmlEntry> constructInfoReadOne(MetaModel metamodel) {
		List<HtmlEntry> entries = new ArrayList<HtmlEntry>();
		entries.add(new HtmlEntry(metamodel.getObjectname(), EntrySize.H3));
		entries.add(new HtmlEntry(metamodel.getCreatedatString(), EntrySize.H4));
		entries.add(new HtmlEntry("FileSize (bytes): " + metamodel.getFilesize().toString(), EntrySize.H4));
		entries.add(new HtmlEntry("ObjectId : " + metamodel.getObjectid().toString(), EntrySize.H4));
		entries.add(new HtmlEntry("uri : " + metamodel.getUri(), EntrySize.H5));
		entries.add(new HtmlEntry(HtmlMetaModelLinks.getDownloadZipJsonLink(metamodel) + " | " + HtmlMetaModelLinks.getDownloadFileJsonLink(metamodel), EntrySize.H5));
		entries.add(new HtmlEntry(HtmlMetaModelLinks.getDeleteFormJsonLink(metamodel), EntrySize.H5));

		return entries;
	}

	/**
	 * Auto-generated method to construct the information from an artifact's list
	 * 
	 * @author miso.distil.codeGenerator
	 */
	@Override
	public List<List<HtmlEntry>> constructInfoReadAll(List<MetaModel> metamodels) {
		List<List<HtmlEntry>> multientries = new ArrayList<List<HtmlEntry>>();
			for(MetaModel metamodel : metamodels) {
				List<HtmlEntry> entries = new ArrayList<HtmlEntry>();
				entries.add(new HtmlEntry(HtmlMetaModelLinks.getReadHtmlLink(metamodel), EntrySize.H3));
				entries.add(new HtmlEntry(metamodel.getCreatedatString(), EntrySize.H4));
				entries.add(new HtmlEntry(HtmlMetaModelLinks.getReadJsonLink(metamodel), EntrySize.H5));
				entries.add(new HtmlEntry(HtmlMetaModelLinks.getDeleteFormJsonLink(metamodel), EntrySize.H5));
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

		HtmlForm form = new HtmlForm(HtmlMetaModelSpark.SearchHTML, "metamodel-search-form", HtmlFreeMarker.ENCTYPE_DEFAULT, "Search", "GET");
		viewObjects.put(HtmlFreeMarker.FORM, form);

		List<HtmlText> texts = new ArrayList<HtmlText>();
		texts.add(new HtmlText(BasicMetaModelParam.Search_query, "", "Search (name)", "search", "Enter where do you want to search"));
		texts.add(new HtmlText(BasicMetaModelParam.Search_value, "", "Search (value)", "search", "Enter what do you want to search"));
		viewObjects.put(HtmlFreeMarker.TEXTS, texts);

		List<HtmlRadio> radios = new ArrayList<HtmlRadio>();
		radios.add(new HtmlRadio(BasicMetaModelParam.Synonyms_query, "Synonyms (name)", "synonyms", true));
		radios.add(new HtmlRadio(BasicMetaModelParam.Synonyms_value, "Synonyms (value)", "synonyms", true));
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

		HtmlForm form = new HtmlForm(BasicMetaModelSpark.UploadJson, "metamodel-upload-form", HtmlFreeMarker.ENCTYPE_FILE, "Upload", "POST");
		viewObjects.put(HtmlFreeMarker.FORM, form);

		List<HtmlText> texts = new ArrayList<HtmlText>();
		viewObjects.put(HtmlFreeMarker.TEXTS, texts);

		List<HtmlRadio> radios = new ArrayList<HtmlRadio>();
		viewObjects.put(HtmlFreeMarker.RADIOS, radios);

		List<HtmlFile> file = new ArrayList<HtmlFile>();
		file.add(new HtmlFile(BasicMetaModelParam.File, "Choose your metamodel", "file"));
		viewObjects.put(HtmlFreeMarker.FILE, file);

		return viewObjects;
	}
}
