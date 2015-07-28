package miso.distil.metamodelServices;

import miso.carrascal.cloudModelServices.abstractServices.Persistent;


/**
 * Auto-generated artifact class
 * 
 * @author miso.distil.codeGenerator
 */
public class MetaModel extends Persistent {

	private static final long serialVersionUID = 1L;
	// Attributes
	private String uri;

	// Empty constructor
	public MetaModel() {
		super();
	}

	// Full constructor
	public MetaModel(String filename, long filesize, String uri) {
	
		super(filename, filesize);
	
		this.uri = uri.toLowerCase();
	}

	// Getters and setters

	public String getUri() {
		return uri;
	}
	
	public void setUri(String uri) {
		this.uri = uri.toLowerCase();
	}

	// To string method

	@Override
	public String toString() {
		return 
		"(uri : " + uri.toString() + ")";
	}
}
