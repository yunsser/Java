package exam04;

class InstanceTypeShower {
	int showCnt; // 필드
	
	InstanceTypeShower(){
		showCnt = 0;
	}
	
	public <T> void showInstType(T inst) { // 제너릭메서드
		System.out.println(inst);
		showCnt++;
	}
	
	public <T, U> void showMultiInstType(T inst1, U inst2) { // 클래스, 메서드 모두 추가가능 // 자료형 고정
		System.out.println(inst1);
		System.out.println(inst2);
		showCnt++;
		
	}
	
	public void showPrintCnt() {
		System.out.println("메서드 호출 수 : " + showCnt);
	}
	
}



