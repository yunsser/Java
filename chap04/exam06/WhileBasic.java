package exam06;

public class WhileBasic {
	public static void main(String[] args) {
		/* 1 ~ 100의 합은 = ?
		int result = 0;
		
		result = 1+2+3+...+99+100;
		System.out.println(result); 
		*/
		int num = 1; //result = 0;
		long result = 0;
		
		while(num < 3) {     // if문과 동일한 형태 가짐
			System.out.println("명령문 실행 : " + num);
			num++; // num += 1;, 누적(증가연산자)
			
		}
		
		num = 1;
		
		while(num <= 100000) { // num 카운팅을 위한 변수이다 
			                // result는 인트로 이용된아이라 더 큰 숫자로 바꾸고싶으면
			                // long으로 변경해준다
			result += num;  // 누적해서 result에 저장해준다
			// System.out.println("누적 값: " + result); // 수행이 잘되었는지 확인
			num++;
		}
		
		System.out.println("1 ~ 100까지의 합 : " + result);
		
		
	}
}
