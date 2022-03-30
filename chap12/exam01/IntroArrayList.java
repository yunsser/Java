package exam01;

import java.util.ArrayList;
import java.util.Iterator;

public class IntroArrayList {
	public static void main(String[] args) {
		
		/*
		Integer num1 = new Integer(10);
		Integer num2 = new Integer(20);
		Integer num3 = new Integer(30);
		
		Integer[] num = new Integer[3];
		num[0] = new Integer(10);
		num[1] = new Integer(20);
		num[2] = new Integer(30);
		*/
		
		ArrayList<Integer> list = new ArrayList<>(); // <> 안써도 호환성있게 에러를 내지 않고 사용할수 있다 // 8버전 이후로는 Interger 생략가능
		
		// 데이터(instance-참조변수) 저장 방법
		/*
		list.add(new Integer(10)); // 리스트가 데이터를 관리한다 // 오토박싱
		list.add(new Integer(20)); 
		list.add(new Integer(30)); 
		*/
		
		list.add(10); // Integer 생략 가능하게 지원해준다 // 자료형만 위에 지정해주면 사용가능 // 데이터 중복허용 // 정렬 잘됨 
		list.add(20);
		list.add(30);
		list.add(20);
		
		//데이터 참조 (읽어오는법)
		for(int i = 0; i < list.size(); i++) { // 사이즈를 통해 데이터의 갯수를 불러와준다
			System.out.println(list.get(i));
		}
		
		System.out.println("====================");
		
		Iterator<Integer> itr = list.iterator();
		
		while(itr.hasNext()) { 
			System.out.println(itr.next()); 
		}
		
		System.out.println("====================");
		
		for(Integer e : list) {
			System.out.println(e);
		}
		
		
	}
}
