package exam09;

class Person { // 같은 패키지 안에서 사용할꺼라 퍼플릭 필요없다
	private String name; // 이름
	private int milID; // 군번     // 여기가 필드 ③ 주소값 반환
	
	Person(String name, int milID){ // 생성자 = 필드의 값을 초기화
		this.name = name; // ②생성자 호출, this. (시작주소값) >> Sting name을 가르킨다(필드를 가르킴)
		this.milID = milID;    
		// this는 여기 안에서만 사용가능, 내부에서만
	}
	
	Person(String name){ // 생성자를 오버로딩
		this.name = name;
		this.milID  = 0; // 군번이 없는 사람은 이름만 // this. 넣어도 되고 안넣어두댐
	}
	
	
	public void showInfo() {
		System.out.println("이름: " + name);
		
		if(milID == 0) {
			System.out.println("군번이 없어요");
		}else {
			System.out.println("군번: " + milID);
		}
	}
	
}
