
public class SimpGen {
	public static void main(String[] args){
		TwoGen<Integer,String> tgobj = new TwoGen<Integer,String>(88,"Generics");
		
		tgobj.showTypes();
		
		int v = tgobj.getob1();
		System.out.println("value: "+v);

		String str = tgobj.getob2();
		System.out.println("value: "+str);
	}
}

