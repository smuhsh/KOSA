package sec03_constructor.EX01_DefaultConstructor;

public class C {
	int m;
	void work() {
		System.out.println(m); //생성자로 넘어온 값
	}
	C(int a){
		m=a;
		/*
		 * 입력매개변수를 포함하고 있는 생성자 정의
		 * 입력매개변수로 전달된 값으로 필드초기화
		 * 
		 * */
	}

}
