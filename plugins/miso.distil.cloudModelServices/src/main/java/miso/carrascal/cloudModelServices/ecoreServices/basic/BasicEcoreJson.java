package miso.carrascal.cloudModelServices.ecoreServices.basic;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletException;
import javax.servlet.http.Part;

import miso.carrascal.cloudModelServices.abstractServices.AbstractPersistentClass;
import miso.carrascal.cloudModelServices.abstractServices.RecordDB;
import miso.carrascal.cloudModelServices.abstractServices.basic.BasicAbstractJson;
import miso.carrascal.cloudModelServices.abstractServices.filter.EType;
import miso.carrascal.cloudModelServices.ecoreServices.Ecore;
import miso.carrascal.cloudModelServices.ecoreServices.PackageRecord;
import miso.carrascal.cloudModelServices.ecoreServices.filter.FilterEType;
import miso.carrascal.cloudModelServices.ecoreServices.filter.FilterETypeCompound;
import miso.carrascal.cloudModelServices.ecoreServices.filter.FilterEcoreInfo;
import miso.carrascal.cloudModelServices.utils.Utils;


//import org.apache.commons.fileupload.FileItem;
//import org.apache.commons.fileupload.FileUploadException;
//import org.apache.commons.fileupload.disk.DiskFileItemFactory;
//import org.apache.commons.fileupload.servlet.ServletFileUpload;
//import org.apache.commons.io.FilenameUtils;
import org.eclipse.emf.ecore.EPackage;

import spark.Request;
import spark.Response;

public class BasicEcoreJson extends BasicAbstractJson {
	
	public BasicEcoreJson() {
		super(Ecore.class);
	}
	
	@Override
	public ArrayList<Ecore> getSearch(Request req, Response res) {	
		HashMap<String, String> map = parseRequest(req, BasicEcoreParam.values());
	    Boolean active = map.get(BasicEcoreParam.Active).equalsIgnoreCase("true");
		
		ArrayList<Ecore> ecores = new ArrayList<Ecore>();
		for(AbstractPersistentClass object : super.getSearch(req, res))
			ecores.add((Ecore)object);
		
		if(active) {
			ArrayList<Ecore> copyEcores = new ArrayList<Ecore>(ecores);
			for(Ecore ecore : copyEcores) {
				if(!ecore.getActive()) {
					ecores.remove(ecore);
				}
			}
		}
		
        return ecores;
	}

	@Override
	public Object postUpdate(Request req, Response res) {
		HashMap<String, String> map = parseRequest(req, BasicEcoreParam.values());
		String id = map.get(BasicEcoreParam.IdPost);
	    String summary = map.get(BasicEcoreParam.Summary);
	    String tags = map.get(BasicEcoreParam.Tags);
		String author = map.get(BasicEcoreParam.Author);
		Boolean active = map.get(BasicEcoreParam.Active).equalsIgnoreCase("true"); 
	    Boolean eclass = map.get(BasicEcoreParam.EClass).equalsIgnoreCase("true");
	    Boolean eabstract= map.get(BasicEcoreParam.EAbstract).equalsIgnoreCase("true"); 
	    Boolean einterface = map.get(BasicEcoreParam.EInterface).equalsIgnoreCase("true"); 
	    Boolean eattribute = map.get(BasicEcoreParam.EAttribute).equalsIgnoreCase("true"); 
	    Boolean ereference = map.get(BasicEcoreParam.EReference).equalsIgnoreCase("true");

	    Ecore oldEcore = (Ecore) RecordDB.getDefault().readOne(id, classType);
	    InputStream IS = RecordDB.getDefault().getInputStream(id, classType);
	    InputStream IScopy = RecordDB.getDefault().getInputStream(id, classType);
	    if(oldEcore == null || IS == null) {
	    	return BasicEcoreCodes.DB_notfound;
	    }

		HashMap<EType, Boolean> activeFilters = new HashMap<EType, Boolean>();
		activeFilters.put(EType.EClass, eclass);
		activeFilters.put(EType.EAbstract, eabstract);
		activeFilters.put(EType.EInterface, einterface);
		activeFilters.put(EType.EAttribute, eattribute);
		activeFilters.put(EType.EReference, ereference);
		
		FilterETypeCompound filters = new FilterETypeCompound();
		for(EType eType : activeFilters.keySet()) {
			if(activeFilters.get(eType)) {
				filters.add(new FilterEType(eType));
			}
		}
	    
	    List<EPackage> ePackages = PackageRecord.getPackages(IScopy, oldEcore.getObjectName());
		List<FilterEcoreInfo> infos = new ArrayList<FilterEcoreInfo>();
		for(EPackage ePackage : ePackages) {
			infos.add(filters.execute(ePackage));
		}
		
	    Ecore newEcore = new Ecore(oldEcore.getObjectName(), oldEcore.getFileSize(), Utils.tagsStringToList(tags), summary, author, active, infos, activeFilters);
		
	    if(RecordDB.getDefault().save(newEcore, IS)) {
	    	if(!RecordDB.getDefault().delete(id, classType)) {
				return BasicEcoreCodes.DB_notfound;
			} else {
				return newEcore;
			}
		} else {
			return BasicEcoreCodes.DB_notupdated;
		}	    
	}

