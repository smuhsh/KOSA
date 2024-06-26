package sec03_map.EX06_TreeMapMethod_2;

public class MyComparableClass<T> implements Comparable<MyComparableClass>{
	
	int data1;
	int data2;
	
	public MyComparableClass(int data1, int data2) {
		super();
		this.data1 = data1;
		this.data2 = data2;
	}


	@Override
	public int compareTo(MyComparableClass o) { //크기비교의 기준을 여기서 설정 (음수, 0, 양수)
		
		if (this.data1<o.data1) {
			return -1;
		}
		else if(this.data1 == o.data1) {
			return 0;
		}
		else 
			return 1;
	}

	@Override
	public String toString() {
		return "data1="+data1+"을 가지고 있는 클래스";
	}
	
	

}
