package sec02_interface.EX07_DefaultMethod_2;
/*
 * 작성일:2024-06-18
 * 작성자:황석현
 * 개요: 교재 p418
 * 		자식 클래스에서 부모 인터페이스의 디폴트 메서드의 호출
 * 
 * */
public class DefaultMethod_2 extends Object {

	public static void main(String[] args) {
		//객체생성
		
		B b = new B();
		
		//메서드 호출
		b.abc(); // B객체의 abc()를 호출할 때 A 인터페이스의 abc()메서드가 먼저 호출됨
		
	}

}
