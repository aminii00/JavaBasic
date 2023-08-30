package _230428_6_SysemTime;

public class SystemTimeExample {

	public static void main(String[] args) {
		long time1 = System.nanoTime();
		
		int sum=0;
		for(int i=0; i<=100000; i++) {
			sum+=i;
		}
		
		long time2 = System.nanoTime();
		
		System.out.println("1~100000������ ��: " + sum);
		System.out.println("��꿡 " + (time2-time1) + "�����ʰ� �ҿ�Ǿ����ϴ�.");
		
		System.out.println("----------------------------");
		
		time1 = System.currentTimeMillis();
		time2 = System.currentTimeMillis();
		
		sum= 0;
		for(int i=0; i<=100000; i++) {
			sum+=i;
		}
		
		System.out.println("1~100000������ ��: " + sum);
		System.out.println("��꿡 " + (time2-time1) + "�����ʰ� �ҿ�Ǿ����ϴ�.");
	}

}
