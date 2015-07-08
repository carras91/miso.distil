package miso.carrascal.codeGenerator.validation

/*
 * Names prohibited because they are used by the generation code
 * 
 * @author Carlos Carrascal
 */
class nameVariables {
	
	/*
	 * Names inside the artifact
	 */
	private static val artifact = newArrayList("objectId", "serialVersionUID", "objectName", "createdAt",
											"fileName", "fileSize", "tags", "filtersEType", "filters")
	/*
	 * Names inside update method
	 */
	private static val update = newArrayList("map", "id", "name", "tags", "eclass", "esupertype", "eabstract", "einterface", "eattribute", "ereference",
											"newXX", "oldXX", "IS", "activeFilters", "filters")
	/*
	 * Names inside upload method
	 */
	private static val upload = newArrayList("items", "fieldName", "fileContent", "XX")
	/*
	 * Names inside html class
	 */
	private static val html   = newArrayList("XXs", "viewObjects", "JSON", "View", "customView", "entries", "multientries", "form", "texts", "radios",
											"hiddens", "file")
	/*
	 * Basic names from java
	 */
	private static val java = newArrayList("int", "Integer", "bool", "Boolean", "String", "Double", "Float", "List", "ArrayList", "Map", "HashMap")
	/*
	 * All of them
	 */
	public static val prohibitedNames = artifact + update + upload + html + java
}