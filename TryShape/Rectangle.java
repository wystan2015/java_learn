public class Rectangle extends Shape {
	
	public Rectangle(double x,double y,double e_x,double e_y) {
		super(x,y);
		this.e_x = e_x;
		this.e_y = e_y;
	}
	public void show() {
		System.out.println(this);
	}
	@Override
	public String toString() {
		return "Rectangle Diagonal:"+super.toString()+" ("+e_x+","+e_y+")";
	}
	private double e_x,e_y;

}

