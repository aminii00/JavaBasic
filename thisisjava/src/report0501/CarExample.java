package report0501;


	public class CarExample {
		public static void main(String[] args) {
			Car car = new Car();
			
			for(int i=1; i<=5; i++) {
				int problemLocation = car.run();
				if(problemLocation != 0) {
					System.out.println(car.tires[problemLocation-1].location + " MisoTire·Î ±³Ã¼");
					car.tires[problemLocation-1] = new MisoTire (car.tires[problemLocation-1].location, 15);
				}
				System.out.println("----------------------------------------");
			}
		}
	}

