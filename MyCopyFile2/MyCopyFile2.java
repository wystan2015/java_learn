import java.io.*;

class MyCopyFile2 {
	public static void main(String[] args) {
		int i;
		if(args.length != 2) {
			System.out.println("Usage:java MyCopyFile filename1 filename2");
			return;
		}
		try(FileReader fin = new FileReader(args[0]);
			FileWriter fout = new FileWriter(args[1])){
			do{
				i = fin.read();
				if(i == -1) break;
				if(i ==' ' ){
					fout.write('_');
				}else{
					fout.write(i);
				}
			}while(i != -1);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}	
}
