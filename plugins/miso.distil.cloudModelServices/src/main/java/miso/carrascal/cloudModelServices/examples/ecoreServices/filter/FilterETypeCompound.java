package miso.carrascal.cloudModelServices.examples.ecoreServices.filter;

import miso.carrascal.cloudModelServices.abstractServices.filter.ComposePredicate;
import miso.carrascal.cloudModelServices.abstractServices.filter.Predicate;
import miso.carrascal.cloudModelServices.utils.NullArgumentException;

import org.eclipse.emf.ecore.EPackage;

public class FilterETypeCompound extends ComposePredicate {

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
	
	public FilterEcoreInfo customExecute(EPackage ePackage) {
		FilterEcoreInfo info = new FilterEcoreInfo();
		
		if(ePackage == null) {
			(new NullArgumentException()).printStackTrace();
			return info;
		}
				
		for(Predicate filter : super.getPredicates()) {
			info.merge(((FilterEType)filter).execute(ePackage));
		}
		
		return info;
	}
	
	@Override
	public void add(Predicate predicate) {
		if(predicate == null) {
			(new NullArgumentException()).printStackTrace();
			return;
		} else if((predicate instanceof FilterEType) && !super.getPredicates().contains(predicate)) {
			super.add(predicate);
		}
		return;
	}
}
