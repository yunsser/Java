/*
변수, 메모리 접근방식, 연산자 우선순위
*/
package exam01;

public class DefineVariable {
	public static void main(String[] args) {
		// 5489 + 9527 = ?
		System.out.println(5489 + 9527);
		
		int data1; // (1)메모리 저장 공간 할당
		int data2;  // 변수 = 데이터를 보관하기 위해서 할당한 데이터보관함
		int sum;
		//int int; // 예약어는 사용금지
		//int 1_data; // 숫자로 시작불가
		//int data_1; // 특수문자는 웬만하면 안쓰는게 좋다
		//int data 1; // 공백 사용불가
		//int numberNameFriend; // 너무 긴 이름도 좋지 않다, 2~3단어 정도 조합 + 약자로 많이 이용
		//byte number;
		
		//data1 = 3.14;
		
		data1 = 5489; // =은 오른쪽에 있는 값을 왼쪽으로 저장해줘라는 기호로 사용된다
		              // (2)메모리 접근 (데이터 저장)
		data2 = 9627; 
		
		System.out.println(data1); // (3)메모리 접근 방법 (데이터 읽어오기)
		System.out.println(data2); 
		
		System.out.println(data1 + data2); 
		System.out.println(data1 - data2); 
		System.out.println(data1 * data2); 
		System.out.println(data1 / data2); 
		
		sum = data1 + data2; // 연산자 우선순위 
		System.out.println(sum);
		
		System.out.println(sum / 100); 
		
		data1 = 1234; // 메모리 재사용
		data2 = 4321; 
		
		System.out.println(data1); 
		System.out.println(data2);
	}

}
