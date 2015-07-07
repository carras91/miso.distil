package miso.carrascal.cloudModelServices.abstractServices.htmlCover.htmlObjects;

public class HtmlRadio {
	
	private String name;
	private String label;
	private String id;
	private Boolean checked;
	
	public HtmlRadio(String name, String label, String id, Boolean checked) {
		this.name = name;
		this.label = label;
		this.id = id;	
		this.checked = checked;
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

	public Boolean getChecked() {
		return checked;
	}	
}
