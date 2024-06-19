package sec04_anonymousclass.EX02_AnonymousClass_2;


public class A extends Object {
	C c = new C() {
		public void bcd() {
			System.out.println("익명 이너 클래스");
		}
	};
	
	void abc() {
		c.bcd();
	}

}
