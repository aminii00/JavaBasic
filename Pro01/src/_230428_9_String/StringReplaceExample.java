package _230428_9_String;

public class StringReplaceExample {

	public static void main(String[] args) {

		String oldstr= "�ڹٴ� ��ü������ �Դϴ�. �ڹٴ� ǳ���� API�� �����մϴ�.";
		String newstr= oldstr.replace("�ڹ�","JAVA");
		
		System.out.println(oldstr);
		System.out.println(newstr);
	}

}
