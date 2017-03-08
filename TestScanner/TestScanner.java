import java.io.*;
import java.util.*;
class TestScanner {
	public static void main(String[] args){
		Scanner conin = new Scanner(System.in);
		int i;
		
		if(conin.hasNextInt()) {
			i = conin.nextInt();
			System.out.println("We got an int value: "+i);
		}
	}


}
