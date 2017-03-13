
public class GenDemo {
	public static void main(String[] args){
		Gen<Integer> iob;
		
		iob = new Gen<Integer>(18);
		
		iob.showType();
		
		int v = iob.getob();
		System.out.println("value: "+v);
		
		System.out.println();
		
		Gen<String> strob = new Gen<String>("Generics test");
		strob.showType();
		
		String str = strob.getob();
		
		System.out.println("value: "+str);
	}
}

