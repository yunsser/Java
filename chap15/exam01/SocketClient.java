package exam01;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketClient {
	public static void main(String[] args) {
		
		try {						  // 내 컴퓨터서버에 연결해줘
			Socket socket = new Socket("localhost", 5001); // 이 고유값을 5001번한테 데려다줘
			
			ObjectOutputStream outStream = new ObjectOutputStream(socket.getOutputStream()); // 연결통로
			
			outStream.writeUTF("이윤서가 전송");
			outStream.flush(); // 실시간으로 전송해줘
			
			ObjectInputStream inStream = new ObjectInputStream(socket.getInputStream()); // 메세지를 받아야함
			
			String msg = inStream.readUTF();
			
			System.out.println("서버로부터 전송되어진 메세지: " + msg);
			
			inStream.close();
			outStream.close();
			socket.close();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}
}
