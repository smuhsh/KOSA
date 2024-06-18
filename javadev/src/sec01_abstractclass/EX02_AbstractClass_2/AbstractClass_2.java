package sec01_abstractclass.EX02_AbstractClass_2;
/*
 * 작성일:2024-06-18
 * 작성자:황석현
 * 개요: 교재p401
 * 		추상 클래스의 객체 생성 방법 ②익명 이너클래스(객체) 활용하기 
 * 
 * */
public class AbstractClass_2 {

	public static void main(String[] args) {
		//객체생성
		A a1 = new A() {
			void abc() {
				System.out.println("방법2. 익명 이너 클래스 방법으로 객체 생성");
			}
		};
		
		A a2 = new A() {
			void abc() {
				System.out.println("방법2. 익명 이너 클래스 방법으로 객체 생성");
			}
		};
		
		//메서드 호출
		a1.abc();
		a2.abc();
	}

}
