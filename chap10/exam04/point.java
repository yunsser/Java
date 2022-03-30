package exam04;

class Point implements Cloneable {
	private int xPos;
	private int yPos;
	
	
	Point(int xPos, int yPos){
		this.xPos = xPos;
		this.yPos = yPos;
	}
	
	public void showPosition() {
		System.out.printf("[%d, %d]\n", xPos, yPos);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException { // clone 실행하러 가보면 CloneNotSupportedException 이런 예외가 발생한다 이 예외를 처리할 메서드를 처리하는 쪽에서는 프라이 캐치문으로 캐치를 구성해서 예외를 반드시 처리해야한다
		return super.clone(); // clone 복제
	}
	
	
	
}
