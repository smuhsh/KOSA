package sec02_staticmodifier.EX01_StaticField_1;
/*
 * 작성일:2024-06-14
 * 작성자:황석현
 * 개요: 교재p293 인스턴스 필드와 정적필드의 활용방법
 * 
 * */
public class StaticField_1 {

	public static void main(String[] args) {
		
		//인스턴스 필드 활용방법(객체를 생성한 후 사용가능)
		A a1 = new A();
		System.out.println(a1.m);
		
		//정적필드 활용방법
		System.out.println(A.n);
		
		//객체를 생성한 후 활용(권장하지 않음)
		A a2 = new A();
		System.out.println(a2.n);
		
	}

}
