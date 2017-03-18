
public class MethodRefDemo2 {
	static boolean numTest(IntPredicate p,int v){
		return p.test(v);
	}
	public static void main(String[] args){
		IntPredicate p=MyIntPredicates::isPrime;
		if(p.test(17)) System.out.println("17 is prime.");	
	}
}

