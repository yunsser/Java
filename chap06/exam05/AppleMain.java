package exam05;

public class AppleMain {
	public static void main(String[] args) {
		Mart e_mart = new Mart(0, 100, 1000);
		Buyer mother = new Buyer(100000);
		
		mother.buyerApple(5000, e_mart);
		mother.buyerApple(2000, e_mart);
		
		mother.showBuyer();
		
		//System.out.println("사용한 돈: " + e_mart.benefit); //error, benefit -> private
		System.out.println(mother.myMoney); // myMoney -> default
		
	}
}
