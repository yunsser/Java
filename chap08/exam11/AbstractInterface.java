package exam11;

public class AbstractInterface {
	public static void main(String[] args) {
		
		
		//UI구현 ....
		System.out.println("이름/생년월일 입력 화면.");
		
		
		
		PersonalStorage person = new PersonalStorageThirdparty(1000); // 다형성
		
		person.addPersonalInfo("홍길동", "19920315");
		person.addPersonalInfo("강감찬", "20220703");
		
		String name = person.searchName("19920315");
		
		System.out.println(name);
		
	}
	
}
