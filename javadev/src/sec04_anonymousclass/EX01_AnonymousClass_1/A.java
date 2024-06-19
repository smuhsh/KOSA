package sec04_anonymousclass.EX01_AnonymousClass_1;


public class A extends Object {
	
	C c = new B();
	void abc() {
		c.bcd();
	}
	
	class B implements C {
		public void bcd() {
			System.out.println("인스턴스 이너 클래스");
		}
	}
	

}
