package miso.distil.modelServices;

import miso.carrascal.cloudModelServices.abstractServices.Persistent;


/**
 * Auto-generated artifact class
 * 
 * @author miso.distil.codeGenerator
 */
public class Model extends Persistent {

	private static final long serialVersionUID = 1L;
	// Attributes
	private String namemodel;
	private String type;

	// Empty constructor
	public Model() {
		super();
	}

	// Full constructor
	public Model(String objectName, long fileSize, String namemodel, String type) {
	
		super(objectName, fileSize);
	
		this.namemodel = namemodel.toLowerCase();
		this.type = type.toLowerCase();
	}

	// Getters and setters

	public String getNamemodel() {
		return namemodel;
	}
	
	public void setNamemodel(String namemodel) {
		this.namemodel = namemodel.toLowerCase();
	}
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type.toLowerCase();
	}

	// To string method

	@Override
	public String toString() {
		return 
		"(namemodel : " + namemodel.toString() + ")" + 
		"(type : " + type.toString() + ")";
	}
}
