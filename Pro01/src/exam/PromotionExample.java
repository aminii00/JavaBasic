package exam;

public class PromotionExample {

	public static void main(String[] args) {
		
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue: " + intValue);
		
		char charValue = 'A';
		intValue = charValue;
		System.out.println("\'��\'�� �����ڵ�: " + intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue: " + longValue);
		
		intValue = 100;
		float floatValue = intValue;
		System.out.println("floatValue: " + floatValue);
		
		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println("doubleValue: " + doubleValue);
		
	}

}
