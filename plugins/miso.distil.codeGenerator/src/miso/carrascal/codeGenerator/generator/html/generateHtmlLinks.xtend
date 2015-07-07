package miso.carrascal.codeGenerator.generator.html

import com.google.inject.Inject
import codeGeneratorModel.Artifact
import org.eclipse.emf.common.util.EList
//import codeGeneratorModel.Reference
//import java.util.List
import codeGeneratorModel.ServiceEnum

class generateHtmlLinks {
	
	@Inject miso.carrascal.codeGenerator.generator.packages pack
		
	def write(Artifact artifact) '''
		«var EList<ServiceEnum> basicServices = artifact.basicServices»
«««		«val EList<Reference> refs = artifact.references»
		«val name = artifact.name»
		«val namelow = artifact.name.toLowerCase»
«««		«var List<String> nameList = newArrayList()»
		package «pack.getHtmlChar(artifact)»;
		
«««		«IF basicServices.contains(ServiceEnum.READ_LITERAL)»
«««			«FOR ref:refs»
«««				«IF !nameList.contains(ref.type.name) && ref.type.basicServices.contains(ServiceEnum.SEARCH_LITERAL)»
«««					«{nameList.add(ref.type.name); null}»
«««					import «pack.getArtifactChar(ref.type)».«ref.type.name»;
«««					import «pack.getHtmlChar(ref.type)».Html«ref.type.name»Links;
«««				«ENDIF»
«««			«ENDFOR»
«««		«ENDIF»
		
		«IF basicServices.contains(ServiceEnum.UPLOAD_LITERAL)»
			import «pack.getBasicChar(artifact)».Basic«name»Param;
		«ENDIF»
		«IF basicServices.contains(ServiceEnum.READ_LITERAL) || basicServices.contains(ServiceEnum.DOWNLOAD_LITERAL) || basicServices.contains(ServiceEnum.UPLOAD_LITERAL)»
			import «pack.getBasicChar(artifact)».Basic«name»Spark;
		«ENDIF»
		import «pack.getArtifactChar(artifact)».«name»;
«««		«IF basicServices.contains(ServiceEnum.READ_LITERAL)»
«««			«var done = false»
«««			«FOR ref:refs»
«««				«IF !done && ref.type.basicServices.contains(ServiceEnum.SEARCH_LITERAL)»
«««					«{done = true; null}»
«««					import «pack.getBasicChar(artifact)».Basic«name»Codes;
«««
«««					import «pack.MisoAbstract».RecordDB;
«««				«ENDIF»
«««			«ENDFOR»
«««		«ENDIF»
		
		public class Html«name»Links {

			«IF basicServices.contains(ServiceEnum.READ_LITERAL)»
				public static String getReadJsonLink(«name» «namelow») {
					return "<a href=" + Basic«name»Spark.ReadJson + «namelow».getObjectId() + ">View as Json</a>";
				}

				public static String getReadHtmlLink(«name» «namelow») {
					return "<a href=" + Html«name»Spark.ReadHTML + «namelow».getObjectId() + ">" + «namelow».getObjectName() + "</a>";
				}
«««				«FOR ref:refs»
«««					«IF ref.type.basicServices.contains(ServiceEnum.SEARCH_LITERAL)»
«««
«««						public static String get«ref.name.toFirstUpper»NameLink(«name» «namelow») {
«««							String link = "";
«««							«IF !ref.many»
«««								«ref.type.name» new«ref.type.name.toString.toLowerCase» = («ref.type.name») RecordDB.getDefault().readOne(«namelow».get«ref.name.toFirstUpper»(), «ref.type.name».class);
«««								if(new«ref.type.name.toString.toLowerCase» != null) {
«««									return link + Html«ref.type.name»Links.getReadHtmlLink(new«ref.type.name.toString.toLowerCase»);
«««								} else {
«««									return link + Basic«name»Codes.DB_«ref.name»notfound;
«««								}
«««							«ELSE»
«««								«ref.type.name» new«ref.type.name.toString.toLowerCase» = null;
«««								for(String ref : «namelow».get«ref.name.toFirstUpper»()) {
«««									 new«ref.type.name.toString.toLowerCase» = («ref.type.name») RecordDB.getDefault().readOne(ref, «ref.type.name».class);
«««									if(new«ref.type.name.toString.toLowerCase» != null) {
«««										link = link + Html«ref.type.name»Links.getReadHtmlLink(new«ref.type.name.toString.toLowerCase»);
«««										if(«namelow».get«ref.name.toFirstUpper»().lastIndexOf(ref) < «namelow».get«ref.name.toFirstUpper»().size()-1) {
«««											link = link + " | ";
«««										}
«««									} else {
«««										return link + Basic«name»Codes.DB_«ref.name»notfound;
«««									}
«««								}
«««								return link;
«««							«ENDIF»
«««						}
«««					«ENDIF»
«««				«ENDFOR»

			«ENDIF»
			«IF basicServices.contains(ServiceEnum.DOWNLOAD_LITERAL)»
				public static String getDownloadZipJsonLink(«name» «namelow») {
					return "<a href=" + Basic«name»Spark.DownloadZipJson + «namelow».getObjectId() + ">Download zip</a>";
				}

				public static String getDownloadFileJsonLink(«name» «namelow») {
					return "<a href=" + Basic«name»Spark.DownloadFileJson + «namelow».getObjectId() + ">Download «namelow»</a>";
				}

			«ENDIF»
			«IF basicServices.contains(ServiceEnum.UPLOAD_LITERAL)»
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
				public static String getUpdateHtmlLink(«name» «namelow») {
					return "<a href=" + Html«name»Spark.UpdateFormHTML + «namelow».getObjectId() + ">Update</a>";
				}
		    «ENDIF»
		}
	'''
}