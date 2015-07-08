/*
 * generated by Xtext
 */
package miso.carrascal.codeGenerator;

import miso.carrascal.codeGenerator.generator.GeneratorOutputConfiguration;

import org.eclipse.xtext.generator.IOutputConfigurationProvider;

import com.google.inject.Binder;
import com.google.inject.Singleton;

/**
 * To register generator.GeneratorOutputConfiguration
 * 
 * @author Carlos Carrascal
 * 
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class RulesRuntimeModule extends miso.carrascal.codeGenerator.AbstractRulesRuntimeModule {

	 @Override
	  public void configure(Binder binder) {
	    super.configure(binder);
	    binder.bind(IOutputConfigurationProvider.class)
	        .to(GeneratorOutputConfiguration.class)
	        .in(Singleton.class);
	  }	

}
