package exam07;

public class AutoBoxingAutoUnBoxing {
	public static void main(String[] args) {
//		String name = new String("홍길동"); // new String("홍길동");
//		int num = 10;
		Integer iValue = 10; // AutoBoxing
		Double dVaule = 3.14; // AutoBoxing
		
		System.out.println(iValue); //AutoUnboxing
		System.out.println(dVaule); //AutoUnboxing
		
		iValue = iValue + 10;
		System.out.println(iValue);
	}
}
