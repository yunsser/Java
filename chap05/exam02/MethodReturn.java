package exam02;

public class MethodReturn {
	public static void main(String[] args) {
		int result1 = multify(10, 20); // 복귀한 result가 이 자리에 온다, 200
		
		if(result1 >= 1000) { // 이름이 동일해도 괜찮다 (result)
			System.out.println("1000 이상 이군요");
		}
		
	}
	
	        // void 수행 후 아무런 값도 전달하지 않아요 // int 수행하고 값을 전달하러가요
	public static int multify(int n1, int n2) {
		int result2 = 0;
		
		result2 = n1 * n2;
		System.out.println("곱셈의 값: " + result2);
		
		return result2; // 복귀한다
	}
}
