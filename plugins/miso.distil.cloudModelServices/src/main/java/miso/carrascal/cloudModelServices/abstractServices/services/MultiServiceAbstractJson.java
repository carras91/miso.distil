package miso.carrascal.cloudModelServices.abstractServices.services;

import java.util.ArrayList;
import java.util.List;

import miso.carrascal.cloudModelServices.abstractServices.Persistent;
import spark.Request;
import spark.Response;

/**
 * Service composed. It defines if the services are executed at the same time with same inputs (parallel) or
 * in series, one receiving as input the output of the previous one.
 * 
 * @author Carlos Carrascal
 */
public abstract class MultiServiceAbstractJson extends ServiceAbstractJson {
	
	/**
	 * Services inside.
	 */
	private List<ServiceAbstractJson> services = new ArrayList<ServiceAbstractJson>();
	/**
	 * Shows if services run in parallel or not.
	 */
	private Boolean parallel = false;
	
	/**
	 * Public constructor.
	 * 
	 * @param parallel True if all services are to be executed in parallel or in series
	 */
	public MultiServiceAbstractJson(Boolean parallel) {
		super();
		this.parallel = parallel;
	}
	
	/**
	 * Add a new service in order.
	 * 
	 * @param service new service
	 */
	public void addService(ServiceAbstractJson service) {
		this.services.add(service);
		
		if(parallel || this.services.size() == 1) {
			addInputClass(service.getInputClass());
		}
		
		if(parallel) {
			addOutputClass(service.getOutputClass());
		}
	}

	/* (non-Javadoc)
	 * @see miso.carrascal.cloudModelServices.abstractServices.services.ServiceAbstractJson#getOutputClass()
	 */
	@Override
	public List<Class<?>> getOutputClass() {
		if(super.getOutputClass().isEmpty() && this.services.size() > 0) {
			addOutputClass(services.get(services.size()-1).getOutputClass());
		}
		return super.getOutputClass();
	}
	
	/* (non-Javadoc)
	 * @see miso.carrascal.cloudModelServices.abstractServices.services.ServiceAbstractJson#prepareService(spark.Request, spark.Response, java.util.List)
	 */
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

	/* (non-Javadoc)
	 * @see miso.carrascal.cloudModelServices.abstractServices.services.ServiceAbstractJson#exeService(java.util.List)
	 */
	@Override
	protected List<Object> exeService(List<Object> input) {
		List<Object> output = new ArrayList<Object>();
		List<Object> aux_input = null;
		if(!testInput(input)) {
			System.out.println("Error testing the inputs for this service");
			return output;
		}
		
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
