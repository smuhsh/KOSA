package sec05_inheritanceofgeneric.EX01_InheritanceGenericClass;

public class Parent<T> {
	T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

}
