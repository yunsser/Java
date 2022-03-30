package exam03;

public class BuilderString {
	public static void main(String[] args) {
		//StringBuilder str = new StringBuilder("Smart"); // 애에 들어가는 메모리들을 순차적으로 적어준 것
		           // 인스턴스 (참조자료형)
		StringBuffer str = new StringBuffer("Smart");
		
//		str.append(" and ");
//		str.append("Simple, ");
//		str.append(true);
//		str.append(25);
//		str.append(3.14);
		str.append(" and ").append("Simple, ").append(true).append(25).append(3.14);
		System.out.println(str);
		
		str.insert(22, false); // 앞에 22는 위치 스페이스바도 포함 0부터 카운터
		System.out.println(str);
		
	}
}
