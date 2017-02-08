public class Point {
	public Point(double xVal,double yVal) {
		x = xVal;
		y = yVal;
	}

	public Point (Point point) {
		x = point.x;
		y = point.y;
	}
	
	@Override
	public String toString() {
		return x+","+y;
	}
	
	protected double x;
	protected double y;
}
