package exam06.cal;

//하나의 소스파일에는 public 한번만 사용가능

public class Calculator { // 계산기 기능
	Adder adder; // 필드, 참조변수, 주석값 담으려고 선언하는 변수
	Subtractor subtractor;
	 
	public Calculator(){ // 메모리할당, 필드값을 초기화해준다
		 adder = new Adder(); // 메모리에 4바이트 할당
		 subtractor = new Subtractor(); 
	}
	public int addTwoNumber(int num1, int num2) {
		int result = 0;
		
		result = adder.addTwoNumber(num1, num2);
		return result;
	}
	public int subTwoNumber(int num1, int num2) {
		int result = 0;
		
		result = subtractor.subTwoNumber(num1, num2);
		return result;
	}
	
	public void showOperationTimes() {
		System.out.println("덧셈횟수: " + adder.getCntAdd());
		System.out.println("뺄셈횟수: " + subtractor.getCntSub());
	}
}

class Adder{ // 덧셈기능
	private int cntAdd; // 덧셈이 몇번 호출 당햇는지
	Adder(){
		cntAdd = 0;
	}
	
	int addTwoNumber(int n1, int n2) {
		cntAdd++;
		return n1 + n2;
	}
	
	int getCntAdd() {
		return cntAdd;
	}
}

class Subtractor{ //뺄셈기능
	private int cntSub;
	
	Subtractor(){
		cntSub = 0;
	}
	
	int subTwoNumber(int n1, int n2) {
		cntSub++;
		return n1 - n2;
	}
	int getCntSub() {
		return cntSub;
	}
	
}

