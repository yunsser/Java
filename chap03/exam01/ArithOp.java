package exam01;

public class ArithOp { // 산술 이항 연산자
	public static void main(String[] args) {
		int num1= 20, num2 = 8;
		int resultInt = 0;
		
		resultInt = num1 + num2; // + 연산자
		System.out.println(num1 + " + " + num2 + " = " + resultInt);
		
		resultInt = num1 - num2; // - 연산자
		System.out.println(num1 + " - " + num2 + " = " + resultInt);
		
		resultInt = num1 * num2; // * 연산자
		System.out.println(num1 + " * " + num2 + " = " + resultInt);
		
		resultInt = num1 / num2; // / 연산자
		System.out.println(num1 + " / " + num2 + " = " + resultInt);
		
		resultInt = num1 % num2; // % 연산자
		System.out.println(num1 + " % " + num2 + " = " + resultInt);
		
		double num3 = 7.8, num4 = 3.2;
		double resultDouble = 0.0;
		
		resultDouble = num3 + num4;
		System.out.println(num3 + " + " + num4 + " = " + resultDouble);
		
		resultDouble = num3 - num4;
		System.out.println(num3 + " - " + num4 + " = " + resultDouble);
		
		resultDouble = num3 * num4;
		System.out.println(num3 + " * " + num4 + " = " + resultDouble);
		
		resultDouble = num3 / num4;
		System.out.println(num3 + " / " + num4 + " = " + resultDouble);
		
		resultDouble = num3 % num4; // 실수형에서는 나머지 연산은 의미 없기 때문에 사용을 잘 안한다
		System.out.println(num3 + " % " + num4 + " = " + resultDouble);
	}
}
