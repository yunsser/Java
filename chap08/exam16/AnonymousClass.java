package exam16;

public class AnonymousClass {

	public static void main(String[] args) {
		OuterClass outer = new OuterClass("Frist");
			
		Readable localClass = outer.createLocalClassInst(10);
		localClass.read();
		}
		
}
