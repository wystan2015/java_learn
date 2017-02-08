public class Rectangle {
	private Point tlft;
	private Point rlow;
	
	public Rectangle() {
		
	}
	
	public void setLeft(int x,int y) {
		tlft = new Point(x,y);
	}

	public void setRight(int x,int y) {
		rlow = new Point(x,y);
	}

	public String toString() {
		String str="left point:"+tlft+"\tright point:"+rlow;
		return str;
	}


}


class Point {

	private int x;
	private int y;

	public Point (int xp,int yp) {
		this.x = xp;
		this.y = yp;
	}
	public Point () {
		this.x = 0;
		this.y = 0;
	}
	
	public String toString() {
		String name="("+x+","+y+")";
		return name;
	}

}
