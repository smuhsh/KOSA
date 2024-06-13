package sec02_method.EX02_InternalCallMethods;

/*
 * 작성일:2024-06-13
 * 작성자:황석현
 * 개요: p233 클래스 내부에서의 메서드 호출
 * 
 * */

public class InternalCallMethods {
	public static void main(String[] args) {
		
		//같은 클래스 안에 있는 내부 메서드 호출
		print();
		
		int a = twice(3);
		System.out.println(a);
		
		double b = sum(a, 5.8);
		System.out.println(b);
		
	}

	private static double sum(int a, double d) {
		return a+d;
	}

	private static int twice(int i) {
		return i*2;
	}

	private static void print() {
		System.out.println("안녕");
	}

}
