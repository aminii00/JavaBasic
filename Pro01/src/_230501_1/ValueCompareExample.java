package _230501_1;

public class ValueCompareExample {

	public static void main(String[] args) {
		System.out.println("[-128~127 초과값인 경우]");
		
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("200");
		Integer obj3 = Integer.valueOf("300");
		
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
	}

}
