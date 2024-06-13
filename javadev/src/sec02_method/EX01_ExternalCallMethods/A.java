package sec02_method.EX01_ExternalCallMethods;
/*
 * 작성일:2024-06-13
 * 작성자:황석현
 * 개요: p231 클래스 외부에서의 메서드 호출
 * 
 * */

//클래스의 정의
class A {
	
	//리턴타입 void, 입력매개변수 없음
	void print() {
		System.out.println("안녕");
	}
	//리턴타입 int, 입력매개변수 없음
	int data() {
		return 3;
	}
	//리턴타입 double, 입력매개변수 2개
	double sum(int a, double b) {
		return a+b;
	}
	//리턴타입 void, 내부에 리턴포함(함수를 종료함)
	void printMonth(int m) {
		if(m<0 || m>12) {
			System.out.println("잘못된 입력");
			return;
		}
		System.out.println(m+"월입니다.");
	}
	

}
