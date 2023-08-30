package _230419_1_getter_setter_exam;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setSpeed(-50);    //잘못된
		System.out.println("현재 속도 :" + myCar.getSpeed()); 
		
		myCar.setSpeed(60);
		
		if(!myCar.isStop()) {   //멈추기
			myCar.setStop(true);
		}
		
		System.out.println("현재 속도 :" + myCar.getSpeed());
	}
}