package _230428_9_String;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		String text = "ȫ�浿/�̼�ȫ/�ڿ���";
		
		StringTokenizer st = new StringTokenizer(text,"/");
		int countTokens  = st.countTokens(); // �����ִ� ��ū
		System.out.println(countTokens);
		for(int i=0; i<countTokens; i++) {
			String token = st.nextToken(); 
			System.out.println(token);
		}
		
		System.out.println();
		
		st= new StringTokenizer(text,"/");
		while(st.hasMoreTokens()) { // ��ū�� �����ִµ���
			String token = st.nextToken(); // ��ū�� �ϳ��� ������
			System.out.println(token);
		}
	}
}