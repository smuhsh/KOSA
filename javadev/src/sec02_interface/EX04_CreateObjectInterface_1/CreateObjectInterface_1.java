package sec02_interface.EX04_CreateObjectInterface_1;
/*
 * 작성일:2024-06-18
 * 작성자:황석현
 * 개요: 교재 p410
 * 		자식 클래스를 직접 정의해 인터페이스 객체 생성
 * */
public class CreateObjectInterface_1 {

	public static void main(String[] args) {
		
		//객체 생성
		A b1 = new B();
		A b2 = new B();
		
		//메서드 호출
		b1.abc();
		b2.abc();

	}

}
