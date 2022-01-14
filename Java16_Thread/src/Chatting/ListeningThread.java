package Chatting;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

//서버에서 보낸 메세지 읽는 쓰레드
public class ListeningThread extends Thread{
	Socket socket = null; //소켓 정보 저장 필드
	
	public ListeningThread(Socket socket) {
		this.socket = socket;
	}
	
	public void run() {
		try {
			//서버에서 보낸 메세지를 클라이언트로 가지고 오는 작업
			InputStream in = socket.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(in));
			
			while(true) { //읽는작업을 무한 반복
				System.out.println(reader.readLine());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//end of ListeningThread()
}//end of class
