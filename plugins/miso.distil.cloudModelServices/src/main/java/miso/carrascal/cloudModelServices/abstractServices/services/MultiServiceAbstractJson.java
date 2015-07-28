package miso.carrascal.cloudModelServices.abstractServices.services;

import java.util.ArrayList;
import java.util.List;

import miso.carrascal.cloudModelServices.abstractServices.Persistent;
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
	protected List<Object> prepareService(Request req, Response res, List<? extends Persistent> artifacts) {
		if(this.parallel) {
			List<Object> input = new ArrayList<>();
		
			for(ServiceAbstractJson service : this.services) {
				input.addAll(service.prepareService(req, res, artifacts));
			}
			return input;
		} else {
			return services.get(0).prepareService(req, res, artifacts);
		}
	}

	@Override
	protected List<Object> exeService(List<Object> input) {
		List<Object> output = new ArrayList<Object>();
		List<Object> aux_input = null;
		if(!testInput(input))
			return output;
		
		if(parallel) {
			Integer index = 0;
			for(int i = 0; i< services.size(); i++) {
				ServiceAbstractJson service = services.get(i);
				aux_input = input.subList(index, index + service.getInputClass().size());
				index += service.getInputClass().size();
				output.addAll(service.exeService(aux_input));
			}
		} else {
			aux_input = input;
			for(int i = 0; i< services.size(); i++) {
				output = services.get(i).exeService(aux_input);
				aux_input = output;
			}
		}

		return output;
	}
}
