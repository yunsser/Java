package exam03;

public class LogicOp2 {
	public static void main(String[] args) {
		int num1 = 10, num2 = 20;
		boolean result = false;
		
		System.out.println(num1 == 10);
		
		result = (num1 == 10) && (num2 == 30);
		System.out.println(result);
		
		result = ((num1 >= 10) || (num2 <= 30)); // 괄호가 없어도 문제 되지 않는다
		System.out.println(result);              // 비교연산자 > 논리연산자 > 대입연산자
		
		
		
		
		
	}
}
