package exam;

public class ArrayCreateByValueListExample2 {
	
	public static int add(int[] scores)  //急攫何
	{ // 贸府何
		int sum = 0;
		for (int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		return sum;
	}

	public static void main(String[] args) { 
		int[] scores;
		scores = new int[] {83,90,87};
		int sum1 = 0;
		for (int i=0; i<scores.length; i++) {
			sum1+=scores[i];
		}
		System.out.println("醚 钦 : " + sum1);
		
		int sum2 = add(new int[] {83,90,87});
		System.out.println("醚 钦 : " + sum2);
		System.out.println();
 	}
}