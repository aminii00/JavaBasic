package exam;

public class ReplaceExample {

	public static void main(String[] args) {
		String oldStr = "자바 문자열은 불변입니다. 자바 문자열은 String입니다.";
		String newStr = oldStr.replace("자바", "JAVA"); // 변경 아니고 새로운 객체생성
		
		System.out.println(oldStr);
		System.out.println(newStr);
		
 	}

}
