package miso.carrascal.cloudModelServices.modelServices.filter;

import miso.carrascal.cloudModelServices.abstractServices.filter.ComposePredicate;
import miso.carrascal.cloudModelServices.abstractServices.filter.Predicate;
import miso.carrascal.cloudModelServices.utils.NullArgumentException;

import org.eclipse.emf.ecore.resource.Resource;

public class FilterETypeCompound extends ComposePredicate {

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
	
	public FilterModelInfo customExecute(Resource resource) {
		FilterModelInfo info = new FilterModelInfo();
		
		if(resource == null) {
			(new NullArgumentException()).printStackTrace();
			return info;
		}
				
		for(Predicate filter : super.getPredicates()) {
			info.merge(((FilterEType)filter).execute(resource));
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
