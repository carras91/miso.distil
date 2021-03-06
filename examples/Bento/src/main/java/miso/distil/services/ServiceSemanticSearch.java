package miso.distil.services;

import java.util.ArrayList;
import java.util.List;

import spark.Request;
import spark.Response;
import miso.carrascal.cloudModelServices.abstractServices.services.ServiceAbstractJson;
import miso.carrascal.cloudModelServices.abstractServices.Persistent;
import miso.distil.metamodelServices.MetaModel;
import miso.distil.bentoServices.Bento;

/**
 * Auto-generated service class.
 * 
 * @author miso.distil.codeGenerator.
 */
public class ServiceSemanticSearch extends ServiceAbstractJson {

	/**
	 * Auto-generated service constructor.
	 */
	public ServiceSemanticSearch() {
		// Input classes
		addInputClass(MetaModel.class);
		// Output classes
		addOutputClass((new ArrayList<Bento>()).getClass());
	}

	@Override
	protected List<Object> prepareService(Request req, Response res, List<? extends Persistent> artifacts) {
		List<Object> input = new ArrayList<Object>();

		// Create the input objects to your service and use (or not) the artifacts
		MetaModel meta = new MetaModel("automatic metamodel name", 42, "automatic metamodel uri");
		input.add(meta);
		System.out.println("SemanticSearch has started");
		
		return input;
	}

	@Override
	protected List<Object> exeService(List<Object> input) {
		List<Object> output = new ArrayList<Object>();
		if(!this.testInput(input))
			return output;

		// Take your inputs
		MetaModel metamodel = MetaModel.class.cast(input.get(0));
		// do something!
		System.out.println(metamodel.toString());

		// Create your outputs (do something!)
		List<Bento> bentos = new ArrayList<Bento>();
		bentos.add(new Bento("first bento name", 42, null, null, null, null));
		bentos.add(new Bento("second bento name", 24, null, null, null, null));
		output.add(bentos);
		
		System.out.println("SemanticSearch has finished");

		return output;
	}
}
