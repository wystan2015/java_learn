public class Circle extends Shape {
	
	public Circle(double x,double y,double length) {
		super(x,y);
		this.length = length;
	}
	public void show() {
		System.out.println(this);
	}
	@Override
	public String toString() {
		return "The Centre of the Circle"+super.toString()+"Radius:"+length;
	}
	private double length;

}

