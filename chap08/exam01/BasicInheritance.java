package exam01;

public class BasicInheritance {
	public static void main(String[] args) {
		Student student = new Student("이순신", "20010815", "서울시 종로구", "abc@email.com", "더조은it대학", "경영학"); 
		                 //자식 생성자                 // 부모한테 줘야하는 생성자
		BusinessMan bman = new BusinessMan( "홍길동", "19960915", "서울시 서대문구", "def@email.com", "더조은it", "영업부", "20210214"); 
		
		student.displayStudentInfo();
		System.out.println();
		bman.displayBusinessManInfo();
		
		System.out.println();
		student.displayFriendInfo(); // 자식에 다 포함되어있는 개념으로 사용할수있다
		System.out.println();
		bman.displayFriendInfo();
	}
}
