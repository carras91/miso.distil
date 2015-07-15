package miso.distil.codeGenerator.generator.basic

import com.google.inject.Inject
import codeGeneratorModel.Artifact
import codeGeneratorModel.ServiceEnum
import org.eclipse.emf.common.util.EList

/*
 * To write BasicXXXSpark.java
 * 
 * @author Carlos Carrascal
 */
class generateBasicSpark {
	
	@Inject miso.distil.codeGenerator.generator.generateUtils genUti
	@Inject miso.distil.codeGenerator.generator.Names names

	/*
	 * To write Basic<artifact.name>Spark.java
	 * 
	 * @author Carlos Carrascal
	 */
	def write(Artifact artifact) '''
		«var EList<ServiceEnum> basicServices = genUti.processBasicServices(artifact.basicServices)»
		«val name = artifact.name»
		«val namelow = artifact.name.toLowerCase»
		package «names.getBasicChar(artifact)»;
		
		«IF basicServices.contains(ServiceEnum.UPDATE) || basicServices.contains(ServiceEnum.UPLOAD) ||
			basicServices.contains(ServiceEnum.DELETE)»
			import static spark.Spark.post;
		«ENDIF»
		«IF basicServices.contains(ServiceEnum.SEARCH) || basicServices.contains(ServiceEnum.READ) ||
			basicServices.contains(ServiceEnum.READ_ALL) || basicServices.contains(ServiceEnum.DOWNLOAD)»
			import static spark.Spark.get;
		«ENDIF»

		import «names.getArtifactJsonFileChar(artifact)»;

		import «names.MisoBasic».JsonTransformer;
		import «names.MisoBasic».BasicInterfaceSpark;

		/**
		 * Auto-generated spark server
		 * 
		 * @author miso.distil.codeGenerator
		 */
		public final class Basic«name»Spark implements BasicInterfaceSpark {

			// URL's
			«IF basicServices.contains(ServiceEnum.READ)»
				public static String ReadJson = "/json/«namelow»/read/";
				public static String ReadIdJson = ReadJson + Basic«name»Param.IdGet;
			«ENDIF»
			«IF basicServices.contains(ServiceEnum.READ_ALL)»
				public static String ReadAllJson = "/json/«namelow»/all";
			«ENDIF»
			«IF basicServices.contains(ServiceEnum.SEARCH)»
				public static String SearchJson = "/json/«namelow»/search";
			«ENDIF»
			«IF basicServices.contains(ServiceEnum.UPDATE)»
				public static String UpdateJson = "/json/«namelow»/update";
			«ENDIF»
			«IF basicServices.contains(ServiceEnum.UPLOAD)»
				public static String UploadJson = "/json/«namelow»/upload";
			«ENDIF»
			«IF basicServices.contains(ServiceEnum.DELETE)»
				public static String DeleteJson = "/json/«namelow»/delete";
			«ENDIF»
			«IF basicServices.contains(ServiceEnum.DOWNLOAD)»
				public static String DownloadZipJson = "/json/«namelow»/download/zip/";
				public static String DownloadZipIdJson = DownloadZipJson + Basic«name»Param.IdGet;
				public static String DownloadFileJson = "/json/«namelow»/download/file/";
				public static String DownloadFileIdJson = DownloadFileJson + Basic«name»Param.IdGet;
			«ENDIF»

			/**
			 * Auto-generated spark service. It initializes all url's
			 * 
			 * @author miso.distil.codeGenerator
			 */
			@Override
			public void runService() {
		
				«name»Json Json = new «name»Json();

				«IF basicServices.contains(ServiceEnum.READ)»
					get(ReadIdJson, "application/json",
						(request, response) -> Json.getRead(request, response), 
						new JsonTransformer());

				«ENDIF»
				«IF basicServices.contains(ServiceEnum.READ_ALL)»
					get(ReadAllJson, "application/json",
						(request, response) -> Json.getReadAll(request, response),
						new JsonTransformer());

				«ENDIF»
				«IF basicServices.contains(ServiceEnum.SEARCH)»
					get(SearchJson, "application/json",
						(request, response) -> Json.getSearch(request, response), 
						new JsonTransformer());

				«ENDIF»
				«IF basicServices.contains(ServiceEnum.UPDATE)»
					post(UpdateJson, "application/json",
						(request, response) -> Json.postUpdate(request, response), 
						new JsonTransformer());

				«ENDIF»
				«IF basicServices.contains(ServiceEnum.UPLOAD)»
					post(UploadJson, "application/json",
						(request, response) -> Json.postUpload(request, response),
						new JsonTransformer());

				«ENDIF»
				«IF basicServices.contains(ServiceEnum.DELETE)»
					post(DeleteJson, "application/json",
						(request, response) -> Json.postDelete(request, response),
						new JsonTransformer());

				«ENDIF»
				«IF basicServices.contains(ServiceEnum.DOWNLOAD)»
					get(DownloadZipIdJson, "application/json",
						(request, response) -> Json.getDownloadZip(request, response),
						new JsonTransformer());

					get(DownloadFileIdJson, "application/json",
						(request, response) -> Json.getDownloadFile(request, response),
						new JsonTransformer());
				«ENDIF»
			}
		}
	'''
}