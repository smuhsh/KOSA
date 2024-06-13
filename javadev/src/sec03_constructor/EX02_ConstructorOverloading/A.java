package sec03_constructor.EX02_ConstructorOverloading;

public class A {
	
	A() {
		System.out.println("첫번째 생성자");
	}
	A(int a) {
		System.out.println("두번째 생성자");
	}
	A(int a, int b){
		System.out.println("세번째 생성자");
	}
	
}
