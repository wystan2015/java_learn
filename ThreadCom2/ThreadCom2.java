class TickTock {
	String state;
	
	synchronized void tick (boolean running) {
		if(!running){
			//stop the clock
			state = "ticked";
			notify();
			return;
		}
		System.out.print("Tick ");
		state = "ticked"; //set the current state to ticked
		
		notify();

		try{
			while(!state.equals("tocked")) {
				wait();
			}
		}catch (InterruptedException e){
			e.printStackTrace();
		}
	}
	
	synchronized void tock(boolean running) {
		if(!running) {
			state = "tocked";
			notify();
			return;
		}
		
		System.out.println("Tock");
		
		state = "tocked";
		notify();
		try{
			while(!state.equals("ticked")){
				wait();
			}
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}



class MyThread implements Runnable {
	Thread thrd;
	TickTock ttOb;

	//Construct a new thread.
	MyThread(String name ,TickTock tt){
		thrd = new Thread(this,name);
		ttOb = tt;
		thrd.start();
	}

	public void run() {
		if(thrd.getName().compareTo("Tick")==0){
			for(int i = 0;i<5;i++) ttOb.tick(true);
			ttOb.tick(false);
		}else {
			for(int i=0;i<5;i++) ttOb.tock(true);
			ttOb.tock(false);
		}
	}
}



class ThreadCom2{
	public static void main(String[] args){
		TickTock tt = new TickTock();
		MyThread mt1 = new MyThread("Tick",tt);
		MyThread mt2 = new MyThread("Tock",tt);

		try{
			mt1.thrd.join();
			mt2.thrd.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
