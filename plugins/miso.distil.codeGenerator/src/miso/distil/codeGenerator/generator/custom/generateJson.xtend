package miso.distil.codeGenerator.generator.custom

import com.google.inject.Inject
import codeGeneratorModel.Artifact
import codeGeneratorModel.Attribute
import org.eclipse.emf.common.util.EList
import codeGeneratorModel.DataEnum
import codeGeneratorModel.Reference
import codeGeneratorModel.Primitive
import codeGeneratorModel.ServiceEnum
import codeGeneratorModel.ArtifactID

/**
 * To write XXXJson.java.
 * 
 * @author Carlos Carrascal.
 */
class generateJson {
	
	@Inject miso.distil.codeGenerator.generator.generateUtils genUti
	@Inject miso.distil.codeGenerator.generator.Names names

	/**
	 * To write "artifact.name"Json.java.
	 * 
	 * @param artifact the artifact.
	 */	
	def write(Artifact artifact) '''
		«var EList<ServiceEnum> basicServices = genUti.processBasicServices(artifact.basicServices)»
		«var EList<Attribute> atts = artifact.attributes»
		«val EList<Attribute> allAtts = genUti.getAllNestedAttributes(artifact.attributes)»
		«val namelow = artifact.name.toLowerCase»
		«val name = artifact.name»
		«var pos = -1»
		package «names.getArtifactChar(artifact)»;

		«IF basicServices.contains(ServiceEnum.UPLOAD)»
			import java.io.IOException;
		«ENDIF»		
		«IF basicServices.contains(ServiceEnum.UPLOAD) || basicServices.contains(ServiceEnum.UPDATE)»
			import java.io.InputStream;
		«ENDIF»
		«IF basicServices.contains(ServiceEnum.UPDATE)»
			import java.util.Map;
		«ENDIF»
		«IF basicServices.contains(ServiceEnum.UPLOAD) || basicServices.contains(ServiceEnum.UPDATE)»
			«var list = false»
			«FOR att:allAtts»
				«IF att instanceof Primitive && att.many && !list»
					«{list = true; null}»
					import java.util.List;
				«ENDIF»
				«IF att instanceof ArtifactID && att.many && !list»
					«{list = true; null}»
					import java.util.List;
				«ENDIF»
			«ENDFOR»
			
			import spark.Request;
			import spark.Response;
		«ENDIF»

		«IF basicServices.contains(ServiceEnum.UPLOAD)»
			import javax.servlet.MultipartConfigElement;
			import javax.servlet.ServletException;
			import javax.servlet.http.Part;

		«ENDIF»
		«IF basicServices.contains(ServiceEnum.UPLOAD) || basicServices.contains(ServiceEnum.UPDATE)»
			import «names.MisoAbstract».RecordDB;
			«var util = false»
			«FOR att:allAtts»
				«IF att instanceof Primitive»
					«IF att.required && att.many && !util»
						«{util = true; null}»
						import «names.MisoUtils».Utils;
					«ENDIF»
				«ENDIF»
			«ENDFOR»
		«ENDIF»	
		import «names.MisoBasic».BasicAbstractJson;

		import «names.getArtifactFileChar(artifact)»;
		«IF basicServices.contains(ServiceEnum.UPLOAD) || basicServices.contains(ServiceEnum.UPDATE)»
			import «names.getBParamFileChar(artifact)»;
			«genUti.getImportCompose(allAtts)»
		«ENDIF»

		/**
		 * Auto-generated custom json methods.
		 * 
		 * @author miso.distil.codeGenerator.
		 */
		public class «name»Json extends BasicAbstractJson<«name»> {

			 /**
			 * Auto-generated empty constructor.
			 */
			 public «name»Json() {
			 	super(«name».class);	
			 }

			«IF basicServices.contains(ServiceEnum.UPDATE)»
				/**
				 * Auto-generated method to cusomice the update method.
				 * 
				 * @param req Spark request.
				 * @param res Spark response.
				 * @return «name» updated or null if error.
				 */
				@Override
				public «name» postUpdate(Request req, Response res) {
					// Basic Params
					Map<String, String> map = parseRequest(req, Basic«name»Param.values());
					String id = map.get(Basic«name»Param.IdPost);

					// Required params
					«{pos = -1; null}»
					«FOR att:allAtts»
						«{pos++; null}»
						«IF att instanceof Primitive»
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
							«IF att instanceof Primitive»
								«IF att.required»
									«IF att.type.equals(DataEnum.STRING) && !att.many»
										«newName» = map.get(Basic«name»Param.«newName.toFirstUpper»);
									«ELSEIF att.type.equals(DataEnum.INTEGER) && !att.many»
										«newName» = Integer.parseInt(map.get(Basic«name»Param.«newName.toFirstUpper»));
									«ELSEIF att.type.equals(DataEnum.DOUBLE) && !att.many»
										«newName» = Double.parseDouble(map.get(Basic«name»Param.«newName.toFirstUpper»));
									«ELSEIF att.type.equals(DataEnum.BOOLEAN) && !att.many»
										«newName» = map.get(Basic«name»Param.«newName.toFirstUpper»).equalsIgnoreCase("true");
									«ELSEIF att.type.equals(DataEnum.STRING)»
										«newName» = Utils.stringToListString(map.get(Basic«name»Param.«newName.toFirstUpper»));
									«ELSEIF att.type.equals(DataEnum.INTEGER)»
										«newName» = Utils.stringToListInteger(map.get(Basic«name»Param.«newName.toFirstUpper»));
									«ELSEIF att.type.equals(DataEnum.DOUBLE)»
										«newName» = Utils.stringToListDouble(map.get(Basic«name»Param.«newName.toFirstUpper»));
									«ELSEIF att.type.equals(DataEnum.BOOLEAN)»
										«newName» = Utils.stringToListBoolean(map.get(Basic«name»Param.«newName.toFirstUpper»));
									«ENDIF»
								«ENDIF»
							«ENDIF»
						«ENDFOR»
					} catch(Exception e) {
						e.printStackTrace();
						return null;
					}

					// Read old «name» and his InputStream
					«name» old«name» = RecordDB.getDefault().readOne(id, classType);
					InputStream IS = RecordDB.getDefault().getInputStream(id, classType);
					if(old«name» == null || IS == null) {
						return null;
					}

					// Not required params and artifact's id
					// TODO : complete these params!
					«{pos = -1; null}»
					«FOR att:allAtts»
						«{pos++; null}»
						«IF att instanceof Primitive»
							«IF !att.required»
								«genUti.getTypeName(att)» «genUti.getNewAttName(pos, artifact)» = null;
							«ENDIF»
						«ENDIF»
						«IF att instanceof ArtifactID»
							«genUti.getTypeName(att)» «genUti.getNewAttName(pos, artifact)» = null;
						«ENDIF»
					«ENDFOR»

					//Composed params
					«{pos = -1; null}»
					«FOR att:allAtts»
						«{pos++; null}»
						«IF att instanceof Reference»
							«val newName = genUti.getNewAttName(pos, artifact)»
							«val typeName = genUti.getTypeName(att)»
							«typeName» «newName» = new «typeName»(«genUti.getNestedAtt(pos, artifact)»);
						«ENDIF»
					«ENDFOR»
					
					// Create new «name»
					«name» new«name» = new «name»(old«name».getFilename(), old«name».getFilesize()«FOR att:atts», «genUti.getNewAttName(att, artifact)»«ENDFOR»);

					// Save new «name» and delete old «name»
					if(RecordDB.getDefault().save(new«name», IS)) {
						if(!RecordDB.getDefault().delete(id, classType)) {
							return null;
						} else {
							return new«name»;
						}
					} else {
						return null;
					}
				}

			«ENDIF»
			«IF basicServices.contains(ServiceEnum.UPLOAD)»
				/**
				 * Auto-generated method to cusomice the upload method
				 * 
				 * @param req Spark request.
				 * @param res Spark response.
				 * @return «name» uploaded or null if error.
				 */
				@Override
				public «name» postUpload(Request req, Response res) {
					// There is a file
					MultipartConfigElement multipartConfigElement = new MultipartConfigElement("/tmp");
					req.raw().setAttribute("org.eclipse.multipartConfig", multipartConfigElement);

					try {
						// File Information
						Part filePart = req.raw().getPart(Basic«name»Param.File);
					    String fileName = getFileName(filePart);
						long fileSize = filePart.getSize();
					    InputStream fileContent = filePart.getInputStream();

						// Required params
						«{pos = -1; null}»
						«FOR att:allAtts»
							«{pos++; null}»
							«val newName = genUti.getNewAttName(pos, artifact)»
							«val type = genUti.getTypeName(att)»
							«IF att instanceof Primitive»
								«IF att.required»
									«IF att.type.equals(DataEnum.BOOLEAN) && !att.many»
										«type» «newName» = req.raw().getParameter(Basic«name»Param.«newName.toFirstUpper»).equalsIgnoreCase("true");
									«ELSEIF att.type.equals(DataEnum.INTEGER) && !att.many»
										«type» «newName» = Integer.parseInt(req.raw().getParameter(Basic«name»Param.«newName.toFirstUpper»));
									«ELSEIF att.type.equals(DataEnum.DOUBLE) && !att.many»
										«type» «newName» = Double.parseDouble(req.raw().getParameter(Basic«name»Param.«newName.toFirstUpper»));
									«ELSEIF att.type.equals(DataEnum.STRING) && !att.many»
										«type» «newName» = req.raw().getParameter(Basic«name»Param.«newName.toFirstUpper»);
									«ELSEIF att.type.equals(DataEnum.INTEGER)»
										«type» «newName» = Utils.stringToListInteger(req.raw().getParameter(Basic«name»Param.«newName.toFirstUpper»));
									«ELSEIF att.type.equals(DataEnum.DOUBLE)»
										«type» «newName» = Utils.stringToListDouble(req.raw().getParameter(Basic«name»Param.«newName.toFirstUpper»));
									«ELSEIF att.type.equals(DataEnum.STRING)»
										«type» «newName» = Utils.stringToListString(req.raw().getParameter(Basic«name»Param.«newName.toFirstUpper»));
									«ELSEIF att.type.equals(DataEnum.BOOLEAN)»
										«type» «newName» = Utils.stringToListBoolean(req.raw().getParameter(Basic«name»Param.«newName.toFirstUpper»));
									«ENDIF»
								«ENDIF»
							«ENDIF»
						«ENDFOR»

						if(fileContent == null || fileName == null) {
							return null;
						}
						if(fileName.isEmpty() «IF artifact.extension != null»|| !fileName.endsWith(".«artifact.extension»")«ENDIF») {
							return null;
						}

						// Not required params and artifact's id
						// TODO : complete these params!
						«{pos = -1; null}»
						«FOR att:allAtts»
							«{pos++; null}»
							«IF att instanceof Primitive»
								«IF !att.required»
									«genUti.getTypeName(att)» «genUti.getNewAttName(pos, artifact)» = null;
								«ENDIF»
							«ENDIF»
							«IF att instanceof ArtifactID»
								«genUti.getTypeName(att)» «genUti.getNewAttName(pos, artifact)» = null;
							«ENDIF»
						«ENDFOR»

						//Composed params
						«{pos = -1; null}»
						«FOR att:allAtts»
							«{pos++; null}»
							«IF att instanceof Reference»
								«val newName = genUti.getNewAttName(pos, artifact)»
								«val typeName = genUti.getTypeName(att)»
								«typeName» «newName» = new «typeName»(«genUti.getNestedAtt(pos, artifact)»);
							«ENDIF»
						«ENDFOR»

						// Create new «name»
						«name» «namelow» = new «name»(fileName, fileSize«FOR att:atts», «genUti.getNewAttName(att, artifact)»«ENDFOR»);

						if(!RecordDB.getDefault().save(«namelow», fileContent)) {
							return null;
						}

						return «namelow»;

					} catch (IOException e) {
						e.printStackTrace();
						return null;
					} catch (ServletException e) {
						e.printStackTrace();
						return null;
					} catch (Exception e) {
						e.printStackTrace();
						return null;
					}
				}
			«ENDIF»
		}
	'''
}