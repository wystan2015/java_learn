package producer_customer;

public class Customer implements Runnable {
	Thread t;
	String name;
	Done go;

	Customer(Done d, String name) {
		this.name = name;
		t = new Thread(this, name);
		go = d;
		t.start();
	}

	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			go.get();
			
		}
	}
}
