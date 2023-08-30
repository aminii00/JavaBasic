package _230417_4_Caluatorclass_exam;

public class CalculatorExample {

	public static void main(String[] args) {
		double result1 = 10 * 10 *Calculator.pi;
		int result2 = Calculator.plus(10, 5);
		int result3= Calculator.minus(10, 5);
		
		Calculator cal = new Calculator();
		
		double result4 = (cal.pi) * 10 * 10;
		int result5 = cal.plus(10, 5);
		int result6 = cal.minus(10, 5);
		
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		System.out.println();
		System.out.println("result4 : " + result4);
		System.out.println("result5 : " + result5);
		System.out.println("result6 : " + result6);
		
		
	}

}
