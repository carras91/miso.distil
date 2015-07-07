package miso.carrascal.cloudModelServices;

import static spark.Spark.staticFileLocation;
import static spark.Spark.get;
import static spark.Spark.port;

import java.util.HashMap;
import java.util.Set;

import miso.carrascal.cloudModelServices.abstractServices.RecordDB;
import miso.carrascal.cloudModelServices.abstractServices.basic.BasicInterfaceSpark;
import miso.carrascal.cloudModelServices.abstractServices.htmlCover.HtmlFreeMarker;

import org.apache.log4j.BasicConfigurator;
import org.reflections.Reflections;
import org.reflections.scanners.SubTypesScanner;
import org.reflections.util.ClasspathHelper;

import freemarker.log.Logger;
import spark.template.freemarker.FreeMarkerEngine;

public class CloudModelServices {
	 
		private final static String MONGO_URI_Default = "mongodb://heroku_user1:miso.uam2015@ds033841.mongolab.com:33841/heroku_app35220664";
			
	    public static void run() {
	       	
	    	// Establecimiento de puerto, necesario para puerto automatico de Heroku
	        setPort();
	        
	        // Establecimiento de una base de datos
	        setMongoDB();

	    	// Configure FreeMarker log!
	        setLogger();
	        
	        // Basic Spark
	    	setDefaultSpark();
	    	
	        // Busqueda automatica de servicios (subclases de AbstractService)
	        runServices();
	    }
	    
	    private static void setPort() {
	    	ProcessBuilder process = new ProcessBuilder();
	        Integer port;
	        if (process.environment().get("PORT") != null) {
	            port = Integer.parseInt(process.environment().get("PORT"));
	        } else {
	            port = 2345;
	        }
	        port(port);
	        System.out.println("Port set to " + port);
	    }
	    
	    private static void setMongoDB() {
	    	MongoDB MongoDBDefault = new MongoDB(MONGO_URI_Default);
	    	RecordDB.setDefault(MongoDBDefault);
	    	System.out.println("MongoDB registered");
	    }
	    
	    private static void setLogger() {
	   		try {
	   			Logger.selectLoggerLibrary(Logger.LIBRARY_SLF4J);
	   		} catch (ClassNotFoundException e) {
	   			e.printStackTrace();
	   		}
	       	BasicConfigurator.configure();
	    }
	    
	    private static void setDefaultSpark() {
	    	
	    	// Configure css location
	       	staticFileLocation("/public/");
		    
	    	// Configure default page 
		    get("/", (request, response) -> {
		    	return HtmlFreeMarker.closeHtml(new HashMap<String, Object>());
	    	}, new FreeMarkerEngine());
	    }
	    
	    private static void runServices() {
	    	// Let's use Reflections to find Spark services
	    	Reflections refl = new Reflections ("miso.carrascal", new SubTypesScanner(false), ClasspathHelper.forClassLoader());
	    	// We want all classes implementing BasicInterfaceSpark
		    Set<Class<? extends BasicInterfaceSpark>> subClassesService = refl.getSubTypesOf(BasicInterfaceSpark.class);
	    	HashMap<String, BasicInterfaceSpark> defaultClasses = new HashMap<String, BasicInterfaceSpark>();
		    for(Class<? extends BasicInterfaceSpark> serviceClass : subClassesService) {
		    	BasicInterfaceSpark service;
				try {
					// So we instantiate the classes
					service = serviceClass.newInstance();
					// If they're custom, we'll run them first (so they stay Default services)
					if(serviceClass.getSimpleName().startsWith("Custom")) {
						service.runService();
						System.out.println("Service " + serviceClass.getSimpleName() + " registered");
					} else {
						defaultClasses.put(serviceClass.getSimpleName(), service);
					}
				} catch (InstantiationException e) {
					e.printStackTrace();
					System.out.println("Service instantiation problem");
				} catch (IllegalAccessException e) {
					e.printStackTrace();
					System.out.println("Service illegal acces problem");
				}
		    }
		    for(String name : defaultClasses.keySet()) {
		    	defaultClasses.get(name).runService();
		    	System.out.println("Service " + name + " registered");
		    }
	    }
}
