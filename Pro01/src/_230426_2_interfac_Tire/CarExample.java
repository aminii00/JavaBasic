package _230426_2_interfac_Tire;

public class CarExample {

	public static void main(String[] args) {

		Car mycar = new Car();
		
		mycar.run();
		
		System.out.println();
		mycar.tires[0] = new KumhoTire();
		mycar.tires[1] = new KumhoTire();
		mycar.tires[2] = new KumhoTire();
		mycar.tires[3] = new KumhoTire();
		
		mycar.run();
		
	}
}