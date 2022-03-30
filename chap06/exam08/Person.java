package exam08;

class Person { // 같은 패키지 안에서 사용할꺼라 퍼플릭 필요없다
	private String name; // 이름
	private int milID; // 군번     // 여기가 필드
	
	Person(String n, int mID){ // 생성자 = 필드의 값을 초기화
		name = n;
		milID = mID;
	}
	
	Person(String n){ // 생성자를 오버로딩
		name = n;
		milID = 0; // 군번이 없는 사람은 이름만
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
