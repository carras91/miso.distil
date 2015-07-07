package miso.carrascal.cloudModelServices.abstractServices.services;

import java.util.ArrayList;
import java.util.List;

import miso.carrascal.cloudModelServices.abstractServices.AbstractPersistentClass;
import spark.Request;
import spark.Response;

public abstract class MultiServiceAbstractJson extends ServiceAbstractJson {
	
	private List<ServiceAbstractJson> services = new ArrayList<ServiceAbstractJson>();
	private Boolean parallel = false;
	
	public MultiServiceAbstractJson(Boolean parallel) {
		super();
		this.parallel = parallel;
	}
	
	public void addService(ServiceAbstractJson service) {
		this.services.add(service);
		
		if(parallel || this.services.size() == 1) {
			addInputClass(service.getInputClass());
		}
		
		if(parallel) {
			addOutputClass(service.getOutputClass());
		}
	}

	@Override
	public List<Class<?>> getOutputClass() {
		if(super.getOutputClass().isEmpty() && this.services.size() > 0) {
			addOutputClass(services.get(services.size()-1).getOutputClass());
		}
		return super.getOutputClass();
	}
	
	@Override
	public List<Object> runService(Request req, Response res, List<? extends AbstractPersistentClass> artifact) {
		return exeService(services.get(0).runService(req, res, artifact));
	}

	@Override
	public List<Object> exeService(List<Object> input) {
		List<Object> output = new ArrayList<Object>();
		List<Object> aux_input = null;
		if(!testInput(input))
			return output;
		
		if(parallel) {
			Integer index = 0;
			for(int i = 1; i< services.size(); i++) {
				ServiceAbstractJson service = services.get(i);
				aux_input = input.subList(index, index + service.getInputClass().size());
				index += service.getInputClass().size();
				output.addAll(service.exeService(aux_input));
			}
		} else {
			aux_input = input;
			for(int i = 1; i< services.size(); i++) {
				output = services.get(i).exeService(aux_input);
				aux_input = output;
			}
		}

		return output;
	}
}
