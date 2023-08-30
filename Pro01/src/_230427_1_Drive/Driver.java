package _230427_1_Drive;

public class Driver {
	
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
		}else if (vehicle instanceof Taxi){
			Taxi taxi = new Taxi();
		}
		vehicle.run();
		vehicle.checkFare();
	}
}