package _230427_3_DefaultMethod;

public interface MyInterface { 
	public void method1(); //처리부가 없음 -> 추상메서드 
	
	public default void method2() { // Override 해도 되고 안해도 되고~
		System.out.println("MyInterface - method2() 실행");
	};
}