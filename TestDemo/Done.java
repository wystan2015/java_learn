package producer_customer;

public class Done {
	int num;
	boolean flag = false;

	Done(int n) {
		this.num = n;
	}

	public synchronized void get() {

		if (flag) {

			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out
					.println(Thread.currentThread().getName() + " get:" + num);
		}
		flag = false;
		notify();
	}

	public synchronized void put(int n) {

		if (!flag) {

			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			this.num = n;
			System.out
					.println(Thread.currentThread().getName() + " Put:" + num);
		}
		flag = true;
		notify();
	}
}
