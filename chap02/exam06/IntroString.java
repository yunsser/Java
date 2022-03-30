package exam06;

public class IntroString {
	public static void main(String[] args) {
		
		String hello = "안녕하세요?"; // 두 글자이상의 문자열에는 큰따옴표
		String name = "홍길동";
		
		System.out.println(hello);
		System.out.println(name);
		
		name = "홍";
		System.out.println(name);
		
		name = "";
		System.out.println("이름:" + name);
		
		// 초기화 방법, = 뒤에 붙은 값을 상수라고 해준다
		int num1 = 0;
		double num2 = 0.0;
		char alphabet = ' ';     // 작은 따옴표 안에 스페이스로 여백을 넣어서 초기화해줘도 가능
		boolean bool = false;
		String string1 = null;   // ""; 큰 따옴표만 가능, null = 메모리화는 했는데 넣을 값을 아직 안정했어
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(alphabet);
		System.out.println(bool);
		System.out.println(string1);
	}
}
