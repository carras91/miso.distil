package miso.carrascal.cloudModelServices.utils;

/*
 * Custom exception (argument's control)
 * 
 *  @author Carlos Carrascal
 */
public class NullArgumentException extends Exception {
	
	private static final long serialVersionUID = 1L;
	private static final String errorString = "Invalid null argument";
	
	public NullArgumentException() {
		super(errorString);
	}
	
	public NullArgumentException(String message) {
		super(message);
	}
	
	public NullArgumentException(Throwable cause) {
		super(cause);
	}
	
	public NullArgumentException(String message, Throwable cause) {
		super(message, cause);
	}
}
