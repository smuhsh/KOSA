package oop04.test;
/*
 * 작성일:2024-06-14
 * 작성자:황석현
 * 개요: 교재 p281~283
 * 
 * */
import oop05.modifier01.A;

public class D extends A{

	public void print() {
		
		//객체생성
//		A a = new A();
		
		//멤버활용
		System.out.print(a+" "); //다른 패키지 내의 클래스에서는 자식클래스가 아닐 때는 public 접근 지정자만 사용가능
		System.out.print(b+" ");
		//System.out.print(c+" ");
		//System.out.print(d+" ");
		System.out.println();
	}	

	
}
