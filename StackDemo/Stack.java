
public class Stack<T> implements MyStack<T> {
	private T[] ob;
	int loc;
	public Stack(T[] o){
		ob = o;
		loc = 0;
	}
	
	@Override	
	public void push(T o) throws StackFullException {
		if(loc == ob.length){
			throw new StackFullException(loc);
		}
		ob[loc++] = o;
	}
	
	@Override
	public T pop() throws StackEmptyException{
		if(loc == 0){
			throw new StackEmptyException();
		}
		return ob[--loc];
	}
}
