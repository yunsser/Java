package exam04;

public class CompoudOp { // 복합대입연산자 (누적)
	public static void main(String[] args) {
		int num = 125;
		//int result = 0;
		
		num += 50; //num = num + 50; // 대입이 되는 순간 num에 125는 사라지고 175가 저장된다
		System.out.println(num);
		
		num -= 50; //num = num - 50; // 현재 내 값에서 50을 빼서 누적해라
		System.out.println(num);
		
		num *= 50; //num = num * 50; // 현재 내 값에서 50을 곱해서 누적해라
		System.out.println(num);
		
		num /= 50; //num = num / 50;
		System.out.println(num);
		
		num %= 50; //num = num % 50; 
		System.out.println(num);
		
		
	}
}
