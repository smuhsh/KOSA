package oop19.wrapper;
/*
 * 작성일:2024-06-21
 * 작성자:황석현
 * 개요: 
 * 
 * */
public class IntegerTest3 extends Object {
	
	public static void main(String[] args) {
		Integer a1 = Integer.valueOf(127);
		Integer a2 = Integer.valueOf(127);
		
		System.out.println(a1 == a2);
		System.out.println(a1.equals(a2));
		System.out.println();
		
		//Integer 의 범위는 -128 ~ 127 인데 128 을 하니까 메모리 주소 틀렸어 false
		Integer b1 = Integer.valueOf(128);
		Integer b2 = Integer.valueOf(128);
		System.out.println(b1 == b2);
		System.out.println(b1.equals(b2));
		
		
	}

}
