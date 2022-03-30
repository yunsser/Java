package exam04;

public class IntriArray {
	public static void main(String[] args) {
		int korean = 90, english = 95, math = 85, social = 95, science = 90;
		// 모든 데이터의 자료형이 int 라는 동일한 자료를 가지고 있따
		// 데이터의 타입이 동일한 경우, 연속적으로 데이터를 할당해서 관리 할 수 있다
		// 또한 연속적으로 메모리를 할당해주기 때문에 int형의 데이터를 담을수있는
		// 연속적으로 데이터를 할당할 5개의 데이터를 요청해준다
		
		System.out.println("국어: " + korean);
		System.out.println("영어: " + english);
		System.out.println("수학: " + math);
		System.out.println("사회: " + social);
		System.out.println("과학: " + science);
		
		System.out.println("=============================");
		
		// 가독성이 떨어진다
		// 실제 실무에서는 코드의 양의 길이가 엄청 길기 때문에
		// 군데군데 변수 선언이 되버리면 가독성이 떨어지므로
		// 맨위에 변수를 선언하는 것이 가독성이 좋으므로 그렇게 하자
		
		                       //1차원자료
		int[] leesoonsin = new int[5]; // 참조자료형의 메모리할당, 연속적으로 int의 데이터를 할당해준다
		                               // 4바이트 짜리 데이터를 연속으로 할당해준다 >> 5개니까 20바이트
		//int leesoonsin[] = new int[5]; // 가능은 하나 많이 쓰지는 말자
		
		
		leesoonsin[0] = 90;
		leesoonsin[1] = 95;
		leesoonsin[2] = 85;
		leesoonsin[3] = 95;
		leesoonsin[4] = 90;
		
//		System.out.println(leesoonsin[0] = 90);
//		System.out.println(leesoonsin[1] = 95);
//		System.out.println(leesoonsin[2] = 85);
//		System.out.println(leesoonsin[3] = 95);
//		System.out.println(leesoonsin[4] = 90);
		
		for(int i = 0; i < leesoonsin.length; i++) {
			System.out.println(leesoonsin[i]);
		}
		
		System.out.println("=============================");
		// 배열 선언 및 초기화
		// int[] hongkildong = new int[] {70, 65, 80, 90, 75}; // 초기화는 {}를 하고 데이터를 바로 넣어준다
		int[] hongkildong = {70, 65, 80, 90, 75}; 
		
		for(int i = 0; i < hongkildong.length; i++) {
			System.out.println(hongkildong[i]);
		}
		
		
	}
}
