package exam08;

public class AutoBoxingAutoUnboxingOp {
	public static void main(String[] args) {
		Integer num1 = 10; // new Integer(10); 5버전때 부터 생략 가능
		Integer num2 = 20;
		
		num1++; // num1 += 1; // num1 = new Integer(num1.intValue()+1);
		System.out.println(num1);
		
		int addResult = num1 + num2;
		             // num1.intValue() + num2.intValue()
		
		
		System.out.println(addResult);
		
	}
}
