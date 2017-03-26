package omm.jikexueyuan.testmyserversocket.main;

import java.io.Closeable;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JOptionPane;

public class ServerListener extends Thread {
	public void run() {
		try {

			//1-65535	
			ServerSocket skt=new ServerSocket(12345);
			//block
			while(true){
				Socket socket=skt.accept();
				JOptionPane.showMessageDialog(null, "有客户端程序连接到服务器");
				ChatSocket cs =new ChatSocket(socket);
				cs.start();
				ChatManager.getChatManager().add(cs);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
