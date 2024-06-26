package sec03_map.EX02_HashMapMachanism;

public class B {
	int data;

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	public B(int data) {
		super();
		this.data = data;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof B) {
			this.data = ((B)obj).data;
			return true;
		}
		return false;
	}
}
