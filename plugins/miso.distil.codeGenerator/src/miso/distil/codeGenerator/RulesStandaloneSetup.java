/*
 * generated by Xtext
 */
package miso.distil.codeGenerator;

import miso.distil.codeGenerator.RulesStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class RulesStandaloneSetup extends RulesStandaloneSetupGenerated {

	public static void doSetup() {
		new RulesStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

