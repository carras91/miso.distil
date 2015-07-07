package miso.carrascal.cloudModelServices.abstractServices.htmlCover.htmlObjects;

public class HtmlForm {
	
	private String url;
	private String id;
	private String enctype;
	private String button;
	private String method;
	
	public HtmlForm(String url, String id, String enctype, String button, String method) {
		this.url = url;
		this.id = id;
		this.enctype = enctype;
		this.button = button;
		this.method = method;
	}

	public final String getUrl() {
		return url;
	}

	public final String getId() {
		return id;
	}

	public final String getEnctype() {
		return enctype;
	}

	public final String getButton() {
		return button;
	}
	
	public final String getMethod() {
		return method;
	}
}
