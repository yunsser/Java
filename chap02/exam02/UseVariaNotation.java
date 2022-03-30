/*
2진법, 8진법, 16진법 표기법
*/
package exam02;

public class UseVariaNotation {
	public static void main(String[] args) {
		byte num1, num2; //변수 선언, 데이터보관하고 있다가 필요할때 쓸려고
		//byte num2;
		
		//num1 = 250; // error 발생 
		num1 = 55; // 초기화
		num2 = 15;
		
		System.out.println(num1 - num2); // 55 - 15 = 40
		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2)); // "55 - " "15" = 40
		
		int num3 = 512, num4 = 250;
		
		// 00010101 -> 21 
		byte num5 = 025; // 8진수 표기법, 앞에 0가 붙어있기 때문에, 3개씩 잘라서 쓰기 010 (2) 101 (5)
		System.out.println(num5); // 결과값 10진수로 나타나짐 
		
		num5 = 0x15; // 16진수 표기법, 0x 붙이기, 4개씩 잘라서 쓰기 0001 (1) 0101 (5)
		System.out.println(num5);
		
		// 00011110 -> 30
		num5 = 036;
		System.out.println(num5);
		
		num5 = 0x1e;
		System.out.println(num5);
		
		num5 = 30;
		System.out.println(num5);
		
		num5 = 0b11110; // 2진법은 앞에 0b를 붙인다
		System.out.println(num5);
		
		
		
		// 2진법  0 1 10 11
		// 10진법 0 1 2 3 4 5 6 7 8 9 10 11  
		// 8진법  0 1 2 3 4 5 6 7 10
		// 16진법 0 1 2 3 4 5 6 7 8 9 a b c d e f  -> a=11, b=12, c=13, .... (4byet에 한개)
	}
	
}
