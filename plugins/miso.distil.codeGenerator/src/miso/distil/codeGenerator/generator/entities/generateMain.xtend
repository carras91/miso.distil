package miso.distil.codeGenerator.generator.entities

import com.google.inject.Inject

/*
 * To write Main.java
 * 
 * @author Carlos Carrascal
 */
class generateMain {
	
	@Inject miso.distil.codeGenerator.generator.Names names

	/*
 	 * To write Main.java
	 * 
	 * @author Carlos Carrascal
	 */
	def write() '''
	package «names.RootChar»;

	import «names.Miso».CloudModelServices;

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