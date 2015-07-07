package miso.carrascal.cloudModelServices.abstractServices.htmlCover.htmlObjects;

public enum EntrySize {	
	H1, 
	H2,
	H3,
	H4,
	H5,
	P;
	
	@Override
	public String toString() {
		switch(this) {
			case H1:
				return "H1";
			case H2:
				return "H2";
			case H3:
				return "H3";
			case H4:
				return "H4";
			case H5:
				return "H5";
			case P:
				return "P";		
		}
		
		return null;
	}
}
