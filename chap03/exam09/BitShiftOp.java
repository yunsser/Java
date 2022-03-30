package exam09;

public class BitShiftOp { // 비트시프트연산자
	public static void main(String[] args) {
		byte num = 2; // 00000010
		
		System.out.println(num << 1); // 00000100, 한 비트를 옮긴다
		System.out.println(num << 2); // 00001000, 두 비트를 옮긴다
		System.out.println(num << 3); // 00010000, 세 비트를 옮긴다
		
		num = 8;
		System.out.println(num >> 1); 
		System.out.println(num >> 2); 
		System.out.println(num >> 3); 
	}
}
