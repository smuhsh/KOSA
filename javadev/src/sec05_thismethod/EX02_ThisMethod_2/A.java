package sec05_thismethod.EX02_ThisMethod_2;

class A {
	int m1, m2, m3, m4;
	A(){
		m1 = 1;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	}
	A(int a){
		m1 = a;
		m2 = 2;
		m3 = 3;
		m4 = 4;
		
	}
	A(int a, int b){
		m1 = a;
		m2 = b;
		m3 = 3;
		m4 = 4;
	}
	void print() {
		System.out.print(m1+" ");
		System.out.print(m2+" ");
		System.out.print(m3+" ");
		System.out.print(m4);
		System.out.println();
		
	}
	
}
