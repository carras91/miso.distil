package miso.carrascal.codeGenerator.generator.entities

import com.google.inject.Inject

class generateMain {
	
	@Inject miso.carrascal.codeGenerator.generator.packages pack
	
	def write() '''
	package «pack.RootChar»;

	import «pack.Miso».CloudModelServices;

	public class Main {

		public static void main(String[] args) {
			System.out.println("Running");
			CloudModelServices.run();
		}
	}
	'''
}