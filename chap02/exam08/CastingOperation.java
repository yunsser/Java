/*
자동형 변환규칙
byte > short > int > long > float > double, (정수 2진수, 실수는 수식 m과 e로 이루어져있어서 long 더 먼저임) 
       char  >
명시적형변환, 강제형변환
 */

package exam08;

public class CastingOperation {
	public static void main(String[] args) {
		char alphabet = 'Z'; // 동일한 자료형을 써야 같은 값이 나온다
		int unicode = ' ';
		long num = 1000000000000000000L;
		float num2;
		
		num2 = num; // 자동형 변환규칙, 작은바이트에서 큰바이트로 가는 건 가능하다, 데이터손실 없기 때문
	    //4byte    2byte
		unicode = (int)alphabet; // 명시적형 변환
		
		System.out.println(alphabet);
		System.out.println(unicode);
		System.out.println(num2);
		
		byte num3 = 0;
		int num4 = 25;
		
		//num3 = num4; //error
		num3 = (byte)num4;
		System.out.println(num3);		
		
		int score = 0;
		double score2 = 23.5;
		// score = score2; //error		
		score = (int)score2; // 강제형변환
		
		//int score = (int)23.5; //강제형변환
		System.out.println(score);
		
		//float result = 0.5 + 19.0; //error ,오른쪽이 double이라 float로 설립이 안된다
		double result = 0.5 + 19.0;
		System.out.println(result);
		
		//float result = (float)0.5 + 19; //error
		result = (float)0.5 + 19;
		System.out.println(result);
		
		
		
		
	}
}
