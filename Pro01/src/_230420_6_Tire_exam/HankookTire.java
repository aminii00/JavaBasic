package _230420_6_Tire_exam;

public class HankookTire extends Tire {

	public HankookTire (String location, int maxRotation) {
		super(location,maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accumulatedRocation;
		if(accumulatedRocation<maxRocation) {
			System.out.println(location + " HankoolTire ���� : " + (maxRocation-accumulatedRocation)+ "ȸ");
			   return true;
		}else {
			System.out.println("*** " + location + "HankoolTire ��ũ ***");
			return false;
		}
	}
}
