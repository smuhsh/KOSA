package sec04_anonymousclass.EX03_AnonymousClass_3;
/*
 * 작성일:2024-06-19
 * 작성자:황석현
 * 개요: 교재p442
 * 		클래스 정의 및 참조 변수명을 사용/미사용 했을 때 입력매개변수 객체 전달
 * 
 * */
public class AnonymousClass_3 {

	public static void main(String[] args) {
		
		C c = new C();
		//방법1. 클래스명O 참조변수명O
		A a = new B();
		c.cde(a);
		
		//방법2. 클래스명O 참조변수명X
		c.cde(new B());
		
	}

}
