package _230428_9_String;

public class StringIndexOfExample {

	public static void main(String[] args) throws Exception {
		
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		
		if(subject.indexOf("자바") != -1) {
			System.out.println("자바와 관련된 책이군요.");
		}else {
			System.out.println("자바와 관련없는 책이군요.");
		}
		
		
	    byte[] bytes = new byte[100];
	    System.out.print("입력 : ");
	    int readByteNo = System.in.read(bytes);
	    String str = new String(bytes,0,readByteNo-2);     //줄바꿈 10과 엔터 13
		System.out.println(str);
		
		if(str.indexOf("자바") != -1) {
			System.out.println("자바와 관련된 책이군요.");
		}else {
			System.out.println("자바와 관련없는 책이군요.");
		}
 
}
}
