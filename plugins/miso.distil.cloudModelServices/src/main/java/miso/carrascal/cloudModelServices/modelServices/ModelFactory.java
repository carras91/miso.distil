package miso.carrascal.cloudModelServices.modelServices;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;

import miso.carrascal.cloudModelServices.ecoreServices.PackageRecord;
import miso.carrascal.cloudModelServices.utils.NullArgumentException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

public class ModelFactory {

	public static Resource createEmptyModel(String ecoreId, URI uri) {
		if(ecoreId == null || uri == null) {
			(new NullArgumentException()).printStackTrace();
			return null;
		}
		
		if(PackageRecord.isEcoreRegistered(ecoreId)) {
			return PackageRecord.getPackage(ecoreId).createResource(uri);
		} else {
			return null;
		}
	}
	
	public static Resource getModel(InputStream modelContent, String modelName, String ecoreId) {
		if(modelContent == null || modelName == null || ecoreId == null) {
			(new NullArgumentException()).printStackTrace();
			return null;
		}
		
		if(!PackageRecord.isEcoreRegistered(ecoreId)) {
			return null;
		}
		
		Resource resource = createEmptyModel(ecoreId, URI.createURI(modelName));
		if(resource == null)
			return null;
		try {
			resource.load(modelContent, Collections.emptyMap());
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		return resource;
	}
	
}
