package Mypackage;

public class MyThread implements Runnable{
	private int ticket=100;
	
	public void run(){
		while(ticket>0)
			try {
				sale();
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

}

	private synchronized void sale() throws InterruptedException {
		if(ticket > 0){
			System.out.println(Thread.currentThread().getName()+":"+ticket--);
			//Thread.sleep(1000);
		}
		
	}
}
