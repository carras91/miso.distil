package miso.distil.atltrafoServices;

import miso.carrascal.cloudModelServices.abstractServices.Persistent;


/**
 * Auto-generated artifact class
 * 
 * @author miso.distil.codeGenerator
 */
public class ATLTrafo extends Persistent {

	private static final long serialVersionUID = 1L;
	// Attributes
	private String nameatl;

	// Empty constructor
	public ATLTrafo() {
		super();
	}

	// Full constructor
	public ATLTrafo(String objectName, long fileSize, String nameatl) {
	
		super(objectName, fileSize);
	
		this.nameatl = nameatl.toLowerCase();
	}

	// Getters and setters

	public String getNameatl() {
		return nameatl;
	}
	
	public void setNameatl(String nameatl) {
		this.nameatl = nameatl.toLowerCase();
	}

	// To string method

	@Override
	public String toString() {
		return 
		"(nameatl : " + nameatl.toString() + ")";
	}
}
