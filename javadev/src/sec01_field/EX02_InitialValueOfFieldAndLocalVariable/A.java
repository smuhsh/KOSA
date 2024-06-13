package sec01_field.EX02_InitialValueOfFieldAndLocalVariable;
/*
 * 작성일:2024-06-13
 * 작성자:황석현
 * 개요: 교재 p226 필드와 지역변수의 초기값
 * 
 * */

class A {
	
	boolean m1;
	int m2;
	double m3;
	String m4;
	
	void printFieldValue() {
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		
	}
	void printLocalVariable() {
		
		int k;
//		System.out.println(k); //지역변수를 초기화하지 않아 오류발생
	}

}
