package exam01;
     //자식 클래스 // 부모 클래스, 상속의 구조
class Student extends Friend { // 학생 친구 // 상속의 관계
	private String university; // 학교 이름
	private String major; // 전공
	
	
	Student(String name, String birth, String address, String email, String university, String major) { // 생성자 = 필드값의 초기화
		// 이 생성자만 호출되기 때문에 이런 데이터는 상속에 관계에서 부모에 정의 되어있다 부모가 가지고 있는
		// 데이터만 상속이 가능하다면 이 데이터를 보내 줄 수 있다 
		super(name, birth, address, email); 
		// 반드시 상속의 조건하에서 사용가능하다, 상속조건이 아닌 곳에서 사용하면 에러뜸 // 오버로딩
		// super라는 키워드를 이용해 부모에 정의 되어있는 생성자를 상속해준다
		this.university = university;
		this.major = major;
	}
	
	public void displayStudentInfo() {// 메서드
		displayFriendInfo();
		System.out.println("학 교 명: " + university);
		System.out.println("전    공: " + major);
	}
}
