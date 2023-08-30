package _230427_1_Drive;

public class DriverExample {

	public static void main(String[] args) {
		
		Vehicle vehicle = new Bus(); // 주소가 같음
		
		vehicle.run();
		vehicle.checkFare();
		
		System.out.println("-----------------");
		
		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		System.out.println();
		driver.drive(taxi);
	}
}