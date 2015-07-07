package miso.carrascal.codeGenerator.generator.html

import com.google.inject.Inject
import codeGeneratorModel.Artifact
import codeGeneratorModel.ServiceEnum
import org.eclipse.emf.common.util.EList

class generateHtmlSpark { 
	
	@Inject miso.carrascal.codeGenerator.generator.packages pack
		
	def write(Artifact artifact) '''
		«var EList<ServiceEnum> basicServices = artifact.basicServices»
		«val name = artifact.name»
		«val namelow = name.toLowerCase»
		package «pack.getHtmlChar(artifact)»;

		import static spark.Spark.get;
		import spark.template.freemarker.FreeMarkerEngine;
		«IF basicServices.contains(ServiceEnum.READ_ALL_LITERAL) || basicServices.contains(ServiceEnum.UPLOAD_LITERAL) || basicServices.contains(ServiceEnum.SEARCH_LITERAL)»

			import java.util.ArrayList;
			import java.util.List;
		«ENDIF»

		import «pack.MisoBasic».BasicInterfaceSpark;
		«IF basicServices.contains(ServiceEnum.READ_ALL_LITERAL) || basicServices.contains(ServiceEnum.UPLOAD_LITERAL) || basicServices.contains(ServiceEnum.SEARCH_LITERAL)»
			import «pack.MisoHtml».HtmlFreeMarker;
			import «pack.MisoHtml».htmlObjects.HtmlLayout;

		«ENDIF»
		«IF basicServices.contains(ServiceEnum.UPDATE_LITERAL) || basicServices.contains(ServiceEnum.READ_LITERAL)»
			import «pack.getBasicChar(artifact)».Basic«name»Param;
		«ENDIF»
		import «pack.getArtifactChar(artifact)».Custom«name»Html;
		import «pack.getHtmlChar(artifact)».Html«name»Json;
		
		public final class Html«name»Spark implements BasicInterfaceSpark {

			«IF basicServices.contains(ServiceEnum.READ_LITERAL)»
				public static String ReadHTML = "/html/«namelow»/read/";
				public static String ReadIdHTML = ReadHTML + Basic«name»Param.IdGet;
			«ENDIF»
			«IF basicServices.contains(ServiceEnum.READ_ALL_LITERAL)»
				public static String ReadAllHTML = "/html/«namelow»/all";
				public static String SearchHTML = "/html/«namelow»/search";
			«ENDIF»
			«IF basicServices.contains(ServiceEnum.SEARCH_LITERAL)»
				public static String SearchFormHTML = "/html/«namelow»/search/form";
				«IF !basicServices.contains(ServiceEnum.READ_ALL_LITERAL)»
					public static String SearchHTML = "/html/«namelow»/search";
				«ENDIF»
			«ENDIF»
			«IF basicServices.contains(ServiceEnum.UPDATE_LITERAL)»
				public static String UpdateFormHTML = "/html/«namelow»/update/";
				public static String UpdateFormIdHTML = UpdateFormHTML + Basic«name»Param.IdGet;
			«ENDIF»
			«IF basicServices.contains(ServiceEnum.UPLOAD_LITERAL)»
				public static String UploadFormHTML = "/html/«namelow»/upload";
			«ENDIF»

			@Override
			public void runService() {
		
				Html«name»Json HTML = new Html«name»Json();

				«IF basicServices.contains(ServiceEnum.READ_LITERAL)»
					get(ReadIdHTML,
						(request, response) -> HTML.getRead(request, response), 
						new FreeMarkerEngine());

				«ENDIF»
				«IF basicServices.contains(ServiceEnum.READ_ALL_LITERAL)»
					get(ReadAllHTML,
						(request, response) -> HTML.getReadAll(request, response),
						new FreeMarkerEngine());

				«ENDIF»
				«IF basicServices.contains(ServiceEnum.SEARCH_LITERAL)»
					get(SearchFormHTML,
						(request, response) -> HTML.getSearchForm(), 
						new FreeMarkerEngine());

					get(SearchHTML,
						(request, response) -> HTML.getSearch(request, response), 
						new FreeMarkerEngine());

				«ENDIF»
				«IF basicServices.contains(ServiceEnum.UPDATE_LITERAL)»
					get(UpdateFormIdHTML,
						(request, response) -> HTML.getUpdateForm(request, response), 
						new FreeMarkerEngine());

				«ENDIF»
				«IF basicServices.contains(ServiceEnum.UPLOAD_LITERAL)»
					get(UploadFormHTML,
						(request, response) -> HTML.getUploadForm(request, response),
						new FreeMarkerEngine());
				«ENDIF»

				«IF basicServices.contains(ServiceEnum.READ_ALL_LITERAL) || basicServices.contains(ServiceEnum.UPLOAD_LITERAL) || basicServices.contains(ServiceEnum.SEARCH_LITERAL)»
					this.addLayout();
				«ENDIF»
			}
			«IF basicServices.contains(ServiceEnum.READ_ALL_LITERAL) || basicServices.contains(ServiceEnum.UPLOAD_LITERAL) || basicServices.contains(ServiceEnum.SEARCH_LITERAL)»

				private void addLayout() {
					List<HtmlLayout> layouts = new ArrayList<HtmlLayout>();
					«IF basicServices.contains(ServiceEnum.READ_ALL_LITERAL)»
						layouts.add(new HtmlLayout("Read all «namelow»s" , ReadAllHTML));
					«ENDIF»
					«IF basicServices.contains(ServiceEnum.UPLOAD_LITERAL)»
						layouts.add(new HtmlLayout("Upload «namelow»" , UploadFormHTML));
					«ENDIF»
					«IF basicServices.contains(ServiceEnum.SEARCH_LITERAL)»
						layouts.add(new HtmlLayout("Search «namelow»" , SearchFormHTML));
					«ENDIF»
					HtmlFreeMarker.addLayout("«name»", layouts);
				}
			«ENDIF»

			private static Html«name»Json HTML = new Html«name»Json(new Custom«name»Html());

			«IF basicServices.contains(ServiceEnum.READ_LITERAL)»
				public static void overWriteInfoReadOne() {
					get(ReadIdHTML,
						(request, response) -> HTML.getRead(request, response), 
						new FreeMarkerEngine());
				}

			«ENDIF»
			«IF basicServices.contains(ServiceEnum.READ_ALL_LITERAL)»
				public static void overWriteInfoReadAll() {
					get(ReadAllHTML,
						(request, response) -> HTML.getReadAll(request, response), 
						new FreeMarkerEngine());

					get(SearchHTML,
						(request, response) -> HTML.getSearch(request, response), 
						new FreeMarkerEngine());
				}

			«ENDIF»
			«IF basicServices.contains(ServiceEnum.SEARCH_LITERAL)»
				public static void overWriteSearchForm() {
					get(SearchFormHTML,
						(request, response) -> HTML.getSearchForm(), 
						new FreeMarkerEngine());
				}

			«ENDIF»
			«IF basicServices.contains(ServiceEnum.UPDATE_LITERAL)»
				public static void overWriteUpdateForm() {
					get(UpdateFormIdHTML,
						(request, response) -> HTML.getUpdateForm(request, response), 
						new FreeMarkerEngine());
				}

			«ENDIF»
			«IF basicServices.contains(ServiceEnum.UPLOAD_LITERAL)»
				public static void overWriteUploadForm() {
					get(UploadFormHTML,
						(request, response) -> HTML.getUploadForm(request, response), 
						new FreeMarkerEngine());
				}
			«ENDIF»
		}
	'''
}