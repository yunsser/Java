package exam07; //후위

public class PostfixOp {
	public static void main(String[] args) {
		int num1 = 7;
		int num2 = 0, num3 = 0;
		
		num2 = num1++; //후위증가연산자, num1 += 1;, 증가시키기 전에 결과를 먼저 실행한다, 대입을 먼저함
		
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		
		num3 = num1++ + 20;
		System.out.println("num1 = " + num1);
		System.out.println("num3 = " + num3);
		
		--num1; // 전위감소연산자, num1 -=1;
		System.out.println(num1);
		
	}
}
