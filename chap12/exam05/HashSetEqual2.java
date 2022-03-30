package exam05;

import java.util.HashSet;

class Person{
	String name;
	int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name + " : " + age;
	}

	@Override
	public int hashCode() {
		return (name + age).hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person tmp = (Person)obj;
			return name.equals(tmp.name) && (age == tmp.age);
		}
		
		return false;
	}
	
	
}


public class HashSetEqual2 {
	public static void main(String[] args) {
		HashSet<Person> set = new HashSet<Person>();
		
		set.add(new Person("홍길동", 25));
		set.add(new Person("이순신", 27));
		set.add(new Person("강감찬", 30));
		set.add(new Person("안중근", 32));
		set.add(new Person("강감찬", 32));
		set.add(new Person("안중근", 32));
		
		for(Person e : set) { // Person e 참조변수
			System.out.println(e); // 내부에서 toString 메서드를 호출 (오버로딩한다)
		}
	}
}




