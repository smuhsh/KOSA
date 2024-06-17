package sec02_typecasting.EX02_Typecasting_2;
/*
 * 작성일:2024-06-17
 * 작성자:황석현
 * 개요: 교재p325 선언 타입에 따른 사용할 수 있는 멤버
 * 
 * */
public class Typecasting_2 {

	public static void main(String[] args) {
		
		//A타입 /A생성자
		A aa = new A();
		System.out.println(aa.m);
		aa.abc();
		
		//B타입 B생성자
		B bb = new B();
		System.out.println(bb.m);
		System.out.println(bb.n);
		bb.abc();
		bb.bcd();
		
		//A타입 / B생정자: 다형적 표현
		A ab = new B();
		System.out.println(ab.m);
		ab.abc();

	}

}
