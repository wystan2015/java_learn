public class ZeroDivideException extends Exception {
	private int index = -1;
	
	public ZeroDivideException() {}
	
	public ZeroDivideException (String s,Throwable cause) {
		super(s,cause);
	}
	
	public ZeroDivideException (int index,Throwable cause) {
		super(cause);
		this.index = index;
	}
	
	public int getIndex() {
		return index;
	}

}
