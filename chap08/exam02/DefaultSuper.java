package exam02;

class ParentClass {// 참조자료형 // 데이터 관리용으로 선언
	int num1; // ④
	
	//ParentClass(){} // 오버로딩 매개변수의 갯수가 다르던가 자료형의 타입이 다르면 된다
	
	ParentClass(int num){ // 자료형을 상속 받아서 자식 클래스로 정의한다고 했을떄 생성자를 호출했을때 초기화된다고 생각해줘야한다
		this.num1 = num;
	}
}
class ChildClass extends ParentClass{
	ChildClass(int num){ //② // default 생성자 // 부모에 정의되어있는 필드를 초기화할 의무를 가진다 super
		super(num); // ③ // 부모에 정의되어있는 생성자 호출 ParentClass(int num)
	}
	
}

public class DefaultSuper {
	public static void main(String[] args) {
		new ChildClass(5); // 여기에 이렇게 적으면 된다 // 정수값이면 된다 // ①
	}
}
