package miso.carrascal.cloudModelServices.abstractServices.htmlCover.htmlObjects;

public class HtmlLayout {
	
	private String label;
	private String href;
	
	public HtmlLayout(String label, String href) {
		this.label = label;
		this.href = href;
	}

	public String getLabel() {
		return label;
	}

	public String getHref() {
		return href;
	}	
}
