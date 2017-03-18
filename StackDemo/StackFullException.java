
public class StackFullException extends Exception{
	int val;
	public StackFullException(int n){
		val = n;
	}
	
	@Override
	public String toString(){
		return "\nStack is full "+val;
	}
}
