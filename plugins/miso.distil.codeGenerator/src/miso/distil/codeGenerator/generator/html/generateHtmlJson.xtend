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

	@Inject miso.distil.codeGenerator.generator.generateUtils genUti
	@Inject miso.distil.codeGenerator.generator.Names names

	/*
	 * To write Html<artifact.name>Json.java
	 * 
	 * @author Carlos Carrascal
	 */	
	def write(Artifact artifact) '''
		«var EList<ServiceEnum> basicServices = genUti.processBasicServices(artifact.basicServices)»
		«val namelow = artifact.name.toLowerCase»
		«val name = artifact.name»
		package «names.getHtmlChar(artifact)»;

		import spark.ModelAndView;
		import spark.Request;
		import spark.Response;

		«IF basicServices.contains(ServiceEnum.READ_ALL) || basicServices.contains(ServiceEnum.SEARCH)»
			import java.util.ArrayList;
		«ENDIF»
		import java.util.HashMap;
		import java.util.Map;
		
		import «names.MisoHtml».HtmlInterfaceJson;

		«IF basicServices.contains(ServiceEnum.READ_ALL) || basicServices.contains(ServiceEnum.SEARCH)»
			import «names.MisoAbstract».Persistent;
		«ENDIF»
		import «names.MisoHtml».HtmlFreeMarker;
		import «names.MisoHtml».HtmlInterfaceView;
		«IF basicServices.contains(ServiceEnum.SEARCH)»
			import «names.MisoUtils».Utils;
		«ENDIF»
		
		«IF basicServices.contains(ServiceEnum.READ) || basicServices.contains(ServiceEnum.SEARCH) || basicServices.contains(ServiceEnum.UPDATE)»
			import «names.getBCodesFileChar(artifact)»;
		«ENDIF»
		«IF basicServices.contains(ServiceEnum.READ) || basicServices.contains(ServiceEnum.READ_ALL) ||
		basicServices.contains(ServiceEnum.UPDATE) || basicServices.contains(ServiceEnum.SEARCH)»
			import «names.getArtifactJsonFileChar(artifact)»;
		«ENDIF»
		import «names.getArtifactCustomFileChar(artifact)»;
		import «names.getArtifactFileChar(artifact)»;

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
					for(Persistent «namelow» : Json.getReadAll(req, res)) {
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
					for(Persistent «namelow» : Json.getSearch(req, res)) {
						«namelow»s.add((«name»)«namelow»);
					}
					if(«namelow»s.isEmpty()) {
						viewObjects = View.constructSearchForm();
						viewObjects.put(HtmlFreeMarker.TEMPLATE, HtmlFreeMarker.FORM_HTML); 
						viewObjects.put(HtmlFreeMarker.EMPTY, Basic«name»Codes.«name»_notfound);
						viewObjects.put(HtmlFreeMarker.SYNONYMS_VALUES, Utils.ListToString(Json.getSynonymesValue(req, res)));
					} else {	
						viewObjects = new HashMap<String, Object>();
						viewObjects.put(HtmlFreeMarker.MULTI_ENTRIES, customView.constructInfoReadAll(«namelow»s));
						viewObjects.put(HtmlFreeMarker.COUNT, «namelow»s.size());
						viewObjects.put(HtmlFreeMarker.SYNONYMS_VALUES, Utils.ListToString(Json.getSynonymesValue(req, res)));
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