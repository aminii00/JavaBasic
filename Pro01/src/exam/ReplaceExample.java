package exam;

public class ReplaceExample {

	public static void main(String[] args) {
		String oldStr = "�ڹ� ���ڿ��� �Һ��Դϴ�. �ڹ� ���ڿ��� String�Դϴ�.";
		String newStr = oldStr.replace("�ڹ�", "JAVA"); // ���� �ƴϰ� ���ο� ��ü����
		
		System.out.println(oldStr);
		System.out.println(newStr);
		
 	}

}
