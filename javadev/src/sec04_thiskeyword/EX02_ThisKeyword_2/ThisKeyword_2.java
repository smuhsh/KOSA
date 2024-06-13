package sec04_thiskeyword.EX02_ThisKeyword_2;

/*
 * 작성일:2024-06-13
 * 작성자:황석현
 * 개요: p255 명시적 this 키워드 추가
 * 
 * */

public class ThisKeyword_2 {
	public static void main(String[] args) {
		//필드명과 지역변수명이 같고, this 키워드를 사용하지 않음
		A a = new A();
		a.init(2, 3);
		System.out.println(a.m);
		System.out.println(a.n);
		
		//필드명과 지역 변수명이 같고, this 키워드를 사용함
		B b = new B();
		b.init(2, 3);
		System.out.println(b.m);
		System.out.println(b.n);
		
	}
		
}