/*
실수의 연산, e표기법
 */

package exam03;

public class DoubleType {
	public static void main(String[] args) {
		double data1 = 3.14, data2 = 1.05;
		System.out.println(data1 - data2);
		
		data1 = 2.24;
		data2 = 1.22;
		System.out.println(data1 - data2); // 실수를 표현하는 수의 한계로 인해 오류가 발생한다
		
		double e1 = 1.2e-3; // 1.2 곱하기 10의 -3승, e = (10의 n승), e표기법(1.2 * 10^-3)
		double e2 = 1.2e+3; // 1.2 곱하기 10의 3승, 플러스는 생략가능 e표기법(1.2 * 10^3)
		
		System.out.println(e1);
		System.out.println(e2);
		
	}

}
