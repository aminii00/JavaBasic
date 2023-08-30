package _230425_2_Driver_exam;

public class DriveExample {

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		Bike bike = new Bike();
		
		driver.drive(bus);
		driver.drive(taxi);
		driver.drive(bike);
		
	}
}