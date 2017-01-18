package mypackage4;

public class NewThread implements Runnable{
	Thread t;
	Ticket tc;
	People p;
	NewThread(Ticket tic,People ps){
		t=new Thread(this);
		tc=tic;
		p=ps;
		t.start();
	}
	public void run(){
		tc.sale();
	}
}
