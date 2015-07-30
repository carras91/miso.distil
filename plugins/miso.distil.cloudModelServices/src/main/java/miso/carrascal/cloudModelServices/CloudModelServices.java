package miso.carrascal.cloudModelServices;

import static spark.Spark.staticFileLocation;
import static spark.Spark.get;
import static spark.Spark.port;
import static spark.Spark.after;


import java.util.HashMap;
import java.util.Set;


import miso.carrascal.cloudModelServices.abstractServices.basic.BasicInterfaceSpark;
import miso.carrascal.cloudModelServices.abstractServices.htmlCover.HtmlFreeMarker;

import miso.carrascal.cloudModelServices.utils.RecordDownload;

import org.apache.log4j.BasicConfigurator;
import org.reflections.Reflections;
import org.reflections.scanners.SubTypesScanner;
import org.reflections.util.ClasspathHelper;


import freemarker.log.Logger;
import spark.template.freemarker.FreeMarkerEngine;

/**
 * To initialice the ports, logger, some default spark configurations and find and run implementations of {@link miso.carrascal.cloudModelServices.abstractServices.basic.BasicInterfaceSpark BasicInterfaceSpark}.
 * 
 * @author Carlos Carrascal
 */
public class CloudModelServices {
	 		
	    /**
	     * To run in order:
	     * 1 - setPort - if port does not exists, 2345.
	     * 2 - setLoogger - it selects Logger.LIBRARY_SLF4J.
	     * 3 - setDefaultSpark - it sets /public as public (.css) and send empty calls (/) to main page.
	     * 4 - runServices - it finds and run all BasicInterfaceSpark implementations.
	     */
	    public static void run() {
	       	
	    	// Establecimiento de puerto, necesario para puerto automatico de Heroku
	        setPort();

	    	// Configure FreeMarker log!
	        setLogger();
	        
	        // Basic Spark
	    	setDefaultSpark();
	    	
	        // Busqueda automatica de servicios (subclases de AbstractService)
	        runServices();
	        
	        // Establecimiento de la descarga al final
	        setFinalDownload();
	    }
	    
	    /**
	     * If port does not exists, 2345.
	     */
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
	    
	    /**
	     * It selects Logger.LIBRARY_SLF4J.
	     */
	    private static void setLogger() {
	   		try {
	   			Logger.selectLoggerLibrary(Logger.LIBRARY_SLF4J);
	   		} catch (ClassNotFoundException e) {
	   			e.printStackTrace();
	   		}
	       	BasicConfigurator.configure();
	    }
	    
	    /**
	     * It sets /public as public (.css) and send empty calls (/) to main page.
	     */
	    private static void setDefaultSpark() {
	    	
	    	// Configure css location
	       	staticFileLocation("/public/");
		    
	    	// Configure default page 
		    get("/", (request, response) -> {
		    	return HtmlFreeMarker.closeHtml(new HashMap<String, Object>());
	    	}, new FreeMarkerEngine());
	    }
	    
	    /**
	     * It finds and run all BasicInterfaceSpark implementations.
	     */
	    private static void runServices() {
	    	// Let's use Reflections to find Spark services
	    	Reflections refl = new Reflections ("miso.distil", new SubTypesScanner(false), ClasspathHelper.forClassLoader());
	    	// We want all classes implementing BasicInterfaceSpark
		    Set<Class<? extends BasicInterfaceSpark>> subClassesService = refl.getSubTypesOf(BasicInterfaceSpark.class);
		    for(Class<? extends BasicInterfaceSpark> serviceClass : subClassesService) {
		    	BasicInterfaceSpark service;
				try {
					// So we instantiate the classes and run the spark service
					service = serviceClass.newInstance();
					service.runService();
					System.out.println("Service " + serviceClass.getSimpleName() + " registered");
				} catch (InstantiationException e) {
					e.printStackTrace();
					System.out.println("Service instantiation problem");
				} catch (IllegalAccessException e) {
					e.printStackTrace();
					System.out.println("Service illegal acces problem");
				}
		    }
	    }
	    
	    /**
	     * It set an after spark service to execute downloads
	     */
	    private static void setFinalDownload() {
	    	// Configure after
		    after("*", (request, response) -> {
		    	RecordDownload.closeDownload(response);
	    	});
	    }
}
