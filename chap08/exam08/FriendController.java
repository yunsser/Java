package exam08; // 상속에 의한 메서드 오버라이딩, 다향성

import java.util.Scanner;

class FriendController { // 메서드를 분석하면서 이런 필드가 왜 필요한지를 알아볼수있다
	
//	HighFriend[] highFriend;  
//	UnivFriend[] univFriend;
//	final private int MAX_HIGH;
//	final private int MAX_UNIV;
//	private int indexOfHigh;
//	private int indexOfUniv;
	
	Friend[] friend;
	final private int MAX_FRIEND; // 상수형의값으로 이 변수를 사용하겠다 = 올 대문자
	private int indexOfFriend;
	
	FriendController(){
//		MAX_HIGH = MAX_UNIV = 100;
//		indexOfHigh = indexOfUniv = 0;
//		highFriend = new HighFriend[MAX_HIGH]; // 4바이트 * 100 
//		univFriend = new UnivFriend[MAX_UNIV];
		MAX_FRIEND = 200; // 고등학교 + 대학교 친구의 수
		friend = new Friend[MAX_FRIEND];
	}

	public void addFriend(int choice) {
		Scanner input = new Scanner(System.in);
		String name = null, phone = null, address = null;
		String work = null, major = null; 
		
		System.out.print("이름을 입력하세요:");
		name = input.nextLine(); // 입력받기를 대기하는 메서드
		
		System.out.print("전화번호를 입력하세요:");
		phone = input.nextLine();
		
		System.out.print("주소를 입력하세요:");
		address = input.nextLine();
		
		if(choice == 1) {
			System.out.print("직업을 입력하세요:");
			work = input.nextLine();
			
			this.friend[indexOfFriend++] = new HighFriend(name, phone, address, work); // 저장하는 순간만 분리
			
			
		}else if(choice == 2) {
			System.out.print("전공을 입력하세요:");  
			major = input.nextLine();
			
			this.friend[indexOfFriend++] = new UnivFriend(name, phone, address, major);
		} 
	}
	
	public void displayFriendInfo() { 
		for(int i=0; i < indexOfFriend; i++) {
			friend[i].displayFriendInfo();
			
			/*
			if (friend[i] instanceof HighFriend) {
				HighFriend highFriend = (HighFriend) friend[i];
				highFriend.displayFriendInfo();
				
			}else if (friend[i] instanceof UnivFriend) {
				UnivFriend univFriend = (UnivFriend) friend[i];	
				univFriend.displayFriendInfo();
			}
			 */
			
			System.out.println();
			
		}

	}
}



















