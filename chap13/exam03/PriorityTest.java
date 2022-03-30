package exam03;
                                  // 뭔가를 동시에 실행한다
class MessageSendingThread extends Thread {
	String message;
	
	MessageSendingThread(String message, int prio){
		this.message = message;
		setPriority(prio); // Thread 안에 정의 되어 있음
	}
	
	
	@Override
	public void run() {
		for(int i = 0; i < 1000; i++) {
			System.out.printf("%s(%d) \n", message, getPriority());
			
			try {
				sleep(i); // dummy 잠깐 자러간다 한 스레드에 점유되는걸 막는다 // sleep(); 대기 (Blocked된 과정)
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
	}
	
}


public class PriorityTest {
	public static void main(String[] args) {
		MessageSendingThread tr1 = new MessageSendingThread("first", Thread.MAX_PRIORITY); // MAX_PRIORITY 올 대문자 10 // 최상위 우선순위 (먼저 실행)
		MessageSendingThread tr2 = new MessageSendingThread("second", Thread.NORM_PRIORITY); // NORM_PRIORITY 5
		MessageSendingThread tr3 = new MessageSendingThread("third", Thread.MIN_PRIORITY); // MIN_PRIORITY 1 // 최하위 우선순위 
		
		tr1.start();
		tr2.start();
		tr3.start();
		
		
	}
}
