package _230420_3_Carcalss_exam;

public class SportsCar extends Car{

	@Override
	public void speedUp() {
		speed += 10;
	}
	/* final로 인해 오버라이딩 불가
	    public final void stop() {
		System.out.println("차를 멈춤");
		speed = 0;
	}*/
}