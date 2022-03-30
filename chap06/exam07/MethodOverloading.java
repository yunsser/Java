package exam07;

class Adder{ //참조자료형 (주소를 참조하여 접근), 메서드 정의시에 원칙은 (필드)원칙은 동일한 이름으로 정의 불가능
	public int add(int n1, int n2) { return n1 + n2; } // 정수값 반환이니까 int
	public double add(double n1, double n2) { return n1 + n2; } // 메서드 오버로딩 동일한 이름으로 메서드 정의가 가능하다
	public double add(int n1, double n2) { return n1 + n2; }      // 조건 : 메서드 정의시에 입력으로 전달되는 
	public double add(double n1, int n2) { return n1 + n2; }             // 매개변수의 타입이 서로 다르면 동일이름
	public double add(double n1, int n2, int n3) { return n1 + n2 + n3; }// 메서드를 정의할수있다
	
	 /* 주의 반환형 타입이 다른 것은 오버로딩에 영향을 미치지 않는다
	 public double add(int n1, int n2) { return n1 + n2; }
	 */
	
	//메서드 오버로딩은 참조자료형 일시에 같은 이름을 두개 이상 정의할수있는것
	//단 매개변수의 갯수가 다르거나 또는 자료형이 서로 다를 경우에 동일한 이름의 메서드를 두개 이상 정의할수있다
}

public class MethodOverloading {
	public static void main(String[] args) {
		Adder adder = new Adder(); // 메모리할당, instance 화
		
		System.out.println("100 + 200 = " + adder.add(100, 200));
		System.out.println("3.14 + 5.45 = " + adder.add(3.14, 5.45));
		System.out.println("3 + 5.45 = " + adder.add(3, 5.45));
		System.out.println("3.14 + 5 = " + adder.add(3.14, 5));
		System.out.println("3.14 + 5 + 10 = " + adder.add(3.14, 5, 10));
		System.out.println("3 + 5 + 10 = " + adder.add(3, 5, 10)); // 자동형변환
		
		
		
	}
}
