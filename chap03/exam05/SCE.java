package exam05;

public class SCE { //Short-Circuit Evaluation
	public static void main(String[] args) {
		int num1 = 0, num2 = 0;
		boolean result = false;
		
		num1 += 10;
		num2 += 10;
		result = (num1 < 0) && (num2 > 0); 
		
		//result = ((num1 += 10) < 0) && ((num2 += 10) > 0); // 동시에 신호가 들어와야 한다
		System.out.println ("결과 = " + result); 
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		
		num1 += 10;
		num2 += 10;
		result = (num1 > 0) || (num2 < 0);
		
		//result = ((num1 += 10) > 0) || ((num2 += 10) < 0); //num1 = 20, num2 = 20
		System.out.println ("결과 = " + result);
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		System.out.println("num1 = " + num1 + ", num2 = " + num2);
		
		
	}
}
