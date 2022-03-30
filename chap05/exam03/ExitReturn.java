package exam03;

public class ExitReturn {
	public static void main(String[] args) {
		divide(10, 5);
		divide(10, 3);
		
		divide(100, 0);
		divide(50, 10);
	}
	
	
	public static void divide(int num1, int num2) {
		int result = 0;
		
		if(num2 == 0) {
			System.out.println("나눗셈은 0으로 나눌 수 없어요");
			return;
		}
		
		result = num1 / num2;
		System.out.println(num1 + " / " + num2 + " = " + result);
	}
}
