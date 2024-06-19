package sec02_instanceinnerclass.EX01_CreateObjectAndAccessMember;
/*
 * 작성일:2024-06-19
 * 작성자:황석현
 * 개요: 교재p430
 * 		이너클래스 내부에서 아우터클래스의 필드/메서드 사용
 * 
 * */
public class CreateObjectAndAccessMember {

	public static void main(String[] args) {
		//정적 이너 클래스의 객체 생성
		//System.out.println(A.b);
		
		A.B b = new A.B();
		//메서드 호출
		b.bcd();
		
		
	}

}
