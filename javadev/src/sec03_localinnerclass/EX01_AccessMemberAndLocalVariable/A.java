package sec03_localinnerclass.EX01_AccessMemberAndLocalVariable;

public class A extends Object {
	int a = 3; //필드
	void method1() {
		int b = 5; //지역변수
		
		class B {
			void method2() {
				System.out.println(a);
				System.out.println(b);
				
				a = 5;
				//b = 7; //지역 이너클래스에서 사용하는 지역변수는 자동 final 선언
			}
			
		}
		
		//b = 9;
		
		B bb = new B();
		bb.method2();
		
	}

}
