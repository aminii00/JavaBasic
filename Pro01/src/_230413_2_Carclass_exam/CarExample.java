package _230413_2_Carclass_exam;

public class CarExample {

	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println("----------car1---------");
		System.out.println("car1.company : " + car1.company);
		System.out.println("Car1.color : " + car1.color);
		System.out.println("car1.model : " + car1.model);
		System.out.println("car1.maxSpeed : " + car1.maxSpeed);
		System.out.println();
		
		System.out.println("----------car2---------");
		Car car2 = new Car("�ڰ���");
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println("Car2.color : " + car2.color);
		System.out.println("car2.maxSpeed : " + car2.maxSpeed);
		System.out.println();
		
		System.out.println("----------car3---------");
		Car car3 = new Car("�ڰ���" , "����");
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("Car3.color : " + car3.color);
		System.out.println("car3.maxSpeed : " + car3.maxSpeed);
		System.out.println();
		
		System.out.println("----------car4---------");
		Car car4 = new Car ("�ý�" , "����" , 200);
		System.out.println("car4.company : " + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("Car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
	}
}