package exam12;

class ClassPrinter {
	                   // Object obj = pos1
	public static void print(Object obj) { // 호출할수 있게 스태틱으로 정의함 // 자기자신에 참조변수를 전달 받을 수 있다
		String org = obj.toString(); // 자바에 의해서 정해져있는 메서드 호출 // 오버라이딩 되어 있으면 오버라이딩 된 걸 호출한다
		
		if(obj instanceof UpperCasePrintable) {
			org = org.toUpperCase(); // org의 문자열을 영문을 전부다 대문자로 리턴해준다 // 새로운 메모리에 저장 후 리턴
		}
		
		System.out.println(org);
		
		
		
	}
	
	
	
}
