/*Compare two files.
 * To use this program,specify the names
 * of the files to be compared on the command line.
 */

import java.io.*;
class CompFiles {
	public static void main(String[] args) {
		int i =0,j=0;
		//First make sure that both files have been specified.
		if(args.length != 2){
			System.out.println("Usage:CompFiles f1 f2");
			return;
		}
	
		try(FileInputStream f1 = new FileInputStream(args[0]);FileInputStream f2 = new FileInputStream(args[1])) {
			do{
				i = f1.read();
				j = f2.read();
				if(i != j) break;
			}while(i != -1 && j!= -1);
			if(i != j){
				System.out.println("Files differ.");
			}else {
				System.out.println("Files are the same.");
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
