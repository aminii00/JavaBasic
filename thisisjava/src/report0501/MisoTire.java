package report0501;

public class MisoTire extends Tire {
	//�ʵ�
	//������
	public MisoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}	
	//�޼ҵ�
	@Override
	public boolean roll() {
		++accumulatedRotation;		
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + " MisoTire ����: " + (maxRotation-accumulatedRotation) + "ȸ");
			return true;
		} else {
			System.out.println("*** " + location + " MisoTire ��ũ ***");
			return false;
		}
	}
}




