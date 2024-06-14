package sec02_staticmodifier.EX03_StaticMethod;
/*
 * 작성일:2024-06-14
 * 작성자:황석현
 * 개요: 교재p298 인스턴스 메서드와 정적 메서드
 * 
 * */
public class A {
	
	void abc() { //인스턴스 메서드
		System.out.println("instance 메서드");
		
	}
	static void bcd() {
		System.out.println("static 메서드");
	}

}
