package sec04_overlapmember.EX02_OverlapStaticField;
/*
 * 작성일:2024-06-17
 * 작성자:황석현
 * 개요: 교재p345 정적필드의 중복
 * 
 * */

public class OverlapStaticField {

	public static void main(String[] args) {
		
		//클래스명으로 바로 접근
		System.out.println(A.m);
		System.out.println(B.m);
		System.out.println();
		
		//객체생성
		A aa = new A();
		B bb = new B();
		A ab = new B();
		
		//생성한 객체로 정적필드 호출
		System.out.println(aa.m);
		System.out.println(bb.m);
		System.out.println(ab.m);

	}

}
