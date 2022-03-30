package quiz06.update;

class MidelFriend extends Friend{ // 중학교 친구(자식클래스)
	
	private String marriage;// 결혼여부
		
	MidelFriend(String name, String phoneNum, String address, String marriage){
		super(name, phoneNum, address);// 부모 필드(field) 초기화 의무
		this.marriage = marriage;
		}
		
	public void displayFriendInfo() { // 상속에 의한 오버라이딩
		super.displayFriendInfo();
		System.out.println("전공:" + marriage);
		}

	}


