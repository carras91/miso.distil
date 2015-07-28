package miso.distil.videoServices;

import miso.carrascal.cloudModelServices.abstractServices.Persistent;

import miso.distil.entities.PersonalData;

/**
 * Auto-generated artifact class
 * 
 * @author miso.distil.codeGenerator
 */
public class Video extends Persistent {

	private static final long serialVersionUID = 1L;
	// Attributes
	private PersonalData videoinfo;
	private Double length;

	// Empty constructor
	public Video() {
		super();
	}

	// Full constructor
	public Video(String filename, long filesize, PersonalData videoinfo, Double length) {
	
		super(filename, filesize);
	
		this.videoinfo = videoinfo;
		this.length = length;
	}

	// Getters and setters

	public PersonalData getVideoinfo() {
		return videoinfo;
	}
	
	public void setVideoinfo(PersonalData videoinfo) {
		this.videoinfo = videoinfo;
	}
	public Double getLength() {
		return length;
	}
	
	public void setLength(Double length) {
		this.length = length;
	}

	// To string method

	@Override
	public String toString() {
		return 
		"(videoinfo : " + videoinfo.toString() + ")" + 
		"(length : " + length.toString() + ")";
	}
}
