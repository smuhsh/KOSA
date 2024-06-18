package sec02_interface.EX06_DefaultMethod_1;

/*
 * 작성일:2024-06-18
 * 작성자:황석현
 * 개요: 교재 p416
 * 		인터페이스 구현 및 디폴트 메서드의 오버라이딩
 * 
 * */
public class DefaultMethod_1 extends Object {

	public static void main(String[] args) {
		//객체생성
		A a1 = new B();
		A a2 = new C();
		
		//메서드 호출
		a1.abc();
		a1.bcd();
		a2.abc();
		a2.bcd();
		
	}

}
