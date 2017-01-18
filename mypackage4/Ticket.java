package mypackage4;

public class Ticket {
	int num=1;
	Ticket(int n){
		num=n;
	}
	Ticket (){
		;
	}
	 synchronized  void  sale(){
		if(num<=0){
			System.out.println("Ticket sale out");
			return;
		}
		System.out.println(Thread.currentThread().getName()+"sales:"+num);
		num--;
	}
}

