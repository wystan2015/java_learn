public  class Shape implements ShapeItf {
	public void move(double a,double b) {
		x += a;
		y += b;
	}
	
	public Shape() {
	
	}
	
	public Shape(double x,double y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "("+x+","+y+")";
	}
	
	public void show() {

	}
	
	protected double x = 0;
	protected double y = 0;
}
