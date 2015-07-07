package miso.carrascal.codeGenerator.generator.html

import codeGeneratorModel.Artifact
import com.google.inject.Inject
import codeGeneratorModel.ServiceEnum
import org.eclipse.emf.common.util.EList

class generateHtmlJson {

	@Inject miso.carrascal.codeGenerator.generator.packages pack
		
	def write(Artifact artifact) '''
		«var EList<ServiceEnum> basicServices = artifact.basicServices»
		«val namelow = artifact.name.toLowerCase»
		«val name = artifact.name»
		package «pack.getHtmlChar(artifact)»;

		import spark.ModelAndView;
		import spark.Request;
		import spark.Response;

		«IF basicServices.contains(ServiceEnum.READ_ALL_LITERAL) || basicServices.contains(ServiceEnum.SEARCH_LITERAL)»
			import java.util.ArrayList;
		«ENDIF»
		import java.util.HashMap;
		import java.util.Map;
		
		import «pack.MisoHtml».HtmlInterfaceJson;

		«IF basicServices.contains(ServiceEnum.READ_ALL_LITERAL) || basicServices.contains(ServiceEnum.SEARCH_LITERAL)»
			import «pack.MisoAbstract».AbstractPersistentClass;
		«ENDIF»
		import «pack.MisoHtml».HtmlFreeMarker;
		import «pack.MisoHtml».HtmlInterfaceView;
		
		«IF basicServices.contains(ServiceEnum.READ_LITERAL) || basicServices.contains(ServiceEnum.SEARCH_LITERAL) || basicServices.contains(ServiceEnum.UPDATE_LITERAL)»
			import «pack.getBasicChar(artifact)».Basic«name»Codes;
		«ENDIF»
		«IF basicServices.contains(ServiceEnum.READ_LITERAL) || basicServices.contains(ServiceEnum.READ_ALL_LITERAL) ||
		basicServices.contains(ServiceEnum.UPDATE_LITERAL) || basicServices.contains(ServiceEnum.SEARCH_LITERAL)»
			import «pack.getArtifactChar(artifact)».«name»Json;
		«ENDIF»
		import «pack.getArtifactChar(artifact)».Custom«name»Html;
		import «pack.getArtifactChar(artifact)».«name»;

		public class Html«name»Json implements HtmlInterfaceJson {

			«IF basicServices.contains(ServiceEnum.READ_LITERAL) || basicServices.contains(ServiceEnum.READ_ALL_LITERAL) ||
				basicServices.contains(ServiceEnum.UPDATE_LITERAL) || basicServices.contains(ServiceEnum.SEARCH_LITERAL)»
				private «name»Json Json = new «name»Json();
			«ENDIF»
			private Html«name»View View = new Html«name»View();
			private HtmlInterfaceView<«name»> customView;

			public Html«name»Json() {
				customView = View;
			}

			public Html«name»Json(Custom«name»Html View) {
				customView = View;
			}

			«IF basicServices.contains(ServiceEnum.READ_LITERAL)»
				@Override
				public ModelAndView getRead(Request req, Response res) {
					Map<String, Object> viewObjects = new HashMap<String, Object>();

					«name» «namelow» = («name») Json.getRead(req, res);
					if(«namelow» == null) {
						viewObjects.put(HtmlFreeMarker.ERROR, Basic«name»Codes.DB_notfound);
					} else {
						viewObjects.put(HtmlFreeMarker.ENTRIES, customView.constructInfoReadOne(«namelow»));
					}
					viewObjects.put(HtmlFreeMarker.TEMPLATE, HtmlFreeMarker.READ_HTML);

					return HtmlFreeMarker.closeHtml(viewObjects);
				}

			«ENDIF»
			«IF basicServices.contains(ServiceEnum.READ_ALL_LITERAL)»
				@Override
				public ModelAndView getReadAll(Request req, Response res) {
					Map<String, Object> viewObjects = new HashMap<String, Object>();

					ArrayList<«name»> «namelow»s = new ArrayList<«name»>();
					for(AbstractPersistentClass «namelow» : Json.getReadAll(req, res)) {
						«namelow»s.add((«name»)«namelow»);
					}
					viewObjects.put(HtmlFreeMarker.MULTI_ENTRIES, customView.constructInfoReadAll(«namelow»s));
					viewObjects.put(HtmlFreeMarker.COUNT, «namelow»s.size());
					viewObjects.put(HtmlFreeMarker.TEMPLATE, HtmlFreeMarker.LIST_HTML);

					return HtmlFreeMarker.closeHtml(viewObjects);
				}

			«ENDIF»
			«IF basicServices.contains(ServiceEnum.SEARCH_LITERAL)»
				@Override
				public ModelAndView getSearchForm() {
					Map<String, Object> viewObjects = new HashMap<String, Object>();
					viewObjects = View.constructSearchForm();
					viewObjects.put(HtmlFreeMarker.TEMPLATE, HtmlFreeMarker.FORM_HTML); 
				
					return HtmlFreeMarker.closeHtml(viewObjects);
				}

			«ENDIF»
			«IF basicServices.contains(ServiceEnum.SEARCH_LITERAL)»
				@Override
				public ModelAndView getSearch(Request req, Response res) {	
					Map<String, Object> viewObjects = new HashMap<String, Object>();

					ArrayList<«name»> «namelow»s = new ArrayList<«name»>();
					for(AbstractPersistentClass «namelow» : Json.getSearch(req, res)) {
						«namelow»s.add((«name»)«namelow»);
					}
					if(«namelow»s.isEmpty()) {
						viewObjects = View.constructSearchForm();
						viewObjects.put(HtmlFreeMarker.TEMPLATE, HtmlFreeMarker.FORM_HTML); 
						viewObjects.put(HtmlFreeMarker.EMPTY, Basic«name»Codes.«name»_notfound);
					} else {	
						viewObjects = new HashMap<String, Object>();
						viewObjects.put(HtmlFreeMarker.MULTI_ENTRIES, customView.constructInfoReadAll(«namelow»s));
						viewObjects.put(HtmlFreeMarker.COUNT, «namelow»s.size());
						viewObjects.put(HtmlFreeMarker.SYNONYMS_QUERY, Json.getSynonymesQuery(req, res));
						viewObjects.put(HtmlFreeMarker.SYNONYMS_VALUE, Json.getSynonymesValue(req, res));
						viewObjects.put(HtmlFreeMarker.TEMPLATE, HtmlFreeMarker.LIST_HTML);
					}

					return HtmlFreeMarker.closeHtml(viewObjects);
				}

			«ENDIF»
			«IF basicServices.contains(ServiceEnum.UPDATE_LITERAL)»
				@Override
				public ModelAndView getUpdateForm(Request req, Response res) {
					Map<String, Object> viewObjects = new HashMap<String, Object>();

					«name» «namelow» = («name») Json.getRead(req, res);
					if(«namelow» == null) {
						viewObjects.put(HtmlFreeMarker.ERROR, Basic«name»Codes.«name»_notfound);
					} else {
						viewObjects = customView.constructUpdateForm(«namelow»);
					}
					viewObjects.put(HtmlFreeMarker.TEMPLATE, HtmlFreeMarker.FORM_HTML);

					return HtmlFreeMarker.closeHtml(viewObjects);
				}

			«ENDIF»
			«IF basicServices.contains(ServiceEnum.UPLOAD_LITERAL)»
				@Override
				public ModelAndView getUploadForm(Request req, Response res) {
					Map<String, Object> viewObjects = new HashMap<String, Object>();
					viewObjects = customView.constructUploadForm(req);
					viewObjects.put(HtmlFreeMarker.TEMPLATE, HtmlFreeMarker.FORM_HTML); 

					return HtmlFreeMarker.closeHtml(viewObjects);
				}

			«ENDIF»
		}
	'''
}