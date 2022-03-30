package exam07;

import java.util.TreeSet;

class Person implements Comparable<Person>{
	String name;
	int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
		
		public void showData() {
			System.out.println("이름: " + name);
			System.out.println("나이: " + age);
	}

	@Override 
	public int compareTo(Person o) { // 정렬의 기준 // 나이순 정렬의 기준 //동일 데이터에대한 필터링 
		if(age > o.age) {
			return 1;
		}else if(age == o.age) {
			return 0;
		}else {
			return -1;
		}

		
	}
}
	

public class ComparablePerson {
	public static void main(String[] args) {
		TreeSet<Person> set = new TreeSet<Person>();
		   
		 //compareTo
		set.add(new Person("홍길동", 25)); // Person p1 = new Person("홍길동", 25);
		set.add(new Person("이순신", 27)); // Person p2 = new Person("이순신", 27);
		set.add(new Person("강감찬", 30)); // Person p3 = new Person("강감찬", 30);
		set.add(new Person("안중근", 32)); // Person p4 = new Person("안중근", 32);
		set.add(new Person("강감찬", 34)); // Person p5 = new Person("강감찬", 34);
		set.add(new Person("안중근", 32)); // Person p6 = new Person("안중근", 32);
		
		for(Person e : set) { 
			e.showData();;
		}
	}
}






