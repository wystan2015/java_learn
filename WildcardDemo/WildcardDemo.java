
public class WildcardDemo {
	public static void main(String[] args){
		NumericFns<Integer> iob = new NumericFns<Integer>(6);
		
		NumericFns<Double> dob = new NumericFns<Double>(-6.0);

		NumericFns<Long> lob = new NumericFns<Long>(5L);

		System.out.println("Testing iob and dob.");
		if(iob.absEqual(dob)){
			System.out.println("Absolute values are equal.");
		}else {
			System.out.println("Absolute values differ.");
		}
		
		System.out.println();

		System.out.println("Testing iob and lob.");
		if(iob.absEqual(lob)){
			System.out.println("Absolute values are equal.");
		}else {
			System.out.println("Absolute values differ.");
		}
	}
}

