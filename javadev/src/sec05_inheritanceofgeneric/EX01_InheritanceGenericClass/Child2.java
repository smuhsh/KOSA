package sec05_inheritanceofgeneric.EX01_InheritanceGenericClass;

public class Child2<T, V> extends Parent<T>{
	V v;

	public V getV() {
		return v;
	}

	public void setV(V v) {
		this.v = v;
	}
	

}
