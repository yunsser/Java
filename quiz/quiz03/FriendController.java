package quiz06; // 상속에 의한 메서드 오버라이딩, 다향성

import java.util.Scanner;

class FriendController { // 메서드를 분석하면서 이런 필드가 왜 필요한지를 알아볼수있다
	Friend[] friend;
	final private int MAX_FRIEND; // 상수형의값으로 이 변수를 사용하겠다 = 올 대문자
	private int indexOfFriend;
	
	FriendController(){
		MAX_FRIEND = 300; // 고등학교 + 대학교 친구의 수
		friend = new Friend[MAX_FRIEND];
	}

	public void addFriend(int choice) {
		Scanner input = new Scanner(System.in);
		String name = null, phone = null, address = null;
		String work = null, major = null, marriage = null;
		
		System.out.print("이름을 입력하세요:");
		name = input.nextLine(); // 입력받기를 대기하는 메서드
		
		System.out.print("전화번호를 입력하세요:");
		phone = input.nextLine();
		
		System.out.print("주소를 입력하세요:");
		address = input.nextLine();
		
		if(choice == 1) {
			System.out.print("결혼여부을 입력하세요:");  
			marriage = input.nextLine();
			
			this.friend[indexOfFriend++] = new MidelFriend(name, phone, address, marriage);
			
		}else if(choice == 2) {
			System.out.print("직업을 입력하세요:");
			work = input.nextLine();
			
			this.friend[indexOfFriend++] = new HighFriend(name, phone, address, work); // 저장하는 순간만 분리
			
		}else if(choice == 3) {
			System.out.print("전공을 입력하세요:");  
			major = input.nextLine();
			
			this.friend[indexOfFriend++] = new UnivFriend(name, phone, address, major);
		
		} 
		
		
		}
	public void displayFriendInfo() {
		for(int i=0; i < indexOfFriend; i++) {
			friend[i].displayFriendInfo();
			System.out.println();

		}
		
		System.out.println();
			
		}
	}




















