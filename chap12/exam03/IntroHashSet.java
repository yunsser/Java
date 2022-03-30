package exam03; // 예제 chap08 - exam15

import java.util.HashSet; // ctrl + shift + o
import java.util.Iterator;

public class IntroHashSet {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		
		// 데이터 저장
		set.add(10);  // Auto Boxing 
		set.add(20);
		set.add(30); // 이 데이터는 중복되니까 셋시킨다
		set.add(20);
		
		// 데이터 참조
		/*
		for(int i = 0; i < set.size(); i++) { 
			System.out.println(set.get(i));
		}
		*/
		
		Iterator<Integer> itr = set.iterator();  // 중복데이터는 해당하지않고 저장 순서도 달라진다 // set의 특징
		
		while(itr.hasNext()) { // itr 여기에 데이터가 있는지 물어보고 있으면 true를 내준다
			System.out.println(itr.next()); // next를 넣어 값을 가져와준다
		}
		
		
		System.out.println("======================");
		
		// 데이터 삭제
		set.remove(10); // 위에 10이 삭제된다
		
		itr = set.iterator(); // 삭제하고 난 후 다시 업데이트를 해줘야한다
		
		while(itr.hasNext()) { 
			System.out.println(itr.next()); 
		}

		
		System.out.println("======================");
		
		HashSet<String> str = new HashSet<String>();
		
		str.add("홍길동");
		str.add("강감찬");
		str.add("이순신");
		str.add("강감찬");
		
		for(String e : str) {
			System.out.println(e);
		}
		
	}
}
