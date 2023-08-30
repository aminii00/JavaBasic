package _230420_6_Tire_exam;

public class KumhoTire extends Tire{

	public KumhoTire (String location, int maxRotation) {
		super(location,maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accumulatedRocation;
		if(accumulatedRocation<maxRocation) {
			System.out.println(location + " KumhoTire ¼ö¸í : " + (maxRocation-accumulatedRocation)+ "È¸");
			   return true;
		}else {
			System.out.println("*** " + location + "KumhoTire ÆãÅ© ***");
			return false;
		}
    }
}
