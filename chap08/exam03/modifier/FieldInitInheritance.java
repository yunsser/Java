package exam03.modifier; // 상속

import exam03.protect.ParentClass;

class ChildClass extends ParentClass{
	ChildClass(int n1, int n2, int n3, int n4 ){
		super(n1, n2, n3, n4);
	}
	
//	public void childMethod() { 접근 제어 방법을 체크하기 위한 예제
//		//System.out.println("num1 = " + num1); // 접근불가 (private)
//		//System.out.println("num2 = " + num2); // 접근불가 (default-다른패키지)
//		System.out.println("num3 = " + num3); // 접근가능 (protected)
//		System.out.println("num4 = " + num4); // 접근가능 (public)
//		
//	}
}

public class FieldInitInheritance {
	public static void main(String[] args) {
		ChildClass child =new ChildClass(1, 2, 3, 4);

		child.childMethod();
	}
}
