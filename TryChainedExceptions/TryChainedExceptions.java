public class TryChainedExceptions {
	public static int divide(int[] array,int index) throws ZeroDivideException {
		try{
			System.out.println("\nFirst try block in divide() entered");
			array[index] = array[index+2]/array[index+1];
			System.out.println("Code at end of fi rst try block in divide()");
			return array[index+2];
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic exception caught in divide()");
			ZeroDivideException zde = new ZeroDivideException(index+1,e);
			System.out.println("Throwing ZeroDivideException");
			throw zde;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Index-out-of-bounds index exception caught in divide()");
		}
		System.out.println("Executing code after try block in divide()");
		return array[index];
	}
	
	public static void main(String[] args) {
		int[] x = {10,5,0,3,12,0,6};
		System.out.println("Values:");
		for(int xValue : x) {
			System.out.print(" "+xValue);
		}
		System.out.println();
		for (int i = 0;i<x.length;++i) {
			try{
				System.out.println("First try block in main() entered");
				System.out.println("result ="+divide(x,i));
			} catch (ZeroDivideException e){
				System.out.println("\nZeroDivideException caught in main()");
				int index = e.getIndex();
				if(index > 0) {
					x[index] = 1;
					x[index +1] = x[index-1];
					e.printStackTrace();
					System.err.println("Zero divisor at x["+index+"] corrected to "+x[index]);
				}
			} catch (ArithmeticException e) {
				System.out.println("Arithmetic exception caught in main()");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Index-out-of-bounds exception caught in main()");
			}
			System.out.println("Outside first try block in main()");
		}
		System.out.print("Values: ");
		for(int xValue : x) {
			System.out.print(" " + xValue);
		}
		System.out.println();
	}
} 
