package exam;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "�ֹξ�"; 
		String strVar2 = "�ֹξ�";
		String strVar3 = new String("�ֹξ�"); // �� ����

		
		System.out.println(strVar1 == strVar2);
		System.out.println(strVar1 == strVar3);
		System.out.println("----equals----");
		System.out.println(strVar1.equals(strVar2));
		System.out.println(strVar1.equals(strVar3));
		
	}

}
