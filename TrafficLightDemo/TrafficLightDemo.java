class TrafficLightDemo{
	public static void main(String[] args){
		TrafficLightSimulator t1 = new TrafficLightSimulator(TrafficLightColor.GREEN);
		for(int i=0;i<9;i++){
			t1.waitForChange();
		}
		t1.cancel();
	}
}


enum TrafficLightColor {
	RED,GREEN,YELLOW
}

class TrafficLightSimulator implements Runnable {
	private Thread thrd;
	private TrafficLightColor tlc;
	boolean stop = false;
	boolean changed = false;

	TrafficLightSimulator(TrafficLightColor init){
		tlc = init;
		thrd = new Thread(this,"thread #1");
		thrd.start();
	}

	TrafficLightSimulator(){
		tlc = TrafficLightColor.RED;
		thrd = new Thread(this);
		thrd.start();
	}
	
	//start up the light.
	public void run(){
		while(!stop){
			try{
				switch(tlc) {
					case GREEN:
						Thread.sleep(1000);
						break;
					case YELLOW:
						Thread.sleep(1000);
						break;
					case RED:
						Thread.sleep(1000);
						break;
				}
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println("now color is:"+getColor());
			changeColor();
		}
	}
	synchronized void changeColor(){
		switch(tlc){
			case RED:
				tlc = TrafficLightColor.GREEN;
				break;
			case YELLOW:
				tlc = TrafficLightColor.RED;
				break;
			case GREEN:
				tlc = TrafficLightColor.YELLOW;
				break;
		}
		changed = true;
		notify();
	}
	
	synchronized void waitForChange(){
		try{
			while(!changed) { 
				System.out.println(thrd.getName()+" comming to wait");
				wait();
			} //第一次调用t1.waitForChange()方法时候线程不是进入睡眠了吗，在哪里唤醒，为什么能够唤醒？
			changed = false;
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}

	TrafficLightColor getColor(){
		return tlc;
	}

	void cancel(){
		stop = true;
	}

}
