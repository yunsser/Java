package exam05;

public class AppleMain {
	public static void main(String[] args) {
//		Mart e_mart = new Mart(0, 100, 1000);
//		Mart homeplus = new Mart(0, 200, 2000);
//		Mart lotte_mart = new Mart(0, 150, 3000);
//		                //new Mart(); 100 byte
//		
//		Buyer mother = new Buyer(100000);
//		Buyer father = new Buyer(50000);
//		Buyer son = new Buyer(10000);
		
		Mart[] mart = new Mart[3]; //4byte, 3개의 인스턴스를 저장할 공간
		
//		for(int i = 0; i < mart.length; i++) { 
//			System.out.println(mart[i]);
//		}
		
		mart[0] = new Mart(0, 100, 1000); // 이마트
		mart[1] = new Mart(0, 200, 2000); // 홈플
		mart[2] = new Mart(0, 150, 3000); // 롯데
       //4byte
//		for(int i = 0; i < mart.length; i++) { //16진수의 주소값, 헥사코드 내부에서 자체적으로 해당되어지는 메모리에 임의의 가상으로 설정된 숫자
//			System.out.println(mart[i]);
//		}
		
		Buyer[] buyer = new Buyer[3]; // 3 * 4byte = 12byte
		
		buyer[0] = new Buyer(100000); 
		buyer[1] = new Buyer(50000); 
		buyer[2] = new Buyer(10000); 
		
//		for(int i = 0; i < buyer.length; i++) { 
//			System.out.println(buyer[i]);
//		}
		
		
		// 어머니가 홈플러스에 가서 사과 4000원 구매
		buyer[0].buyerApple(4000, mart[1]);
		buyer[0].buyerApple(2000, mart[1]);
		buyer[0].buyerApple(2000, mart[1]);
		
		buyer[0].showBuyer();
		
		System.out.println("===========================");
		
		mart[1].showSeller();

	}
}
