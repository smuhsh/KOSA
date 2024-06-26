package sec03_map.EX02_HashMapMachanism;

import java.util.Objects;

public class C {
	int data;

	public int getData() {
		return data;
	}

	public C(int data) {
		super();
		this.data = data;
	}

	public void setData(int data) {
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
