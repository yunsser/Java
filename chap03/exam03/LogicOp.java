package exam03;

public class LogicOp { // 논리연산자 (&&, ||, !)
	                                //and or not
	public static void main(String[] args) {
		boolean X1 = false, X2 = false;
		
		System.out.println(X1 + " && " + X2 + " = " + (X1 && X2));
		System.out.println(X1 + " || " + X2 + " = " + (X1 || X2));
		System.out.println("");
		
		X2 = true;
		System.out.println(X1 + " && " + X2 + " = " + (X1 && X2));
		System.out.println(X1 + " || " + X2 + " = " + (X1 || X2));
		System.out.println("");
		
		X1 = true; X2 = false;
		System.out.println(X1 + " && " + X2 + " = " + (X1 && X2));
		System.out.println(X1 + " || " + X2 + " = " + (X1 || X2));
		System.out.println("");
				
		X1 = true; X2 = true;
		System.out.println(X1 + " && " + X2 + " = " + (X1 && X2));
		System.out.println(X1 + " || " + X2 + " = " + (X1 || X2));
		System.out.println("");
		
		System.out.println(!X1); // X1이라는 값이 true이면 false를 출력해주고, false이면 true를 출력해준다
		                         // 반전이기 때문에
	}
}
