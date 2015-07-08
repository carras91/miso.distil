package miso.carrascal.codeGenerator.generator.custom

import com.google.inject.Inject
import codeGeneratorModel.Artifact
import codeGeneratorModel.Attribute
import org.eclipse.emf.common.util.EList
import codeGeneratorModel.DataEnum
import codeGeneratorModel.MultiAttribute
import codeGeneratorModel.SimpleAttribute
import codeGeneratorModel.ServiceEnum

/*
 * To write XXXJson.java
 * 
 * @author Carlos Carrascal
 */
class generateJson {
	
	@Inject miso.carrascal.codeGenerator.generator.generateUtils genUti
	@Inject miso.carrascal.codeGenerator.generator.packages pack

	/*
	 * To write <artifact.name>Json.java
	 * 
	 * @author Carlos Carrascal
	 */	
	def write(Artifact artifact) '''
		«var EList<ServiceEnum> basicServices = artifact.basicServices»
		«var EList<Attribute> atts = artifact.attributes»
		«val EList<Attribute> allAtts = genUti.getAllNestedAttributes(artifact.attributes)»
		«val namelow = artifact.name.toLowerCase»
		«val name = artifact.name»
		«var pos = -1»
		package «pack.getArtifactChar(artifact)»;

		«IF basicServices.contains(ServiceEnum.UPLOAD_LITERAL)»
			import java.io.IOException;
			import java.util.List;
		«ENDIF»		
		«IF basicServices.contains(ServiceEnum.UPLOAD_LITERAL) || basicServices.contains(ServiceEnum.UPDATE_LITERAL)»
			import java.io.InputStream;
		«ENDIF»
		«IF basicServices.contains(ServiceEnum.UPDATE_LITERAL)»
			import java.util.Map;
		«ENDIF»
		«IF basicServices.contains(ServiceEnum.UPLOAD_LITERAL) || basicServices.contains(ServiceEnum.UPDATE_LITERAL)»

			import spark.Request;
			import spark.Response;
		«ENDIF»

		«IF basicServices.contains(ServiceEnum.UPLOAD_LITERAL)»
			import javax.servlet.MultipartConfigElement;
			import javax.servlet.ServletException;
			import javax.servlet.http.Part;

		«ENDIF»
		«IF basicServices.contains(ServiceEnum.UPLOAD_LITERAL) || basicServices.contains(ServiceEnum.UPDATE_LITERAL)»
			import «pack.MisoAbstract».RecordDB;
			import «pack.MisoUtils».Utils;
		«ENDIF»
		import «pack.MisoBasic».BasicAbstractJson;

		import «pack.getArtifactChar(artifact)».«name»;
		«IF basicServices.contains(ServiceEnum.UPLOAD_LITERAL) || basicServices.contains(ServiceEnum.UPDATE_LITERAL)»
			import «pack.getBasicChar(artifact)».Basic«name»Codes;
			import «pack.getBasicChar(artifact)».Basic«name»Param;
			«genUti.getImportCompose(allAtts)»
		«ENDIF»

		/**
		 * Auto-generated custom json methods
		 * 
		 * @author miso.distil.codeGenerator
		 */
		public class «name»Json extends BasicAbstractJson {

			/**
			 * Auto-generated empty constructor
			 * 
			 * @author miso.distil.codeGenerator
			 */
			public «name»Json() {
				super(«name».class);	
			}

			«IF basicServices.contains(ServiceEnum.UPDATE_LITERAL)»
				/**
				 * Auto-generated method to cusomice the update method
				 * 
				 * @author miso.distil.codeGenerator
				 */
				@Override
				public Object postUpdate(Request req, Response res) {
					// Basic Params
					Map<String, String> map = parseRequest(req, Basic«name»Param.values());
					String id = map.get(Basic«name»Param.IdPost);
					String tags = map.get(Basic«name»Param.Tags);

					// Required params
					«{pos = -1; null}»
					«FOR att:allAtts»
						«{pos++; null}»
						«IF att instanceof SimpleAttribute»
							«IF att.required»
								«genUti.getTypeName(att)» «genUti.getNewAttName(pos, artifact)» = null;
							«ENDIF»
						«ENDIF»
					«ENDFOR»

					try {
						«{pos = -1; null}»
						«FOR att:allAtts»
							«{pos++; null}»
							«val newName = genUti.getNewAttName(pos, artifact)»
							«IF att instanceof SimpleAttribute»
								«IF att.required»
									«IF att.data.equals(DataEnum.STRING_LITERAL) && !att.many»
										«newName» = map.get(Basic«name»Param.«newName.toFirstUpper»);
									«ELSEIF att.data.equals(DataEnum.INTEGER_LITERAL) && !att.many»
										«newName» = Integer.parseInt(map.get(Basic«name»Param.«newName.toFirstUpper»));
									«ELSEIF att.data.equals(DataEnum.DOUBLE_LITERAL) && !att.many»
										«newName» = Double.parseDouble(map.get(Basic«name»Param.«newName.toFirstUpper»));
									«ELSEIF att.data.equals(DataEnum.BOOLEAN_LITERAL) && !att.many»
										«newName» = map.get(Basic«name»Param.«newName.toFirstUpper»).equalsIgnoreCase("true");
									«ELSEIF att.data.equals(DataEnum.STRING_LITERAL)»
										«newName» = Utils.StringToListString(map.get(Basic«name»Param.«newName.toFirstUpper»));
									«ELSEIF att.data.equals(DataEnum.INTEGER_LITERAL)»
										«newName» = Utils.StringToListInteger(map.get(Basic«name»Param.«newName.toFirstUpper»));
									«ELSEIF att.data.equals(DataEnum.DOUBLE_LITERAL)»
										«newName» = Utils.StringToListDouble(map.get(Basic«name»Param.«newName.toFirstUpper»));
									«ELSEIF att.data.equals(DataEnum.BOOLEAN_LITERAL)»
										«newName» = Utils.StringToListBoolean(map.get(Basic«name»Param.«newName.toFirstUpper»));
									«ENDIF»
								«ENDIF»
							«ENDIF»
						«ENDFOR»
					} catch(Exception e) {
						e.printStackTrace();
						return Basic«name»Codes.Param_error;
					}

					// Read old «name» and his InputStream
					«name» old«name» = («name») RecordDB.getDefault().readOne(id, classType);
					InputStream IS = RecordDB.getDefault().getInputStream(id, classType);
					if(old«name» == null || IS == null) {
						return Basic«name»Codes.DB_notfound;
					}

					// Not required params
					«{pos = -1; null}»
					«FOR att:allAtts»
						«{pos++; null}»
						«IF att instanceof SimpleAttribute»
							«IF !att.required»
								«genUti.getTypeName(att)» «genUti.getNewAttName(pos, artifact)» = null;
							«ENDIF»
						«ENDIF»
					«ENDFOR»

					//Composed params
					«{pos = -1; null}»
					«FOR att:allAtts»
						«{pos++; null}»
						«IF att instanceof MultiAttribute»
							«val newName = genUti.getNewAttName(pos, artifact)»
							«val typeName = genUti.getTypeName(att)»
							«typeName» «newName» = new «typeName»(«genUti.getNestedAtt(pos, artifact)»);
						«ENDIF»
					«ENDFOR»
					
					// Create new «name»
					«name» new«name» = new «name»(old«name».getObjectName(), old«name».getFileSize(), Utils.tagsStringToList(tags)«FOR att:atts», «genUti.getNewAttName(att, artifact)»«ENDFOR»);

					// Save new «name» and delete old «name»
					if(RecordDB.getDefault().save(new«name», IS)) {
						if(!RecordDB.getDefault().delete(id, classType)) {
							return Basic«name»Codes.DB_notfound;
						} else {
							return new«name»;
						}
					} else {
						return Basic«name»Codes.DB_notupdated;
					}
				}

			«ENDIF»
			«IF basicServices.contains(ServiceEnum.UPLOAD_LITERAL)»
				/**
				 * Auto-generated method to cusomice the upload method
				 * 
				 * @author miso.distil.codeGenerator
				 */
				@Override
				public Object postUpload(Request req, Response res) {
					// There is a file
					MultipartConfigElement multipartConfigElement = new MultipartConfigElement("/tmp");
					req.raw().setAttribute("org.eclipse.multipartConfig", multipartConfigElement);

					try {
						// File Information
						Part filePart = req.raw().getPart(Basic«name»Param.File);
					    String fileName = getFileName(filePart);
						long fileSize = filePart.getSize();
					    InputStream fileContent = filePart.getInputStream();

						List<String> tags = Utils.tagsStringToList(req.raw().getParameter(Basic«name»Param.Tags));

						// Required params
						«{pos = -1; null}»
						«FOR att:allAtts»
							«{pos++; null}»
							«val newName = genUti.getNewAttName(pos, artifact)»
							«val type = genUti.getTypeName(att)»
							«IF att instanceof SimpleAttribute»
								«IF att.required»
									«IF att.data.equals(DataEnum.BOOLEAN_LITERAL) && !att.many»
										«type» «newName» = req.raw().getParameter(Basic«name»Param.«newName.toFirstUpper»).equalsIgnoreCase("true");
									«ELSEIF att.data.equals(DataEnum.INTEGER_LITERAL) && !att.many»
										«type» «newName» = Integer.parseInt(req.raw().getParameter(Basic«name»Param.«newName.toFirstUpper»));
									«ELSEIF att.data.equals(DataEnum.DOUBLE_LITERAL) && !att.many»
										«type» «newName» = Double.parseDouble(req.raw().getParameter(Basic«name»Param.«newName.toFirstUpper»));
									«ELSEIF att.data.equals(DataEnum.STRING_LITERAL) && !att.many»
										«type» «newName» = req.raw().getParameter(Basic«name»Param.«newName.toFirstUpper»);
									«ELSEIF att.data.equals(DataEnum.INTEGER_LITERAL)»
										«type» «newName» = Utils.StringToListInteger(req.raw().getParameter(Basic«name»Param.«newName.toFirstUpper»));
									«ELSEIF att.data.equals(DataEnum.DOUBLE_LITERAL)»
										«type» «newName» = Utils.StringToListDouble(req.raw().getParameter(Basic«name»Param.«newName.toFirstUpper»));
									«ELSEIF att.data.equals(DataEnum.STRING_LITERAL)»
										«type» «newName» = Utils.StringToListString(req.raw().getParameter(Basic«name»Param.«newName.toFirstUpper»));
									«ELSEIF att.data.equals(DataEnum.BOOLEAN_LITERAL)»
										«type» «newName» = Utils.StringToListBoolean(req.raw().getParameter(Basic«name»Param.«newName.toFirstUpper»));
									«ENDIF»
								«ENDIF»
							«ENDIF»
						«ENDFOR»

						if(fileContent == null || fileName == null) {
							return Basic«name»Codes.Param_emptyfile;
						}
						if(fileName.isEmpty() «IF artifact.extension != null»|| !fileName.endsWith(".«artifact.extension»")«ENDIF») {
							return Basic«name»Codes.Param_emptyfile;
						}

						// Not required params
						«{pos = -1; null}»
						«FOR att:allAtts»
							«{pos++; null}»
							«IF att instanceof SimpleAttribute»
								«IF !att.required»
									«genUti.getTypeName(att)» «genUti.getNewAttName(pos, artifact)» = null;
								«ENDIF»
							«ENDIF»
						«ENDFOR»

						//Composed params
						«{pos = -1; null}»
						«FOR att:allAtts»
							«{pos++; null}»
							«IF att instanceof MultiAttribute»
								«val newName = genUti.getNewAttName(pos, artifact)»
								«val typeName = genUti.getTypeName(att)»
								«typeName» «newName» = new «typeName»(«genUti.getNestedAtt(pos, artifact)»);
							«ENDIF»
						«ENDFOR»

						// Create new «name»
						«name» «namelow» = new «name»(fileName, fileSize, tags«FOR att:atts», «genUti.getNewAttName(att, artifact)»«ENDFOR»);

						if(!RecordDB.getDefault().save(«namelow», fileContent)) {
							return Basic«name»Codes.DB_notuploaded;
						}

						return «namelow»;

					} catch (IOException e) {
						e.printStackTrace();
						return Basic«name»Codes.Param_corruptfile;
					} catch (ServletException e) {
						e.printStackTrace();
						return Basic«name»Codes.Param_corruptfile;
					} catch (Exception e) {
						e.printStackTrace();
						return Basic«name»Codes.Param_error;
					}
				}
			«ENDIF»
		}
	'''
}