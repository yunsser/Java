package exam04;

public class Overriding {
	public static void main(String[] args) {
		
		Speaker speaker = new Speaker();
		
		speaker.setVolumeRate(7);
		speaker.showCurrentState();
		System.out.println("\n\n========================");
		
		BaseEnSpeaker baseSpeaker = new BaseEnSpeaker();
		
		baseSpeaker.setVolumeRate(8);
		baseSpeaker.setbaseRate(5);
		baseSpeaker.showCurrentState();
		System.out.println("\n\n========================");
		
		Speaker speaker2 = new BaseEnSpeaker(); // 다형성
		// Speaker speaker2 = null; // 스피커2는 자료형 스피커다
		// speaker2 = new BaseEnSpeaker(); 
		
		speaker2.setVolumeRate(5);
		System.out.println(speaker2.getVolumeRate());
		
		//speaker2.setbaseRate(7); //error //speaker2 = speaker이기 때문에 자신의 영역 이외에 곳은 불러오거나 관리할 수 없다 
		
		speaker2.showCurrentState(); // 부모든 자식이든 동일한 메서드*오버라이딩 시켜준다
		// 자료형이 스피커임에도 불구하고 자식에 정의 되어있는 (오버라이딩 된 메소드) 을(를) 호출시킨다.
		
		
		
	}
}
