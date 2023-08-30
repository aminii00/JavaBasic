package exam;

public class SwitchStringExample {

	public static void main(String[] args) {
		String position = "대한민국";
		
		switch(position) {
		case "대한민국" :
			System.out.println("70");
			break;
		case "안녕" :
			System.out.println("50");
			break;
		default :
			System.out.println("30");
		}
	}

}
