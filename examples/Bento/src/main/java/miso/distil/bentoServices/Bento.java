package miso.distil.bentoServices;

import miso.carrascal.cloudModelServices.abstractServices.Persistent;

import java.util.List;


/**
 * Auto-generated artifact class.
 * 
 * @author miso.distil.codeGenerator.
 */
public class Bento extends Persistent {

	private static final long serialVersionUID = 1L;
	// Attributes
	private List<String> inputconcepts;
	private List<String> outputconcepts;
	private List<String> atl;
	private List<String> tags;

	/**
	 * Empty constructor.
	 */
	public Bento() {
		super();
	}

	/**
	 * Full constructor.
	 * 
	 * @param filename Name file. 
	 * @param filesize File size.
	* @param inputconcepts Attribute inputconcepts.
	* @param outputconcepts Attribute outputconcepts.
	* @param atl Attribute atl.
	* @param tags Attribute tags.
	 */
	public Bento(String filename, long filesize, List<String> inputconcepts, List<String> outputconcepts, List<String> atl, List<String> tags) {
	
		super(filename, filesize);
	
		this.inputconcepts = inputconcepts;
		for(int i=0; i < this.inputconcepts.size(); i++) {
			this.inputconcepts.set(i, this.inputconcepts.get(i).toLowerCase());
		}
		this.outputconcepts = outputconcepts;
		for(int i=0; i < this.outputconcepts.size(); i++) {
			this.outputconcepts.set(i, this.outputconcepts.get(i).toLowerCase());
		}
		this.atl = atl;
		for(int i=0; i < this.atl.size(); i++) {
			this.atl.set(i, this.atl.get(i).toLowerCase());
		}
		this.tags = tags;
		for(int i=0; i < this.tags.size(); i++) {
			this.tags.set(i, this.tags.get(i).toLowerCase());
		}
	}

	/**
	 * To get inputconcepts
	 *
	 * @return inputconcepts
	 */
	public List<String> getInputconcepts() {
		return inputconcepts;
	}
	
	/**
	 * To set inputconcepts
	 *
	 * @param inputconcepts new inputconcepts
	 */
	public void setInputconcepts(List<String> inputconcepts) {
		this.inputconcepts = inputconcepts;
		for(int i=0; i < this.inputconcepts.size(); i++) {
			this.inputconcepts.set(i, this.inputconcepts.get(i).toLowerCase());
		}
	}
	/**
	 * To get outputconcepts
	 *
	 * @return outputconcepts
	 */
	public List<String> getOutputconcepts() {
		return outputconcepts;
	}
	
	/**
	 * To set outputconcepts
	 *
	 * @param outputconcepts new outputconcepts
	 */
	public void setOutputconcepts(List<String> outputconcepts) {
		this.outputconcepts = outputconcepts;
		for(int i=0; i < this.outputconcepts.size(); i++) {
			this.outputconcepts.set(i, this.outputconcepts.get(i).toLowerCase());
		}
	}
	/**
	 * To get atl
	 *
	 * @return atl
	 */
	public List<String> getAtl() {
		return atl;
	}
	
	/**
	 * To set atl
	 *
	 * @param atl new atl
	 */
	public void setAtl(List<String> atl) {
		this.atl = atl;
		for(int i=0; i < this.atl.size(); i++) {
			this.atl.set(i, this.atl.get(i).toLowerCase());
		}
	}
	/**
	 * To get tags
	 *
	 * @return tags
	 */
	public List<String> getTags() {
		return tags;
	}
	
	/**
	 * To set tags
	 *
	 * @param tags new tags
	 */
	public void setTags(List<String> tags) {
		this.tags = tags;
		for(int i=0; i < this.tags.size(); i++) {
			this.tags.set(i, this.tags.get(i).toLowerCase());
		}
	}

	// To string method

	@Override
	public String toString() {
		return super.toString() +
		"( inputconcepts : " + inputconcepts.toString() + " ) " + 
		"( outputconcepts : " + outputconcepts.toString() + " ) " + 
		"( atl : " + atl.toString() + " ) " + 
		"( tags : " + tags.toString() + " )";
	}
}
