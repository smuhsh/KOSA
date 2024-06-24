package sec04_boundedtype.EX01_BoundedTypeOfGenericClass;
/*
 * 작성일:2024-06-24
 * 작성자:황석현
 * 개요: 교재p601
 * 		제네릭 메서드 내부에서 사용할 수 있는 메서드
 * */
public class BoundedTypeOfGenericClass extends Object {
	public static void main(String[] args) {
//		D<A> d1 = new D<>(); //불가능
		
		D<B> d2 = new D<>();
		D<C> d3 = new D<>();
		D d4 = new D();
		
		d2.set(new B());
		d2.set(new B());
		
//		d3.set(new B()); //불가능
		d3.set(new C());
		d4.set(new B());
		d4.set(new C());
	}

}
