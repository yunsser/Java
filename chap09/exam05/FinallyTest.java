package exam05;

public class FinallyTest {

	public static void main(String[] args) {
		boolean divOK = divider(4,2);
		
		
		if(divOK) {
			System.out.println("연산 성공");
		}else {
			System.out.println("연산 실패");
		}
		
		divOK = divider(4,0);
		
		if(divOK) {
			System.out.println("연산 성공");
		}else {
			System.out.println("연산 실패");
		}
	}
	
	public static boolean divider(int n1, int n2) {
		
		try {
			int result = n1 / n2;
			return true; // 복귀해라~
		}catch (ArithmeticException e) {
			System.out.println("나눗셈 불가능...");
			return false;
		}finally {
			System.out.println("finally 실행");
		}
	}
	
}
