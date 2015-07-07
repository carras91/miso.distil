package miso.carrascal.cloudModelServices.abstractServices.filter;

import java.util.ArrayList;
import java.util.List;

public abstract class ComposePredicate implements Predicate {

	private List<Predicate> predicates = new ArrayList<Predicate>();
	
	public void add(Predicate predicate) {
		this.predicates.add(predicate);
	}
	
	public void delete(Predicate predicate) {
		this.predicates.remove(predicate);
	}
	
	protected List<Predicate> getPredicates() {
		return predicates;
	}
}
