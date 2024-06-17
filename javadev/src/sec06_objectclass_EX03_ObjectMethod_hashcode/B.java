package sec06_objectclass_EX03_ObjectMethod_hashcode;

public class B {
	String name;
	B(String name) {
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		if(this.name ==((B)obj).name) {
			return true;
		}
		else
			return false;
	}
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	@Override
	public String toString() {
		return name;
	}

}
