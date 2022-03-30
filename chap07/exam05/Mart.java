package exam05;

class Mart { // 참조자료형 (판매자)
	private int benefit; // 이윤 // private = 내 영역 안에서만 필드에 접근 가능
	private int numberApple; // 잔고(사과 갯수)
	private final int APPLE_PRICE; // 사과 단가, 상수, 값을 한번 담으면 변경 할 수 없다, 전부 다 대문자로 지정
	
	// 생성자
	Mart(int bf, int num, int price){
		benefit = bf;
		numberApple = num;
		APPLE_PRICE = price;
	}
	
	// 메소드(Method) - 기능/동작(사물), 행위(사람)
	// 사과 판매 행위.
	public int saleApple(int cost) {
		int number = 0; // 변수
		
		benefit += cost; // 누적 = 복합대입연산자
		number = cost / APPLE_PRICE;  // 개수 = cost / 단가
		
		numberApple -= number; // 누적
		
		return number;
	}
	
	// 정산
	public void showSeller() {
		System.out.println("이윤: " + benefit);
		System.out.println("사과 재고: " + numberApple);
	}
	
}
