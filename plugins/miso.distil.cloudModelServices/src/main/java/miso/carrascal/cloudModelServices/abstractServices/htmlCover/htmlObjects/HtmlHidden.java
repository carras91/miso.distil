package miso.carrascal.cloudModelServices.abstractServices.htmlCover.htmlObjects;

public class HtmlHidden {
	
	private String name;
	private String value;
	
	public HtmlHidden(String name, String value) {
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}
	
	public String getValue() {
		return value;
	}	
}
