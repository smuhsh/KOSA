package sec06_objectclass_EX03_ObjectMethod_hashcode;

public class A extends Object{
	
	String name;
	A(String name) {
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		if(this.name ==((A)obj).name) {
			return true;
		}
		else
			return false;
	}
	@Override
	public String toString() {
		return name;
	}
	
}
