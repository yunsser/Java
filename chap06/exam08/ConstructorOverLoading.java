package exam08;

public class ConstructorOverLoading {
	public static void main(String[] args) {
		
		Person chulsoo = new Person("철수", 20220209);
		Person younghee = new Person("영희");

		chulsoo.showInfo();
		younghee.showInfo();
		
	}
}
