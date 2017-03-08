class UseThreads2 {
	public static  void main(String args[]) {
		System.out.println("Main thread starting.");
		
		//创建一个可运行的对象
		MyThread mt1 = new MyThread("Child #1");
		MyThread mt2 = new MyThread("Child #2");
		
		//在该对象上构造一个线程
		Thread newThread1 = new Thread(mt1);
		Thread newThread2 = new Thread(mt2);
		
		//开始运行线程
		newThread1.start();
		newThread2.start();

		for(int i=0;i<50;i++) {
			System.out.print(".");
			try{
				Thread.sleep(100);
			}catch(InterruptedException exc) {
				System.out.println("Main thread interrupted.");
			}
		}
		System.out.println("Main thread ending.");
	}

}
