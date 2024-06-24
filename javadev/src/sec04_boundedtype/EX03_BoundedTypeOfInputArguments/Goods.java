package sec04_boundedtype.EX03_BoundedTypeOfInputArguments;

public class Goods<T> {
	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}

}
