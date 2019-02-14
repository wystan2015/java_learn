import java.io.*;
public class ReadFile {
	public static void main(String[] args){
		File file = new File("test.txt");
		try{
		if(file.exists()){
			System.out.println("exists");
			FileInputStream fins = new FileInputStream(file);
			InputStreamReader isr = new InputStreamReader(fins);
			BufferedReader br = new BufferedReader(isr);
			String line;
			while((line=br.readLine()) !=null){
				System.out.println(line);
			}
			br.close();
			isr.close();
			fins.close();
		}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}

