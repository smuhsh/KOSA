package sec04_overlapmember.EX01_OverlapInstanceField;
/*
 * 작성일:2024-06-17
 * 작성자:황석현
 * 개요: 교재p342 인스턴스 필드의 중복
 * 
 * */

public class OverlapInstanceField {

	public static void main(String[] args) {
		//객체생성
		A aa = new A();
		B bb = new B();
		A ab = new B();
		
		//인스턴스 필드
		System.out.println(aa.m);
		System.out.println(bb.m);
		System.out.println(ab.m);

	}

}
