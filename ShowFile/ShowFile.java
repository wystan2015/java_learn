/*Display a text file.
 * To use this program,specify the name 
 * of the file that you want to see.
 * For example,to see a file called test.txt
 * use the following command line.
 * java ShowFile test.txt
 */
import java.io.*;

class ShowFile{
	public static void main(String[] args) {
		int i;
		FileInputStream fin;
		//First make sure that a file has been specified.
		if(args.length != 1) {
			System.out.println("Usage:java ShowFile filename");
			return;
		}
		try {

			fin = new FileInputStream(args[0]);//Open file
		} catch (FileNotFoundException exc){
			System.out.println("File "+args[0]+" Not Found");
			exc.printStackTrace();
			return;
		}
		try {
			//read bytes until EOF is encountered
			do{
				i = fin.read();
				if(i != -1) { 
					System.out.print((char)i);
				}
			} while(i != -1);
		}catch(IOException exc){
			System.out.println("Error reading file.");
		}finally{
			try {
				fin.close();
			}catch(IOException exc){
				System.out.println("Error closing file.");
			}
	
		}
	}

}
