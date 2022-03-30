package exam18;

import java.util.StringTokenizer;

public class TokenizerString01 {
	public static void main(String[] args) {
		String data = "11:22:33:44:55"; // :(콜론, 구분자) 전 데이터를 토큰이라고 한다 ex)11, 22, 33, 44, 55
		
		StringTokenizer st = new StringTokenizer(data, ":"); // : 이걸로 데이터를 구분할꺼야 라는 말이다
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken()); // 반복문 
		}
		
		// 이 코드는 거의 정형화되서 코드가 작성이 된다
		
	}
}
