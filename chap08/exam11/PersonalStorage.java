package exam11; // 추상클래스

            // PersonalNumberStorage
//abstract class PersonalStorage { // 상속의 관계를 만들어서 메서드들을 오버라이딩을 해서 이 메서드를 자식으로 기능해달라고(호출) 할때 씀
interface PersonalStorage {
	public /*abstract*/ void addPersonalInfo(String name, String perNum); 
	public /*abstract*/ String searchName(String perNum);
}
