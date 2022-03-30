package exam01;

class SumThread extends Thread{
	String threadName;
	int start, end;
	
	SumThread(String name, int s, int e){
		this.threadName = name;
		this.start = s;
		this.end = e;
	}

	@Override
	public void run() { // Thread에서의 메인역활을 한다
		int sum = 0; // 지역변수
		
		for(int i = start; i <= end; i++) {
			sum += i;
			System.out.println(threadName);
		}
		
		System.out.printf("%s => %d ~ %d까지\n", threadName, start, end);
		
	}

}

public class ThreadUnderstand {
	public static void main(String[] args) {
		SumThread thread1 = new SumThread("쓰레드1", 1, 100);
		SumThread thread2 = new SumThread("쓰레드2", 101, 200);
		
		thread1.start();
		thread2.start();
		
		int sum = 0;
		
		for(int i = 1000; i <= 1100; i++) {
			sum += i;
		}
		System.out.printf("main() 메서드 실행 => %d ~ %d까지의 합 : %d\n", 1000, 1100, sum);
		
		System.out.println("프로그램 종료");
	}
}
