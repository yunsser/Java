package exam15;

interface Readable{
	public void read(); // 오버라이딩
}

class OuterClass {
	private String name;
	
	OuterClass(String name){
		this.name = name;
	}
	
	public Readable createLocalClassInst(int num) {
	
		class LocalClass implements Readable {// 메서드 안에서도 클래스를 선언 할 수 있다 // 지역변수 	
			public void read() {
				System.out.println("LocalClass read(): ");
				System.out.println("num: " + num);
			}
		}
		
		LocalClass localClass = new LocalClass();
		//localClass.read();
		return localClass;
	}
	
}
