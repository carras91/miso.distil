package miso.distil.codeGenerator.validation

/**
 * Names prohibited because they are used by the generation code
 * 
 * @author Carlos Carrascal
 */
class nameVariables {
	
	/**
	 * Name to change by artifact name 
	 */
	 public static val artifactName = "XXX";	
	/**
	 * Variables inside BasicCodes
	 */
	 private static val basicCodes = newArrayList("emptyfilename", "emptyfile", "filenotfound", "corruptfile", "notfound", "DB")
	/**
	 * Variables inside BasicParam
	 */
	 private static val basicParam = newArrayList("IdGet", "IdPost", "File", "Search_query", "Search_value", "Search_synonyms")
	/**
	 * Variables inside CustomHtml
	 */
	 private static val customHtml = newArrayList("multientries", "entries", "viewObjects", "form", "selectbox", "boxes", "box",
	 											"texts", "radios", "hiddens", "file")
	/**
	 * Variables inside Json
	 */
	 private static val json = newArrayList("map", "id", "IS", "old"+artifactName, "new"+artifactName, "multipartConfigElement", "filePart", "fileName",
	 										"fileSize", "fileContent")
	/**
	 * Variables inside the artifact class
	 */
	private static val artifact = newArrayList("objectid", "serialVersionUID", "createdAt", "filename", "filesize")
	/**
	 * Variables inside HtmlJson
	 */
	private static val htmlSpark = newArrayList("viewObjects", "viewObject", artifactName+"s")
	/**
	 * Variables inside HtmlJson
	 */
	private static val htmlView = newArrayList("entries", "multientries", "entries", "viewObjects", "form", "selectbox", "boxes",
												"texts", "radios", "hiddens", "file")
	/**
	 * Variables names from java
	 */
	private static val java = newArrayList("int", "Integer", "bool", "Boolean", "String", "Double", "Float", "List", "ArrayList", "Map", "HashMap",
											"public", "private", "final", "static", "interface", "abstract", "class", "void")
	/**
	 * All variables
	 */
	public static val prohibitedNames = basicCodes + basicParam + customHtml + json + artifact + htmlSpark + htmlView + java
}