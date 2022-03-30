package exam06;

class Box{
	public void simpleWrap(){
		System.out.println ("simple wrap");
	}
}
	
class PaperBox extends Box {
	public void paperWrap() { 
		System.out.println ("paper wrap");
	}
}

class GoldPaperBox extends PaperBox { // 여기가 오버라이딩
	public void goldWrap() {
		System.out.println ("gold wrap");
	}
}


public class InstanceOf {
	public static void main(String[] args) {
		Box box1 = new Box();
		PaperBox box2 = new PaperBox();
		GoldPaperBox box3 = new GoldPaperBox();
		
		wrapBox(box3);
		wrapBox(box2);
		wrapBox(box1);
	}
	                        // Box box = box3;
	                        // Box box = box2;  // 다형성
	                        // Box box = box1;
	public static void wrapBox(Box box) { // 상속이라는 전제조건에서 사용 // instanceof 너 재 알아?
		
		if (box instanceof GoldPaperBox) { // 순서 중요 // 너 골드페이퍼 박스 알아?를 물어본다 // 안다
			GoldPaperBox wrap = (GoldPaperBox)box; // 강제 형변환 해줘 // 강제 할당 해줘 // 시작주소값 여기에 복귀시킨다 
			                                       // 시작 주소값으로 전체 영역 관리를 하려고
			wrap.simpleWrap();
			wrap.paperWrap();
			wrap.goldWrap();
		}else if(box instanceof PaperBox) {
			PaperBox wrap = (PaperBox)box; 
			
			wrap.simpleWrap();
			wrap.paperWrap();
		}else {
			box.simpleWrap();
		}
		
//		box.simpleWrap();	
//		box.paperWrap();	
//		box.goldWrap();	
	}
//	                        // PaperBox box = box2; // Box box = box2; // 다형성에 의해 가능하다
//	public static void wrapBox(PaperBox box) { // 오버로딩
//		//box.simpleWrap();
//		box.paperWrap();
//		
//	}
//	                        // GoldPaperBox box = box3; // Box box = box3;
//	public static void wrapBox(GoldPaperBox box) { // 오버로딩
//		//box.simpleWrap();
//		//box.paperWrap();
//		box.goldWrap();
//	}
	
	
	
}
