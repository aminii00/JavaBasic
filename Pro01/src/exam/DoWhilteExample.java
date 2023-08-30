package exam;

import java.util.Scanner;

public class DoWhilteExample {

	public static void main(String[] args) throws Exception{
		System.out.println("메세지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
		Scanner scanner = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.print(">");
			inputString = scanner.nextLine();
			System.out.println(inputString);
		} while (! inputString.equals("q"));
		
		System.out.println();
		System.out.println("프로그램 종료");
	}
}