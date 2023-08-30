package _230420_6_Tire_exam;

public class Tire {

	public int maxRocation;
	public int accumulatedRocation;
	public String location;
	
	public Tire (String location, int maxRocation) {
		this.location = location;
		this.maxRocation = maxRocation;
	}
		
	public boolean roll(){
		++accumulatedRocation;
		if(accumulatedRocation<maxRocation) {
			System.out.println(location + " Tire ���� : " + (maxRocation-accumulatedRocation)+ "ȸ");
			   return true;
		}else {
			System.out.println("*** " + location + "Tire ��ũ ***");
			return false;
		}
	}
}
