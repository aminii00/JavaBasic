package _230428_9_String;

public class StringToLowerUpperCaseExample {

	public static void main(String[] args) {
		String str1 ="Java Programming";
		String str2 = "JAVA Programming";
		
		System.out.println(str1.equals(str2));
		
		String Upperstr1 = str1.toUpperCase();
		String Upperstr2 = str2.toUpperCase();
		System.out.println(Upperstr1.equals(Upperstr2));
		System.out.println(str1.equalsIgnoreCase(str2));
	}
}