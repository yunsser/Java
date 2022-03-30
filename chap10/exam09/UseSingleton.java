package exam09;

class CalendarExam {
	private static CalendarExam instance /*= new CalendarExam()*/ ; // 참조변수(주소값 저장) 선언
	
	CalendarExam(){}
	
	public static CalendarExam getInstance() {
		return instance;
	}
}


public class UseSingleton {
	public static void main(String[] args) {
		CalendarExam calendar1 =  CalendarExam.getInstance(); // singleton
		CalendarExam calendar2 =  CalendarExam.getInstance(); // singleton
		
		
	}
}
