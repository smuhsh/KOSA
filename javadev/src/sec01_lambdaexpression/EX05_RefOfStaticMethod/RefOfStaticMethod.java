package sec01_lambdaexpression.EX05_RefOfStaticMethod;
/*
 * 작성일:2024-06-25
 * 작성자:황석현
 * 개요: 교재p736
 * 		정적 메서드 참조
 * */
public class RefOfStaticMethod {

	public static void main(String[] args) {
		
		//1.익명 이너 클래스
		A a1 = new A() {

			@Override
			public void abc() {
				B.bcd();
				
			}
			
		};
		
		//2. 람다식을 표현
		A a2 = () ->{B.bcd();};
		
		//3. 정적 메서드 참조
		A a3 = B::bcd;
		
		a1.abc();
		a2.abc();
		a3.abc();
	}

}
