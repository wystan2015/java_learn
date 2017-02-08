public class TryRectangle {
	public static void main(String[] args) {

		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		Rectangle r3 = new Rectangle();
		Rectangle r4 = new Rectangle();
		
		r1.setLeft(0,0);
		r1.setRight(10,10);
		
		r2.setLeft(1,1);
		r2.setRight(12,21);
		
		r3.setLeft(2,3);
		r3.setRight(13,31);
	
		r4.setLeft(4,5);
		r4.setRight(14,41);

		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
	}


}
