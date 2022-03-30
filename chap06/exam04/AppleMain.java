package exam04;

public class AppleMain { // 메인을 찾기위해서 
	public static void main(String[] args) {
		Mart e_mart = new Mart(0, 100, 1000); // e_mart 주소
		Buyer mother = new Buyer(100000);
		
		mother.buyerApple(5000, e_mart);
		mother.buyerApple(2000, e_mart);
		
		mother.showBuyer();
		
		//e_mart = null; // 주소값의 연결을 끊는다
	}
}
