package sec03_constructor.EX01_DefaultConstructor;

/*
 * 작성일:2024-06-13
 * 작성자:황석현
 * 개요: p249 기본 생성자의 자동추가
 * 
 * */

public class DefaultConstructor {
	public static void main(String[] args) {
		
		//클래스의 객체 생성
		A a = new A();
		B b = new B();
//		C c = new C(); //기본생성자 호출 불가능
		C c = new C(3);
		
		//메서드 호출
		a.work();
		b.work();
		c.work();
		
	}
		
}