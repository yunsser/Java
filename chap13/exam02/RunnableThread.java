package exam02;

class Sum{
	int sum;
	
	Sum(){ sum = 0; }
	public void addNum(int num) {this.sum += num;}
	public int getNum() {return sum;}
	
}

class AddThread extends Sum implements Runnable{ // 이름만 가지고 있는 추상메서드가 인터페이스를 상속하는 자식의 클래스는 
	int start, end;								 // 오버라이딩해서 사용할 의무가 있어를 강하게 말함
	
	AddThread(int s, int e){
		this.start = s;
		this.end = e;
		
	}
	
	@Override
	public void run() { //run 추상메서드 Thread와 상관 없음
		for(int i = start; i <= end; i++) {
			addNum(i);
		}
	}
	
}

public class RunnableThread {
	public static void main(String[] args) {
		AddThread at1 = new AddThread(1, 50); // Thread 기능 탑재 아직 안됨
		AddThread at2 = new AddThread(51, 100);
		
		Thread thread1 = new Thread(at1); // Thread 기능 정의해주기
		Thread thread2 = new Thread(at2);
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join(); // join(); // 쓰레드 1만 지켜보고 있다가, 끝나는 시점에 리턴해서 복귀해온다 // 메인의 입장에선 대기중
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println(" 1 ~ 100 까지의 합: " + (at1.getNum() + at2.getNum())); // 원인 : 스타트했다고 해서 복귀하는 시점이 
																					// 쓰레드 1이 끝날 시점이 아니고 시작하자마자 바로 그냥 복귀한다 
																					// (개빠름, 쓰레드 시작 안했을때 시작할수도 있음)
		
	}
}
