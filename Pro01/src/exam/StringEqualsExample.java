package exam;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "ÃÖ¹Î¾Æ"; 
		String strVar2 = "ÃÖ¹Î¾Æ";
		String strVar3 = new String("ÃÖ¹Î¾Æ"); // Èü ¿µ¿ª

		
		System.out.println(strVar1 == strVar2);
		System.out.println(strVar1 == strVar3);
		System.out.println("----equals----");
		System.out.println(strVar1.equals(strVar2));
		System.out.println(strVar1.equals(strVar3));
		
	}

}
