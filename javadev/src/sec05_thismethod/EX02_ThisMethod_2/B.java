package sec05_thismethod.EX02_ThisMethod_2;

public class B {
	int m1, m2, m3, m4;
	B(){
		m1 = 1;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	}
	B(int a){
		this(); //B() 생성자 호출
		m1 = a;
	}
	B(int a, int b){
		this(a); // B(int a)생성자 호출
		m2 = b;
	}
	
	//B() 생성자를 호출하고 두 필드값을 한번에 수정할 수도 있음
//	B(int a, int b){
//		this();
//		m1 = a;
//		m2 = b;
//	}
	
	void print() {
		System.out.print(m1+" ");
		System.out.print(m2+" ");
		System.out.print(m3+" ");
		System.out.print(m4);
		System.out.println();
	}
	

}
