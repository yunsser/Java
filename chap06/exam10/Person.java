package exam10;

class Person { 
	private String name; // 이름
	private int milID; // 군번     
	private int birthYear; // 년
	private int birthMonth; // 월
	private int birthDay; // 일
	
	
	Person(String name, int milID, int birthYear, int birthMonth, int birthDay){ // 생성자
		this.name = name; 
		this.milID = milID;
		this.birthYear = birthYear;
		this.birthMonth = birthMonth;
		this.birthDay = birthDay;
	
	}
	
	Person(String name, int birthYear, int birthMonth, int birthDay){ // 생성자를 오버로딩
		this(name, 0, birthYear, birthMonth, birthDay); // this(); 생성자 호출, 5개를 전달 받는 생성자 호출
//		this.name = name;
//		this.milID  = 0; 
//		this.birthMonth = birthMonth;
//		this.birthDay = birthDay;
	}
	
	Person(String name, int birthYear, int birthMonth){
		this(name, 0, birthYear, birthMonth, 0);
//		this.name = name;
//		this.milID  = 0;
//		this.birthYear = birthYear;
//		this.birthMonth = birthMonth;
//		this.birthDay = 0;
	}
	
	
	
	public void showInfo() {
		System.out.println("이름: " + name);
		
		if(milID == 0) {
			System.out.println("군번: 없음");
		}else {
			System.out.println("군번: " + milID);
		}
		
		System.out.println("출생년도: " + birthYear + "년");
		System.out.println("출생월: " + birthMonth + "월");
//		System.out.println("출생일: " + birthDay + "일");
	
		if(birthDay == 0) {
			System.out.println("출생일: 비공개");
		}else {
			System.out.println("출생일: " + birthDay + "일");
		}

	}
	
}
