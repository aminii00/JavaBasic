package exam;

public class VariableScopeExample {

	public static void main(String[] args) {
		
		int v1 = 15;
		int v2 = 0;
		int v3 = 0;
		if (v1>10) {
			
			v2 = v1 -10;
			v3 = v1 + v2 + 5;
			
		}
		System.out.println("v1 �� : " + v1);
		System.out.println("v2 �� : " + v2);
		System.out.println("v3 �� : " + v3);
		
		System.out.println(v1);
	}
}