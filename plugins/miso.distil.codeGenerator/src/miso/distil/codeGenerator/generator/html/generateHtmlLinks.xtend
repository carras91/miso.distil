package miso.distil.codeGenerator.generator.html

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
	
	@Inject miso.distil.codeGenerator.generator.generateUtils genUti
	@Inject miso.distil.codeGenerator.generator.Names names
	
	/*
	 * To write Html<artifact.name>Links.java
	 * 
	 * @author Carlos Carrascal
	 */			
	def write(Artifact artifact) '''
		«var EList<ServiceEnum> basicServices = genUti.processBasicServices(artifact.basicServices)»
		«val name = artifact.name»
		«val namelow = artifact.name.toLowerCase»
		package «names.getHtmlChar(artifact)»;

		«IF basicServices.contains(ServiceEnum.DELETE)»
			import «names.getBParamFileChar(artifact)»;
		«ENDIF»
		«IF basicServices.contains(ServiceEnum.READ) || basicServices.contains(ServiceEnum.DOWNLOAD) || basicServices.contains(ServiceEnum.DELETE)»
			import «names.getBSparkFileChar(artifact)»;
		«ENDIF»
		import «names.getArtifactFileChar(artifact)»;
		
		/**
		 * Auto-generated html links
		 * 
		 * @author miso.distil.codeGenerator
		 */
		public class Html«name»Links {

			«IF basicServices.contains(ServiceEnum.READ)»
				/**
				 * Auto-generated link to the service read one json
				 * 
				 * @author miso.distil.codeGenerator
				 */
				public static String getReadJsonLink(«name» «namelow») {
					return "<a href=" + Basic«name»Spark.ReadJson + «namelow».getObjectid() + ">View as Json</a>";
				}

				/**
				 * Auto-generated link to the service read one html
				 * 
				 * @author miso.distil.codeGenerator
				 */
				public static String getReadHtmlLink(«name» «namelow») {
					return "<a href=" + Html«name»Spark.ReadHTML + «namelow».getObjectid() + ">" + «namelow».getObjectname() + "</a>";
				}

			«ENDIF»
			«IF basicServices.contains(ServiceEnum.DOWNLOAD)»
				/**
				 * Auto-generated link to the service download zip
				 * 
				 * @author miso.distil.codeGenerator
				 */
				public static String getDownloadZipJsonLink(«name» «namelow») {
					return "<a href=" + Basic«name»Spark.DownloadZipJson + «namelow».getObjectid() + ">Download zip</a>";
				}

				/**
				 * Auto-generated link to the service download file
				 * 
				 * @author miso.distil.codeGenerator
				 */
				public static String getDownloadFileJsonLink(«name» «namelow») {
					return "<a href=" + Basic«name»Spark.DownloadFileJson + «namelow».getObjectid() + ">Download «namelow»</a>";
				}

			«ENDIF»
			«IF basicServices.contains(ServiceEnum.DELETE)»
				/**
				 * Auto-generated link to the service delete
				 * 
				 * @author miso.distil.codeGenerator
				 */
				public static String getDeleteFormJsonLink(«name» «namelow») {
					String form = "";
					form = "<form id=\"delete" + «namelow».getObjectid() + "\"action=\"" + Basic«name»Spark.DeleteJson + "\" method=\"POST\">";
					form += "<input type='hidden' name='" + Basic«name»Param.IdPost + "' value=\"" + «namelow».getObjectid() + "\"/>";
					form += "<a href=\"javascript:{}\" onclick=\"document.getElementById('delete" + «namelow».getObjectid() + "').submit(); return false;\">Delete</a>";
					form += "</form>";
				    return form;
				}

			«ENDIF»
			«IF basicServices.contains(ServiceEnum.UPDATE)»
				/**
				 * Auto-generated link to the service update form html
				 * 
				 * @author miso.distil.codeGenerator
				 */
				public static String getUpdateHtmlLink(«name» «namelow») {
					return "<a href=" + Html«name»Spark.UpdateFormHTML + «namelow».getObjectid() + ">Update</a>";
				}
		    «ENDIF»
		}
	'''
}