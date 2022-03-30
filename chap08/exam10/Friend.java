package exam10;

abstract class Friend { // 공통 특징(부모클래스) 
	                    // 추상메서드를 포함하고 있는 참조 자료형도 추상 클래스로 바꿔준다
	// field
	private String name; // 이름 -> 애의 값을 보내주려고 한다
	private String phoneNum; // 폰번호
	private String address; // 주소
	
	Friend(){}
	
	// Constructor
	Friend(String name, String phoneNum, String address){
		this.name = name;
		this.phoneNum = phoneNum;
		this.address = address;
	}
	
	public String getName() {return name;}  // 이 메서드는 필드의 값을 반환해주는 값이구나
	                                        // 정보은닉된 자료는 이렇게 정의해주면 쓸수있다
	
		
	// Method
	public void displayFriendInfo() {
		System.out.println("이름:" + name);
		System.out.println("폰번호:" + phoneNum);
		System.out.println("주소:" + address);
	}
	
	//public void displayBasicFriendInfo() {} // 오버라이딩의 관계 
	abstract public void displayBasicFriendInfo(); // abstract는 기능을 정의하기 위해서 만든 메소드가 아니라
	                                               // 상속에 관계하에서 메서드 오버라이딩을 할 목적으로 처음부터
	                                               //정의한 메서드라는 의미 // 추상메서드 // abstract메서드
	                                              
}