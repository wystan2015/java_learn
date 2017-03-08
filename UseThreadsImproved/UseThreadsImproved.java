class UseThreadsImproved {
	public static  void main(String args[]) {
		System.out.println("Main thread starting.");
		
		//创建一个可运行的对象
		MyThread mt = new MyThread("Child #1");
		
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
