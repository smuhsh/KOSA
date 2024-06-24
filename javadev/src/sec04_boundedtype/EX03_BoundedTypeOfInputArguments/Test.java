package sec04_boundedtype.EX03_BoundedTypeOfInputArguments;

public class Test {
	void method1(Goods<A> g) {}
	void method2(Goods<?> g) {}
	void method3(Goods<? extends B> g) {}
	void method4(Goods<? super B> g) {}

}
