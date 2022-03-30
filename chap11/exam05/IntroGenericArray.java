package exam05;

public class IntroGenericArray {
	public static void main(String[] args) {
		String[] stArr = {"Hi", "I'm so Happy", "Java Generic Programming"};
		
		showArrayData(stArr);
	}
	
	private static <T> void showArrayData(T[] arr) {
		for(T e : arr) {
			
		}
		
	}

}
