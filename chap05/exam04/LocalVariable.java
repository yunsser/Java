package exam04;

public class LocalVariable {
	public static void main(String[] args) {
		boolean scope = true;
		//double result = 0.0; // simple에서만 사용 가능 // 독립적이기 때문에 오류
		// double num = 3.14; // 아래 num 값이 이미 있기 때문에 중복으로 쓰면 오류가난다
		
		
		int result = simple(5); 
		
		if(scope) { //지역변수
			int num = 5;
			num++;
			System.out.println(num);
		}else {
			int num = -5;
			num++;
			System.out.println(num);
		}
		
		//System.out.println(num);
		
	}
	
	public static int simple(int num) { // 로컬베이러어블
		int result = num * num;
		
		System.out.println("전달된 값: " + num);
		System.out.println("결과 값: " + result);
		
		return result;
	}
}
