package miso.carrascal.nature.builder;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.osgi.framework.Bundle;

/**
 * To create/copy folders and files needed by maven
 * 
 * @author Carlos Carrascal
 */
public class ConvertToMaven {
	
	/**
	 * Path to folders/files to copy
	 */
	private static String PATH = "/resources/";
	/**
	 * This plugin's id
	 */
	private static String PLUGIN_ID = "miso.distil.nature";
	/**
	 * CloudModelServices id
	 */
	private static String REPO_ID = "miso.distil.cloudModelServices";
	/**
	 * Jar path from REPO_ID
	 */
	private static String PATH_JAR = "/target/";
	/**
	 * Pom name (cloudModelServices)
	 */
	private static String POM = "pom.xml";
	/**
	 * Jar name (cloudModelServices)
	 */
	private static String JAR = "miso.distil.cloudModelServices-jar-with-dependencies.jar";
	/**
	 * New name to pom and jar copies
	 */
	private static String FINAL_NAME = "cloudModelServices-0.0.1";

	/**
	 * First it creates files needed, then copy jar/pom. Finally converts src/main/java and src/main/resources to source folders.
	 * @author Carlos Carrascal
	 * 
	 * @param project This project
	 * @throws CoreException When an error happens
	 */
	public static void run(IProject project) throws CoreException {
		try {
			createMavenFiles(project);
			copyRepo(project);	
		} catch (IOException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}	
		addSource(project);
	}
	
	/**
	 * Search the plugin (bundle) with his url and call copyFiles
	 * @author Carlos Carrascal
	 * 
	 * @param project This project
	 * @throws CoreException
	 * @throws IOException
	 * @throws URISyntaxException
	 */
	private static void createMavenFiles(IProject project) throws CoreException, IOException, URISyntaxException {
		Bundle bundle = Platform.getBundle(PLUGIN_ID);
		URL url = bundle.getEntry(PATH);
		URL extended_url = FileLocator.toFileURL(url);
		File resources = new File(extended_url.toURI());
		copyFiles(resources, project);
	}
	
	/**
	 * Copy inside srcFolder everything insides "resources"
	 * @author Carlos Carrascal
	 * 
	 * @param srcFolder 
	 * @param destFolder 
	 * @throws CoreException
	 * @throws FileNotFoundException
	 */
	private static void copyFiles(File srcFolder, IContainer destFolder) throws CoreException, FileNotFoundException {
		for(File f : srcFolder.listFiles()) {
			if(f.isDirectory()) {
				IFolder newFolder = destFolder.getFolder(new Path(f.getName()));
				if(!newFolder.exists()) {
					newFolder.create(true, true, null);
				}
				copyFiles(f, newFolder);
			} else {
				IFile newFile = destFolder.getFile(new Path(f.getName()));
				if(!newFile.exists()) {
					newFile.create(new FileInputStream(f), true, null);
				}
			}
		}
	}
	
	/**
	 * Copy cloudModelServices jar and pom inside repo/miso/distil/cloudModelServices/0.0.1
	 * @author Carlos Carrascal
	 * 
	 * @param project This project
	 * @throws URISyntaxException
	 * @throws IOException
	 * @throws CoreException
	 */
	private static void copyRepo(IProject project) throws URISyntaxException, IOException, CoreException {
		// repo
		IFolder repo = project.getFolder("repo");					
		// repo/miso
		IFolder srcMiso = repo.getFolder("miso");	
		// repo/miso/distil
		IFolder srcMainDistil = srcMiso.getFolder("distil");			
		// repo/miso/distil/cloudModelServices
		IFolder srcMainDistilCloud = srcMainDistil.getFolder("cloudModelServices");
		// repo/miso/distil/cloudModelServices/0.0.1
		IFolder srcMainDistilCloudVersion = srcMainDistilCloud.getFolder("0.0.1");
		
		// REPO_ID plugin
		Bundle bundle = Platform.getBundle(REPO_ID);
		// Root folder
		URL url_root = bundle.getEntry("");
		URL extended_url_root = FileLocator.toFileURL(url_root);
		File root = new File(extended_url_root.toURI());
		// jar folder
		URL url_jar = bundle.getEntry(PATH_JAR);
		URL extended_url_jar = FileLocator.toFileURL(url_jar);
		File jar = new File(extended_url_jar.toURI());
		
		// Copy POM
		IFile pomFile = srcMainDistilCloudVersion.getFile(new Path(FINAL_NAME + ".pom"));
		if(!pomFile.exists()) {
			FilenameFilter filterPom = new FilenameFilter() {
				@Override
				public boolean accept(File dir, String name) {
					return name.equalsIgnoreCase(POM);
				}
			};
			pomFile.create(new FileInputStream(root.listFiles(filterPom)[0]), true, null);
		}
		
		// Copy JAR
		IFile jarFile = srcMainDistilCloudVersion.getFile(new Path(FINAL_NAME + ".jar"));
		if(!jarFile.exists()) {
			FilenameFilter filterJar = new FilenameFilter() {
				@Override
				public boolean accept(File dir, String name) {
					return name.equalsIgnoreCase(JAR);
				}
			};
			jarFile.create(new FileInputStream(jar.listFiles(filterJar)[0]), true, null);
		}
	}
		
	/**
	 * Converts src/main/java and src/main/resources into source folders 
	 * @author Carlos Carrascal
	 * 
	 * @param project This project
	 * @throws CoreException
	 */
	private static void addSource(IProject project) throws CoreException {
		// src
		IFolder src = project.getFolder("src");
		// src/main
		IFolder srcMain = src.getFolder("main");
		// src/main/java
		IFolder srcMainJava = srcMain.getFolder("java");			
		// src/main/resources
		IFolder srcMainResources = srcMain.getFolder("resources");
		
		// Set java and resources as source folder
		IJavaProject javaProject = JavaCore.create(project);
		IClasspathEntry[] oldEntries = javaProject.getRawClasspath();
		ArrayList<IClasspathEntry> newEntries = new ArrayList<>();
		for(IClasspathEntry entry : oldEntries) {
			if(!entry.getPath().toString().contains("src")) {
				newEntries.add(entry);
			}
		}
				
		IPackageFragmentRoot packageRootJava = javaProject.getPackageFragmentRoot(srcMainJava);
		newEntries.add(JavaCore.newSourceEntry(packageRootJava.getPath()));
				
		IPackageFragmentRoot packageRootResources = javaProject.getPackageFragmentRoot(srcMainResources);
		newEntries.add(JavaCore.newSourceEntry(packageRootResources.getPath()));
					
		javaProject.setRawClasspath(newEntries.toArray(new IClasspathEntry[0]), null);		
	}
}
