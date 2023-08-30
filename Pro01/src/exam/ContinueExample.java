package exam;

public class ContinueExample {

	public static void main(String[] args) {
		System.out.println("------------Â¦¼ö-------------");
		for(int i=1; i<=10; i++) {
			if(i%2 != 0) {
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println("------------È¦¼ö-------------");
		for(int i=1; i<=10; i++) {
			if(i%2 != 1) {
				continue;
			}
			System.out.println(i);
		}
		
	}

}