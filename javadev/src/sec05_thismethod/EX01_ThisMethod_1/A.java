package sec05_thismethod.EX01_ThisMethod_1;

//클래스의 정의
class A {
	
	A() {
		System.out.println("첫번째 생성자");
	}
	A(int a) {
		this();
		System.out.println("두번쨰 생성자");
	}
//	void abc() {
//		this(); //메서드에서는 this() 메서드 사용 불가능
//	}
	
	
}
