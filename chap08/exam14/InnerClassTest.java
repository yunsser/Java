package exam14;

public class InnerClassTest {
	
	
	public static void main(String[] args) {
		OuterClass outer1 = new OuterClass("First");
		OuterClass outer2 = new OuterClass("Second");
		
		//new OuterClass.InnerClass(); // error
		OuterClass.InnerClass inner1 = outer1.new InnerClass(); // outer1에 종속적인 innerclass
		OuterClass.InnerClass inner2 = outer1.new InnerClass();
		
		OuterClass.InnerClass inner3 = outer2.new InnerClass(); // outer2에 종속적인 innerclass
		OuterClass.InnerClass inner4 = outer2.new InnerClass();
		
		
	}
}
