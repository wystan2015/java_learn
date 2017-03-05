import java.io.*;

class KtoD {
	public static void main(String[] args) {
		String str;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("Enter text ('stop' to quit).");
		try(FileWriter fw = new FileWriter("test.txt")){
			do{
				System.out.println(":");
				str = br.readLine();
				
				if(str.compareTo("stop") == 0) break;
	

				str = str+"\r\n";
				fw.write(str);
			}while(str.compareTo("stop") != 0);
		}catch(IOException e) {
			e.printStackTrace();
		}

	}


}
