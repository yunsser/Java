/*
long, float
 */

package exam07;

public class UseConstant {
	public static void main(String[] args) {
		
		// 변수를 선언함과 동시에 초기화
		//int num = 10000000000; //error
		long num = 10000000000L; // L,l (대문자나 소문자)을 붙여야 8바이트로 인식함, long에 필수, 정수형 상수
		float pi = 3.14F; // F,f를 붙여줘야 4바이트로 인식함, 실수형 상수
		
		System.out.println(num);
		System.out.println(pi);
		
		
		
		
	}
}
