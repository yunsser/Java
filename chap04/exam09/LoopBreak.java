package exam09;

public class LoopBreak {
	public static void main(String[] args) {   //조건
		System.out.println("* 1~100사이의 (양의) 짝수값을 출력.");
		
		for(int i = 1; i <= 100; i++) {
			if((i % 2) == 0) { // 0이 나오면 짝수, 1이 나오면 홀수인 조건
				System.out.println(i);
			}
		}
	
		System.out.println("");
		
		System.out.println("* 1 ~ 100사이의 (양의) 5의 배수를 출력");
		
		for(int i = 1; i <= 100; i++) {
			if((i % 5) == 0) {
				System.out.println(i);			
			}
		}
		
		/*
		System.out.println("");
		
		System.out.println("* 1 ~ 100사이의 (양의) 2와 5의 배수를 출력");
		
		for(int i = 1; i <= 100; i++) {
			if((i % 2) == 0 && (i % 5) == 0) {
				System.out.println(i);
			}
		}
		*/
		
		System.out.println("");
		System.out.println("* 1 ~ 100사이의 (양의) 5의 배수이면서 7의 배수인 첫 숫자를 출력");
		
		for(int i = 1; i <= 100; i++) {
			if(((i % 5) == 0) && ((i % 7 == 0))) {
				System.out.println(i);
				break; // 조건을 만족했을때 브레이크 키워드를 만나서 벗어난다
				       // 그럼 결과값이 하나만 된다
			}
			//break; 앞에 i%5만 만나기 때문에 조건문 안에만 넣어줘야한다
		}
		System.out.println("");
		System.out.println("* continue 구문");
		
		int count = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(((i % 5) != 0) || ((i % 7) != 0)) { // != 다르냐?
				// 1 2 3         // 1 2 3 4 5 6 
				continue; 
			}
			
			count++;
			System.out.println(i);
			
		}
		System.out.println(count);
		
	
		
		
			
		
		
		
	}
}
