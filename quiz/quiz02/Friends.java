package quiz05;

class Friend { // 참조자료형
	private String name;
	private String number;
	private String address; 
	private int age; 

	// 생성자
	Friend(String name, String number, String address, int age){
		this.name = name;
		this.number = number;
		this.address = address;
		this.age = age;
	}
		
	public void showInfo() {
		System.out.println("이    름: " + name);
		System.out.println("전화번호: " + number);
		System.out.println("주    소: " + address);
		System.out.println("나    이: " + age);
	}
}	

