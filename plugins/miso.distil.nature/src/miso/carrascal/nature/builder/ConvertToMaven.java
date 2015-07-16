package miso.carrascal.nature.builder;

import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.PrintStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

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
	 * Pom path from REPO_ID
	 */
	private static String PATH_POM = "";
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
	 * String to change by project name
	 */
	private static String PROJECT_NAME = "--Foo--";

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
		File res = new File(extended_url.toURI());
		
		// src
		IFolder src = getFolder(project, "src");
		// src/main
		IFolder main = getFolder(src, "main");
		// src/main/resources
		IFolder resources = getFolder(main, "resources");
		// src/main/resources/*.rules
		for(File f : res.listFiles()) {
			if(f.isFile()) {
				File newFile;
				if(f.getName().contains(".rules")) {
					newFile = new File(resources.getLocation().toOSString()+"\\" + f.getName());
				} else {
					newFile = new File(project.getLocation().toOSString()+"\\" + f.getName());
				}
				if(!newFile.exists()) {
					PrintStream stream = new PrintStream(newFile);
					Scanner scanner = new Scanner(f);
					while(scanner.hasNextLine()) {
						String lineString = scanner.nextLine();
						stream.println(lineString.replaceAll(PROJECT_NAME, project.getName()));
					}
					stream.close();
					scanner.close();
				}
			}
		}
	}	
	
	/**
	 * Create folder "nameFolder" inside srcFolder
	 * @author Carlos Carrascal
	 *  
	 * @param srcFolder
	 * @param nameFolder
	 * @return the new folder
	 * @throws CoreException
	 */
	private static IFolder getFolder(IContainer srcFolder, String nameFolder) throws CoreException {
		IFolder newFolder = srcFolder.getFolder(new Path(nameFolder));
		if(!newFolder.exists()) {
			newFolder.create(true, true, null);
		}
		return newFolder;
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
		IFolder repo = getFolder(project, "repo");
		// repo/miso
		IFolder srcMiso = getFolder(repo, "miso");
		// repo/miso/distil
		IFolder srcMainDistil = getFolder(srcMiso, "distil");		
		// repo/miso/distil/cloudModelServices
		IFolder srcMainDistilCloud = getFolder(srcMainDistil, "cloudModelServices");
		// repo/miso/distil/cloudModelServices/0.0.1
		IFolder srcMainDistilCloudVersion = getFolder(srcMainDistilCloud, "0.0.1");
		
		// REPO_ID plugin
		Bundle bundle = Platform.getBundle(REPO_ID);
		// Root folder
		URL url_root = bundle.getEntry(PATH_POM);
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
		if(jarFile.exists()) {
			jarFile.delete(true, null);
		}
		FilenameFilter filterJar = new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				return name.equalsIgnoreCase(JAR);
			}
		};
		jarFile.create(new FileInputStream(jar.listFiles(filterJar)[0]), true, null);
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
		IFolder src = getFolder(project, "src");
		// src/main
		IFolder srcMain = getFolder(src, "main");
		// src/main/java
		IFolder srcMainJava = getFolder(srcMain, "java");	
		// src/main/resources
		IFolder srcMainResources = getFolder(srcMain, "resources");
		
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
