package sec04_boundedtype.EX02_BoundedTypeOfGenericMethod;

public class A {
	public <T extends Number> void method1(T t) {
		System.out.println(t.intValue());
	}

}
