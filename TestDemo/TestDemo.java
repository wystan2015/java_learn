package producer_customer;

public class TestDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Done d = new Done(1);
		Procuder p = new Procuder(d,"Procuder");
		Customer c = new Customer(d,"Customer");
		
	
		try {
			c.t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		try {
			p.t.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
