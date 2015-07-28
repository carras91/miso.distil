package miso.carrascal.cloudModelServices.abstractServices.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import miso.carrascal.cloudModelServices.abstractServices.Persistent;
import spark.Request;
import spark.Response;

public abstract class ServiceAbstractJson {

	private List<Class<?>> inputClass = new ArrayList<Class<?>>();
	private List<Class<?>> outputClass = new ArrayList<Class<?>>();

	public List<Class<?>> getInputClass() {
		return new ArrayList<>(inputClass);
	}
	
	public List<Class<?>> getOutputClass() {
		return new ArrayList<>(outputClass);
	}

	public void addInputClass(Class<?> inClass) {
		inputClass.add(inClass);
	}
	
	public void addOutputClass(Class<?> outClass) {
		outputClass.add(outClass);
	}
	
	public void addInputClass(Collection<Class<?>> inClass) {
		inputClass.addAll(inClass);
	}
	
	public void addOutputClass(Collection<Class<?>> outClass) {
		outputClass.addAll(outClass);
	}

	public ServiceAbstractJson() {}
	
	public Boolean testInput(List<Object> input) {
		Integer position = 0;
		for(Class<?> inputClass : this.getInputClass()) {
			if(!input.get(position).getClass().equals(inputClass)) {
				return false;
			} else {
				position++;
			}
		}
		return true;
	}
	
	public List<Object> runService(Request req, Response res, List<? extends Persistent> artifacts) {
		return exeService(prepareService(req, res, artifacts));
	}

	protected abstract List<Object> prepareService(Request req, Response res, List<? extends Persistent> artifacts);
	
	protected abstract List<Object> exeService(List<Object> input);
}
