package exam07;

import java.util.Scanner;

class FriendController { // 메서드를 분석하면서 이런 필드가 왜 필요한지를 알아볼수있다
	
	HighFriend[] highFriend;  
	UnivFriend[] univFriend;
	final private int MAX_HIGH;
	final private int MAX_UNIV;
	private int indexOfHigh;
	private int indexOfUniv;
	
	FriendController(){
		MAX_HIGH = MAX_UNIV = 100;
		indexOfHigh = indexOfUniv = 0;
		highFriend = new HighFriend[MAX_HIGH]; // 4바이트 * 100 
		univFriend = new UnivFriend[MAX_UNIV];
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
			
			this.highFriend[indexOfHigh++] = new HighFriend(name, phone, address, work);
			//indexOfHigh++;
			
		}else if(choice == 2) {
			System.out.print("전공을 입력하세요:");  // 인덱스로 관리
			major = input.nextLine();
			
			this.univFriend[indexOfUniv++] = new UnivFriend(name, phone, address, major);
		} 
	}
	
	public void displayFriendInfo() { 
		for(int i=0; i < indexOfHigh; i++) {
			highFriend[i].disdplayHighFriendInfo();
			System.out.println();
		}
		
		for(int i=0; i < indexOfUniv; i++) {
			univFriend[i].displayUnivFriendInfo();
			System.out.println();
		}
	}
}



















