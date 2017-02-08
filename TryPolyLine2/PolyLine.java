public class PolyLine {
	public PolyLine(double[][] coords) {
		Point[] points = new Point[coords.length];
		
		for (int i =0;i<coords.length;++i) {
			points[i] = new Point(coords[i][0],coords[i][1]);
		}
		polyline = new LinkedList(points);
	}
	
	public PolyLine(Point[] points) {
		polyline = new LinkedList(points);
	}
	
	public void addPoint(Point point) {
		polyline.addItem(point);
	}
	
	public void addPoint(double x ,double y) {
		polyline.addItem(new Point(x,y));
	}
	
	@Override
	public String toString() {
		StringBuffer  str = new StringBuffer("Polyline:");
		Point point = (Point) polyline.getFirst();

		while(point != null) {
			str.append(" ("+point+") ");
			point = (Point)polyline.getNext();
		}
		return str.toString();
	}
	private LinkedList polyline;	

}
