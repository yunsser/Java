package exam02;

public class FruitBaseFruitBox {
	public static void main(String[] args) {
		
		Apple apple = new Apple(500);
		FruitBox appleBox = new FruitBox();
		
		appleBox.store(apple);
		
		Apple tmpApple = (Apple)appleBox.pullOut(); // 강제 형변형
		tmpApple.showAppleWeight();
		
		
		System.out.println("====================");
		
		
		Orange orange = new Orange(8);
		FruitBox oreageBox = new FruitBox();
		
		oreageBox.store(orange);
		
		Orange tmpOrange = (Orange)oreageBox.pullOut(); // 강제 형변형
		tmpOrange.showSugerContent();
		
		
		System.out.println("====================\n");
		
		
		oreageBox.store("오렌지"); // 장: 범용적 포장지 // 단: 자료형 안전하지않음
		
	}
}
