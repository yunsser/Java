package exam06;

public class BoxingUnboxing {

	public static void main(String[] args) {
//		int num = 10;
		Integer iValue = new Integer(10); // 원래의 정수값을 클래스로 포장한다 // Boxing
		Double dValue = new Double(3.14); // 실수의 데이터를 클래스로 박싱한다 // Boxing
		
		System.out.println(iValue.intValue()); // 클래스안에 감싸져있는 데이터 꺼내오기 // Unboxing
		System.out.println(dValue.doubleValue()); // Unboxing
		
		int num1 = iValue.intValue();
		double num2 = dValue.doubleValue();
		
		System.out.println(num1);
		System.out.println(num2);
		
		iValue = new Integer(iValue.intValue() + 10);
		
		System.out.println(iValue.intValue());
	}
}
