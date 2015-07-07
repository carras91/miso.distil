package miso.carrascal.cloudModelServices.modelServices.basic;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletException;
import javax.servlet.http.Part;

import miso.carrascal.cloudModelServices.abstractServices.RecordDB;
import miso.carrascal.cloudModelServices.abstractServices.basic.BasicAbstractJson;
import miso.carrascal.cloudModelServices.abstractServices.filter.EType;
import miso.carrascal.cloudModelServices.ecoreServices.Ecore;
import miso.carrascal.cloudModelServices.ecoreServices.PackageRecord;
import miso.carrascal.cloudModelServices.ecoreServices.basic.BasicEcoreParam;
import miso.carrascal.cloudModelServices.modelServices.Model;
import miso.carrascal.cloudModelServices.modelServices.ModelFactory;
import miso.carrascal.cloudModelServices.modelServices.filter.FilterEType;
import miso.carrascal.cloudModelServices.modelServices.filter.FilterETypeCompound;
import miso.carrascal.cloudModelServices.modelServices.filter.FilterModelInfo;
import miso.carrascal.cloudModelServices.utils.Utils;

import org.eclipse.emf.ecore.resource.Resource;

import spark.Request;
import spark.Response;

public class BasicModelJson extends BasicAbstractJson {

	public BasicModelJson() {
		super(Model.class);
	}
	
	@Override
	public Object postUpdate(Request req, Response res) {
		HashMap<String, String> map = parseRequest(req, BasicModelParam.values());
		String id = map.get(BasicModelParam.IdPost);
	    String summary = map.get(BasicModelParam.Summary);
	    String tags = map.get(BasicModelParam.Tags);
		String author = map.get(BasicModelParam.Author);

	    Model oldModel = (Model) RecordDB.getDefault().readOne(id, classType);
	    InputStream IS = RecordDB.getDefault().getInputStream(id, classType);
	    if(oldModel == null || IS == null) {
	    	return BasicModelCodes.DB_notfound;
	    }
	    Model newModel = new Model(oldModel.getObjectIdEcore(), oldModel.getObjectName(), oldModel.getFileSize(), summary, Utils.tagsStringToList(tags), author, oldModel.getFilterInfo(), oldModel.getFilters());
		
	    if(RecordDB.getDefault().save(newModel, IS)) {
	    	if(!RecordDB.getDefault().delete(id, classType)) {
				return BasicModelCodes.DB_notfound;
			} else {
				return newModel;
			}
		} else {
			return BasicModelCodes.DB_notupdated;
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
		    InputStream xmiFileContent = filePart.getInputStream();
		    
			String ecore_id = req.raw().getParameter(BasicModelParam.EcoreId);
		    String author = req.raw().getParameter(BasicModelParam.Author);
			String summary = req.raw().getParameter(BasicModelParam.Summary);
			List<String> tags = Utils.tagsStringToList(req.raw().getParameter(BasicModelParam.Tags));
			boolean eclass = req.raw().getParameter(BasicModelParam.EClass).equalsIgnoreCase("true");
		    boolean esupertype = req.raw().getParameter(BasicModelParam.ESuperType).equalsIgnoreCase("true");
		    boolean eattribute = req.raw().getParameter(BasicModelParam.EReference).equalsIgnoreCase("true");
		    boolean ereference = req.raw().getParameter(BasicModelParam.EAttribute).equalsIgnoreCase("true");		

		    if(fileContent == null || fileName == null) {
				return BasicModelCodes.Param_emptyfile;
			}
			if(fileName.isEmpty()) {
				return BasicModelCodes.Param_emptyfile;
			}

			if(!PackageRecord.isEcoreRegistered(ecore_id)) {
				try {
					if(!PackageRecord.registerPackages(ecore_id, RecordDB.getDefault().getInputStream(ecore_id, Ecore.class), RecordDB.getDefault().readOne(ecore_id, Ecore.class).getObjectName())) {
						return BasicModelCodes.Regis_fail;
					}
				} catch (Exception e) {
					e.printStackTrace();
					return BasicModelCodes.DB_ecorenotfound;
				}
			}
			PackageRecord.registerExtensionEcore(fileName.substring(fileName.lastIndexOf('.')+1));
			
			Resource modelResource = ModelFactory.getModel(xmiFileContent, fileName, ecore_id);
			if(modelResource == null) {
				return BasicModelCodes.Pack_fail;
			}
			
			HashMap<EType, Boolean> activeFilters = new HashMap<EType, Boolean>();
			activeFilters.put(EType.EClass, eclass);
			activeFilters.put(EType.ESuperType, esupertype);
			activeFilters.put(EType.EAttribute, eattribute);
			activeFilters.put(EType.EReference, ereference);
			
			FilterETypeCompound filters = new FilterETypeCompound();
			for(EType eType : activeFilters.keySet()) {
				if(activeFilters.get(eType)) {
					filters.add(new FilterEType(eType));
				}
			}
			
			FilterModelInfo info = filters.execute(modelResource);
			tags.addAll(info.getClassName());
			
			Model model = new Model(ecore_id, fileName, fileSize, summary, tags, author, info, activeFilters);
			
			if(!RecordDB.getDefault().save(model, fileContent)) {
				info.getModelInfo().clear();
				info.getModelInfo().put(BasicModelCodes.Java_spacetoosmall, null);
				model.setFilterInfo(info);
				if(!RecordDB.getDefault().save(model, fileContent)) {
					return BasicModelCodes.DB_notuploaded;
				}
			}
			
			return model;
		    
		} catch (IOException e) {
			e.printStackTrace();
			return BasicModelCodes.Param_corruptfile;
		} catch (ServletException e) {
			e.printStackTrace();
			return BasicModelCodes.Param_corruptfile;
		}
	}
}
