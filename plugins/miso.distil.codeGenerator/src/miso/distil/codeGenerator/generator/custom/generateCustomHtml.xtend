package miso.distil.codeGenerator.generator.custom

import codeGeneratorModel.Artifact
import com.google.inject.Inject
import codeGeneratorModel.ServiceEnum
import org.eclipse.emf.common.util.EList

/*
 * To write CustomXXXHtml.java
 * 
 * @author Carlos Carrascal
 */
class generateCustomHtml {
	
	@Inject miso.distil.codeGenerator.generator.generateUtils genUti
	@Inject miso.distil.codeGenerator.generator.Names names

	/*
	 * To write Custom<artifact.name>Html.java
	 * 
	 * @author Carlos Carrascal
	 */
	def write(Artifact artifact) '''
		«var EList<ServiceEnum> basicServices = genUti.processBasicServices(artifact.basicServices)»
		«val namelow = artifact.name.toLowerCase»
		«val name = artifact.name»
		package «names.getArtifactChar(artifact)»;

		«IF basicServices.contains(ServiceEnum.UPLOAD)»
			import spark.Request;

		«ENDIF»
		import java.util.ArrayList;
		«IF basicServices.contains(ServiceEnum.SEARCH) || basicServices.contains(ServiceEnum.UPDATE) || basicServices.contains(ServiceEnum.UPLOAD)»
			import java.util.HashMap;
			import java.util.Map;
		«ENDIF»
		import java.util.List;

		import «names.MisoHtml».HtmlInterfaceView;
		«IF basicServices.contains(ServiceEnum.SEARCH) || basicServices.contains(ServiceEnum.UPDATE) || basicServices.contains(ServiceEnum.UPLOAD)»
			import «names.MisoHtml».HtmlFreeMarker;
		«ENDIF»
		import «names.MisoHtml».htmlObjects.*;
		import «names.MisoBasic».BasicInterfaceSpark;

		«IF basicServices.contains(ServiceEnum.SEARCH) || basicServices.contains(ServiceEnum.UPDATE) || basicServices.contains(ServiceEnum.UPLOAD)»
			import «names.getBParamFileChar(artifact)»;
		«ENDIF»
		«IF basicServices.contains(ServiceEnum.UPDATE) || basicServices.contains(ServiceEnum.UPLOAD)»
			import «names.getBSparkFileChar(artifact)»;
		«ENDIF»
		«IF basicServices.contains(ServiceEnum.SEARCH)»
			import «names.getHSparkFileChar(artifact)»;
		«ENDIF»
		import «names.getArtifactFileChar(artifact)»;

		/**
		 * Auto-generated custom html spark server
		 * 
		 * @author miso.distil.codeGenerator
		 */
		public class Custom«name»Html implements HtmlInterfaceView<«name»>, BasicInterfaceSpark
		{
			/**
			 * Auto-generated custom spark service. It overwrites some html URL's
			 * 
			 * @author miso.distil.codeGenerator
			 */
			@Override
			public void runService() {

				«IF basicServices.contains(ServiceEnum.READ) || basicServices.contains(ServiceEnum.READ_ALL) ||
					basicServices.contains(ServiceEnum.UPDATE) || basicServices.contains(ServiceEnum.UPLOAD) ||
					basicServices.contains(ServiceEnum.SEARCH)»
					// To overwrite the default constructions of HTML
					// Be careful: you need to modify the method previously
				«ENDIF»
				«IF basicServices.contains(ServiceEnum.READ)»
					// Html«name»Spark.overWriteInfoReadOne();
				«ENDIF»
				«IF basicServices.contains(ServiceEnum.READ_ALL)»
					// Html«name»Spark.overWriteInfoReadAll();
				«ENDIF»
				«IF basicServices.contains(ServiceEnum.SEARCH)»
					// Html«name»Spark.overWriteSearchForm();
				«ENDIF»
				«IF basicServices.contains(ServiceEnum.UPDATE)»
					// Html«name»Spark.overWriteUpdateForm();
				«ENDIF»
				«IF basicServices.contains(ServiceEnum.UPLOAD)»
					// Html«name»Spark.overWriteUploadForm();
				«ENDIF»
			}

			«IF basicServices.contains(ServiceEnum.READ)»
				/**
				 * Auto-generated method to customice the information from an artifact
				 * 
				 * @author miso.distil.codeGenerator
				 */
				@Override
				public List<HtmlEntry> constructInfoReadOne(«name» «namelow») {
					List<HtmlEntry> entries = new ArrayList<HtmlEntry>();
						// Add the information you want, line per line
						entries.add(new HtmlEntry(«namelow».getObjectname(), EntrySize.H3));
						// ..
					return entries;
				}

			«ENDIF»
			«IF basicServices.contains(ServiceEnum.READ_ALL)»
				/**
				 * Auto-generated method to customice the information from an artifact's list
				 * 
				 * @author miso.distil.codeGenerator
				 */
				@Override
				public List<List<HtmlEntry>> constructInfoReadAll(List<«name»> «namelow»s) {
					List<List<HtmlEntry>> multientries = new ArrayList<List<HtmlEntry>>();
					// Add the information you want, line per line, from various «name»s
					for(«name» «namelow» : «namelow»s) {
						List<HtmlEntry> entries = new ArrayList<HtmlEntry>();
						entries.add(new HtmlEntry(«namelow».getObjectname(), EntrySize.H4));
						// ..
						multientries.add(entries);
					}
					return multientries;
				}

			«ENDIF»
			«IF basicServices.contains(ServiceEnum.SEARCH)»
				/**
				 * Auto-generated method to customice the search form
				 * 
				 * @author miso.distil.codeGenerator
				 */
				@Override
				public Map<String, Object> constructSearchForm() {
					Map<String, Object> viewObjects = new HashMap<String, Object>();

					// You need to add first a Form
					HtmlForm form = new HtmlForm(Html«name»Spark.SearchHTML, "«namelow»-search-form", HtmlFreeMarker.ENCTYPE_DEFAULT, "Search", "GET");
					viewObjects.put(HtmlFreeMarker.FORM, form);

					// Then, whatever you want in your Form: Text, Radio, Hidden, File
					List<HtmlText> texts = new ArrayList<HtmlText>();
					texts.add(new HtmlText(Basic«name»Param.Search_query, "", "Search (name)", "search", "Enter where do you want to search"));
					texts.add(new HtmlText(Basic«name»Param.Search_value, "", "Search (value)", "search", "Enter what do you want to search"));
					// ..
					viewObjects.put(HtmlFreeMarker.TEXTS, texts);

					List<HtmlRadio> radios = new ArrayList<HtmlRadio>();
					radios.add(new HtmlRadio(Basic«name»Param.Synonyms_query, "Synonyms (name)", "synonyms", true));
					radios.add(new HtmlRadio(Basic«name»Param.Synonyms_value, "Synonyms (value)", "synonyms", true));
					// ..
					viewObjects.put(HtmlFreeMarker.RADIOS, radios);

					// ..

					return viewObjects;
				}

			«ENDIF»
			«IF basicServices.contains(ServiceEnum.UPDATE)»
				/**
				 * Auto-generated method to customice the update form
				 * 
				 * @author miso.distil.codeGenerator
				 */
				@Override
				public Map<String, Object> constructUpdateForm(«name» «namelow») {
					Map<String, Object> viewObjects = new HashMap<String, Object>();

					// You need to add first a Form
					HtmlForm form = new HtmlForm(Basic«name»Spark.UpdateJson, "«namelow»-update-form", HtmlFreeMarker.ENCTYPE_DEFAULT, "Update", "POST");
					viewObjects.put(HtmlFreeMarker.FORM, form);

					// Then, whatever you want in your Form: Text, Radio, Hidden, File
					List<HtmlText> texts = new ArrayList<HtmlText>();
					// texts.add(new HtmlText(Basic«name»Param.T, «namelow».getT(), "T (t1,t2,t3,...)", "t", ""));
					// ..
					viewObjects.put(HtmlFreeMarker.TEXTS, texts);

					// List<HtmlRadio> radios = new ArrayList<HtmlRadio>();
					// radios.add(new HtmlRadio(Basic«name»Param.Bool, "Bool", "bool", true));
					// ..
					// viewObjects.put(HtmlFreeMarker.RADIOS, radios);

					List<HtmlHidden> hiddens = new ArrayList<HtmlHidden>();
					hiddens.add(new HtmlHidden(Basic«name»Param.IdPost, «namelow».getObjectid()));
					// ..
					viewObjects.put(HtmlFreeMarker.HIDDENS, hiddens);

					List<HtmlFile> file = new ArrayList<HtmlFile>();
					file.add(new HtmlFile(Basic«name»Param.File, "Choose your «namelow»", "file"));
					// ..
					viewObjects.put(HtmlFreeMarker.FILE, file);

					return viewObjects;
				}

			«ENDIF»
			«IF basicServices.contains(ServiceEnum.UPLOAD)»
				/**
				 * Auto-generated method to customice the upload form
				 * 
				 * @author miso.distil.codeGenerator
				 */
				@Override
				public Map<String, Object> constructUploadForm(Request req) {
					Map<String, Object> viewObjects = new HashMap<String, Object>();

					// You need to add first a Form
					HtmlForm form = new HtmlForm(Basic«name»Spark.UploadJson, "«namelow»-upload-form", HtmlFreeMarker.ENCTYPE_DEFAULT, "Upload", "POST");
					viewObjects.put(HtmlFreeMarker.FORM, form);

					// Then, whatever you want in your Form: Text, Radio, Hidden, File
					List<HtmlText> texts = new ArrayList<HtmlText>();
					// texts.add(new HtmlText(Basic«name»Param.T, "", "T (t1,t2,t3,...)", "t", "Enter new t"));
					// ..
					viewObjects.put(HtmlFreeMarker.TEXTS, texts);

					// List<HtmlRadio> radios = new ArrayList<HtmlRadio>();
					// radios.add(new HtmlRadio(Basic«name»Param.Bool, "Bool", "bool", true));
					// ..
					// viewObjects.put(HtmlFreeMarker.RADIOS, radios);

					List<HtmlHidden> hiddens = new ArrayList<HtmlHidden>();
					hiddens.add(new HtmlHidden(Basic«name»Param.IdPost, "This is a secret!"));
					// ..
					viewObjects.put(HtmlFreeMarker.HIDDENS, hiddens);

					List<HtmlFile> file = new ArrayList<HtmlFile>();
					file.add(new HtmlFile(Basic«name»Param.File, "Choose your «namelow»", "file"));
					// ..
					viewObjects.put(HtmlFreeMarker.FILE, file);

					return viewObjects;
				}
			«ENDIF»
		}
	'''
}