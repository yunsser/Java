package exam10;

class HighFriend extends Friend{ // 고등학교 친구(자식클래스)
	
	// field(멤버변수)
	private String work; // 직업
	
	//HighFriend(){super();}
	HighFriend(String name, String phoneNum, String address, String work){
		super(name, phoneNum, address);// 부모 필드(field) 초기화 의무
		this.work = work;
	}
	
	// Method(멤버메서드)
	public void displayFriendInfo() { // 상속에 의한 오버라이딩
		super.displayFriendInfo();
		System.out.println("직업:" + work);
	}
	
	//Method (기본 능력 출력 - 이름/직업)
	public void displayBasicFriendInfo() {
		System.out.println("이름: " + getName()); //프렌드에 저장되 있다 // 프라이빗으로 선언 되어있음
		System.out.println("직업: " + work);
	} 	
	
}







