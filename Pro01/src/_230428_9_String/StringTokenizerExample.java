package _230428_9_String;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		String text = "홍길동/이수홍/박연수";
		
		StringTokenizer st = new StringTokenizer(text,"/");
		int countTokens  = st.countTokens(); // 남아있는 토큰
		System.out.println(countTokens);
		for(int i=0; i<countTokens; i++) {
			String token = st.nextToken(); 
			System.out.println(token);
		}
		
		System.out.println();
		
		st= new StringTokenizer(text,"/");
		while(st.hasMoreTokens()) { // 토큰이 남아있는동안
			String token = st.nextToken(); // 토큰을 하나씩 꺼내옴
			System.out.println(token);
		}
	}
}