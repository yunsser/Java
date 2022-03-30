package exam14;

class OuterClass {// 인스턴스가 생성이 되어지지 않는다면 소스코드안에서 사용하지않는다고 하면 내부 클래스도 사용이 될 일이 없다 
	private String name; // 의미를 가지는 순간 내부에 정의되어있는 클래스도 의미를 가진다
	private int num;     // 종속적인 관계를 통해 정의를 하는게 가독성이 높다
	
	OuterClass(String name) {
		this.name = name;
		this.num = 0;
		new InnerClass();
	}
	
	public void whoAreYou() {
		num++;
		System.out.println(name + " OuterClass " + num);
	}
	
	    // 내부클래스 (static차이)
	class InnerClass{ 
		InnerClass(){
			whoAreYou(); 
		}
	}
	
}
