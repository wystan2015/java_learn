class SumArray {
	private int sum;
	
	int sumArray(int nums[]) {
		sum = 0;
		for(int i=0;i<nums.length;i++){
			sum += nums[i];
			System.out.println("Running total for "+Thread.currentThread().getName()+" is "+sum);
		}
		try{
			Thread.sleep(100);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		return sum;
	}
	
	void pri(){
		for(int j=0;j<10;j++){
			System.out.println(Thread.currentThread().getName()+":j="+j);
			try{
				Thread.sleep(400);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		
	}
}

class MyThread implements Runnable {
	Thread thrd;
	static SumArray sa = new SumArray();
	int a[];
	int answer;
	
	MyThread(String name,int nums[]) {
		thrd = new Thread(this,name);
		a = nums;
		thrd.start();
	}

	public void run(){
		int sum;
		System.out.println(thrd.getName()+" starting..");
		synchronized (sa){
			answer = sa.sumArray(a);//放在synchronized代码块中执行
		}
		sa.pri();//没有在synchronized代码块中执行
		System.out.println("Sum for "+thrd.getName()+" is "+answer);
		System.out.println(thrd.getName()+" terminating.");
	}
}

class Sync2{
	public static void main(String[] args){
		int a[] = {1,2,3,4,5};
		MyThread mt1 = new MyThread("Child #1",a);
		MyThread mt2 = new MyThread("Child #2",a);
		try{
			mt1.thrd.join();
			mt2.thrd.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}

}
