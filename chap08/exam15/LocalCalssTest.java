package exam15;

public class LocalCalssTest {
	
	public static void main(String[] args) {
		OuterClass outer = new OuterClass("Frist");
		
		Readable localClass = outer.createLocalClassInst(10);
		localClass.read();
	}
}
