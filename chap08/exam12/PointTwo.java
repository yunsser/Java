package exam12;

class PointTwo implements UpperCasePrintable {
	private int xPos;
	private int yPos;
	
	PointTwo(int x, int y) {
		this.xPos = x;
		this.yPos = y;
	}

	@Override
	public String toString() {
		String posInfo = "(x pos: " + xPos + ", y pox: " + yPos + ")";
		
		return posInfo;
	}
	
	
	
	
}