package _230428_9_String;

public class StringIndexOfExample {

	public static void main(String[] args) throws Exception {
		
		String subject = "�ڹ� ���α׷���";
		
		int location = subject.indexOf("���α׷���");
		System.out.println(location);
		
		if(subject.indexOf("�ڹ�") != -1) {
			System.out.println("�ڹٿ� ���õ� å�̱���.");
		}else {
			System.out.println("�ڹٿ� ���þ��� å�̱���.");
		}
		
		
	    byte[] bytes = new byte[100];
	    System.out.print("�Է� : ");
	    int readByteNo = System.in.read(bytes);
	    String str = new String(bytes,0,readByteNo-2);     //�ٹٲ� 10�� ���� 13
		System.out.println(str);
		
		if(str.indexOf("�ڹ�") != -1) {
			System.out.println("�ڹٿ� ���õ� å�̱���.");
		}else {
			System.out.println("�ڹٿ� ���þ��� å�̱���.");
		}
 
}
}
