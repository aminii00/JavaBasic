package _230419_1_getter_setter_exam;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setSpeed(-50);    //�߸���
		System.out.println("���� �ӵ� :" + myCar.getSpeed()); 
		
		myCar.setSpeed(60);
		
		if(!myCar.isStop()) {   //���߱�
			myCar.setStop(true);
		}
		
		System.out.println("���� �ӵ� :" + myCar.getSpeed());
	}
}