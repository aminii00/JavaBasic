package _230427_3_DefaultMethod;

public class DefaultMethodExample {

	public static void main(String[] args) {
		MyInterface mi1 = new MyclassA();
		mi1.method1();
		mi1.method2(); // MyclassA �ȿ� method2 �������̵�X -> �������̽� default�޼���
		
		MyInterface mi2 = new MyclassB();
		mi2.method1();
		mi2.method2();
	}

}
