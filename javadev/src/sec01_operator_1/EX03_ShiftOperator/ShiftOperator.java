package sec01_operator_1.EX03_ShiftOperator;

/*
 * 작성일:2024-06-10
 * 작성자:황석현
 * 개요: 교재p95 산술 시프트와 논리 시프트
 * 
 * */

public class ShiftOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//산술 시프트
		// @<<
		System.out.println(3<<1);
		System.out.println(-3<<1);
		System.out.println(3<<2);
		System.out.println(-3<<2);
		System.out.println();
		
		//@ >>
		System.out.println(5>>1);
		System.out.println(-5>>1);
		System.out.println(5>>2);
		System.out.println(-5>>2);
		System.out.println();
		
		//논리 시프트(>>>)
		System.out.println(3 >>>1);
		System.out.println(-3 >>>31);		
		
	}

}
