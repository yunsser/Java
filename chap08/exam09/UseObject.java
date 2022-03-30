package exam09;

//import java.lang.*; // 자동 생성

class Person /* extends Object*/{
	private String name;
	
	Person(String name){
		this.name = name;
		}

	@Override             // 오른쪽마우스 -> souce -> override/im....
	public String toString() {
		return name + "님 환영합니다";
	}
	
		
}


public class UseObject {
	public static void main(String[] args) {
		Person person = new Person("홍길동");
		
		           //Object x = person
		System.out.println(person);
		

	}

}
