package sec02_method.EX01_ExternalCallMethods;

/*
 * 작성일:2024-06-13
 * 작성자:황석현
 * 개요: p231 클래스 외부에서의 메서드 호출
 * 
 * */

public class ExternalCallMethods {
	public static void main(String[] args) {
		
		//객체생성
		A a = new A();
		//메서드 호출(멤버활용)
		a.print();
		int k = a.data();
		
		a.data();
		System.out.println(k);
		double result = a.sum(3, 5.2);
		System.out.println(result);
		a.printMonth(5);
		a.printMonth(15);
		
	}

}
