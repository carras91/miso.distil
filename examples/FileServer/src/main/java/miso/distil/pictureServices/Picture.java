package miso.distil.pictureServices;

import miso.carrascal.cloudModelServices.abstractServices.Persistent;

import miso.distil.entities.PersonalData;
import java.util.List;


/**
 * Auto-generated artifact class
 * 
 * @author miso.distil.codeGenerator
 */
public class Picture extends Persistent {

	private static final long serialVersionUID = 1L;
	// Attributes
	private PersonalData pictureinfo;
	private List<String> peoplepictured;
	private String place;
	private Boolean edited;

	// Empty constructor
	public Picture() {
		super();
	}

	// Full constructor
	public Picture(String filename, long filesize, PersonalData pictureinfo, List<String> peoplepictured, String place, Boolean edited) {
	
		super(filename, filesize);
	
		this.pictureinfo = pictureinfo;
		this.peoplepictured = peoplepictured;
		for(int i=0; i < this.peoplepictured.size(); i++) {
			this.peoplepictured.set(i, this.peoplepictured.get(i).toLowerCase());
		}
		this.place = place.toLowerCase();
		this.edited = edited;
	}

	// Getters and setters

	public PersonalData getPictureinfo() {
		return pictureinfo;
	}
	
	public void setPictureinfo(PersonalData pictureinfo) {
		this.pictureinfo = pictureinfo;
	}
	public List<String> getPeoplepictured() {
		return peoplepictured;
	}
	
	public void setPeoplepictured(List<String> peoplepictured) {
		this.peoplepictured = peoplepictured;
		for(int i=0; i < this.peoplepictured.size(); i++) {
			this.peoplepictured.set(i, this.peoplepictured.get(i).toLowerCase());
		}
	}
	public String getPlace() {
		return place;
	}
	
	public void setPlace(String place) {
		this.place = place.toLowerCase();
	}
	public Boolean getEdited() {
		return edited;
	}
	
	public void setEdited(Boolean edited) {
		this.edited = edited;
	}

	// To string method

	@Override
	public String toString() {
		return 
		"(pictureinfo : " + pictureinfo.toString() + ")" + 
		"(peoplepictured : " + peoplepictured.toString() + ")" + 
		"(place : " + place.toString() + ")" + 
		"(edited : " + edited.toString() + ")";
	}
}
