import java.io.*;
public class TestStream {
	public static void main(String[] args) {
		try {
			System.out.println(System.in.available());
		} catch (IOException e) {
			System.out.println("IOException catched");
		}
	}

}
