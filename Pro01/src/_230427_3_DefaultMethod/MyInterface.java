package _230427_3_DefaultMethod;

public interface MyInterface { 
	public void method1(); //ó���ΰ� ���� -> �߻�޼��� 
	
	public default void method2() { // Override �ص� �ǰ� ���ص� �ǰ�~
		System.out.println("MyInterface - method2() ����");
	};
}