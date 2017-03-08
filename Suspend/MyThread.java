class MyThread implements Runnable {
	Thread thrd;
	boolean suspended;
	boolean stopped;
	
	MyThread(String name){
		thrd = new Thread(this,name);
		suspended = false;
		stopped = false;
		thrd.start();
	}

	public void run() {
		System.out.println(thrd.getName()+" starting.");
		try{
			for(int i=0;i<1000;i++){
				System.out.print(i+" ");
				if((i%10)==0){
					System.out.println();
					Thread.sleep(40);	
				}
				synchronized(this){
					while(suspended) {
						wait();
					}
					if(stopped) break;
				}
			}
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println(thrd.getName()+" exiting.");
	}

	synchronized void mystop(){
		stopped = true;
		
		//确保挂起的线程能够被停止
		suspended = false;
		notify();
	}

	synchronized void mysuspend(){
		suspended = true;
	}

	synchronized void myresume(){
		suspended = false;
		notify();
	}
}

class Suspend {
	public static void main(String[] args){
		MyThread ob1 = new MyThread("My Thread");
		
		try{
			Thread.sleep(1000);
			
			ob1.mysuspend();
			System.out.println("Suspending thread.");
			Thread.sleep(1000);
			
			ob1.myresume();
			System.out.println("Resuming thread.");
			Thread.sleep(1000);

			ob1.mysuspend();
			System.out.println("Suspending thread.");
			Thread.sleep(1000);
			
			ob1.myresume();
			System.out.println("Resuming thread.");
			Thread.sleep(1000);
			
			ob1.mysuspend();
			System.out.println("Stoping thread.");
			ob1.mystop();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		try{
			ob1.thrd.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	
		System.out.println("Main thread exiting.");
	}

}
