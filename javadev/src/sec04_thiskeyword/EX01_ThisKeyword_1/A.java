package sec04_thiskeyword.EX01_ThisKeyword_1;

//클래스 내부에서 필드, 메서드에 앞에 자동으로 붙는 this 키워드
public class A {
	
	int m;
	int n;
	
	void init(int a, int b) {
		int c;
		c = 3;
//		this.m = a; //this. 를 생략했을 때 자동으로 추가
//		this.n = b; //this. 를 생략했을 때 자동으로 추가
		m = a; //this. 를 생략했을 때 자동으로 추가
		n = b; //this. 를 생략했을 때 자동으로 추가
	}
	
	void work() {
		this.init(2, 3); //this. 를 생략했을 때 자동으로 추가
	}
	
}
