package exam05;

class Person{
	
}

public class UseWrapperClass {
	public static void main(String[] args) {
		Person person = new Person();
		showDate(person);
		
		int num = 10;
		showDate(num);
		
		Integer intInst = new Integer(10);
		showDate(intInst);
	}
	                         // Object obj = new Integer(10);
	public static void showDate(Object obj) {
		System.out.println(obj);
		
		
	}
	

}
