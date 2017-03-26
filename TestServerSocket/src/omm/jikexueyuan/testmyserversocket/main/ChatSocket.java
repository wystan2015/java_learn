package omm.jikexueyuan.testmyserversocket.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.Socket;

public class ChatSocket extends Thread {
	Socket socket;
	public ChatSocket(Socket s) {
		this.socket = s;
	}
	
	public void out(String s){
		try {
			socket.getOutputStream().write(s.getBytes("UTF-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void run() {
		try {
			BufferedReader br = new BufferedReader(
					new InputStreamReader(
							socket.getInputStream()));
			String line=null;
			while ((line=br.readLine()) != null) {
				ChatManager.getChatManager().publish(this, line);
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
