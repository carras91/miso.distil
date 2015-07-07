package miso.carrascal.cloudModelServices.abstractServices.htmlCover.htmlObjects;

public class HtmlEntry {
	
	private String value;
	private EntrySize size;
	
	public HtmlEntry(String value, EntrySize size) {
		this.value = value;
		this.size = size;
	}
	
	public String getValue() {
		return value;
	}
	
	public Boolean isH1() {
		if(EntrySize.H1.equals(size))
			return true;
		else
			return false;
	}
	
	public Boolean isH2() {
		if(EntrySize.H2.equals(size))
			return true;
		else
			return false;
	}
	
	public Boolean isH3() {
		if(EntrySize.H3.equals(size))
			return true;
		else
			return false;
	}
	
	public Boolean isH4() {
		if(EntrySize.H4.equals(size))
			return true;
		else
			return false;
	}
	
	public Boolean isH5() {
		if(EntrySize.H5.equals(size))
			return true;
		else
			return false;
	}
	
	public Boolean isP() {
		if(EntrySize.P.equals(size))
			return true;
		else
			return false;
	}
}
