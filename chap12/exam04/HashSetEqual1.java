package exam04;

import java.util.HashSet;

class Num{
	int num;
	
	Num(int num){
		this.num = num;
	}

	@Override
	public String toString() {
		return "" + num /* String.valueOf(num) */; // 인트를 리턴을 못 시키니까 문자열로 리턴
	}

	@Override
	public boolean equals(Object obj) {
		Num comp = (Num)obj;
		
		if(num == comp.num) {
			return true;
		}else {
			return false;
		}
	
	}

	@Override
	public int hashCode() {
		return num % 3;
	}
	
	
}

public class HashSetEqual1 { // set = 중복 허용 안하고 저장 순서를 유지하지 않는다, 저장하는 순간에 체크
	public static void main(String[] args) {
		HashSet<Num> set = new HashSet<>(); // 
		
		set.add(new Num(10)); // 저장 순서는 유지되지 않는다
		set.add(new Num(20));
		set.add(new Num(10)); // set.add를 하면 equal를 호출 하면서 주소값을 비교한다
		set.add(new Num(30)); // 
		
		for(Num e : set) {
			System.out.println(e);
		}
	}
}
