package sec04_boundedtype.EX02_BoundedTypeOfGenericMethod;
/*
 * 작성일:2024-06-24
 * 작성자:황석현
 * 개요: 교재p608
 * 		제네릭 메서드에서의 제네릭 타입 제한 범위 설정
 * */
public class BoundedTypeOfGenericMethod {

	public static void main(String[] args) {
		A a = new A();
		a.method1(5.8); // = a.<Double>method1(5.8);
		
		B b = new B();
		b.method1(new MyIntrface() {
			
			@Override
			public void print() {
				System.out.println("print() 구현");
				
			}
		});
	}

}
