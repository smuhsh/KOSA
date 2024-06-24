package sec02_set.EX02_HashSetMachanism;

import java.util.Objects;

class C extends Object {
	int data;
	public C(int data) {
		this.data = data;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof C) {
			this.data = ((C)obj).data;
			return true;
		}
		return false;
	}	
	@Override
	public int hashCode() {		
		return Objects.hash(data);		
	}
}
