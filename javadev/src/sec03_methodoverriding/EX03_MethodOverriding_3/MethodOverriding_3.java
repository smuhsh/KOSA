package sec03_methodoverriding.EX03_MethodOverriding_3;
/*
 * 작성일:2024-06-17
 * 작성자:황석현
 * 개요: 교재p338 메서드 오버라이딩과 메서드 오버로딩
 * 
 * */

public class MethodOverriding_3 {

	public static void main(String[] args) {
		
		//A타입 선언 / A생성자 사용
		A aa = new A();
		aa.print1();
		aa.print2();
		System.out.println();
		
		//B타입선언 /B생성자 사용
		B bb = new B();
		bb.print1();
		bb.print2();
		bb.print2(3);
		System.out.println();
		
		//A타입 선언 / B생성자 사용
		A ab = new B();
		ab.print1();
		ab.print2();

	}

}
