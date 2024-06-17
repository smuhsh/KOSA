package sec01_inheritancepolymorphism.EX02_Polymorphism;

/*
 * 작성일:2024-06-17
 * 작성자:황석현
 * 개요: 교재p318 상속을 이용한 객체의 다형적 표현
 * 
 * */
public class Polymorphism {
	public static void main(String[] args) {
		
		//A타입의 다형적 표현
		A a1 = new A(); //A는 A이다 (O)
		A a2 = new B(); //B는 A이다 (O)
		A a3 = new C();
		A a4 = new D();
		
		//B타입의 다형적 표현
		//B b1 = new A(); //A는 B이다 (X)
		B B2 = new B(); //B는 B이다 (O)
		B B3 = new C(); //C는 B이다 (O)
		B B4 = new D(); //D는 B이다 (O)
		
	}

}
