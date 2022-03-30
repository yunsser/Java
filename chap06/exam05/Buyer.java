package exam05;

// public을 붙여주면 모든 곳에서 범용적으로 사용할 수 있다
public class Buyer { // 참조자료형
	// field 
	int myMoney; // 가진 돈
	int numOfApple; // 구매한 사과 갯수
	
	// 생성자
	public Buyer(int money){ // Buyer 앞에 아무것도 없으면 default
		myMoney = money;
		numOfApple = 0;
	}
	
	// 메소드(Method)
	// 사과 구매 행위
	public void buyerApple(int money, Mart mart) {
		numOfApple += mart.saleApple(money);
		myMoney -= money;
	}
	
	//가계부
	public void showBuyer() {
		System.out.println("구매한 사과 갯수: " + numOfApple);
		System.out.println("남은 돈 : " + myMoney);
	}
	
}
