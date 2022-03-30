package exam04;
                    //상속  //부모클래스
class BaseEnSpeaker extends Speaker {
	private int baseRate;
	
	public void setbaseRate(int baseRate) {
		this.baseRate = baseRate;
		
	}
	
	public int getBaseRate() {
		return baseRate;
	}
	
	public void showCurrentState() { // 메서드 오버라이딩(상속인 관계일때), 
		super.showCurrentState(); // 스피커 // 자기 영역 안에서 호출 먼저 하고 있기 때문에 계속 내 자신만 호출을 하고있다
		                              // 그래서 오류가 나서 강제종료를 해준다 (가까운걸 먼저 찾기 때문)
		                              // 오버라이딩된 메서드에서 부모에 정의 되있는 메서드를 호출하고 싶으면
		                              // super 키워드를 이용해서 점프해준다 (상속의 조건 하에서만 유효)
		System.out.println("베이스 크기: " + getBaseRate());
	}
	// 상속의 조건하에서 부모에 정의되어있는 메서드를 자식의 참조자료형 안에 이름,
	// 입력의 매개변수상태와 반환형까지도 모두 동일하게 정의하는 메서드
	
	
	// why? (특징)  
}
