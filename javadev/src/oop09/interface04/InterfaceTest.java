package oop09.interface04;
/*
 * 작성일:2024-06-18
 * 작성자:황석현
 * 개요: 
 * 
 * */
public class InterfaceTest {

	public static void main(String[] args) {
		InterImpl impl = new InterImpl();
		
		InterfaceA ia = impl;
		ia.MethodA();
		System.out.println();
		
		InterfaceB ib = impl;
		ib.MethodB();
		System.out.println();
		
		InterfaceC ic = impl;
		ic.MethodA();
		ic.MethodB();
		ic.MethodC();

	}

}
