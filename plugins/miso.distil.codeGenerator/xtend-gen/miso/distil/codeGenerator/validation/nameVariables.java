package miso.distil.codeGenerator.validation;

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
   * Name to change by artifact name
   */
  public final static String artifactName = "XXX";
  
  /**
   * Variables inside BasicCodes
   */
  private final static ArrayList<String> basicCodes = CollectionLiterals.<String>newArrayList("emptyfilename", "emptyfile", "filenotfound", "corruptfile", "notfound", "DB");
  
  /**
   * Variables inside BasicParam
   */
  private final static ArrayList<String> basicParam = CollectionLiterals.<String>newArrayList("IdGet", "IdPost", "File", "Search_query", "Search_value", "Search_synonyms");
  
  /**
   * Variables inside CustomHtml
   */
  private final static ArrayList<String> customHtml = CollectionLiterals.<String>newArrayList("multientries", "entries", "viewObjects", "form", "selectbox", "boxes", "box", 
    "texts", "radios", "hiddens", "file");
  
  /**
   * Variables inside Json
   */
  private final static ArrayList<String> json = CollectionLiterals.<String>newArrayList("map", "id", "IS", ("old" + nameVariables.artifactName), ("new" + nameVariables.artifactName), "multipartConfigElement", "filePart", "fileName", 
    "fileSize", "fileContent");
  
  /**
   * Variables inside the artifact class
   */
  private final static ArrayList<String> artifact = CollectionLiterals.<String>newArrayList("objectid", "serialVersionUID", "createdAt", "filename", "filesize");
  
  /**
   * Variables inside HtmlJson
   */
  private final static ArrayList<String> htmlSpark = CollectionLiterals.<String>newArrayList("viewObjects", "viewObject", (nameVariables.artifactName + "s"));
  
  /**
   * Variables inside HtmlJson
   */
  private final static ArrayList<String> htmlView = CollectionLiterals.<String>newArrayList("entries", "multientries", "entries", "viewObjects", "form", "selectbox", "boxes", 
    "texts", "radios", "hiddens", "file");
  
  /**
   * Variables names from java
   */
  private final static ArrayList<String> java = CollectionLiterals.<String>newArrayList("int", "Integer", "bool", "Boolean", "String", "Double", "Float", "List", "ArrayList", "Map", "HashMap", 
    "public", "private", "final", "static", "interface", "abstract", "class", "void");
  
  /**
   * All variables
   */
  public final static Iterable<String> prohibitedNames = Iterables.<String>concat(Iterables.<String>concat(Iterables.<String>concat(Iterables.<String>concat(Iterables.<String>concat(Iterables.<String>concat(Iterables.<String>concat(nameVariables.basicCodes, nameVariables.basicParam), nameVariables.customHtml), nameVariables.json), nameVariables.artifact), nameVariables.htmlSpark), nameVariables.htmlView), nameVariables.java);
}
