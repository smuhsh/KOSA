package sec01_lambdaexpression.EX03_RefOfIntanceMethod_Type1_1;
/*
 * 작성일:2024-06-25
 * 작성자:황석현
 * 개요: 교재p731 ~ 732
 * 		정의돼 있는 인스턴스 메서드 참조
 * 
 * */
public class RefOfIntanceMethod_Type1_1 {

	public static void main(String[] args) {
		
		//1.익명 이너 클래스
		A a1 = new A() {

			@Override
			public void abc() {
				B b = new B();
				b.bcd();
				
			}
			
		};
		
		//2. 람다식으로 표현
		A a2 = () -> {
			B b = new B();
			b.bcd();
		};
		
		//3.정의된 인스턴스 메서드 참조
		B b = new B();
		A a3 = b::bcd;
		a1.abc();
		a2.abc();
		a3.abc();
		
	}

}
