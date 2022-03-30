package exam03;

class StudentScore { // 테이블 = 표 = 참조자료형 // 데이터를 효율적으로 관리하기 위한 방법 // 객체지향 
	// field (멤버변수)
	String name;                             
	int quiz1;
	int midTerm;
	int quiz2;
	int finalTerm;
	
	StudentScore(String n, int q1, int mid,int q2, int f){ // Constructor (생성자), new 메모리 할당을 요청한 곳에 나옴, 참조자료형의 이름과 같아야한다
		//System.out.println("StudentScore() 호출...");
		name = n;
		quiz1 = q1;
		midTerm = mid;
		quiz2 = q2;
		finalTerm = f;
	}
	
	// (멤버) 메서드
	public int sum() { 
		int result = 0;
		
		result = quiz1 + midTerm + quiz2 + finalTerm;
		return result;
	}
	
	public int average() {
		int result;
		
		result = (quiz1 + midTerm + quiz2 + finalTerm) / 4;
		return result;
	}
	
}

public class ConstructorOPP { 	
	public static void main(String[] args) { // 자바는 메인만 관심있다!
		
		System.out.println("프로그램 시작");
		                                                      // 참조변수 // 주소를 참조한다
		StudentScore hongkildong; // 테이블 이름이 자료형이다 // 참조자료형 //int boolean 등등 기본자료형
		hongkildong = new StudentScore("홍길동", 85, 80, 90, 95);
		                                  // 테이블을 실제 데이터로 저장할때는 new로 지정해준다 // 데이터 지정
		                                  // 주소값을 저장할 시작점 // 4바이트
		
		/*
		hongkildong.name = "홍길동"; // 메모리 접근방법 (저장)
		hongkildong.quiz1 = 85;
		hongkildong.midTerm = 80;
		hongkildong.quiz2 = 90;
		hongkildong.finalTerm = 95;
		*/
		
		System.out.println("");
		System.out.println("이    름: " + hongkildong.name);
		System.out.println("퀴   즈1: " + hongkildong.quiz1);
		System.out.println("중간고사: " + hongkildong.midTerm);
		System.out.println("퀴   즈2: " + hongkildong.quiz2);
		System.out.println("기말고사: " + hongkildong.finalTerm);
		
		System.out.println("홍길동의 총점: " + hongkildong.sum());
		System.out.println("홍길동의 평균점수: " + hongkildong.average());
		
		//--------------------------------------------------------------------
		
		StudentScore KangKamChan; // 참조변수
		KangKamChan = new StudentScore("강감찬", 75, 60, 80, 100); // Instance화 > Instance(인스턴스)
		
        /*
		KangKamChan.name = "강감찬";
		KangKamChan.quiz1 = 75;
		KangKamChan.midTerm = 60;
		KangKamChan.quiz2 = 80;
		KangKamChan.finalTerm = 100;
        */
		
		System.out.println("");
		System.out.println(KangKamChan.name);
		System.out.println(KangKamChan.quiz1);
		System.out.println(KangKamChan.midTerm);
		System.out.println(KangKamChan.quiz2);
		System.out.println(KangKamChan.finalTerm);
		
		//--------------------------------------------------------------------
		
		StudentScore LeeSunSin;
		LeeSunSin = new StudentScore("이순신", 95, 90, 85, 80);
		
		/*
		LeeSunSin.name = "이순신";
		LeeSunSin.quiz1 = 95;
		LeeSunSin.midTerm = 90;
		LeeSunSin.quiz2 = 85;
		LeeSunSin.finalTerm = 80;
		*/
		
		System.out.println("");
		System.out.println(LeeSunSin.name);
		System.out.println(LeeSunSin.quiz1);
		System.out.println(LeeSunSin.midTerm);
		System.out.println(LeeSunSin.quiz2);
		System.out.println(LeeSunSin.finalTerm);
		
		System.out.println("이순신의 총점: " + LeeSunSin.sum());
		
		//--------------------------------------------------------------------
		
		StudentScore YoukanSun;
		YoukanSun = new StudentScore("유관순", 75, 90, 85, 100);
		
		/*
		YoukanSun.name = "유관순";
		YoukanSun.quiz1 = 75;
		YoukanSun.midTerm = 90;
		YoukanSun.quiz2 = 85;
		YoukanSun.finalTerm = 100;		
		*/
		
		System.out.println("");
		System.out.println(YoukanSun.name);
		System.out.println(YoukanSun.quiz1);
		System.out.println(YoukanSun.midTerm);
		System.out.println(YoukanSun.quiz2);
		System.out.println(YoukanSun.finalTerm);
		
		//--------------------------------------------------------------------
		
		StudentScore AnJungKun;
		AnJungKun = new StudentScore("안중근", 85, 85, 80, 80);
		
		/*
		AnJungKun.name = "안중근";
		AnJungKun.quiz1 = 85;
		AnJungKun.midTerm = 85;
		AnJungKun.quiz2 = 80;
		AnJungKun.finalTerm = 80;		
		*/
		
		System.out.println("");
		System.out.println(AnJungKun.name);
		System.out.println(AnJungKun.quiz1);
		System.out.println(AnJungKun.midTerm);
		System.out.println(AnJungKun.quiz2);
		System.out.println(AnJungKun.finalTerm);
		
		//--------------------------------------------------------------------
		
		System.out.println("");
		System.out.println("프로그램 종료");
		
	}
	
}
