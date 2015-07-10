package miso.distil.codeGenerator.generator.html

import codeGeneratorModel.Artifact
import com.google.inject.Inject
import codeGeneratorModel.ServiceEnum
import org.eclipse.emf.common.util.EList

/*
 * To write HtmlXXXJson.java
 * 
 * @author Carlos Carrascal
 */
class generateHtmlJson {

	@Inject miso.distil.codeGenerator.generator.packages pack

	/*
	 * To write Html<artifact.name>Json.java
	 * 
	 * @author Carlos Carrascal
	 */	
	def write(Artifact artifact) '''
		«var EList<ServiceEnum> basicServices = artifact.basicServices»
		«val namelow = artifact.name.toLowerCase»
		«val name = artifact.name»
		package «pack.getHtmlChar(artifact)»;

		import spark.ModelAndView;
		import spark.Request;
		import spark.Response;

		«IF basicServices.contains(ServiceEnum.READ_ALL) || basicServices.contains(ServiceEnum.SEARCH)»
			import java.util.ArrayList;
		«ENDIF»
		import java.util.HashMap;
		import java.util.Map;
		
		import «pack.MisoHtml».HtmlInterfaceJson;

		«IF basicServices.contains(ServiceEnum.READ_ALL) || basicServices.contains(ServiceEnum.SEARCH)»
			import «pack.MisoAbstract».AbstractPersistentClass;
		«ENDIF»
		import «pack.MisoHtml».HtmlFreeMarker;
		import «pack.MisoHtml».HtmlInterfaceView;
		
		«IF basicServices.contains(ServiceEnum.READ) || basicServices.contains(ServiceEnum.SEARCH) || basicServices.contains(ServiceEnum.UPDATE)»
			import «pack.getBasicChar(artifact)».Basic«name»Codes;
		«ENDIF»
		«IF basicServices.contains(ServiceEnum.READ) || basicServices.contains(ServiceEnum.READ_ALL) ||
		basicServices.contains(ServiceEnum.UPDATE) || basicServices.contains(ServiceEnum.SEARCH)»
			import «pack.getArtifactChar(artifact)».«name»Json;
		«ENDIF»
		import «pack.getArtifactChar(artifact)».Custom«name»Html;
		import «pack.getArtifactChar(artifact)».«name»;

		/**
		 * Auto-generated html methods
		 * 
		 * @author miso.distil.codeGenerator
		 */
		public class Html«name»Json implements HtmlInterfaceJson {

			«IF basicServices.contains(ServiceEnum.READ) || basicServices.contains(ServiceEnum.READ_ALL) ||
				basicServices.contains(ServiceEnum.UPDATE) || basicServices.contains(ServiceEnum.SEARCH)»
				private «name»Json Json = new «name»Json();
			«ENDIF»
			private Html«name»View View = new Html«name»View();
			private HtmlInterfaceView<«name»> customView;

			/**
			 * Auto-generated empty constructor
			 * 
			 * @author miso.distil.codeGenerator
			 */
			public Html«name»Json() {
				customView = View;
			}

			/**
			 * Auto-generated constructor with a custom view
			 * 
			 * @author miso.distil.codeGenerator
			 */
			public Html«name»Json(Custom«name»Html View) {
				customView = View;
			}

			«IF basicServices.contains(ServiceEnum.READ)»
				/**
				 * Auto-generated method to read the information from an artifact
				 * 
				 * @author miso.distil.codeGenerator
				 */
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
			«IF basicServices.contains(ServiceEnum.READ_ALL)»
				/**
				 * Auto-generated method to read the information from an artifact's list
				 * 
				 * @author miso.distil.codeGenerator
				 */
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
			«IF basicServices.contains(ServiceEnum.SEARCH)»
				/**
				 * Auto-generated method to construct the search form
				 * 
				 * @author miso.distil.codeGenerator
				 */
				@Override
				public ModelAndView getSearchForm() {
					Map<String, Object> viewObjects = new HashMap<String, Object>();
					viewObjects = View.constructSearchForm();
					viewObjects.put(HtmlFreeMarker.TEMPLATE, HtmlFreeMarker.FORM_HTML); 
				
					return HtmlFreeMarker.closeHtml(viewObjects);
				}

			«ENDIF»
			«IF basicServices.contains(ServiceEnum.SEARCH)»
				/**
				 * Auto-generated method to read the information from the result list of a search
				 * 
				 * @author miso.distil.codeGenerator
				 */
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
			«IF basicServices.contains(ServiceEnum.UPDATE)»
				/**
				 * Auto-generated method to construct the update form
				 * 
				 * @author miso.distil.codeGenerator
				 */
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
			«IF basicServices.contains(ServiceEnum.UPLOAD)»
				/**
				 * Auto-generated method to construct the upload form
				 * 
				 * @author miso.distil.codeGenerator
				 */
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