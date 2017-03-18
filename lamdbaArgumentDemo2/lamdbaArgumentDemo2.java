
public class lamdbaArgumentDemo2 {
	static String changeStr(StringFunc sf, String s){
		return sf.func(s);
	}

	public static void main(String[] args){
		String inStr = "lamdba Expressions Expand Java";
		String outStr;
		
		System.out.println("Here is input string: "+inStr);
		
		StringFunc reverse = (str)->{
			String result = "";
			for(int i=str.length()-1;i>=0;i--){
				result += str.charAt(i);
			}
			return result;
		};
		
		//outStr = changeStr(reverse,inStr);
		outStr = reverse.func(inStr);
		System.out.println("The string reversed: "+outStr);
		
	}
}

