package sec04_anonymousclass.EX04_AnonymousClass_4;
/*
 * 작성일:2024-06-19
 * 작성자:황석현
 * 개요: 교재p443
 * 		클래스 미정의 및 참조 변수명을 사용/미사용 했을떄 입력매개변수 객체전달
 * 
 * */
public class AnonymousClass_4 {

	public static void main(String[] args) {
		
		C c = new C();
		//방법3. 클래스명X 참조변수명O
		A a = new A() {
			public void abc() {
				System.out.println("입력매개변수 전달");
			}
		};
		
		c.cde(a);
		//방법4. 클래스명X 참조변수명X
		c.cde(new A() {
			public void abc() {
				System.out.println("입력매개변수 전달");
			}
			
		});
		
	}

}
