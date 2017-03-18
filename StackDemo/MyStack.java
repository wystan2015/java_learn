
interface MyStack<T> {
	public void push(T o) throws StackFullException;
	public T pop() throws StackEmptyException;
}
