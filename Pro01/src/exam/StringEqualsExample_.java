package exam;

public class StringEqualsExample_ {

	public static void main(String[] args) {
		String strVar1 = "�ֹξ�";
		String strVar2 = "�ֹξ�";
		if (strVar1 == strVar2) {
			System.out.println("strVar1�� strVar2�� ������ ����");
		}else {
			System.out.println("strVar1�� strVar2�� ������ �ٸ�");
		}
		
		if (strVar1.equals(strVar2)) {
			System.out.println("strVar1�� strVar2�� ���ڿ��� ����");
		}
		
		
		String strVar3 = new String("�ֹξ�");
		String strVar4 = new String("�ֹξ�");
		if (strVar3 == strVar4) {
			System.out.println("strVar1�� strVar2�� ������ ����");
		}else {
			System.out.println("strVar1�� strVar2�� ������ �ٸ�");
		}
		
		if (strVar3.equals(strVar4)) {
			System.out.println("strVar1�� strVar2�� ���ڿ��� ����");
		}
		
	}

}