package miso.distil.entities;

import java.util.List;

/**
 * Auto-generated entity class
 * 
 * @author miso.distil.codeGenerator
 */
public class PersonalData {

	// Attributes
	private String author;
	private String source;
	private List<String> tags;
	private String fileextension;

	// Empty constructor
	public PersonalData() {}
	
	// Full constructor
	public PersonalData(String author, String source, List<String> tags, String fileextension) {
	
		this.author = author.toLowerCase();
		this.source = source.toLowerCase();
		this.tags = tags;
		for(int i=0; i < this.tags.size(); i++) {
			this.tags.set(i, this.tags.get(i).toLowerCase());
		}
		this.fileextension = fileextension.toLowerCase();
	}

	// Getters and setters

	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author.toLowerCase();
	}
	public String getSource() {
		return source;
	}
	
	public void setSource(String source) {
		this.source = source.toLowerCase();
	}
	public List<String> getTags() {
		return tags;
	}
	
	public void setTags(List<String> tags) {
		this.tags = tags;
		for(int i=0; i < this.tags.size(); i++) {
			this.tags.set(i, this.tags.get(i).toLowerCase());
		}
	}
	public String getFileextension() {
		return fileextension;
	}
	
	public void setFileextension(String fileextension) {
		this.fileextension = fileextension.toLowerCase();
	}

	// To string method

	@Override
	public String toString() {
		return 
		"(author : " + author.toString() + ")" + 
		"(source : " + source.toString() + ")" + 
		"(tags : " + tags.toString() + ")" + 
		"(fileextension : " + fileextension.toString() + ")";
	}
}
