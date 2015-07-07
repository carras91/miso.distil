package miso.carrascal.cloudModelServices.abstractServices.basic;

import spark.ResponseTransformer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/*
 * Custom class to set a JSON as response from a spark parser
 * 
 * @author Carlos Carrascal
 */
public class JsonTransformer implements ResponseTransformer{

	private static final Gson gson = new GsonBuilder().setPrettyPrinting().serializeNulls().create();
	
	@Override
	public String render(Object object) throws Exception {
		return gson.toJson(object);
	}
}
