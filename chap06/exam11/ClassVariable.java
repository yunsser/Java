package exam11;

class InstCnt{
	static int instNum; // static, 이름에 바로 접근할수있는 특징을 가진다, 이름으로 그대로 접근
	
	InstCnt(){ // 생성자
		instNum++;
		System.out.println("인스턴스 생성: "+ instNum);
	}
}

public class ClassVariable {

	public static void main(String[] args) {
		InstCnt.instNum = 10; // 클래스변수
		
		
		InstCnt.instNum ++;
		System.out.println(InstCnt.instNum);
		
		InstCnt cnt1 = new InstCnt(); // cnt1에 주소값 저장
		InstCnt cnt2 = new InstCnt();
		InstCnt cnt3 = new InstCnt(); // cnt3 공유 데이터라 프린트로 읽을수있다
		
		System.out.println(cnt1.instNum);
		System.out.println(cnt2.instNum);
		System.out.println(cnt3.instNum);
		
		
		
	}

}
