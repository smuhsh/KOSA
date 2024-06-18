package sec02_interface.EX08_StaticMethod;
/*
 * 작성일:2024-06-18
 * 작성자:황석현
 * 개요: 교재 p420
 * 		인터페이스 내의 정적 메서드
 * */

interface A {
	
	static void abc() {
		System.out.println("A 인터페이스의 정적 메서드 abc()");
	}
}

public class StaticMethod {

	public static void main(String[] args) {
		//정적 메서드 호출
		A.abc();

	}

}
