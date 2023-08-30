package _230428_1_toString;

public class SmartPhone {

	private String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}
	
	@Override
	public String toString() { // Object »ó¼Ó
		return company + ", " + os;  
	}
}
