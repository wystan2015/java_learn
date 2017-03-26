package omm.jikexueyuan.testmyserversocket.main;

import java.util.Vector;

public class ChatManager {
	private  ChatManager() {
		
	}
	
	private static final ChatManager cm = new ChatManager();
	public static ChatManager getChatManager(){
		return cm;
	}
	
	Vector<ChatSocket> vector =new Vector<ChatSocket>();
	
	public void add(ChatSocket cs) {
		vector.add(cs);
	}
	
	public void publish(ChatSocket cs,String s) {
		for (int i = 0; i < vector.size(); i++) {
			ChatSocket cschks=vector.get(i);		
			if (!cs.equals(cschks)) {
				cschks.out(s);
			}
		}
	}
}
