package miso.distil.documentServices;

import miso.carrascal.cloudModelServices.abstractServices.Persistent;

import miso.distil.entities.PersonalData;
import java.util.List;


/**
 * Auto-generated artifact class
 * 
 * @author miso.distil.codeGenerator
 */
public class Document extends Persistent {

	private static final long serialVersionUID = 1L;
	// Attributes
	private PersonalData docinfo;
	private List<String> coauthors;
	private Boolean isfinished;

	// Empty constructor
	public Document() {
		super();
	}

	// Full constructor
	public Document(String filename, long filesize, PersonalData docinfo, List<String> coauthors, Boolean isfinished) {
	
		super(filename, filesize);
	
		this.docinfo = docinfo;
		this.coauthors = coauthors;
		for(int i=0; i < this.coauthors.size(); i++) {
			this.coauthors.set(i, this.coauthors.get(i).toLowerCase());
		}
		this.isfinished = isfinished;
	}

	// Getters and setters

	public PersonalData getDocinfo() {
		return docinfo;
	}
	
	public void setDocinfo(PersonalData docinfo) {
		this.docinfo = docinfo;
	}
	public List<String> getCoauthors() {
		return coauthors;
	}
	
	public void setCoauthors(List<String> coauthors) {
		this.coauthors = coauthors;
		for(int i=0; i < this.coauthors.size(); i++) {
			this.coauthors.set(i, this.coauthors.get(i).toLowerCase());
		}
	}
	public Boolean getIsfinished() {
		return isfinished;
	}
	
	public void setIsfinished(Boolean isfinished) {
		this.isfinished = isfinished;
	}

	// To string method

	@Override
	public String toString() {
		return 
		"(docinfo : " + docinfo.toString() + ")" + 
		"(coauthors : " + coauthors.toString() + ")" + 
		"(isfinished : " + isfinished.toString() + ")";
	}
}
