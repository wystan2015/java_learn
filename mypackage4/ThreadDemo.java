package mypackage4;

public class ThreadDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ticket tt = new Ticket(3);
		People ps = new People();
		NewThread t1 = new NewThread(tt,ps);
		NewThread t2 = new NewThread(tt,ps);

		try {
			t1.t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			t2.t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
