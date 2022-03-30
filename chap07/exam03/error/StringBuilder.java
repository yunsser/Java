package exam03.error;

public class StringBuilder { // 자바가 제공해주는 참조, 클래스 이름으로 짓지않기 (오동작이 일어날 확률이 높음)
	
	public StringBuilder(String str){} // 디폴트 생성자를 내부적으로 생성해서 호출해준다
	
	
	public static void main(String[] args) {
		StringBuilder build = new StringBuilder("StringBuilder 클래스"); 
		// 퍼블릭클래스와 이름이 같으면 안됨

		//java.lang.StringBuilder build = java.lang.new StringBuilder("StringBuilder 클래스"); // 이렇게도 가능
		
		// 메서드 오버로딩 
		// 참조 자료형 생성할때 매개변수의 이름이 똑같으면 그 안에서 값을 초기화할때
		// this. 이라는 초기화 값을 넣지 않으면 문제가 생긴다
	}
}
