package miso.carrascal.codeGenerator.validation;

import com.google.common.collect.Iterables;
import java.util.ArrayList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

/**
 * Names prohibited because they are used by the generation code
 * 
 * @author Carlos Carrascal
 */
@SuppressWarnings("all")
public class nameVariables {
  /**
   * Names inside the artifact
   */
  private final static ArrayList<String> artifact = CollectionLiterals.<String>newArrayList("objectId", "serialVersionUID", "objectName", "createdAt", 
    "fileName", "fileSize", "tags", "filtersEType", "filters");
  
  /**
   * Names inside update method
   */
  private final static ArrayList<String> update = CollectionLiterals.<String>newArrayList("map", "id", "name", "tags", "eclass", "esupertype", "eabstract", "einterface", "eattribute", "ereference", 
    "newXX", "oldXX", "IS", "activeFilters", "filters");
  
  /**
   * Names inside upload method
   */
  private final static ArrayList<String> upload = CollectionLiterals.<String>newArrayList("items", "fieldName", "fileContent", "XX");
  
  /**
   * Names inside html class
   */
  private final static ArrayList<String> html = CollectionLiterals.<String>newArrayList("XXs", "viewObjects", "JSON", "View", "customView", "entries", "multientries", "form", "texts", "radios", 
    "hiddens", "file");
  
  /**
   * Basic names from java
   */
  private final static ArrayList<String> java = CollectionLiterals.<String>newArrayList("int", "Integer", "bool", "Boolean", "String", "Double", "Float", "List", "ArrayList", "Map", "HashMap");
  
  /**
   * All of them
   */
  public final static Iterable<String> prohibitedNames = Iterables.<String>concat(Iterables.<String>concat(Iterables.<String>concat(Iterables.<String>concat(nameVariables.artifact, nameVariables.update), nameVariables.upload), nameVariables.html), nameVariables.java);
}
