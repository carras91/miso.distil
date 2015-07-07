package miso.carrascal.codeGenerator.generator;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IOutputConfigurationProvider;
import org.eclipse.xtext.generator.OutputConfiguration;

public class GeneratorOutputConfiguration implements IOutputConfigurationProvider {

	public static final String GEN_ONCE_OUTPUT = "gen-once";
	public static final String GEN_ALWAYS_OUTPUT = IFileSystemAccess.DEFAULT_OUTPUT;
	
	@Override
	public Set<OutputConfiguration> getOutputConfigurations() {
		
		// Delete existing derived files and overwrite
		OutputConfiguration outConf = new OutputConfiguration(GEN_ALWAYS_OUTPUT);
		outConf.setCanClearOutputDirectory(false);
		outConf.setCleanUpDerivedResources(false);
		outConf.setCreateOutputDirectory(true);
		outConf.setDescription("Output Folder");
		outConf.setHideSyntheticLocalVariables(false);
		outConf.setInstallDslAsPrimarySource(false);
		outConf.setKeepLocalHistory(true);
		outConf.setOutputDirectory("./src/main/java");
		outConf.setOverrideExistingResources(true);
		outConf.setSetDerivedProperty(true);
		outConf.setUseOutputPerSourceFolder(false);
		
		// Keep not derived files
		OutputConfiguration readOnlyConf = new OutputConfiguration(GEN_ONCE_OUTPUT);
		readOnlyConf.setCanClearOutputDirectory(false);
		readOnlyConf.setCleanUpDerivedResources(false);
		readOnlyConf.setCreateOutputDirectory(true);
		readOnlyConf.setDescription("Output Folder");
		readOnlyConf.setHideSyntheticLocalVariables(false);
		readOnlyConf.setInstallDslAsPrimarySource(false);
		readOnlyConf.setKeepLocalHistory(true);
		readOnlyConf.setOutputDirectory("./src/main/java");
		readOnlyConf.setOverrideExistingResources(false);
		readOnlyConf.setSetDerivedProperty(false);
		readOnlyConf.setUseOutputPerSourceFolder(false);
		
		Set<OutputConfiguration> set = new HashSet<OutputConfiguration>();
		set.add(outConf);
		set.add(readOnlyConf);
		return set;
	}

}
