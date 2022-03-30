package quiz07;

import java.util.Random;

public class Lotto {
	public static void main(String[] args) {
		Random random = new Random();
		
		for(int i=0; i<6; i++) {
			int num1 = random.nextInt(45);
			System.out.println(num1);
			
		}
		
		
		
	}
}
