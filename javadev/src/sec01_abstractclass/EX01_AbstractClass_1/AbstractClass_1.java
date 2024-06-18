package sec01_abstractclass.EX01_AbstractClass_1;
/*
 * 작성일:2024-06-18
 * 작성자:황석현
 * 개요: 교재p400
 * 		추상 클래스의 객체 생성 방법 ⓛ자식 클래스 활용하기 ②
 * 
 * */
public class AbstractClass_1 {

	public static void main(String[] args) {
		//객체생성
		A b1 = new B();
		A b2 = new B();
		
		//메서드 호출
		b1.abc();
		b2.abc();
	}

}
