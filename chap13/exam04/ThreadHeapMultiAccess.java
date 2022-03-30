package exam04;

class Sum{
	int sum;
	
	Sum(){ sum = 0; }
	  // 동기화 : 메소드 동작이 끝나기 전에 다른 쓰레드가 접근할 수 없다. 속도는 느려짐
	   // 두 개 이상의 쓰레드가 공유하고 있는 힙메모리가 있는 경우에만 사용.

	
	public synchronized void addNum(int num) {this.sum += num;} // synchronized 동기화 // 
	public int getNum() {return sum;}
	
}

class AdderThread extends Thread{
	int start, end;
	Sum sumInst;
	
	AdderThread(Sum s, int start,int end){
		sumInst = s;
		this.start = start;
		this.end = end;
	}
	
	@Override
	public void run() {
		for(int i = start; i <= end; i++) {
			sumInst.addNum(i);
		}
	}
	
	
}

public class ThreadHeapMultiAccess {
	public static void main(String[] args) {
		Sum sum = new Sum();
		
		AdderThread at1 = new AdderThread(sum, 1, 5000);
		AdderThread at2 = new AdderThread(sum, 5001, 10000);
		
		at1.start();
		at2.start();
		
		try {
			at1.join();
			at2.join();
		} catch (InterruptedException e) { 
			e.printStackTrace();
		}
		
		System.out.println("1 ~ 10000까지의 합: " + sum.getNum());
		
	    // 예상하는 결과를 받지 못하는 이유 : at1과 at2가 동시에 한 
	    // 메모리를 바라보는데 메소드가 다 끝나기 전에 쓰레드에게 할당된 시간이 끝나버린다.
	}
}







