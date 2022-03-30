package exam01;

public class SystemOutPrintln {
	
	public static void main(String[] args) {
		System.out.println("Hello, Java!!!");
		
		System.out.println(100);
		System.out.println(3.14);
		
		System.out.println(100+35);
		System.out.println(100-35);
		System.out.println(100*35);
		System.out.println(100/35);
		
		System.out.println("100+35"); // "" 안에 작성하면 문자열로 인식한다, 
		                              // 문장 (두 글자이상) = 문자열 이라 불린다
		System.out.println("100");    // 데이터라 부르고, 컴퓨터가 이해 할수 있는 데이터가 정해져있다
		
		System.out.println("나이 : " + 25);   // 문자열에 숫자를 더 하면 내용이 출력된다, 프로그램 언어만의 특징
		//System.out.println("나이 : " + "25"); // 숫자를 문자열 해버려서 결과가 똑같다
		//System.out.println("나이 : 25");      // 문자열과 문자열을 결합 시켜준다
                                              // 출력을 확인할려고 하는 결과값
		System.out.println("100+35="+(100+35)); // 앞엔 문자열이라 그대로 출력하고 연산순위는 ()가 높아서 먼저본다
		//System.out.println("100+35="+135);  
		//System.out.println("100+35="+"135"); // 문자열과 문자열을 +로 결합 해준다
		//System.out.println("100+35=135");
		
		System.out.println("100-35="+(100-35));
		
	}
}
