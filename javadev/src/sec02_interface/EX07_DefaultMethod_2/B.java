package sec02_interface.EX07_DefaultMethod_2;

public class B implements A {
	public void abc() {
		A.super.abc(); //부모 인터페이스 A의 abc() 메서드 호출
		System.out.println("B클래스의 abc()");
	}

}
