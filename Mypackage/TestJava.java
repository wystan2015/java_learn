package Mypackage;

public class TestJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		MyThread t=new MyThread();
		//MyThread t2=new MyThread();
		//MyThread t3=new MyThread();
		
		Thread r1=new Thread(t);
		Thread r2=new Thread(t);
		Thread r3=new Thread(t);
		r1.start();
		r2.start();
		r3.start();
	}

}
