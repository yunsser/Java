package exam04;

class Speaker {
	private int volumeRate; // 볼륨값을 저장할 필드
	
	public void setVolumeRate(int vol) {
		this.volumeRate = vol;
	}
	
	public int getVolumeRate() {
		return volumeRate;
	}
	
	public void showCurrentState() {
		System.out.println("볼륨크기: " + getVolumeRate()) ;
	}
	
	
}
