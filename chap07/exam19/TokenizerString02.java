package exam19;

import java.util.StringTokenizer;

public class TokenizerString02 {
	public static void main(String[] args) {
		String phoneNum = "TEL 82-02-1234-5678"; // 하나의 디폴트를 구분할때 스페이스바를 구분자(디폴트)로
		                                         // 생각해서 나눠준다
		
		System.out.println("First Result ===");
		StringTokenizer st1 = new StringTokenizer(phoneNum);
		
		while(st1.hasMoreTokens()) { // hasMoreTokens 사용 할 수 있는 토큰이 있는지 확인한다
			System.out.println(st1.nextToken());
		}
		
		System.out.println("Second Result ===");
		st1 = new StringTokenizer(phoneNum, " -"); // (여백과 -) >> 구분자로 지정
		
		while(st1.hasMoreTokens()) { 
			System.out.println(st1.nextToken());
		}
		
		System.out.println("Third Result ===");
		st1 = new StringTokenizer(phoneNum, " -", true); // 구분자 출력 여부 지정
		
		while(st1.hasMoreTokens()) { 
			System.out.println(st1.nextToken());
		}
		
	}
}
