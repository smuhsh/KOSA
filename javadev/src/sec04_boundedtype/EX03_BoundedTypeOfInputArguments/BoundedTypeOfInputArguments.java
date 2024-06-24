package sec04_boundedtype.EX03_BoundedTypeOfInputArguments;
/*
 * 작성일:2024-06-24
 * 작성자:황석현
 * 개요: 교재p610, 611
 * 		메서드 매개변수로서 제네릭 클래스의 타입제한 범위설정
 * 
 * */
public class BoundedTypeOfInputArguments {

	public static void main(String[] args) {
		
		Test t = new Test();
		
		//case1
		t.method1(new Goods<A>());
//		t.method1(new Goods<B>());
//		t.method1(new Goods<C>());
//		t.method1(new Goods<D>());
		
		//case2
		t.method2(new Goods<A>());
		t.method2(new Goods<B>());
		t.method2(new Goods<C>());
		t.method2(new Goods<D>());

		//case3
//		t.method3(new Goods<A>());
		t.method3(new Goods<B>());
		t.method3(new Goods<C>());
		t.method3(new Goods<D>());
		
		//case4
		t.method4(new Goods<A>());
		t.method4(new Goods<B>());
//		t.method4(new Goods<C>());
//		t.method4(new Goods<D>());
		
	}

}
