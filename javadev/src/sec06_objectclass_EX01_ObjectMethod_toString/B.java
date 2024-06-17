package sec06_objectclass_EX01_ObjectMethod_toString;

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

}
