package exam03;

public class GenericBaseFruitBox {
	public static void main(String[] args) {
		Orange orange = new Orange(7);
		Apple apple = new Apple(700);
		
		FruitBox<Orange> orangeBox = new FruitBox<Orange>(); // T 위치를 오렌지로 치환(배치) 하겠다 // 오렌지만 담을 수 있다
		FruitBox<Apple> appleBox = new FruitBox<Apple>(); // T 위치를 사과로 치환(배치) 하겠다 // 사과만 담을 수 있다
		
		orangeBox.store(orange);
//		orangeBox.store("오렌지"); //error
//		orangeBox.store(apple); //error
		appleBox.store(apple);
		
		Orange tmpOrange = orangeBox.pullOut();
		tmpOrange.showSugerContent();
		
		Apple tmpApple = appleBox.pullOut();
		tmpApple.showAppleWeight();
		
	}
}
