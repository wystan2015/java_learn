import  java.util.Random;
public class TryShape2 {
	public static void main(String [] args) {
		Shape s[]={new Line(1,2,3,4),new Circle(5,6,10),new Rectangle(9,8,7,6)};
		Random rand = new Random();
		for(int i = 0;i<10;i++) {
			s[rand.nextInt(3)].show();
		}

	}

}
