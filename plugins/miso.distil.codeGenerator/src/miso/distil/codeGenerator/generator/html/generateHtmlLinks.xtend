package miso.distil.codeGenerator.generator.html

import com.google.inject.Inject
import codeGeneratorModel.Artifact
import org.eclipse.emf.common.util.EList
import codeGeneratorModel.ServiceEnum

/**
 * To write HtmlXXXLinks.java.
 * 
 * @author Carlos Carrascal.
 */
class generateHtmlLinks {
	
	@Inject miso.distil.codeGenerator.generator.generateUtils genUti
	@Inject miso.distil.codeGenerator.generator.Names names
	
	/**
	 * To write Html"artifact.name"Links.java.
	 * 
	 * @param artifact the artifact.
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
		 * Auto-generated html links.
		 * 
		 * @author miso.distil.codeGenerator.
		 */
		public class Html«name»Links {

			«IF basicServices.contains(ServiceEnum.READ)»
				/**
				 * Auto-generated link to the service read one json.
				 * 
				 * @param «namelow» «name» to create the link.
				 * @return the link.
				 */
				public static String getReadJsonLink(«name» «namelow») {
					return "<a href=" + Basic«name»Spark.ReadJson + «namelow».getObjectid() + ">View as Json</a>";
				}

				/**
				 * Auto-generated link to the service read one html.
				 * 
				 * @param «namelow» «name» to create the link.
				 * @return the link.
				 */
				public static String getReadHtmlLink(«name» «namelow») {
					return "<a href=" + Html«name»Spark.ReadHTML + «namelow».getObjectid() + ">" + «namelow».getFilename() + "</a>";
				}

			«ENDIF»
			«IF basicServices.contains(ServiceEnum.DOWNLOAD)»
				/**
				 * Auto-generated link to the service download.
				 * 
				 * @param «namelow» «name» to create the link.
				 * @return the link.
				 */
				public static String getDownloadJsonLink(«name» «namelow») {
					return "<a href=" + Basic«name»Spark.DownloadJson + «namelow».getObjectid() + ">Download</a>";
				}

			«ENDIF»
			«IF basicServices.contains(ServiceEnum.DELETE)»
				/**
				 * Auto-generated link to the service delete.
				 * 
				 * @param «namelow» «name» to create the link.
				 * @return the link (form type post link).
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
				 * Auto-generated link to the service update form html.
				 * 
				 * @param «namelow» «name» to create the link.
				 * @return the link.
				 */
				public static String getUpdateHtmlLink(«name» «namelow») {
					return "<a href=" + Html«name»Spark.UpdateFormHTML + «namelow».getObjectid() + ">Update</a>";
				}
		    «ENDIF»
		}
	'''
}