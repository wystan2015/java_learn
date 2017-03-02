import java.io.*;

public class ReadBytes {
	public static void main(String [] args){
		byte data[] = new byte[10];
		System.out.println("Enter some characters.");
		try{
			System.in.read(data);
		} catch (IOException e) {
			System.out.println("IOException catched");
		}
		System.out.print("You entered: ");
		for(int i=0;i<data.length;i++) {
			System.out.print(data[i]);
		}
		System.out.println();

	}

}
