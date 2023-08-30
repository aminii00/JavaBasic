package _230427_1_Drive;

public class Taxi implements Vehicle {

	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}
	@Override
	public void checkFare() {
		System.out.println("승차요금을 체크합니다.");
	}

}
