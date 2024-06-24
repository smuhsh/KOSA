package sec05_inheritanceofgeneric.EX02_InheritanceGenericMethod;

public class Parent extends Object {
	<T extends Number> void print(T t) {
		System.out.println(t);
	}

}
