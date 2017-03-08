class MyThread extends Thread{
	Thread thrd;

	MyThread (String name){
		super(name);
		start();
	}

	public void run() {
		System.out.println(getName() + " Starting.");
		try{
			for(int count=0;count < 10;count++) {
				Thread.sleep(400);
				System.out.println("In "+getName()+", count is "+count);
			}
		}catch (InterruptedException exc){
			System.out.println(getName() +" interrupted.");
		}
		System.out.println(getName()+" terminating.");
	}
}