	@Override
	public Object postUpload(Request req, Response res) {
		
		MultipartConfigElement multipartConfigElement = new MultipartConfigElement("/tmp");
		req.raw().setAttribute("org.eclipse.multipartConfig", multipartConfigElement);

		try {
			Part filePart = req.raw().getPart(BasicEcoreParam.File);
		    String fileName = getFileName(filePart);
			long fileSize = filePart.getSize();
		    InputStream fileContent = filePart.getInputStream();
		    InputStream ecoreFileContent = filePart.getInputStream();

		    String author = req.raw().getParameter(BasicEcoreParam.Author);
			String summary = req.raw().getParameter(BasicEcoreParam.Summary);
			List<String> tags = Utils.tagsStringToList(req.raw().getParameter(BasicEcoreParam.Tags));
			Boolean active = req.raw().getParameter(BasicEcoreParam.Active).equalsIgnoreCase("true");
			boolean eclass = req.raw().getParameter(BasicEcoreParam.EClass).equalsIgnoreCase("true");
		    boolean eabstract = req.raw().getParameter(BasicEcoreParam.EInterface).equalsIgnoreCase("true");
		    boolean einterface = req.raw().getParameter(BasicEcoreParam.EAbstract).equalsIgnoreCase("true");
		    boolean eattribute = req.raw().getParameter(BasicEcoreParam.EReference).equalsIgnoreCase("true");
		    boolean ereference = req.raw().getParameter(BasicEcoreParam.EAttribute).equalsIgnoreCase("true");		
			
			if(fileContent == null || fileName == null) {
				return BasicEcoreCodes.Param_emptyfile;
			}
			if(fileName.isEmpty() || !fileName.endsWith(".ecore")) {
				return BasicEcoreCodes.Param_emptyfile;
			}
			
			HashMap<EType, Boolean> activeFilters = new HashMap<EType, Boolean>();
			activeFilters.put(EType.EClass, eclass);
			activeFilters.put(EType.EAbstract, eabstract);
			activeFilters.put(EType.EInterface, einterface);
			activeFilters.put(EType.EAttribute, eattribute);
			activeFilters.put(EType.EReference, ereference);
			
			FilterETypeCompound filters = new FilterETypeCompound();
			for(EType eType : activeFilters.keySet()) {
				if(activeFilters.get(eType)) {
					filters.add(new FilterEType(eType));
				}
			}
			
			List<EPackage> ePackages = PackageRecord.getPackages(ecoreFileContent, fileName);
			List<FilterEcoreInfo> infos = new ArrayList<FilterEcoreInfo>();
			for(EPackage ePackage : ePackages) {
				FilterEcoreInfo einfo = filters.execute(ePackage);
				infos.add(einfo);
				tags.addAll(einfo.getClassName());
			}

			Ecore ecore = new Ecore(fileName, fileSize, tags, summary, author, active, infos, activeFilters);
				
			if(!RecordDB.getDefault().save(ecore, fileContent)) {
				infos.clear();
				FilterEcoreInfo filter = new FilterEcoreInfo();
				filter.getEcoreInfo().put(BasicEcoreCodes.Java_spacetoosmall, null);
				infos.add(filter);
				ecore.setFilterInfo(infos);
				if(!RecordDB.getDefault().save(ecore, fileContent)) {
					return BasicEcoreCodes.DB_notuploaded;
				}
			}
			
			if(!PackageRecord.registerPackages(ecore.getObjectId(), ePackages))
				return BasicEcoreCodes.Regis_fail;
			
			return ecore;
		    
		} catch (IOException e) {
			e.printStackTrace();
			return BasicEcoreCodes.Param_corruptfile;
		} catch (ServletException e) {
			e.printStackTrace();
			return BasicEcoreCodes.Param_corruptfile;
		}
	}
}
