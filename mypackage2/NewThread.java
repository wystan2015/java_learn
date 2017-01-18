package mypackage2;

public class NewThread implements Runnable{
	String s;
	int ticket=10;
	
	NewThread(String str){
		s=str;
	}
	/**
	 * ÂôÆ±
	 */
	private synchronized void sale(){
		try{
			while(ticket>0){
			System.out.println(Thread.currentThread().getName()+"sale:"+ticket--);
			Thread.sleep(1);
			}
		}catch (InterruptedException e){
			System.out.println(Thread.currentThread().getName()+"Interrupted");
		}
		
		System.out.println(Thread.currentThread().getName()+"exiting");
	}
	public void run(){
		sale();
	}
}
