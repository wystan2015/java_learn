
public class VarCapture {
	public static void main(String[] args){
		int num = 10;
		
		MyFunc mylamdba = (n)->{
			int v = num+n;
			//num++;
			return v;
		};

		System.out.println(mylamdba.func(8));
		
		//num = 9;
	}
}

