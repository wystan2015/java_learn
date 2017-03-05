/*A help program that uses a disk file
 * to store help information
 */

import java.io.*;

/**
 * The Help class opens a help file,
 * searches for a topic, and then displays
 * the information associated with that topic.
 * Notice that it handles all I/O exceptions
 * itself,avoiding the need for calling code
 * to do so.
 */

class Help{
	String helpfile;
	Help(String fname){
		helpfile = fname;
	}
	
	//Display help on a topic.
	boolean helpOn(String what) {
		int ch;
		String topic,info;
		try(BufferedReader helpRdr = new BufferedReader(new FileReader(helpfile))){
			do{
				ch = helpRdr.read();
				if(ch == '#') {
					topic = helpRdr.readLine();
					if(what.compareTo(topic) == 0){
						do{
							info = helpRdr.readLine();
							if(info != null) System.out.println(info);
						}while((info != null )&&(info.compareTo("") != 0));
						return true;//topic found
					}
				}
			}while(ch != -1);
		}catch(IOException e){
			e.printStackTrace();
		}
		return false;//topic not found
	}

	//get a help topic
	String getSelection() {
		String topic = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter topic");
		try{
			topic = br.readLine();
		}catch(IOException e){
			e.printStackTrace();
		}
		return topic;
	}
}
