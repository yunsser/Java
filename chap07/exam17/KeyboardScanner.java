package exam17;

import java.util.Scanner;

public class KeyboardScanner {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("덧셈 연순 수행 프로그램");
		
		System.out.print("첫번째 정수값 입력: ");
		int num1 = keyboard.nextInt(); // 프로그램을 실행하고 멈춰있다, 사용자가 정수값을 입력하고 엔터를 누를때까지
		
		System.out.print("두번째 정수값 입력: ");
		int num2 = keyboard.nextInt(); // 숫자값부터 엔터값까지 가지고 와진다
		
//		System.out.printf("%d, %d\n", num1, num2);
		
		int sum = num1 + num2;
		System.out.printf("%d + %d = %d\n", num1, num2, sum);
		
		keyboard.nextLine(); // dummy code 실행상의 목적으로 된 코드가 아니라 오류나 동작상에 특성때문에 별도의
		                     // 코드상의 기능으로 넣은게 아니라 의도하지않는 동작에 의해 집어 넣어준 것
		
		System.out.println("당신의 이름은?: ");
		String name = keyboard.nextLine(); // 문자열 입력한걸 엔터하면 입력한 문자열을 가지고 리턴한다
		// 
		
		System.out.printf("당신의 이름은 %s이군요\n", name);
		
		
	}
}
