package exam01;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
	public static void main(String[] args) {
		
		try {
			ServerSocket serverSocket = new ServerSocket(5001); // 1024번대는 자바 운영체제가 쓰는 번호임으로 작동 안할수도 있다 // 9000번 이후가 안전빵
			
			while(true) {
			Socket socket = serverSocket.accept();
			
			ObjectInputStream inStream = new ObjectInputStream(socket.getInputStream()); // 연결통로
			
			String msg = inStream.readUTF(); // 스트림의 데이터를 읽어온다
			System.out.println("Client가 전송해 온 메세지: " + msg);
			
			if(msg.equals("exit")) {
				break;
			}
				
			ObjectOutputStream outStream = new ObjectOutputStream(socket.getOutputStream());
			
			outStream.writeUTF("이윤서: "); // 본명
			outStream.flush(); // 메세지 바로 보낼 수 있는 기능
			
			outStream.close();
			inStream.close();
			socket.close();
			
			serverSocket.close();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
}
