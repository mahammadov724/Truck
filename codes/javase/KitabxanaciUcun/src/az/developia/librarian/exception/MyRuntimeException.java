package az.developia.librarian.exception;

public class MyRuntimeException extends Exception {
	
	private String myMessage;

	public MyRuntimeException(String mes) {
		this.myMessage=mes;
	}
	
	public String getMyMessage() {
		return myMessage;
	}
}
