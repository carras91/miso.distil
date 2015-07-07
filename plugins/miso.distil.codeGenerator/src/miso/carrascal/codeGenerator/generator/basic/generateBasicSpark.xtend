package miso.carrascal.codeGenerator.generator.basic

import com.google.inject.Inject
import codeGeneratorModel.Artifact
import codeGeneratorModel.ServiceEnum
import org.eclipse.emf.common.util.EList

class generateBasicSpark {
	
	@Inject miso.carrascal.codeGenerator.generator.packages pack
		
	def write(Artifact artifact) '''
		«var EList<ServiceEnum> basicServices = artifact.basicServices»
		«val name = artifact.name»
		«val namelow = artifact.name.toLowerCase»
		package «pack.getBasicChar(artifact)»;
		
		«IF basicServices.contains(ServiceEnum.UPDATE_LITERAL) || basicServices.contains(ServiceEnum.UPLOAD_LITERAL)»
			import static spark.Spark.post;
		«ENDIF»
		«IF basicServices.contains(ServiceEnum.SEARCH_LITERAL) || basicServices.contains(ServiceEnum.READ_LITERAL) ||
			basicServices.contains(ServiceEnum.READ_ALL_LITERAL) || basicServices.contains(ServiceEnum.DOWNLOAD_LITERAL)»
			import static spark.Spark.get;
		«ENDIF»

		import «pack.getArtifactChar(artifact)».«name»Json;

		import «pack.MisoBasic».JsonTransformer;
		import «pack.MisoBasic».BasicInterfaceSpark;

		public final class Basic«name»Spark implements BasicInterfaceSpark {

			«IF basicServices.contains(ServiceEnum.READ_LITERAL)»
				public static String ReadJson = "/json/«namelow»/read/";
				public static String ReadIdJson = ReadJson + Basic«name»Param.IdGet;
			«ENDIF»
			«IF basicServices.contains(ServiceEnum.READ_ALL_LITERAL)»
				public static String ReadAllJson = "/json/«namelow»/all";
			«ENDIF»
			«IF basicServices.contains(ServiceEnum.SEARCH_LITERAL)»
				public static String SearchJson = "/json/«namelow»/search";
			«ENDIF»
			«IF basicServices.contains(ServiceEnum.UPDATE_LITERAL)»
				public static String UpdateJson = "/json/«namelow»/update";
			«ENDIF»
			«IF basicServices.contains(ServiceEnum.UPLOAD_LITERAL)»
				public static String UploadJson = "/json/«namelow»/upload";
				public static String DeleteJson = "/json/«namelow»/delete";
			«ENDIF»
			«IF basicServices.contains(ServiceEnum.DOWNLOAD_LITERAL)»
				public static String DownloadZipJson = "/json/«namelow»/download/zip/";
				public static String DownloadZipIdJson = DownloadZipJson + Basic«name»Param.IdGet;
				public static String DownloadFileJson = "/json/«namelow»/download/file/";
				public static String DownloadFileIdJson = DownloadFileJson + Basic«name»Param.IdGet;
			«ENDIF»

			@Override
			public void runService() {
		
				«name»Json Json = new «name»Json();

				«IF basicServices.contains(ServiceEnum.READ_LITERAL)»
					get(ReadIdJson, "application/json",
						(request, response) -> Json.getRead(request, response), 
						new JsonTransformer());

				«ENDIF»
				«IF basicServices.contains(ServiceEnum.READ_ALL_LITERAL)»
					get(ReadAllJson, "application/json",
						(request, response) -> Json.getReadAll(request, response),
						new JsonTransformer());

				«ENDIF»
				«IF basicServices.contains(ServiceEnum.SEARCH_LITERAL)»
					get(SearchJson, "application/json",
						(request, response) -> Json.getSearch(request, response), 
						new JsonTransformer());

				«ENDIF»
				«IF basicServices.contains(ServiceEnum.UPDATE_LITERAL)»
					post(UpdateJson, "application/json",
						(request, response) -> Json.postUpdate(request, response), 
						new JsonTransformer());

				«ENDIF»
				«IF basicServices.contains(ServiceEnum.UPLOAD_LITERAL)»
					post(UploadJson, "application/json",
						(request, response) -> Json.postUpload(request, response),
						new JsonTransformer());

					post(DeleteJson, "application/json",
						(request, response) -> Json.postDelete(request, response),
						new JsonTransformer());

				«ENDIF»
				«IF basicServices.contains(ServiceEnum.DOWNLOAD_LITERAL)»
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