package miso.carrascal.cloudModelServices.abstractServices.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import miso.carrascal.cloudModelServices.abstractServices.Persistent;
import spark.Request;
import spark.Response;

/**
 * Custom service.
 * 
 * @author Carlos Carrascal
 */
public abstract class ServiceAbstractJson {

	/**
	 * All input classes (in order).
	 */
	private List<Class<?>> inputClass = new ArrayList<Class<?>>();
	/**
	 * All output classes (in order).
	 */
	private List<Class<?>> outputClass = new ArrayList<Class<?>>();

	/**
	 * Get inputClass.
	 * 
	 * @return input classes
	 */
	public List<Class<?>> getInputClass() {
		return new ArrayList<>(inputClass);
	}
	
	/**
	 * Get outputClass.
	 * 
	 * @return output classes
	 */
	public List<Class<?>> getOutputClass() {
		return new ArrayList<>(outputClass);
	}

	/**
	 * Add a new input class in order.
	 * 
	 * @param inClass new input class
	 */
	public void addInputClass(Class<?> inClass) {
		inputClass.add(inClass);
	}
	
	/**
	 * Add a new output class in order.
	 * 
	 * @param outClass new output class
	 */
	public void addOutputClass(Class<?> outClass) {
		outputClass.add(outClass);
	}
	
	/**
	 * Add multiple input classes in order.
	 * 
	 * @param inClass new input classes
	 */
	public void addInputClass(Collection<Class<?>> inClass) {
		inputClass.addAll(inClass);
	}
	
	/**
	 * Add multiple output classes in order.
	 * 
	 * @param outClass new output classes
	 */
	public void addOutputClass(Collection<Class<?>> outClass) {
		outputClass.addAll(outClass);
	}

	/**
	 * Public constructor
	 */
	public ServiceAbstractJson() {}
	
	/**
	 * Test if input list object's have the same classes (using isInstance) in the same order than inputClass
	 * 
	 * @param input list with input
	 * 
	 * @return true if list is correct, false in other case
	 */
	public Boolean testInput(List<Object> input) {
		if(input.size() != this.getInputClass().size()) {
			System.out.println(".. Different size of lists");
			return false;
		}
		
		Integer position = 0;
		for(Class<?> inputClass : this.getInputClass()) {
			if(!inputClass.isInstance(input.get(position))) {
				System.out.println(".. Object " + position + " is not a " + inputClass.getSimpleName());
				System.out.println(".. The object is ("+ input.get(position).getClass().getSimpleName() + 
						"): \n" + input.get(position).toString() + "\n..");
				return false;
			} else {
				position++;
			}
		}
		return true;
	}
	
	/**
	 * Method to run the service. First, it calls {@link #prepareService prepareService} and then {@link #exeService exeService}.
	 * Not to be override.
	 * 
	 * @param req Java Spark Request. On request, request sent by user. Otherwise, request from basic services.
	 * @param res Java Spark Response. On request, response sent by user. Otherwise, response from basic services.
	 * @param artifacts List of artifacts. If called on request, is empty. If called after Upload, Download, Update, Delete, Read, 
	 * has the object treated. If called after ReadAll or Search, has the objects found.
	 * @return output list from {@link #exeService exeService}.
	 */
	public List<Object> runService(Request req, Response res, List<? extends Persistent> artifacts) {
		return exeService(prepareService(req, res, artifacts));
	}

	/**
	 * Method to prepare the inputs. It can use request, response and artifacts.
	 * 
	 * @param req Java Spark Request. On request, request sent by user. Otherwise, request from basic services.
	 * @param res Java Spark Response. On request, response sent by user. Otherwise, response from basic services.
	 * @param artifacts List of artifacts. If called on request, is empty. If called after Upload, Download, Update, Delete, Read, 
	 * has the object treated. If called after ReadAll or Search, has the objects found.
	 * @return input list.
	 */
	protected abstract List<Object> prepareService(Request req, Response res, List<? extends Persistent> artifacts);
	
	/**
	 * This method execute the service. Process the input to create the output.
	 * 
	 * @param input input list from {@link #prepareService prepareService}.
	 * @return output list.
	 */
	protected abstract List<Object> exeService(List<Object> input);
}
