package _230420_3_Carcalss_exam;

public class SportsCar extends Car{

	@Override
	public void speedUp() {
		speed += 10;
	}
	/* final�� ���� �������̵� �Ұ�
	    public final void stop() {
		System.out.println("���� ����");
		speed = 0;
	}*/
}