package sec04_boundedtype.EX02_BoundedTypeOfGenericMethod;

public class B {
	public <T extends MyIntrface> void method1(T t) {
		t.print();
	}

}
