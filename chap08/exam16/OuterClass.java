package exam16;

interface Readable{
	public void read(); // 오버라이딩
}

class OuterClass {
	private String name;
	
	OuterClass(String name){
		this.name = name;
	}
	
	public Readable createLocalClassInst(int num) {
	
		return new Readable() { // 인터페이스라서 new를 못하는데 추상메서드를 오버라이딩을 해주면 기능에 대한 재정의가 가능하다

			@Override
			public void read() {
				System.out.println("LocalClass read():" + name);
				System.out.println("num: " +num);
			}
			
		};
	}
	
}
