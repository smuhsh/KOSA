package sec05_thismethod.EX01_ThisMethod_1;

/*
 * 작성일:2024-06-13
 * 작성자:황석현
 * 개요: p257 this() 메서드의 문법적 특징과 의미
 * 
 * */

public class ThisMethod_1 {
	public static void main(String[] args) {
		//객체생성
		A a1 = new A(); //첫번째 생성자 호출
		System.out.println();
		A a2 = new A(3); //두번째 생성자 호출(새성자의 내부에서 첫번째 생성자호출)
		
	}
		
}