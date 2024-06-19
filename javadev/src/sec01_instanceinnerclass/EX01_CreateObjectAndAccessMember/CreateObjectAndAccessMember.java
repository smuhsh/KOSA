package sec01_instanceinnerclass.EX01_CreateObjectAndAccessMember;
/*
 * 작성일:2024-06-19
 * 작성자:황석현
 * 개요: 교재p428
 * 		인스턴스 이너클래새의 아우터 클래스 멤버 사용 및 객체생성
 * 
 * */
public class CreateObjectAndAccessMember {

	public static void main(String[] args) {
		//아우터 클래스 객체 생성
		A a = new A();
		//멤버사용
		A.B b = a.new B();
		b.bcd();
	}

}
