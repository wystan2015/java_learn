import java.io.*;

class KtoS {
	public static void main(String[] args) {
		String s;
		try(BufferedReader br = new BufferedReader(new FileReader("test.txt"))){
			while((s=br.readLine()) != null){
				System.out.println(s);
			}

		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
