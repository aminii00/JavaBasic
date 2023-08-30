package exam;

import java.util.Scanner;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int score = Scanner.nextInt();
		char grade = (score > 90) ? 'A' : ( (score > 80) ? 'B' : 'C');
		System.out.println(score + "점은 " + grade + "등급입니다.");
		
	}

}