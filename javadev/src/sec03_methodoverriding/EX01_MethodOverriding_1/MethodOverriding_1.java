package sec03_methodoverriding.EX01_MethodOverriding_1;
/*
 * 작성일:2024-06-17
 * 작성자:황석현
 * 개요: 교재p332 메서드 오버라이딩의 기본동작
 * 
 * */
public class MethodOverriding_1 {

	public static void main(String[] args) {
		//A타입 /A생성자
		A aa = new A();
		aa.print();
		
		//B타입 /B생성자
		B bb = new B();
		bb.print();
		
		//A타입 /B생성자
		A ab = new B();
		ab.print();

	}

}
