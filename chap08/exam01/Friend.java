package exam01;

class Friend {
	private String name; // 이름
	private String birth; // 생년월일
	private String address; // 주소
	private String email; // 이메일
	
	Friend(String name, String birth, String address, String email) {
		this.name = name;
		this.birth = birth;
		this.address = address;
		this.email = email;
	}
	
	public void displayFriendInfo() { // public 상속의 관계가 아니더라도 패키지 안에가 아니더라도 언제 든지 호출가능하다
		System.out.println("이    름: " + name);
		System.out.println("생년월일: " + birth);
		System.out.println("주    소: " + address);
		System.out.println("이 메 일: " + email);	
		}
}
