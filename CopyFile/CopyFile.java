/*Display a text file.
 * To use this program,specify the name 
 * of the file that you want to see.
 * For example,to see a file called test.txt
 * use the following command line.
 * java ShowFile test.txt
 */
import java.io.*;

class CopyFile{
	public static void main(String[] args) {
		int i;
		FileInputStream fin = null;
		FileOutputStream fout = null;
		//First make sure that a file has been specified.
		if(args.length != 2) {
			System.out.println("Usage:java ShowFile filename");
			return;
		}
		try {

			fin = new FileInputStream(args[0]);//Open file
			fout = new FileOutputStream(args[1]);
			//read bytes until EOF is encountered
			do{
				i = fin.read();
				if(i != -1) { 
					fout.write(i);
				}
			} while(i != -1);
		}catch(IOException exc){
				exc.printStackTrace();
		}finally{
			try {
				if(fin != null) fin.close();
			}catch(IOException exc){
				exc.printStackTrace();
			}
			try {
				if(fout != null) fout.close();
			}catch(IOException exc){
				exc.printStackTrace();
			}


		}
	}

}
