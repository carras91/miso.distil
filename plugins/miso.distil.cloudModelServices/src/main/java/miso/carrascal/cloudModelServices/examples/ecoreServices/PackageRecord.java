package miso.carrascal.cloudModelServices.examples.ecoreServices;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import miso.carrascal.cloudModelServices.utils.NullArgumentException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

public class PackageRecord {
	
	private final static HashMap<String, ResourceSet> resourceSet = new HashMap<String, ResourceSet>();
	
	public static Boolean registerPackages(String ecoreId, InputStream ecoreContent, String ecoreName) {
		if(ecoreId == null || ecoreContent == null || ecoreName == null) {
			(new NullArgumentException()).printStackTrace();
			return false;
		}
		
		return registerPackages(ecoreId, getPackages(ecoreContent, ecoreName));
	}
	
	public static Boolean registerPackages(String ecoreId, List<EPackage> ePackages) {
		if(ecoreId == null || ePackages == null) {
			(new NullArgumentException()).printStackTrace();
			return false;
		}
		if(isEcoreRegistered(ecoreId) || ePackages.isEmpty())
			return false;
		
		ResourceSet resource = new ResourceSetImpl();
		for(EPackage ePackage : ePackages) {
			resource.getPackageRegistry().put(ePackage.getNsURI(), ePackage);
			resourceSet.put(ecoreId, resource);
		}
		
		return true;
	}
	
	public static void registerExtensionEcore(String extension) {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(extension, new XMIResourceFactoryImpl());
	}
	
	public static List<EPackage> getPackages(InputStream ecoreContent, String ecoreName) {
	    List<EPackage> ePackages = new ArrayList<EPackage>();		
		if(ecoreContent == null || ecoreName == null) {
			(new NullArgumentException()).printStackTrace();
			return ePackages;
		}
		
		XMIResource resource = new XMIResourceImpl(URI.createURI(ecoreName));
		
	    try {
			resource.load(ecoreContent, Collections.emptyMap());
		} catch (IOException e) {
			e.printStackTrace();
			return ePackages;
		}

	    EList<EObject> list = resource.getContents();
	    for(EObject object : list) {
	    	if(object.getClass().equals(EPackageImpl.class)) {
	    		ePackages.add((EPackage) object);
	    	}
	    }
		return ePackages;
	}
	
	public static Boolean isEcoreRegistered(String ecoreId) {
		if(ecoreId == null) {
			(new NullArgumentException()).printStackTrace();
			return false;
		}
		
		return resourceSet.containsKey(ecoreId);
	}
	
	public static ResourceSet getPackage(String ecoreId) {
		if(ecoreId == null) {
			(new NullArgumentException()).printStackTrace();
			return null;
		}
		
		return resourceSet.get(ecoreId);
	}
}

