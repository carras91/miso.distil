package miso.carrascal.cloudModelServices.abstractServices.filter;

public enum EType {	
	EClass, 
	EAbstract,
	EInterface,
	ESuperType,
	EAttribute,
	EReference;
	
	@Override
	public String toString() {
		switch(this) {
			case EClass:
				return "EClass";
			case EAbstract:
				return "EAbstract";
			case EInterface:
				return "EInterface";
			case ESuperType:
				return "ESuperType";
			case EAttribute:
				return "EAttribute";
			case EReference:
				return "EReference";		
		}
		
		return null;
	}
}
