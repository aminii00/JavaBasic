package _230417_2_Caluatorclass_exam;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator myCalcul = new Calculator();
		
		double result1 = myCalcul.areaRectangle(10);
		double result2 = myCalcul.areaRectangle(10, 20);
		
		System.out.println("정사각형 넓이 : " + result1);
		System.out.println("직사각형 넓이 : " + result2);
	}
}