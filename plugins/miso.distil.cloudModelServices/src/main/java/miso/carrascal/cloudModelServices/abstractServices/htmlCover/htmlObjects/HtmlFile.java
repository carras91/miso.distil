package miso.carrascal.cloudModelServices.abstractServices.htmlCover.htmlObjects;

public class HtmlFile {
	
	private String name;
	private String label;
	private String id;
	
	public HtmlFile(String name, String label, String id) {
		this.name = name;
		this.label = label;
		this.id = id;	
	}

	public String getName() {
		return name;
	}

	public String getLabel() {
		return label;
	}

	public String getId() {
		return id;
	}	
}
