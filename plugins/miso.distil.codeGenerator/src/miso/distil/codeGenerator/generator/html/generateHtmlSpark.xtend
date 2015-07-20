package miso.distil.codeGenerator.generator.html

import com.google.inject.Inject
import codeGeneratorModel.Artifact
import codeGeneratorModel.ServiceEnum
import org.eclipse.emf.common.util.EList

/*
 * To write HtmlXXXSpark.java
 * 
 * @author Carlos Carrascal
 */
class generateHtmlSpark { 
	
	@Inject miso.distil.codeGenerator.generator.generateUtils genUti
	@Inject miso.distil.codeGenerator.generator.Names names

	/*
	 * To write Html<artifact.name>Spark.java
	 * 
	 * @author Carlos Carrascal
	 */		
	def write(Artifact artifact) '''
		«var EList<ServiceEnum> basicServices = genUti.processBasicServices(artifact.basicServices)»
		«val name = artifact.name»
		«val namelow = name.toLowerCase»
		package «names.getHtmlChar(artifact)»;

		import static spark.Spark.get;
		import spark.template.freemarker.FreeMarkerEngine;
		«IF basicServices.contains(ServiceEnum.READ_ALL) || basicServices.contains(ServiceEnum.UPLOAD) || basicServices.contains(ServiceEnum.SEARCH)»

			import java.util.ArrayList;
			import java.util.List;
		«ENDIF»

		import «names.MisoBasic».BasicInterfaceSpark;
		«IF basicServices.contains(ServiceEnum.READ_ALL) || basicServices.contains(ServiceEnum.UPLOAD) || basicServices.contains(ServiceEnum.SEARCH)»
			import «names.MisoHtml».HtmlFreeMarker;
			import «names.MisoHtml».htmlObjects.HtmlSelectBox;

		«ENDIF»
		«IF basicServices.contains(ServiceEnum.UPDATE) || basicServices.contains(ServiceEnum.READ)»
			import «names.getBParamFileChar(artifact)»;
		«ENDIF»
		import «names.getArtifactCustomFileChar(artifact)»;
		import «names.getHJsonFileChar(artifact)»;

		/**
		 * Auto-generated html spark server
		 * 
		 * @author miso.distil.codeGenerator
		 */
		public final class Html«name»Spark implements BasicInterfaceSpark {

			// URL's
			«IF basicServices.contains(ServiceEnum.READ)»
				public static String ReadHTML = "/html/«namelow»/read/";
				public static String ReadIdHTML = ReadHTML + Basic«name»Param.IdGet;
			«ENDIF»
			«IF basicServices.contains(ServiceEnum.READ_ALL)»
				public static String ReadAllHTML = "/html/«namelow»/all";
				public static String SearchHTML = "/html/«namelow»/search";
			«ENDIF»
			«IF basicServices.contains(ServiceEnum.SEARCH)»
				public static String SearchFormHTML = "/html/«namelow»/search/form";
				«IF !basicServices.contains(ServiceEnum.READ_ALL)»
					public static String SearchHTML = "/html/«namelow»/search";
				«ENDIF»
			«ENDIF»
			«IF basicServices.contains(ServiceEnum.UPDATE)»
				public static String UpdateFormHTML = "/html/«namelow»/update/";
				public static String UpdateFormIdHTML = UpdateFormHTML + Basic«name»Param.IdGet;
			«ENDIF»
			«IF basicServices.contains(ServiceEnum.UPLOAD)»
				public static String UploadFormHTML = "/html/«namelow»/upload";
			«ENDIF»

			/**
			 * Auto-generated html spark service. It initializes all html url's
			 * 
			 * @author miso.distil.codeGenerator
			 */
			@Override
			public void runService() {
		
				Html«name»Json HTML = new Html«name»Json();

				«IF basicServices.contains(ServiceEnum.READ)»
					get(ReadIdHTML,
						(request, response) -> HTML.getRead(request, response), 
						new FreeMarkerEngine());

				«ENDIF»
				«IF basicServices.contains(ServiceEnum.READ_ALL)»
					get(ReadAllHTML,
						(request, response) -> HTML.getReadAll(request, response),
						new FreeMarkerEngine());

				«ENDIF»
				«IF basicServices.contains(ServiceEnum.SEARCH)»
					get(SearchFormHTML,
						(request, response) -> HTML.getSearchForm(), 
						new FreeMarkerEngine());

					get(SearchHTML,
						(request, response) -> HTML.getSearch(request, response), 
						new FreeMarkerEngine());

				«ENDIF»
				«IF basicServices.contains(ServiceEnum.UPDATE)»
					get(UpdateFormIdHTML,
						(request, response) -> HTML.getUpdateForm(request, response), 
						new FreeMarkerEngine());

				«ENDIF»
				«IF basicServices.contains(ServiceEnum.UPLOAD)»
					get(UploadFormHTML,
						(request, response) -> HTML.getUploadForm(request, response),
						new FreeMarkerEngine());
				«ENDIF»

				«IF basicServices.contains(ServiceEnum.READ_ALL) || basicServices.contains(ServiceEnum.UPLOAD) || basicServices.contains(ServiceEnum.SEARCH)»
					this.addLayout();
				«ENDIF»
			}
			«IF basicServices.contains(ServiceEnum.READ_ALL) || basicServices.contains(ServiceEnum.UPLOAD) || basicServices.contains(ServiceEnum.SEARCH)»

				/**
				 * Auto-generated layout service. It add's to the html layout some permanents links
				 * 
				 * @author miso.distil.codeGenerator
				 */
				private void addLayout() {
					List<HtmlSelectBox> layouts = new ArrayList<HtmlSelectBox>();
					«IF basicServices.contains(ServiceEnum.READ_ALL)»
						layouts.add(new HtmlSelectBox("Read all «namelow»s" , ReadAllHTML));
					«ENDIF»
					«IF basicServices.contains(ServiceEnum.UPLOAD)»
						layouts.add(new HtmlSelectBox("Upload «namelow»" , UploadFormHTML));
					«ENDIF»
					«IF basicServices.contains(ServiceEnum.SEARCH)»
						layouts.add(new HtmlSelectBox("Search «namelow»" , SearchFormHTML));
					«ENDIF»
					HtmlFreeMarker.addLayout("«name»", layouts);
				}
			«ENDIF»

			private static Html«name»Json HTML = new Html«name»Json(new Custom«name»Html());

			«IF basicServices.contains(ServiceEnum.READ)»
				/**
				 * Auto-generated method to overwrite the information from an artifact
				 * 
				 * @author miso.distil.codeGenerator
				 */
				public static void overWriteInfoReadOne() {
					get(ReadIdHTML,
						(request, response) -> HTML.getRead(request, response), 
						new FreeMarkerEngine());
				}

			«ENDIF»
			«IF basicServices.contains(ServiceEnum.READ_ALL)»
				/**
				 * Auto-generated method to overwrite the information from an artifact's list
				 * 
				 * @author miso.distil.codeGenerator
				 */
				public static void overWriteInfoReadAll() {
					get(ReadAllHTML,
						(request, response) -> HTML.getReadAll(request, response), 
						new FreeMarkerEngine());

					get(SearchHTML,
						(request, response) -> HTML.getSearch(request, response), 
						new FreeMarkerEngine());
				}

			«ENDIF»
			«IF basicServices.contains(ServiceEnum.SEARCH)»
				/**
				 * Auto-generated method to overwrite the search form
				 * 
				 * @author miso.distil.codeGenerator
				 */
				public static void overWriteSearchForm() {
					get(SearchFormHTML,
						(request, response) -> HTML.getSearchForm(), 
						new FreeMarkerEngine());
				}

			«ENDIF»
			«IF basicServices.contains(ServiceEnum.UPDATE)»
				/**
				 * Auto-generated method to overwrite the update form
				 * 
				 * @author miso.distil.codeGenerator
				 */
				public static void overWriteUpdateForm() {
					get(UpdateFormIdHTML,
						(request, response) -> HTML.getUpdateForm(request, response), 
						new FreeMarkerEngine());
				}

			«ENDIF»
			«IF basicServices.contains(ServiceEnum.UPLOAD)»
				/**
				 * Auto-generated method to overwrite the upload form
				 * 
				 * @author miso.distil.codeGenerator
				 */
				public static void overWriteUploadForm() {
					get(UploadFormHTML,
						(request, response) -> HTML.getUploadForm(request, response), 
						new FreeMarkerEngine());
				}
			«ENDIF»
		}
	'''
}