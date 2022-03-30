package exam16; // java.util // Scanner

import java.util.Scanner; // import를 해줘야 사용 할 수 있다, 자바가 제공해주는 패키지들은 import 해줘야한다

// java.lang package는 워낙 자주 사용하는 패키지라서 import를 해주지 않는다, 필수에 워낙 기본이라
// java.util은 

public class StringScanner {
	public static void main(String[] args) {
		String source = "1 5 7";
		Scanner scanner = new Scanner(source);
		
		int num1 = scanner.nextInt(); // 첫번째 정수값을 가져온다 // 정수형으로 형변환해서 리턴해준다
		int num2 = scanner.nextInt(); // 두번째
		int num3 = scanner.nextInt(); // 세번째
		
		int sum = num1 + num2 + num3;
		
		System.out.printf("문자열에 저장된 num1 = %d, num2 = %d, num3 = %d, sum = %d \n", num1, num2, num3, sum);
	}
}
