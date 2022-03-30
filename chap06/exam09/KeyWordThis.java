package exam09;

public class KeyWordThis {
	public static void main(String[] args) {
		Person chulsoo = new Person("철수", 20220209); // new = 메모리할당, 생성자호출, 주소값반환
		Person younghee = new Person("영희"); // ①메모리 할당
		
		chulsoo.showInfo();
		younghee.showInfo();
		
//		this.showInfo(); 철수껀지 영희껀지 알수가 없기 때문에 다른 변수를 선언해서 사용한다
		
	}
}
