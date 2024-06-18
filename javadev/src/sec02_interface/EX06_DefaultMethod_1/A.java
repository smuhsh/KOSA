package sec02_interface.EX06_DefaultMethod_1;

public interface A {
	void abc();
	default void bcd() {
		System.out.println("A인터페이스의 bcd()");
	}

}
