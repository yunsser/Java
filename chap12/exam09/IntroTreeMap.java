package exam09;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeMap;

public class IntroTreeMap {
	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>(); // 뒤에 <> 만 써도 가능
		
		map.put(/*new Integer(6)*/6, "dara6");
		map.put(5, "dara5");
		map.put(4, "dara4");
		map.put(2, "dara3");
		map.put(1, "dara2");
		map.put(3, "dara1");
		
		NavigableSet<Integer> navi = map.navigableKeySet(); // key 값
		
		System.out.println("=== 오름 차순 ===");
		Iterator<Integer> itr =  navi.iterator(); // key 값
		
		while(itr.hasNext()) {
			System.out.println(map.get(itr.next())); // key 값 반환
		}
		
		
		System.out.println("=== 내림 차순 ===");
		itr = navi.descendingIterator(); // 위에서 값을 가져옴
		
		while(itr.hasNext()) {
			System.out.println(map.get(itr.next())); // key 값 반환
		}
		
		
	}
}
