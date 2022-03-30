package exam13;

class OuterClassOne {
	// field
	NestedClass nst; // 참조변수선언
	
	// 생성자
	OuterClassOne(){
		nst = new NestedClass(); // instance
		nst.simpleMethod();
	}
	
	
	// 메서드
	public void whoAreYou() {
		System.out.println("whoAreYou() 호출....");
		//simpleMethod(); // error
		nst.simpleMethod();
	}
	
	
	// Nested Class // 고~오급 기능 // 클래스라는 이름일뿐
	static class NestedClass{ // 클래스만 static이지 안에 메서드도 static은 아니다
		NestedClass(){ // 생성자 필드 메서드 다 가능
			simpleMethod();
			//whoAreYou(); // error // 되기도 하고 안되기도 함
		}
		
		public void simpleMethod() { // new 하는 순간에만 할당된다 // 참조변수. 으로만 가능하고 다이렉트로는 불가능
			System.out.println("NestedClass => simpleMethod() 호출....");
		}
	}
	
}
