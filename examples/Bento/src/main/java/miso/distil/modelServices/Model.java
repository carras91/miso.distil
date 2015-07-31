package miso.distil.modelServices;

import miso.carrascal.cloudModelServices.abstractServices.Persistent;


/**
 * Auto-generated artifact class.
 * 
 * @author miso.distil.codeGenerator.
 */
public class Model extends Persistent {

	private static final long serialVersionUID = 1L;
	// Attributes
	private String namemodel;
	private String type;

	/**
	 * Empty constructor.
	 */
	public Model() {
		super();
	}

	/**
	 * Full constructor.
	 * 
	 * @param filename Name file. 
	 * @param filesize File size.
	* @param namemodel Attribute namemodel.
	* @param type Attribute type.
	 */
	public Model(String filename, long filesize, String namemodel, String type) {
	
		super(filename, filesize);
	
		this.namemodel = namemodel.toLowerCase();
		this.type = type.toLowerCase();
	}

	/**
	 * To get namemodel
	 *
	 * @return namemodel
	 */
	public String getNamemodel() {
		return namemodel;
	}
	
	/**
	 * To set namemodel
	 *
	 * @param namemodel new namemodel
	 */
	public void setNamemodel(String namemodel) {
		this.namemodel = namemodel.toLowerCase();
	}
	/**
	 * To get type
	 *
	 * @return type
	 */
	public String getType() {
		return type;
	}
	
	/**
	 * To set type
	 *
	 * @param type new type
	 */
	public void setType(String type) {
		this.type = type.toLowerCase();
	}

	// To string method

	@Override
	public String toString() {
		return super.toString() +
		"( namemodel : " + namemodel.toString() + " ) " + 
		"( type : " + type.toString() + " )";
	}
}
