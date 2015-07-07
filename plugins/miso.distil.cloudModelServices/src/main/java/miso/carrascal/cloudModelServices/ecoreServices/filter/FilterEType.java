package miso.carrascal.cloudModelServices.ecoreServices.filter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

import miso.carrascal.cloudModelServices.abstractServices.filter.EType;
import miso.carrascal.cloudModelServices.abstractServices.filter.Predicate;
import miso.carrascal.cloudModelServices.utils.NullArgumentException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EClassImpl;

public class FilterEType implements Predicate {

	private EType type;
	
	public FilterEType(EType type) {
		this.type = type;
	}
	
	public FilterEType() {
		this.type = EType.EClass;
	}
	
	@Override
	public FilterEcoreInfo execute(Object object) {
		if(object == null) {
			(new NullArgumentException()).printStackTrace();
			return new FilterEcoreInfo();
		} else if(object instanceof EPackage) {
			return customExecute((EPackage)object);
		} else {
			return new FilterEcoreInfo();
		}
	}
	
	private FilterEcoreInfo customExecute(EPackage ePackage) {
		FilterEcoreInfo info = new FilterEcoreInfo();
		
		if(ePackage == null) {
			(new NullArgumentException()).printStackTrace();
			return info;
		}
		Iterator<EClassifier> iterator = ePackage.getEClassifiers().iterator();
		LinkedHashMap<String, List<String>> ecoreInfo = info.getEcoreInfo();
		switch(type) {
	
			case EClass: {
				while(iterator.hasNext()) {
					EClassifier eClassifier = iterator.next();
					if(eClassifier instanceof EClassImpl) {
						EClass eClass = (EClass)eClassifier;
						ecoreInfo.put(name(EType.EClass, eClass.getName()), new ArrayList<String>());
					}
				}
				info.setEcoreInfo(ecoreInfo);
			} 
			case EAbstract: {
				while(iterator.hasNext()) {
					EClassifier eClassifier = iterator.next();
					if(eClassifier instanceof EClassImpl) {
						EClass eClass = (EClass)eClassifier;
						List<String> abs = new ArrayList<String>();
						abs.add(name(EType.EAbstract, eClass.isAbstract()));
						ecoreInfo.put(name(EType.EClass, eClass.getName()), abs);
					}
				}
				info.setEcoreInfo(ecoreInfo);
			}
			case EInterface: {
				while(iterator.hasNext()) {
					EClassifier eClassifier = iterator.next();
					if(eClassifier instanceof EClassImpl) {
						EClass eClass = (EClass)eClassifier;
						List<String> inter = new ArrayList<String>();
						inter.add(name(EType.EInterface, eClass.isInterface()));
						ecoreInfo.put(name(EType.EClass, eClass.getName()), inter);
					}
				}
				info.setEcoreInfo(ecoreInfo);
			}
			case EAttribute: {
				while(iterator.hasNext()) {
					EClassifier eClassifier = iterator.next();
					if(eClassifier instanceof EClassImpl) {
						EClass eClass = (EClass)eClassifier;
						List<String> att = new ArrayList<String>();
				    	for(EAttribute eAttribute : eClass.getEAllAttributes()) {
				    		att.add(name(EType.EAttribute, eAttribute.getName()));
						}
						ecoreInfo.put(name(EType.EClass, eClass.getName()), att);
					}
				}
				info.setEcoreInfo(ecoreInfo);
			}
			case EReference: {
				while(iterator.hasNext()) {
					EClassifier eClassifier = iterator.next();
					if(eClassifier instanceof EClassImpl) {
						EClass eClass = (EClass)eClassifier;
						List<String> ref = new ArrayList<String>();
				    	for(EReference eReference : eClass.getEAllReferences()) {
				    		ref.add(name(EType.EReference, eReference.getName()));
						}
						ecoreInfo.put(name(EType.EClass, eClass.getName()), ref);
					}
				}
				info.setEcoreInfo(ecoreInfo);
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
	
	private String name(EType eType, boolean name) {
		return eType + ":" + name;
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
