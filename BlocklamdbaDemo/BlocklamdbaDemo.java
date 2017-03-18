interface good{
	String getstr(int n,boolean boo);
}

interface bad{
	double getd(double n);
}
public class BlocklamdbaDemo{

		public static void main(String[] args){
		good g=(n,boo)-> {
		//	boo==true?"good boy "+n:"beautiful girl "+n;
			if(boo){
				return "a good boy got:"+n/(n+1);	
			}else{
				return "a beautiful girl got:"+n;
			}
		};
		bad b=(n)->1/(n);
		
		System.out.println(g.getstr(100,true));
		System.out.println(g.getstr(100,false));

		System.out.println(b.getd(4.3));
		
	}
}

