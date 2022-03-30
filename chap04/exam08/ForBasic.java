package exam08;

public class ForBasic {
	public static void main(String[] args) {
		// 1~ 100의 합은 = ?
		int result = 0;
		
		   //    1        2     5   4     순서로 진행한다  
		for(int i = 1; i < 100; i++) { //카운팅;, 참거짓(비교연산); 
			//System.out.println("카운팅 값: " + i); // 3
			result += i;
			//System.out.println("누적 값: " + result);
		}
		
		System.out.println("1 ~ 100까지의 합: " + result);
		
	}
}
