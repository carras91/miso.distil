package miso.distil.documentServices;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;

import spark.Request;
import spark.Response;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletException;
import javax.servlet.http.Part;

import miso.carrascal.cloudModelServices.abstractServices.RecordDB;
import miso.carrascal.cloudModelServices.utils.Utils;
import miso.carrascal.cloudModelServices.abstractServices.basic.BasicAbstractJson;
import miso.distil.documentServices.Document;
import miso.distil.documentServices.basic.BasicDocumentCodes;
import miso.distil.documentServices.basic.BasicDocumentParam;
import miso.distil.entities.PersonalData;

/**
 * Auto-generated custom json methods
 * 
 * @author miso.distil.codeGenerator
 */
public class DocumentJson extends BasicAbstractJson<Document> {

	/**
	 * Auto-generated empty constructor
	 * 
	 * @author miso.distil.codeGenerator
	 */
	 public DocumentJson() {
	 	super(Document.class);	
	 }

	/**
	 * Auto-generated method to cusomice the update method
	 * 
	 * @author miso.distil.codeGenerator
	 */
	@Override
	public Object postUpdate(Request req, Response res) {
		// Basic Params
		Map<String, String> map = parseRequest(req, BasicDocumentParam.values());
		String id = map.get(BasicDocumentParam.IdPost);

		// Required params
		String author_docinfo = null;
		String source_docinfo = null;
		List<String> tags_docinfo = null;
		Boolean isfinished = null;

		try {
			author_docinfo = map.get(BasicDocumentParam.Author_docinfo);
			source_docinfo = map.get(BasicDocumentParam.Source_docinfo);
			tags_docinfo = Utils.stringToListString(map.get(BasicDocumentParam.Tags_docinfo));
			isfinished = map.get(BasicDocumentParam.Isfinished).equalsIgnoreCase("true");
		} catch(Exception e) {
			e.printStackTrace();
			return BasicDocumentCodes.Param_error;
		}

		// Read old Document and his InputStream
		Document oldDocument = (Document) RecordDB.getDefault().readOne(id, classType);
		InputStream IS = RecordDB.getDefault().getInputStream(id, classType);
		if(oldDocument == null || IS == null) {
			return BasicDocumentCodes.DB_notfound;
		}

		// Not required params and artifact's id
		// Complete these params!
		String fileextension_docinfo = oldDocument.getDocinfo().getFileextension();
		List<String> coauthors = oldDocument.getCoauthors();

		//Composed params
		PersonalData docinfo = new PersonalData(author_docinfo, source_docinfo, tags_docinfo, fileextension_docinfo);
		
		// Create new Document
		Document newDocument = new Document(oldDocument.getFilename(), oldDocument.getFilesize(), docinfo, coauthors, isfinished);

		// Save new Document and delete old Document
		if(RecordDB.getDefault().save(newDocument, IS)) {
			if(!RecordDB.getDefault().delete(id, classType)) {
				return BasicDocumentCodes.DB_notfound;
			} else {
				return newDocument;
			}
		} else {
			return BasicDocumentCodes.DB_notupdated;
		}
	}

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
			Part filePart = req.raw().getPart(BasicDocumentParam.File);
		    String fileName = getFileName(filePart);
			long fileSize = filePart.getSize();
		    InputStream fileContent = filePart.getInputStream();

			// Required params
			String author_docinfo = req.raw().getParameter(BasicDocumentParam.Author_docinfo);
			String source_docinfo = req.raw().getParameter(BasicDocumentParam.Source_docinfo);
			List<String> tags_docinfo = Utils.stringToListString(req.raw().getParameter(BasicDocumentParam.Tags_docinfo));
			Boolean isfinished = req.raw().getParameter(BasicDocumentParam.Isfinished).equalsIgnoreCase("true");

			if(fileContent == null || fileName == null) {
				return BasicDocumentCodes.Param_emptyfile;
			}
			if(fileName.isEmpty() ) {
				return BasicDocumentCodes.Param_emptyfile;
			}

			// Not required params and artifact's id
			// Complete these params!
			int indexof = fileName.lastIndexOf('.');
			String fileextension_docinfo = "unknown";
			if(indexof >= 0 && indexof < fileName.length()) {
				fileextension_docinfo = fileName.substring(indexof);
			}
			List<String> coauthors = new ArrayList<String>();
			coauthors.add(author_docinfo + "'s friends");
			coauthors.add(author_docinfo + "'s family");

			//Composed params
			PersonalData docinfo = new PersonalData(author_docinfo, source_docinfo, tags_docinfo, fileextension_docinfo);

			// Create new Document
			Document document = new Document(fileName, fileSize, docinfo, coauthors, isfinished);

			if(!RecordDB.getDefault().save(document, fileContent)) {
				return BasicDocumentCodes.DB_notuploaded;
			}
			res.body(document.getObjectid());
			return document;

		} catch (IOException e) {
			e.printStackTrace();
			return BasicDocumentCodes.Param_corruptfile;
		} catch (ServletException e) {
			e.printStackTrace();
			return BasicDocumentCodes.Param_corruptfile;
		} catch (Exception e) {
			e.printStackTrace();
			return BasicDocumentCodes.Param_error;
		}
	}
}
