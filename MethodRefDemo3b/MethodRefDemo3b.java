interface IntPredicate {
	boolean test(int n);
}

class MyIntNum{
	private int v;
	MyIntNum(int x){
		v = x;
	}
	int getNum(){return v;}	
	static boolean isFactor(int n){
		//return (v %n) == 0; 静态方法不能引用非静态成员
		return n/(n+1)>5;
	}
}

public class MethodRefDemo3b {
	public static void main(String[] args){
		boolean result;
		MyIntNum myNum = new MyIntNum(12);
	
		IntPredicate ip = MyIntNum::isFactor;

		result = ip.test(3);
		if(result) System.out.println("3 is a factor of "+myNum.getNum());
		
	}
}

