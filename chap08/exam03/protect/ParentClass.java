package exam03.protect;

public class ParentClass { // 다른 패키지에서도 사용가능 // 필드만 정의 되어있는 참조자료형
	private int num1;
	int num2;
	protected int num3; // 상속의 관계 하에서 의미를 가지는 접근제어 지시자, 상속의 관계하에서는 서로다른 패키지라 하더라도 접근 가능
	public int num4;
	
	public ParentClass(int num1, int num2, int num3, int num4) { // 생성자 // 퍼블릭으로 되어있어야 호출이 가을함
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		this.num4 = num4;
		
	}
	
	public void childMethod() { // 정석적인 방법은 여기에 작성하는 것
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		System.out.println("num3 = " + num3); 
		System.out.println("num4 = " + num4); 
	
	}
}
	
