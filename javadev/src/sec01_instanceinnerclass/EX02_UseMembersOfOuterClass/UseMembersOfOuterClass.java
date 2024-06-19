package sec01_instanceinnerclass.EX02_UseMembersOfOuterClass;
/*
 * 작성일:2024-06-19
 * 작성자:황석현
 * 개요: 교재p430
 * 		이너클래스 내부에서 아우터클래스의 필드/메서드 사용
 * 
 * */
public class UseMembersOfOuterClass {

	public static void main(String[] args) {
		//아우터 클래스 객체 생성
		A a = new A();
		
		//이너클래스 객체생성
		A.B b = a.new B();
		b.bcd();
	}

}
