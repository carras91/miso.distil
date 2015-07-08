package miso.carrascal.codeGenerator.generator.html

import codeGeneratorModel.Attribute
import codeGeneratorModel.DataEnum
import codeGeneratorModel.Artifact
import com.google.inject.Inject
import org.eclipse.emf.common.util.EList
import codeGeneratorModel.SimpleAttribute
import codeGeneratorModel.ServiceEnum

/*
 * To write HtmlXXXView.java
 * 
 * @author Carlos Carrascal
 */
class generateHtmlView {
	
	@Inject miso.carrascal.codeGenerator.generator.generateUtils genUti
	@Inject miso.carrascal.codeGenerator.generator.packages pack

	/*
	 * To write Html<artifact.name>View.java
	 * 
	 * @author Carlos Carrascal
	 */				
	def write(Artifact artifact) '''
		«var EList<ServiceEnum> basicServices = artifact.basicServices»
		«val namelow = artifact.name.toLowerCase»
		«val name = artifact.name»
		«val EList<Attribute> allAtts = genUti.getAllNestedAttributes(artifact.attributes)»
		«var pos = -1»
		package «pack.getHtmlChar(artifact)»;

		«IF basicServices.contains(ServiceEnum.UPLOAD_LITERAL)»
			import spark.Request;

		«ENDIF»
		import java.util.ArrayList;
		«IF basicServices.contains(ServiceEnum.SEARCH_LITERAL) || basicServices.contains(ServiceEnum.UPDATE_LITERAL) || basicServices.contains(ServiceEnum.UPLOAD_LITERAL)»
			import java.util.HashMap;
			import java.util.Map;
		«ENDIF»
		import java.util.List;

		import «pack.MisoHtml».HtmlInterfaceView;
		«IF basicServices.contains(ServiceEnum.SEARCH_LITERAL) || basicServices.contains(ServiceEnum.UPDATE_LITERAL) || basicServices.contains(ServiceEnum.UPLOAD_LITERAL)»
			import «pack.MisoHtml».HtmlFreeMarker;
		«ENDIF»
		import «pack.MisoHtml».htmlObjects.*;
		«IF basicServices.contains(ServiceEnum.READ_LITERAL) || basicServices.contains(ServiceEnum.UPDATE_LITERAL)»
			«var util = false»
			«FOR att:allAtts»
				«IF att instanceof SimpleAttribute»
					«IF att.many && !util»
						«{util = true; null}»
						import «pack.MisoUtils».Utils;
					«ENDIF»
				«ENDIF»
			«ENDFOR»
		«ENDIF»
		
		«IF basicServices.contains(ServiceEnum.SEARCH_LITERAL) || basicServices.contains(ServiceEnum.UPLOAD_LITERAL) || basicServices.contains(ServiceEnum.UPDATE_LITERAL)»
			import «pack.getBasicChar(artifact)».Basic«name»Param;
		«ENDIF»
		«IF basicServices.contains(ServiceEnum.UPLOAD_LITERAL) || basicServices.contains(ServiceEnum.UPDATE_LITERAL)»
			import «pack.getBasicChar(artifact)».Basic«name»Spark;
		«ENDIF»
		import «pack.getArtifactChar(artifact)».«name»;

		public class Html«name»View implements HtmlInterfaceView<«name»>{

			«IF basicServices.contains(ServiceEnum.READ_LITERAL)»
				/**
				 * Auto-generated method to construct the information from an artifact
				 * 
				 * @author miso.distil.codeGenerator
				 */
				@Override
				public List<HtmlEntry> constructInfoReadOne(«name» «namelow») {
					List<HtmlEntry> entries = new ArrayList<HtmlEntry>();
					entries.add(new HtmlEntry(«namelow».getObjectName(), EntrySize.H3));
					entries.add(new HtmlEntry(«namelow».getCreatedAtString(), EntrySize.H4));
					entries.add(new HtmlEntry("FileSize (bytes): " + «namelow».getFileSize().toString(), EntrySize.H4));
					entries.add(new HtmlEntry("ObjectId : " + «namelow».getObjectId().toString(), EntrySize.H4));
					entries.add(new HtmlEntry("Tags : " + «namelow».getTagsString(), EntrySize.H5));
					«{pos = -1; null}»
					«FOR att:allAtts»
						«{pos++; null}»
						«IF att instanceof SimpleAttribute»
							«val newName = genUti.getNewAttName(pos, artifact).toFirstUpper»
							«IF att.data.equals(DataEnum.STRING_LITERAL) && !att.many»
								entries.add(new HtmlEntry("«newName» : " + «genUti.getNestedGets(pos, artifact)», EntrySize.H5));
							«ELSEIF (att.data.equals(DataEnum.DOUBLE_LITERAL) || att.data.equals(DataEnum.DOUBLE_LITERAL) || att.data.equals(DataEnum.INTEGER_LITERAL)) && !att.many»
								entries.add(new HtmlEntry("«newName» : " + «genUti.getNestedGets(pos, artifact)».toString(), EntrySize.H5));
							«ELSEIF att.many»
								entries.add(new HtmlEntry("«newName» : " + Utils.ListToString(«genUti.getNestedGets(pos, artifact)»), EntrySize.H5));				
							«ENDIF»
						«ENDIF»
					«ENDFOR»
					«IF basicServices.contains(ServiceEnum.DOWNLOAD_LITERAL)»
						entries.add(new HtmlEntry(Html«name»Links.getDownloadZipJsonLink(«namelow») + " | " + Html«name»Links.getDownloadFileJsonLink(«namelow»), EntrySize.H5));
					«ELSEIF basicServices.contains(ServiceEnum.UPDATE_LITERAL)»
						entries.add(new HtmlEntry(Html«name»Links.getUpdateHtmlLink(«namelow»), EntrySize.H5));
					«ELSEIF basicServices.contains(ServiceEnum.UPLOAD_LITERAL)»
						entries.add(new HtmlEntry(Html«name»Links.getDeleteFormJsonLink(«namelow»), EntrySize.H5));
					«ENDIF»

					return entries;
				}

			«ENDIF»
			«IF basicServices.contains(ServiceEnum.READ_ALL_LITERAL)»
				/**
				 * Auto-generated method to construct the information from an artifact's list
				 * 
				 * @author miso.distil.codeGenerator
				 */
				@Override
				public List<List<HtmlEntry>> constructInfoReadAll(List<«name»> «namelow»s) {
					List<List<HtmlEntry>> multientries = new ArrayList<List<HtmlEntry>>();
						for(«name» «namelow» : «namelow»s) {
							List<HtmlEntry> entries = new ArrayList<HtmlEntry>();
							«IF basicServices.contains(ServiceEnum.READ_LITERAL)»
								entries.add(new HtmlEntry(Html«name»Links.getReadHtmlLink(«namelow»), EntrySize.H3));
							«ENDIF»
							entries.add(new HtmlEntry(«namelow».getCreatedAtString(), EntrySize.H4));
							«IF basicServices.contains(ServiceEnum.READ_LITERAL)»
								entries.add(new HtmlEntry(Html«name»Links.getReadJsonLink(«namelow»), EntrySize.H5));
							«ELSEIF basicServices.contains(ServiceEnum.UPDATE_LITERAL)»
								entries.add(new HtmlEntry(Html«name»Links.getUpdateHtmlLink(«namelow»), EntrySize.H5));
							«ELSEIF basicServices.contains(ServiceEnum.UPLOAD_LITERAL)»
								entries.add(new HtmlEntry(Html«name»Links.getDeleteFormJsonLink(«namelow»), EntrySize.H5));
							«ENDIF»
							multientries.add(entries);
						}

					return multientries;
				}

			«ENDIF»
			«IF basicServices.contains(ServiceEnum.SEARCH_LITERAL)»
				/**
				 * Auto-generated method to construct the search form
				 * 
				 * @author miso.distil.codeGenerator
				 */
				@Override
				public Map<String, Object> constructSearchForm() {
					Map<String, Object> viewObjects = new HashMap<String, Object>();

					HtmlForm form = new HtmlForm(Html«name»Spark.SearchHTML, "«namelow»-search-form", HtmlFreeMarker.ENCTYPE_DEFAULT, "Search", "GET");
					viewObjects.put(HtmlFreeMarker.FORM, form);

					List<HtmlText> texts = new ArrayList<HtmlText>();
					texts.add(new HtmlText(Basic«name»Param.Search_query, "", "Search (name)", "search", "Enter where do you want to search"));
					texts.add(new HtmlText(Basic«name»Param.Search_value, "", "Search (value)", "search", "Enter what do you want to search"));
					viewObjects.put(HtmlFreeMarker.TEXTS, texts);

					List<HtmlRadio> radios = new ArrayList<HtmlRadio>();
					radios.add(new HtmlRadio(Basic«name»Param.Synonyms_query, "Synonyms (name)", "synonyms", true));
					radios.add(new HtmlRadio(Basic«name»Param.Synonyms_value, "Synonyms (value)", "synonyms", true));
					viewObjects.put(HtmlFreeMarker.RADIOS, radios);

					return viewObjects;
				}

			«ENDIF»
			«IF basicServices.contains(ServiceEnum.UPDATE_LITERAL)»
				/**
				 * Auto-generated method to construct the update form
				 * 
				 * @author miso.distil.codeGenerator
				 */
				@Override
				public Map<String, Object> constructUpdateForm(«name» «namelow») {
					Map<String, Object> viewObjects = new HashMap<String, Object>();
					HtmlForm form = new HtmlForm(Basic«name»Spark.UpdateJson, "«namelow»-update-form", HtmlFreeMarker.ENCTYPE_DEFAULT, "Update", "POST");
					viewObjects.put(HtmlFreeMarker.FORM, form);

					List<HtmlText> texts = new ArrayList<HtmlText>();
					texts.add(new HtmlText(Basic«name»Param.Tags, «namelow».getTagsString(), "Tags (tag1,tag2,tag3,...)", "tags", ""));
					«{pos = -1; null}»
					«FOR att:allAtts»
						«{pos++; null}»
						«IF att instanceof SimpleAttribute»
							«IF att.required»
								«val newName = genUti.getNewAttName(pos, artifact).toFirstUpper»
								«IF att.data.equals(DataEnum.STRING_LITERAL) && !att.many»
									texts.add(new HtmlText(Basic«name»Param.«newName», «genUti.getNestedGets(pos, artifact)», "«newName.toLowerCase»", "«att.name»", ""));
								«ELSEIF (att.data.equals(DataEnum.DOUBLE_LITERAL) || att.data.equals(DataEnum.INTEGER_LITERAL)) && !att.many»
									texts.add(new HtmlText(Basic«name»Param.«newName», «genUti.getNestedGets(pos, artifact)».toString(), "«newName.toLowerCase»", "«att.name»", ""));
								«ELSEIF att.many»
									texts.add(new HtmlText(Basic«name»Param.«newName», Utils.ListToString(«genUti.getNestedGets(pos, artifact)»), "«newName.toLowerCase» («att.name»1,«att.name»2,...)", "«att.name»", ""));
								«ENDIF»
							«ENDIF»
						«ENDIF»
					«ENDFOR»
					viewObjects.put(HtmlFreeMarker.TEXTS, texts);

					List<HtmlRadio> radios = new ArrayList<HtmlRadio>();
					«{pos = -1; null}»
					«FOR att:allAtts»
						«{pos++; null}»
						«IF att instanceof SimpleAttribute»
							«IF att.required»
								«var newName = genUti.getNewAttName(pos, artifact).toFirstUpper»
								«IF att.data.equals(DataEnum.BOOLEAN_LITERAL) && !att.many»
									radios.add(new HtmlRadio(Basic«name»Param.«newName», "«newName.toLowerCase»", "«att.name»", «genUti.getNestedGets(pos, artifact)»));
								«ENDIF»
							«ENDIF»
						«ENDIF»
					«ENDFOR»
					viewObjects.put(HtmlFreeMarker.RADIOS, radios);

					List<HtmlHidden> hiddens = new ArrayList<HtmlHidden>();
					hiddens.add(new HtmlHidden(Basic«name»Param.IdPost, «namelow».getObjectId()));
					viewObjects.put(HtmlFreeMarker.HIDDENS, hiddens);
					return viewObjects;
				}

			«ENDIF»
			«IF basicServices.contains(ServiceEnum.UPLOAD_LITERAL)»
				/**
				 * Auto-generated method to construct the upload form
				 * 
				 * @author miso.distil.codeGenerator
				 */
				@Override
				public Map<String, Object> constructUploadForm(Request req) {
					Map<String, Object> viewObjects = new HashMap<String, Object>();

					HtmlForm form = new HtmlForm(Basic«name»Spark.UploadJson, "«namelow»-upload-form", HtmlFreeMarker.ENCTYPE_FILE, "Upload", "POST");
					viewObjects.put(HtmlFreeMarker.FORM, form);

					List<HtmlText> texts = new ArrayList<HtmlText>();
					texts.add(new HtmlText(Basic«name»Param.Tags, "", "Tags (tag1,tag2,tag3,...)", "tags", "Enter new tags"));
					«{pos = -1; null}»
					«FOR att:allAtts»
						«{pos++; null}»
						«IF att instanceof SimpleAttribute»
							«IF att.required»
								«val newName = genUti.getNewAttName(pos, artifact).toFirstUpper»
								«IF !att.data.equals(DataEnum.BOOLEAN_LITERAL) && !att.many»
									texts.add(new HtmlText(Basic«name»Param.«newName», "", "«newName.toLowerCase»", "«att.name»", "Enter valid «att.data.toString»"));
								«ELSEIF att.many»
									texts.add(new HtmlText(Basic«name»Param.«newName», "", "«newName.toLowerCase» («att.name»1,«att.name»2,...)", "«att.name»", "Enter new list of valid «att.data.toString»"));
								«ENDIF»
							«ENDIF»
						«ENDIF»
					«ENDFOR»
					viewObjects.put(HtmlFreeMarker.TEXTS, texts);

					List<HtmlRadio> radios = new ArrayList<HtmlRadio>();
					«{pos = -1; null}»
					«FOR att:allAtts»
						«{pos++; null}»
						«IF att instanceof SimpleAttribute»
							«IF att.required»
								«val newName = genUti.getNewAttName(pos, artifact).toFirstUpper»
								«IF att.data.equals(DataEnum.BOOLEAN_LITERAL) && !att.many»
									radios.add(new HtmlRadio(Basic«name»Param.«newName», "«newName.toLowerCase»", "«att.name»", true));
								«ENDIF»
							«ENDIF»
						«ENDIF»
					«ENDFOR»
					viewObjects.put(HtmlFreeMarker.RADIOS, radios);

					List<HtmlFile> file = new ArrayList<HtmlFile>();
					file.add(new HtmlFile(Basic«name»Param.File, "Choose your «namelow»", "file"));
					viewObjects.put(HtmlFreeMarker.FILE, file);

					return viewObjects;
				}
			«ENDIF»
		}
	'''
}