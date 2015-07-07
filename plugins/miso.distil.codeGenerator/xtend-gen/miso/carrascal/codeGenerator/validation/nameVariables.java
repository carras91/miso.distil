package miso.carrascal.codeGenerator.validation;

import com.google.common.collect.Iterables;
import java.util.ArrayList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class nameVariables {
  private final static ArrayList<String> object = CollectionLiterals.<String>newArrayList("objectId", "serialVersionUID", "objectName", "createdAt", 
    "fileName", "fileSize", "tags", "filtersEType", "filters");
  
  private final static ArrayList<String> update = CollectionLiterals.<String>newArrayList("map", "id", "name", "tags", "eclass", "esupertype", "eabstract", "einterface", "eattribute", "ereference", 
    "newXX", "oldXX", "IS", "activeFilters", "filters");
  
  private final static ArrayList<String> upload = CollectionLiterals.<String>newArrayList("items", "fieldName", "fileContent", "XX");
  
  private final static ArrayList<String> html = CollectionLiterals.<String>newArrayList("XXs", "viewObjects", "JSON", "View", "customView", "entries", "multientries", "form", "texts", "radios", 
    "hiddens", "file");
  
  private final static ArrayList<String> java = CollectionLiterals.<String>newArrayList("int", "Integer", "bool", "Boolean", "String", "Double", "Float", "List", "ArrayList", "Map", "HashMap");
  
  public final static Iterable<String> prohibitedNames = Iterables.<String>concat(Iterables.<String>concat(Iterables.<String>concat(Iterables.<String>concat(nameVariables.object, nameVariables.update), nameVariables.upload), nameVariables.html), nameVariables.java);
}
