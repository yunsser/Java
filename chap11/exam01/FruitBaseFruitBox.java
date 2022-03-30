package exam01;

public class FruitBaseFruitBox {
	public static void main(String[] args) {
		
		Apple apple = new Apple(500);
		AppleBox appleBox = new AppleBox();
		
		appleBox.store(apple);
		
		Apple tmpApple = appleBox.pullOut();
		tmpApple.showAppleWeight();
		
		
		System.out.println("====================");
		
		
		Orange orange = new Orange(8);
		OrangeBox oreageBox = new OrangeBox();
		
		oreageBox.store(orange);
		
		Orange tmpOrange = oreageBox.pullOut();
		tmpOrange.showSugerContent();
		
		
		System.out.println("====================");
		
		
//		oreageBox.store("오렌지"); 장: 자료형에 안전 // 단: 개별 포장지 //error
	}
}
