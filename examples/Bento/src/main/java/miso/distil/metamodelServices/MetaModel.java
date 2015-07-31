package miso.distil.metamodelServices;

import miso.carrascal.cloudModelServices.abstractServices.Persistent;


/**
 * Auto-generated artifact class.
 * 
 * @author miso.distil.codeGenerator.
 */
public class MetaModel extends Persistent {

	private static final long serialVersionUID = 1L;
	// Attributes
	private String uri;

	/**
	 * Empty constructor.
	 */
	public MetaModel() {
		super();
	}

	/**
	 * Full constructor.
	 * 
	 * @param filename Name file. 
	 * @param filesize File size.
	* @param uri Attribute uri.
	 */
	public MetaModel(String filename, long filesize, String uri) {
	
		super(filename, filesize);
	
		this.uri = uri.toLowerCase();
	}

	/**
	 * To get uri
	 *
	 * @return uri
	 */
	public String getUri() {
		return uri;
	}
	
	/**
	 * To set uri
	 *
	 * @param uri new uri
	 */
	public void setUri(String uri) {
		this.uri = uri.toLowerCase();
	}

	// To string method

	@Override
	public String toString() {
		return super.toString() +
		"( uri : " + uri.toString() + " )";
	}
}
