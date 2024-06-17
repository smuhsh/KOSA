package sec04_overlapmember.EX03_OverlapStaticMethod;
/*
 * 작성일:2024-06-17
 * 작성자:황석현
 * 개요: 교재p347 정적메서드의 중복
 * 
 * */

public class OverlapStaticMethod {

	public static void main(String[] args) {
		
		//클래스명으로 바로 접근
		A.print();
		B.print();
		System.out.println();
		
		//객체생성
		A aa = new A();
		B bb = new B();
		A ab = new B();
		
		//객체를 통한 메서드 호출
		aa.print();
		bb.print();
		ab.print();
		
	}

}
