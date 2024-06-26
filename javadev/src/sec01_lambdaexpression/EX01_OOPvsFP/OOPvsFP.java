package sec01_lambdaexpression.EX01_OOPvsFP;
/*
 * 작성일:2024-06-25
 * 작성자:황석현
 * 개요: 교재p723 ~ 724
 * 		객체지향 프로그래밍 문법과 함수형 프로그래밍 문법
 * 
 * */
public class OOPvsFP {

	public static void main(String[] args) {
		//#1. 객체지향 프로그래밍 문법 1(case1)
		A a1 = new B();
		a1.abc(); // 메서드 내용
		
		//#2. 객체지향 프로그래밍 문법 2 (case2) : 익명이너클래스 사용
		A a2 = new A() {

			@Override
				public void abc() {
					System.out.println("메서드 내용 2");
				}
			
		};
		a2.abc(); //메서드 내용
		
		//#3. 함수적 프로그래밍 문법 (람다식) (case3)
		A a3 = ()-> System.out.println("메서드 내용 3");
		a3.abc();
	}

}
