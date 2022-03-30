package exam02;

import java.util.Iterator;
import java.util.LinkedList;

public class IntroLinkedList {
	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
		
		// 데이터 저장
		list.add(10);  // Auto Boxing
		list.add(20);
		list.add(30);
		list.add(20);
		
		// 데이터 참조
		for(int i = 0; i < list.size(); i++) { 
			System.out.println(list.get(i));
		}
		
		System.out.println("======================");
		
		// 데이터 삭제
		list.remove(1); // 위에 20이 삭제된다
		
		for(int i = 0; i < list.size(); i++) { 
			System.out.println(list.get(i));
		}
		System.out.println("======================");
		
//		Iterator<Integer> itr = list.iterator();
//		
//		while(itr.hasNext()) { 
//			System.out.println(itr.next()); 
//		}
//		
//		System.out.println("======================");
//		
//		for(Integer e : list) {
//			System.out.println(e);
//		}
		
		
	}
}
