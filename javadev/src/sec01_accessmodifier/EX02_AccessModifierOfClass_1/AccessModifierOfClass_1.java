package sec01_accessmodifier.EX02_AccessModifierOfClass_1;
/*
 * 작성일:2024-06-14
 * 작성자:황석현
 * 개요: 교재 p289~290
 * 	같은 패키지에서 클래스 접근 지정자와 생성자 접근 지정자
 * 
 * */
public class AccessModifierOfClass_1 {
	public static void main(String[] args) {
		//객체생성
		
		/* 같은 패키지에서는 public 클래스와 default 클래스의 타입 모두 객체를 선얼할 수 있으며, 
		 * public 생성자와 default 생성자 모두 호출가능
		 * */
		A a = new A();
		B b = new B();
		C c = new C();
	}
	
}
