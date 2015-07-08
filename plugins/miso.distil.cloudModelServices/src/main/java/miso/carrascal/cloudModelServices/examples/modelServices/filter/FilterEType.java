package miso.carrascal.cloudModelServices.examples.modelServices.filter;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import miso.carrascal.cloudModelServices.abstractServices.filter.EType;
import miso.carrascal.cloudModelServices.abstractServices.filter.Predicate;
import miso.carrascal.cloudModelServices.utils.NullArgumentException;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;

public class FilterEType implements Predicate {

	private EType type;
	
	public FilterEType(EType type) {
		this.type = type;
	}
	
	public FilterEType() {
		this.type = EType.EClass;
	}
	
	@Override
	public FilterModelInfo execute(Object object) {
		if(object == null) {
			(new NullArgumentException()).printStackTrace();
			return new FilterModelInfo();
		} else if(object instanceof Resource) {
			return customExecute((Resource)object);
		} else {
			return new FilterModelInfo();
		}
	}
	
	private FilterModelInfo customExecute(Resource resource) {
		FilterModelInfo info = new FilterModelInfo();
		
		if(resource == null) {
			(new NullArgumentException()).printStackTrace();
			return info;
		}
		
	    TreeIterator<EObject> iterator = resource.getAllContents();
		LinkedHashMap<String, List<List<String>>> modelInfo = info.getModelInfo();
		switch(type) {
	
			case EClass: {
				while(iterator.hasNext()) {
					EClass eClass= iterator.next().eClass();
					insert(modelInfo, name(EType.EClass, eClass.getName()), new ArrayList<String>());
				}
				info.setModelInfo(modelInfo);
			}
			case ESuperType: {
				while(iterator.hasNext()) {
					EClass eClass= iterator.next().eClass();
					ArrayList<String> sup = new ArrayList<String>();
				    for(EClass eSuperType : eClass.getEAllSuperTypes()) {
				    	sup.add(name(EType.ESuperType, eSuperType.getName()));
					}
				    insert(modelInfo, name(EType.EClass, eClass.getName()), sup);
				}
				info.setModelInfo(modelInfo);
			}
			case EAttribute: {
				while(iterator.hasNext()) {
					EObject eObject = iterator.next();
					EClass eClass= eObject.eClass();
					ArrayList<String> att = new ArrayList<String>();
				    for(EAttribute eAttribute : eClass.getEAllAttributes()) {
				    	if(!eAttribute.isUnsettable())
				    		att.add(name(eAttribute.getName(), eObject.eGet(eAttribute)));
					}
				    insert(modelInfo, name(EType.EClass, eClass.getName()), att);
				}
				info.setModelInfo(modelInfo);
			}
			case EReference: {
				while(iterator.hasNext()) {
					EClass eClass= iterator.next().eClass();
					ArrayList<String> ref = new ArrayList<String>();
				    for(EReference eReference : eClass.getEAllReferences()) {
				    	ref.add(name(EType.EReference, eReference.getName()));
					}
				    insert(modelInfo, name(EType.EClass, eClass.getName()), ref);
				}
				info.setModelInfo(modelInfo);
			}
			default: {
				break;
			}
		}
		return info;
	}
	
	private String name(EType eType, String name) {
		return eType + ":" + name;
	}
	
	private String name(String name, Object object) {
		return name + ":" + object;
	}
	
	private void insert(LinkedHashMap<String, List<List<String>>> modelInfo, String name, List<String> item) {
		if(modelInfo.containsKey(name)) {
	    	modelInfo.get(name).add(item);
	    } else {
		    List<List<String>> list = new ArrayList<List<String>>();
		    list.add(item);
		    modelInfo.put(name, list);
	    }
	}
	
	public EType getType() {
		return type;
	}

	public void setType(EType type) {
		this.type = type;
	}
	
	@Override
	public boolean equals(Object o) {
		if(FilterEType.class == o.getClass()) {
			return type.equals(((FilterEType)o).getType());
		}
		return false;
		
	}
}
