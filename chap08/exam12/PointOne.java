package exam12;

class PointOne extends Object{
	private int xPos;
	private int yPos;
	
	PointOne(int x, int y) {
		this.xPos = x;
		this.yPos = y;
	}

	@Override
	public String toString() {
		String posInfo = "(x pos: " + xPos + ", y pox: " + yPos + ")";
		
		return posInfo;
	}
	
	
	
	
}
