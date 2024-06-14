package oop05.modifier01;
/*
 * 작성일:2024-06-14
 * 작성자:황석현
 * 개요: 교재 p281,282
 * 
 * */

public class A {
	
	public int a = 1;
	protected int b = 2;
	int c = 3;
	private int d = 4;
	
	public void print() {
		System.out.print(a+" ");
		System.out.print(b+" ");
		System.out.print(c+" ");
		System.out.print(d);
		System.out.println();
		
	}
	
}
