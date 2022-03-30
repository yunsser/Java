package exam13;

public class NestedClassTest {
	public static void main(String[] args) {
		OuterClassOne one = new OuterClassOne();
		OuterClassTwo two = new OuterClassTwo();
		
		one.whoAreYou();
		//one.simpleMethod(); // error
		one.nst.simpleMethod(); 
		
		OuterClassOne.NestedClass nst1 = new OuterClassOne.NestedClass(); // Nested Class만 할당
		
		nst1.simpleMethod();
		
		// new OuterClassTwo.NestedClass(); // error
	}
}
