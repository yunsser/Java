package exam03;

class FruitBox<T> { // <T, U> 이런식으로 두 개도 가능
	T item;
	
	FruitBox(){}
	
	public void store(T item) { // 포장
		this.item = item;
	}
	
	public T pullOut() { // 개봉
		return item;
	}
	
	
}





