package exam06;

import java.util.TreeSet; // 성능이 가장 떨어짐 // 알파벳 순서대로 정리함
//import java.util.HashSet; // 이게 더 많이 사용됨 

public class IntroTreeSet {
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>(); // TreeSet = 데이터에 대한 중복을 허용하지 않겠다, 저장 순서를 유지하지 않는대신에 정렬해서 알려준다
//		HashSet<String> set = new HashSet<String>(); 
		
		// 데이터 저장
		set.add("First");
		set.add("Third");
		set.add("Second");
		set.add("Second");
		set.add("Fourth");
		
		System.out.println(set.size()); // 저장된 갯수
		
		for(String e : set) {
			System.out.println(e); // 알파벳 순서
		}
	}
}
