package exam05;

class Computer {
	Computer(){}
}

class Notebook extends Computer{
	Notebook(){}
}

class TabletPC extends Notebook{
	TabletPC(){}
}

// 컴퓨터          = new 노트북(); // 컴퓨터가 노트북이 될 순 없지만 노트북이 컴퓨터로 해당될 순 있다

public class ReferenceVariableUse {
	public static void main(String[] args) {
		Computer cpt1 = new Notebook();
		Computer cpt2 = new TabletPC();
		Notebook cpt3 = new TabletPC();
//		TabletPC cpt4 = new Notebook() //error
		
		TabletPC cpt5 = new TabletPC();
		TabletPC cpt6 = cpt5;
		
		Notebook cpt7 = cpt6;
		Computer cpt8 = cpt6;
		
		Computer cpt9 = new TabletPC();
//		Notebook cpt10 = cpt9; // error 
//		TabletPC cpt11 = cpt9; // error
		
	}

}
