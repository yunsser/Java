package exam04;

class FatherClass {

	@Override
	public String toString() { // println 시에 출력
		return "class FatherClass";
	}
}

class ChildClass {

	@Override
	public String toString() {
		return "class ChildClass";
	}
}
