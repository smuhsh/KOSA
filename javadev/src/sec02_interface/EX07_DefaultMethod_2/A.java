package sec02_interface.EX07_DefaultMethod_2;

public interface A {
	default void abc() {
		System.out.println("A인터페이스의 bcd()");
	}

}
