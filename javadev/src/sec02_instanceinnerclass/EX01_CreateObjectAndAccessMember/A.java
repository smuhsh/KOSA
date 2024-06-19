package sec02_instanceinnerclass.EX01_CreateObjectAndAccessMember;

public class A extends Object {
	int a = 3;
	static int b = 4;
	void method1() {
		System.out.println("A클래스 method1()");
	}
	static void method2() {
		System.out.println("A클래스 method2()");
	}
	
	//정적 이너 클래스 정의
	static class B {
		void bcd() {
			//필드사용
			System.out.println(b);
			
			//메서드호출
			method2();
		}

	}

}
