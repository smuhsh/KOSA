package sec01_finalmodifier.EX01_FinalModifier_1;
/*
 * 작성일:2024-06-18
 * 작성자:황석현
 * 개요: 교재 p383, 384
 * 		final 필드와 final 지역변수의 특징
 *  
 * */
public class FinalModifier_1 {

	public static void main(String[] args) {
		//객체 생성
		A1 a1 = new A1();
		A2 a2 = new A2();
		
		//필드값 변경
		a1.a = 7;
		//a1.b = 9; //→ final 필드는 한 번 정해진 값을 변경할 수 없음.
		a2.a = 7;
		//a2.b = 9; //→ final 필드는 한 번 정해진 값을 변경할 수 없음.

	}

}
