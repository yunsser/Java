package exam03;

class Orange {
	int sugarContent; // 당분함량
	
	Orange(int sugarContent){
		this.sugarContent = sugarContent;
	}
	
	public void showSugerContent() {
		System.out.println("당분함량: " + sugarContent);
	}

}