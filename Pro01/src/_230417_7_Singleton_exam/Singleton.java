package _230417_7_Singleton_exam;

public class Singleton {

	private static Singleton singleton = new Singleton();
	
	private Singleton() {}
	
	static Singleton getInstance() {
		return singleton;
	}
}
