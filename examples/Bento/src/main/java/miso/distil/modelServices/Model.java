package miso.distil.modelServices;

import miso.carrascal.cloudModelServices.abstractServices.Persistent;

import java.util.List;


/**
 * Auto-generated artifact class
 * 
 * @author miso.distil.codeGenerator
 */
public class Model extends Persistent {

	private static final long serialVersionUID = 1L;
	// Attributes
	private String namemodel;
	private List<String> type;

	// Empty constructor
	public Model() {
		super();
	}

	// Full constructor
	public Model(String objectName, long fileSize, String namemodel, List<String> type) {
	
		super(objectName, fileSize);
	
		this.namemodel = namemodel.toLowerCase();
		this.type = type;
		for(int i=0; i < this.type.size(); i++) {
			this.type.set(i, this.type.get(i).toLowerCase());
		}
	}

	// Getters and setters

	public String getNamemodel() {
		return namemodel;
	}
	
	public void setNamemodel(String namemodel) {
		this.namemodel = namemodel.toLowerCase();
	}
	public List<String> getType() {
		return type;
	}
	
	public void setType(List<String> type) {
		this.type = type;
		for(int i=0; i < this.type.size(); i++) {
			this.type.set(i, this.type.get(i).toLowerCase());
		}
	}

	// To string method

	@Override
	public String toString() {
		return 
		"(namemodel : " + namemodel.toString() + ")" + 
		"(type : " + type.toString() + ")";
	}
}
