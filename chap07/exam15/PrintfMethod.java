package exam15; // %s 문자열, %d 정수, %f 실수, %c 문자

//import java.lang.System; 
//import java.lang.String;
//import java.lang.*; // 모든 참조형들을 가져오겠다 // 모든 클래스들이 다가져오기 때문에 파일 사이즈가 커짐, 비추

public class PrintfMethod {
	public static void main(String[] args) {
		int age = 20; // 나이
		double tall = 175.7; // 키
		String name = "홍길동"; // 이름
		
		System.out.println("제 이름은 " + name + "입니다");
		System.out.printf("제 이름은 %s 입니다\n", name);// %s 는 문자열을 출력한다 (서식문자)
		                                                 // %s << 약자로 쓰고 ,name로 넣어준다는 입력을 해주면 된다
		                                                 // print는 같은 줄에 써지기 때문에 \n 넣어 줄을 바꿔준다
		System.out.printf("나이는 %d살이고, 키는 %.2f입니다\n", age, tall);
		// %d (Decimal) 정수형 // %f 실수형(소숫점 6자리), %.2f 소숫점 2번째 자리까지만 나오한다 
		System.out.printf("%d, 0x%x, 0%o\n", 77, 77, 77); // 0x%x 16진수로 출력, 0%o 8진수
		System.out.printf("%f, %e\n", 0.00014, 0.00014);
		System.out.printf("%g, %e\n", 0.00014, 0.000014); // %g 출력의 실수값의 따라서 %e or %f로 적절하게 알아서 출력해준다
	}
}
