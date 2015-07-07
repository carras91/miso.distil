package miso.carrascal.codeGenerator.validation

class nameVariables {
	
	private static val object = newArrayList("objectId", "serialVersionUID", "objectName", "createdAt",
											"fileName", "fileSize", "tags", "filtersEType", "filters")
	private static val update = newArrayList("map", "id", "name", "tags", "eclass", "esupertype", "eabstract", "einterface", "eattribute", "ereference",
											"newXX", "oldXX", "IS", "activeFilters", "filters")
	private static val upload = newArrayList("items", "fieldName", "fileContent", "XX")
	private static val html   = newArrayList("XXs", "viewObjects", "JSON", "View", "customView", "entries", "multientries", "form", "texts", "radios",
											"hiddens", "file")
	
	private static val java = newArrayList("int", "Integer", "bool", "Boolean", "String", "Double", "Float", "List", "ArrayList", "Map", "HashMap")
	
	public static val prohibitedNames = object + update + upload + html + java
}