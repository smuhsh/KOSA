package sec02_interface.EX05_CreateObjectInterface_2;
/*
 * 작성일:2024-06-18
 * 작성자:황석현
 * 개요: 교재 p411
 * 		익명 이너 클래스를 활용해 인터페이스 객체생성
 * 
 * */
public class CreateObjectInterface_2 {

	public static void main(String[] args) {
		//객체생성
		A a1 = new A() {
			public void abc() {
				System.out.println("방법2. 익명 이너 클래스를 이용한 객체 생성");
			}
		};
		
		A a2 = new A() {
			public void abc() {
				System.out.println("방법2. 익명 이너 클래스를 이용한 객체 생성");

			}
		};
		
		//메서드 호출
		a1.abc();
		a2.abc();

	}

}
