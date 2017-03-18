
public class StackDemo {
	public static void main(String[] args){
		Integer iob[] =new Integer[10];
		Stack<Integer> ist = new Stack<Integer>(iob);
		try{
			for(int i=0;i<4;i++){
				ist.push(i);
			}
		}catch (StackFullException e){
			System.out.println(e);
		}

		System.out.println();
		try{
			for(int i=0;i<5;i++){
				System.out.println("pop:"+ist.pop());
			}
		}catch(StackEmptyException e){
			System.out.println(e);
		}
		System.out.println();
	}
}

