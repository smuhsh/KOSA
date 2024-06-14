package oop05.modifier01;
/*
 * 작성일:2024-06-14
 * 작성자:황석현
 * 개요: 교재 p281~283
 * 
 * */
public class B {
	
	public void print() {
		
		//객체생성
		A a = new A();
		
		//멤버활용
		System.out.print(a.a+" ");
		System.out.print(a.b+" ");
		System.out.print(a.c+" ");
		System.out.println();
	}	
	
}
