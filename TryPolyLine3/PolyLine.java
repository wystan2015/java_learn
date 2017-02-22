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

	public void addCur(Point point) {
		polyline.addCurItem(point);
	}
	
	public void addCur(double x,double y) {
		polyline.addCurItem(new Point(x,y));
	}
	
	public void delCur() {
		polyline.delCurItem();
	}
	
	public void getHead() {
		polyline.getFirst();
	}
	
	public void getNext() {
		polyline.getNext();
	}
	
	@Override
	public String toString() {
		StringBuffer  str = new StringBuffer("Polyline:");
		Point point = (Point) polyline.getFirst();
		
		while(point != null) {
			str.append(" ("+point+") ");
			point = (Point)polyline.getNext();
		}

		str.append("\nPolyline from end to start:");
		
		point = (Point) polyline.getEnd();
		while(point != null) {
			str.append(" ("+point+") ");
			point = (Point)polyline.getFront();
		}
		return str.toString();
	}
	private LinkedList polyline;	

}
