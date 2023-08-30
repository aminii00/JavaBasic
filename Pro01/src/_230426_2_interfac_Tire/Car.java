package _230426_2_interfac_Tire;


public class Car {
	
	/*Tire frontLeftTire = new HankookTire();
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();*/
	
	Tire[] tires = {
			new HankookTire(),
			new HankookTire(),
			new HankookTire(),
			new HankookTire()
	};
 	
	
	void run() {
		/*frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();*/
		
		for(int i=0; i<tires.length; i++) {
			tires[i].roll();
		}
	}

}
