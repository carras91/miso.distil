package miso.carrascal.cloudModelServices.abstractServices.basic;

import spark.ResponseTransformer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Custom class to set a JSON as response from a spark parser
 * 
 * @author Carlos Carrascal
 */
public class JsonTransformer implements ResponseTransformer{

	/**
	 * Gson object, with pretty printing and null serializer
	 */
	private static final Gson gson = new GsonBuilder().setPrettyPrinting().serializeNulls().create();
	
	/* (non-Javadoc)
	 * @see spark.ResponseTransformer#render(java.lang.Object)
	 */
	@Override
	public String render(Object object) throws Exception {
		return gson.toJson(object);
	}
	
	/**
	 * To convert from string json to classOfT
	 * 
	 * @param json String with correct json
	 * @param classOfT class to be converted
	 * @return instance of classOfT with json string converted
	 */
	public static <T extends Object> T fromJson(String json, Class<T> classOfT) {
		return (new Gson()).fromJson(json, classOfT);
	}
}
