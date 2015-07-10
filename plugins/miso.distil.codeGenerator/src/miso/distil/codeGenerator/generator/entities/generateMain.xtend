package miso.distil.codeGenerator.generator.entities

import com.google.inject.Inject

/*
 * To write Main.java
 * 
 * @author Carlos Carrascal
 */
class generateMain {
	
	@Inject miso.distil.codeGenerator.generator.packages pack

	/*
 	 * To write Main.java
	 * 
	 * @author Carlos Carrascal
	 */
	def write() '''
	package «pack.RootChar»;

	import «pack.Miso».CloudModelServices;

	/**
	 * Auto-generated main class
	 * 
	 * @author miso.distil.codeGenerator
	 */
	public class Main {

		public static void main(String[] args) {
			System.out.println("Running");
			// Call cloudModelServices to start all spark server
			CloudModelServices.run();
		}
	}
	'''
}