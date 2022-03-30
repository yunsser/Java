package quiz04;

public class AppleMain {
	public static void main(String[] args) {
		Mart mart[] = new Mart[2];
		
		mart[0] = new Mart(0, 100, 1000); // 이마트
		mart[1] = new Mart(0, 50, 2000); // 홈플
		
		Buyer[] buyer = new Buyer[3];
		
		buyer[0] = new Buyer(10000); // 철수
		buyer[1] = new Buyer(30000); // 영희
		buyer[2] = new Buyer(50000); // 미애

		buyer[0].buyerApple(5000, mart[0]); // 철수 - 이마트
		buyer[0].buyerApple(2000, mart[1]); // 철수 - 홈플러스
		
		buyer[1].buyerApple(8000, mart[0]); // 영희 - 이마트
		buyer[1].buyerApple(12000, mart[1]); // 영희 - 홈플러스
		
		buyer[2].buyerApple(20000, mart[0]); // 미애 - 이마트
		buyer[2].buyerApple(10000, mart[1]); // 미애 - 홈플러스
		

		buyer[0].showBuyer();
		buyer[1].showBuyer();
		buyer[2].showBuyer();
		
		System.out.println("================");
		
		mart[0].showSeller();
		mart[1].showSeller();
	}
}
