package miso.carrascal.cloudModelServices.abstractServices.htmlCover.htmlObjects;

public class HtmlSelectBox {

	private String label;
	private String value;
	
	public HtmlSelectBox(String label, String value) {
		this.label = label;
		this.value = value;
	}

	public String getLabel() {
		return label;
	}

	public String getValue() {
		return value;
	}	
}
