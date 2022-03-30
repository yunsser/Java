package exam10;

public class ThreeDimenArray {
	public static void main(String[] args) {
		int[][][] threeDimenArray = new int[2][3][4]; // 3행4열 짜리가 2면(개) 있다
		int num = 0;
		
		for(int i = 0; i < threeDimenArray.length; i++) { 
			for(int j = 0; j < threeDimenArray[i].length; j++) {
				for(int k = 0; k < threeDimenArray[i][j].length; k++) {
					threeDimenArray[i][j][k] = num++;
				}
			}
		}
		
		for(int i = 0; i < threeDimenArray.length; i++) { 
			for(int j = 0; j < threeDimenArray[i].length; j++) {
				for(int k = 0; k < threeDimenArray[i][j].length; k++) {
					System.out.println("["+ i +"]"+"["+ j +"]" + "["+ k +"]"+threeDimenArray[i][j][k]);
				}
			}
		}		
		
		
		
	}
}
