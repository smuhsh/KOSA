package sec02_genericclass.EX03_Solution2_Generic;

public class Goods<T> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public Goods(T t) {
		super();
		this.t = t;
	}
	

}
