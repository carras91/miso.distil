package miso.carrascal.cloudModelServices.abstractServices.basic;

/**
 * Interface to be found to star spark server.
 * 
 * @author Carlos Carrascal.
 */
public interface BasicInterfaceSpark {
	
	/**
	 * This method will be executed starting the spark server. It needs to have get/post/after/... spark calls.
	 */
	public void runService();
}
