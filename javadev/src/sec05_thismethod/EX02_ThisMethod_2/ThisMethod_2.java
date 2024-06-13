package sec05_thismethod.EX02_ThisMethod_2;

/*
 * 작성일:2024-06-13
 * 작성자:황석현
 * 개요: p259 this(생성자 입력매개변수) 활용
 * 
 * */

public class ThisMethod_2 {
	public static void main(String[] args) {
		//3가지 객체 생성(this() 미사용)
		A a1 = new A();
		A a2 = new A(10);
		A a3 = new A(10, 20);
		a1.print();
		a2.print();
		a3.print();
		System.out.println();
		
		//3가지 객체 생성(this() 사용)
		B b1 = new B();
		B b2 = new B(10);
		B b3 = new B(10, 20);
		b1.print();
		b2.print();
		b3.print();
		
	}
		
}