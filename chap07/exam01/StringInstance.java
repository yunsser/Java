package exam01;

public class StringInstance {
	public static void main(String[] args) {
		String hello1 = "안녕하세요!!!";
		String hello2 = new String("안녕하세요!!!, 여러분~");
		
		System.out.println(hello1);
		System.out.println(hello2.length()); // 스페이스도 포함


		String name1 = new String("홍길동");
		String name2 = new String("홍길동");
		String name3 = "홍길동";
		String name4 = "홍길동";
		
		System.out.println(name1);
		
		if(name1 == name2) {
			System.out.println("동일한 인스터스 참조;");
		}else {
			System.out.println("다른 인스터스 참조;");
		}
		
		if(name3 == name4) {
			System.out.println("동일한 인스터스 참조;");
		}else {
			System.out.println("다른 인스터스 참조;");
		}
		
		int length = "Hello, Java World!!!".length(); // 아래 두줄과 똑같은 코드이다
		System.out.println(length);
		
		//String str = new String("Hello, Java World!!!");
		//String str = "Hello, Java World!!!";
		//length = str.length(); // 할당된 주소값으로 이동
		}
}
