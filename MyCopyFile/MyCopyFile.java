import java.io.*;

class MyCopyFile {
	public static void main(String[] args) throws IOException {
		int i;
		if(args.length != 2) {
			System.out.println("Usage:java MyCopyFile filename1 filename2");
			return;
		}
		FileInputStream fin = new FileInputStream(args[0]);
		FileOutputStream fout = new FileOutputStream(args[1]);

		do{
			i = fin.read();
			if(i == -1) break;
			if(i ==' ' ){
				fout.write('_');
			}else{
				fout.write(i);
			}
		}while(i != -1);
		fin.close();
	}	
}
