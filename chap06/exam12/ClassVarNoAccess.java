package exam12;

class NoAccessWay{ // 필드 (속성), 참조자료형
	static int num = 0; // 클래스변수, 메인에서 먼저 찾는다
	int memVari = 0; // 내 영역 안에서는 이름만으로도 접근가능 // new로 접근가능
	
	NoAccessWay(){ // 생성자
		incrementCnt();
	}
	
	public void incrementCnt() {
		memVari++; // 접근 가능
		num++; // 접근 가능
		
		noAccessWay(); // 일반메서드에서 static메서드 접근(호출) 가능
	}
	
	public static void noAccessWay() { // 메인에서 가장 먼저 찾는게 static이라서 memVari은 늦게 출력 되기 때문에
		//memVari++; //접근불가능      // static 안에서 단순 int는 사용이 불가능하다, new를 사용하면 접근가능
		num++; // 접근가능
		
		//incrementCnt(); // static메서드에서 일반메서드는 호출 불가능
		                  // new 해서 메모리가 할당되어 있지 않아서
	}
	
	public static void method() { // 메인이 스태틱이기 때문에
		
	}
	
}


public class ClassVarNoAccess {
	
	public static void main(String[] args) { 
		NoAccessWay.num = 5; // static 변수
		NoAccessWay.noAccessWay(); // 메모리 할당이 안 됨 new를 해줘야 메모리를 할당해주기 때문에
		
		NoAccessWay accessWay = new NoAccessWay();
		System.out.println(accessWay.num);
		
		accessWay.incrementCnt();
		System.out.println("num:" + accessWay.num);
		System.out.println("memVari:" + accessWay.memVari);
		
		accessWay.noAccessWay();
		System.out.println("num:" + accessWay.num);

	}
	
	
	
}
