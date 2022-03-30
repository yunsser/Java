package exam06;

import exam06.cal.Calculator;

public class CalculatoerMain {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		int result = 0;
		
		result = calculator.addTwoNumber(33456, 549);
		System.out.println("33456 + 549 = " + result);
		
		
		result = calculator.subTwoNumber(33456, 549);
		System.out.println("33456 - 549 = " + result);
		
		calculator.showOperationTimes();
	}
}