package miso.carrascal.codeGenerator.generator.html

import com.google.inject.Inject
import codeGeneratorModel.Artifact
import org.eclipse.emf.common.util.EList
import codeGeneratorModel.ServiceEnum

/*
 * To write HtmlXXXLinks.java
 * 
 * @author Carlos Carrascal
 */
class generateHtmlLinks {
	
	@Inject miso.carrascal.codeGenerator.generator.packages pack
	
	/*
	 * To write Html<artifact.name>Links.java
	 * 
	 * @author Carlos Carrascal
	 */			
	def write(Artifact artifact) '''
		«var EList<ServiceEnum> basicServices = artifact.basicServices»
		«val name = artifact.name»
		«val namelow = artifact.name.toLowerCase»
		package «pack.getHtmlChar(artifact)»;

		«IF basicServices.contains(ServiceEnum.UPLOAD_LITERAL)»
			import «pack.getBasicChar(artifact)».Basic«name»Param;
		«ENDIF»
		«IF basicServices.contains(ServiceEnum.READ_LITERAL) || basicServices.contains(ServiceEnum.DOWNLOAD_LITERAL) || basicServices.contains(ServiceEnum.UPLOAD_LITERAL)»
			import «pack.getBasicChar(artifact)».Basic«name»Spark;
		«ENDIF»
		import «pack.getArtifactChar(artifact)».«name»;
		
		/**
		 * Auto-generated html links
		 * 
		 * @author miso.distil.codeGenerator
		 */
		public class Html«name»Links {

			«IF basicServices.contains(ServiceEnum.READ_LITERAL)»
				/**
				 * Auto-generated link to the service read one json
				 * 
				 * @author miso.distil.codeGenerator
				 */
				public static String getReadJsonLink(«name» «namelow») {
					return "<a href=" + Basic«name»Spark.ReadJson + «namelow».getObjectId() + ">View as Json</a>";
				}

				/**
				 * Auto-generated link to the service read one html
				 * 
				 * @author miso.distil.codeGenerator
				 */
				public static String getReadHtmlLink(«name» «namelow») {
					return "<a href=" + Html«name»Spark.ReadHTML + «namelow».getObjectId() + ">" + «namelow».getObjectName() + "</a>";
				}

			«ENDIF»
			«IF basicServices.contains(ServiceEnum.DOWNLOAD_LITERAL)»
				/**
				 * Auto-generated link to the service download zip
				 * 
				 * @author miso.distil.codeGenerator
				 */
				public static String getDownloadZipJsonLink(«name» «namelow») {
					return "<a href=" + Basic«name»Spark.DownloadZipJson + «namelow».getObjectId() + ">Download zip</a>";
				}

				/**
				 * Auto-generated link to the service download file
				 * 
				 * @author miso.distil.codeGenerator
				 */
				public static String getDownloadFileJsonLink(«name» «namelow») {
					return "<a href=" + Basic«name»Spark.DownloadFileJson + «namelow».getObjectId() + ">Download «namelow»</a>";
				}

			«ENDIF»
			«IF basicServices.contains(ServiceEnum.UPLOAD_LITERAL)»
				/**
				 * Auto-generated link to the service delete
				 * 
				 * @author miso.distil.codeGenerator
				 */
				public static String getDeleteFormJsonLink(«name» «namelow») {
					String form = "";
					form = "<form id=\"delete" + «namelow».getObjectId() + "\"action=\"" + Basic«name»Spark.DeleteJson + "\" method=\"POST\">";
					form += "<input type='hidden' name='" + Basic«name»Param.IdPost + "' value=\"" + «namelow».getObjectId() + "\"/>";
					form += "<a href=\"javascript:{}\" onclick=\"document.getElementById('delete" + «namelow».getObjectId() + "').submit(); return false;\">Delete</a>";
					form += "</form>";
				    return form;
				}

			«ENDIF»
			«IF basicServices.contains(ServiceEnum.UPDATE_LITERAL)»
				/**
				 * Auto-generated link to the service update form html
				 * 
				 * @author miso.distil.codeGenerator
				 */
				public static String getUpdateHtmlLink(«name» «namelow») {
					return "<a href=" + Html«name»Spark.UpdateFormHTML + «namelow».getObjectId() + ">Update</a>";
				}
		    «ENDIF»
		}
	'''
}