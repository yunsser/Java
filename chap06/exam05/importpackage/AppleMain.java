package exam05.importpackage;

import exam05.Buyer; // 이렇게 쓰면 이름만으로도 사용이 가능하다
                       // ctl + shift + o (단축키)

public class AppleMain {

	public static void main(String[] args) {
		//exam05.Buyer mother = new exam05.Buyer(1000000); // new = 3가지 동작 // 메모리할당, 생성자호출, 참조값 반환
		Buyer mother = new Buyer(100000);
		
	}
}
