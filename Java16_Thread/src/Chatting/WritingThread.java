package Chatting;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

//서버로 메세지를 보내는 쓰레드
public class WritingThread extends Thread{
	Socket socket = null;
	Scanner sc = new Scanner(System.in);
	
	public WritingThread(Socket socket) {
		this.socket = socket;
	}
	
	public void run() {		
		try {
			OutputStream out = socket.getOutputStream();
			PrintWriter writer = new PrintWriter(out, true);
			
			while(true) {
				writer.print(sc.nextLine());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}// end of class
