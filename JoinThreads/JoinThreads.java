class JoinThreads{
	public static  void main(String args[]) {
		System.out.println("Main thread starting.");
		
		//创建一个可运行的对象
		MyThread mt1 = new MyThread("Child #1");
		MyThread mt2 = new MyThread("Child #2");
		MyThread mt3 = new MyThread("Child #3");
		MyThread mt4 = new MyThread("Child #4");
		MyThread mt5 = new MyThread("Child #5");
		
		try{
			mt1.thrd.join();
			System.out.println("Child #1 joined");
			mt2.thrd.join();
			System.out.println("Child #2 joined");
			mt3.thrd.join();
			System.out.println("Child #3 joined");
			mt4.thrd.join();
			System.out.println("Child #4 joined");
			mt5.thrd.join();
			System.out.println("Child #5 joined");
	}catch (InterruptedException e){
			e.printStackTrace();
		}	
		System.out.println("Main thread ending.");
	}

}
