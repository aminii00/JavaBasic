package _230413_5_Carclass_exam;

public class CarExample {
	public static void main(String[] args) {
		
		Car myCar = new Car();
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("����ӵ� : " + speed + "km/h");
	}
}