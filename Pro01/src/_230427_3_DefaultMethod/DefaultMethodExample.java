package _230427_3_DefaultMethod;

public class DefaultMethodExample {

	public static void main(String[] args) {
		MyInterface mi1 = new MyclassA();
		mi1.method1();
		mi1.method2(); // MyclassA 안에 method2 오버라이딩X -> 인터페이스 default메서드
		
		MyInterface mi2 = new MyclassB();
		mi2.method1();
		mi2.method2();
	}

}
