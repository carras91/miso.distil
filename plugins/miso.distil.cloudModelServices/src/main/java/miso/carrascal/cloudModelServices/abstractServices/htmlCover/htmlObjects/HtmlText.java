package miso.carrascal.cloudModelServices.abstractServices.htmlCover.htmlObjects;

public class HtmlText {
	
	private String name;
	private String value;
	private String label;
	private String id;
	private String placeHolder;
	
	public HtmlText(String name, String value, String label, String id, String placeHolder) {
		this.name = name;
		this.value = value;
		this.label = label;
		this.id = id;
		this.placeHolder = placeHolder;		
	}

	public String getName() {
		return name;
	}
	
	public String getValue() {
		return value;
	}

	public String getLabel() {
		return label;
	}

	public String getId() {
		return id;
	}

	public String getPlaceHolder() {
		return placeHolder;
	}
	
}
