package producer_customer;

public class Procuder implements Runnable {
	Thread t;
	String name;
	Done go;
	int ticket = 1;

	Procuder(Done d, String name) {
		this.name = name;
		t = new Thread(this, name);
		go = d;
		t.start();
	}

	public void run() {
		for(ticket=0;ticket<10;ticket++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Producet:"+ticket);
			go.put(ticket);
			
		}
	}
}
