package sec02_genericclass.EX01_SingleGenericArgument;

public class MyClass<T> {
	private T t;
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t = t;
	}

}
