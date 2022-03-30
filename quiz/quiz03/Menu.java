package quiz06;

import java.util.Scanner;

class Menu {
	FriendController controller; // 필드선언 // 필드에 정의해서 필드값으로 정의 참조자료형으로 선언하면 자료값이 사라지므로
	                             // 참조변수 // 입력 저장하는 컨트롤 // 저장된 자료 컨트롤 // 기능

	Menu(){
		controller = new FriendController(); // 인스턴트 생성
	
	}
	
	public void displayMenu() {
		while(true) { // 무한반복
			System.out.println("*****  메뉴 선택  *****");
			System.out.println("0. 프로그램 종료.");
			System.out.println("1. 중학교 친구 정보 저장.");
			System.out.println("2. 고등학교 친구 정보 저장.");
			System.out.println("3. 대학교 친구 정보 저장.");
			System.out.println("4. 친구 정보 출력.");
			System.out.println();
			
			System.out.print("원하는 항목 번호를 선택하세요 >> ");
			
			Scanner input = new Scanner(System.in); // 키보드로부터 무언가를 입력받겠구나
			
			int choice = input.nextInt(); // 대기 // 사용자가 숫자값이용하고 엔터 칠때까지 //// 엔터 전의 값을 강제형변환 (int 0)
			
			System.out.println(); // 줄 바꿔주기
			
			switch(choice) {
				case 0:
					System.out.println("프로그램을 종료합니다."); // 메인에서 모든 실행문이 끝나면 종료
					return; // 메서드를 실행하는 과정에서 리턴을 만나면 복귀해라, 값을 가지고 복귀해라 // 메인이 있는 곳으로 복귀해서 프로그램이 종료됨
				case 1: case 2: case 3:
					controller.addFriend(choice); // controller 참조변수
					break;
				case 4:
					controller.displayFriendInfo();
					break;
				default: // 메뉴에 없는 번호나 이상한 텍스트를 치면 나옴
					System.out.println("잘못된 입력을 하셨습니다.");
					System.out.println("번호를 확인하세요.");
					break;
			}
			
			System.out.println();
		}
	}
}

