package exam;

public class ContinueExample {

	public static void main(String[] args) {
		System.out.println("------------¦��-------------");
		for(int i=1; i<=10; i++) {
			if(i%2 != 0) {
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println("------------Ȧ��-------------");
		for(int i=1; i<=10; i++) {
			if(i%2 != 1) {
				continue;
			}
			System.out.println(i);
		}
		
	}

}