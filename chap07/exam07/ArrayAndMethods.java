package exam07;

public class ArrayAndMethods {
	public static void main(String[] args) {
		int[] arr= {1, 2, 3, 4, 5}; // 중괄호 앞new int[] 생략
		    //주소값
		int num = 5; // 
		int[] ref = null; // 리턴값 저장
		
		ref = addAllArray(arr, num);
		
		for(int i=0; i < arr.length; i++) {
			System.out.println(arr[i]); // ①
		}
		
		System.out.println("=====================");
		
		if(arr == ref) {
			System.out.println("같은 메모리 영역 참조");
		}else {
			System.out.println("다른 메모리 영역 참조");
		}
		
		for(int i=0; i < ref.length; i++) {
			System.out.println(ref[i]); // ①
		}
	}
		                              //주소값 전달 받을거
	public static int[] addAllArray(int[] a, int n) {
		n = 10; // 새로운 값 대입.
		
		
		for(int i=0; i < a.length; i++) {
			a[i] += 10;
		}
		
		for(int i=0; i < a.length; i++) {
			System.out.println(a[i]); // ② 1번과 2번은 결과값이 똑같다
		}
		
		System.out.println("=====================");
		
		return a;
		
	}
	
}
