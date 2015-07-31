package miso.distil.atltrafoServices;

import miso.carrascal.cloudModelServices.abstractServices.Persistent;


/**
 * Auto-generated artifact class.
 * 
 * @author miso.distil.codeGenerator.
 */
public class ATLTrafo extends Persistent {

	private static final long serialVersionUID = 1L;
	// Attributes
	private String nameatl;

	/**
	 * Empty constructor.
	 */
	public ATLTrafo() {
		super();
	}

	/**
	 * Full constructor.
	 * 
	 * @param filename Name file. 
	 * @param filesize File size.
	* @param nameatl Attribute nameatl.
	 */
	public ATLTrafo(String filename, long filesize, String nameatl) {
	
		super(filename, filesize);
	
		this.nameatl = nameatl.toLowerCase();
	}

	/**
	 * To get nameatl
	 *
	 * @return nameatl
	 */
	public String getNameatl() {
		return nameatl;
	}
	
	/**
	 * To set nameatl
	 *
	 * @param nameatl new nameatl
	 */
	public void setNameatl(String nameatl) {
		this.nameatl = nameatl.toLowerCase();
	}

	// To string method

	@Override
	public String toString() {
		return super.toString() +
		"( nameatl : " + nameatl.toString() + " )";
	}
}
