package sec04_thiskeyword.EX02_ThisKeyword_2;

public class A {
	
	int m;
	int n;
	
	void init(int m, int n) {
		m = m; //this. 를 생략했을 때 자동으로 추가
		n = n; //this. 를 생략했을 때 자동으로 추가
	}
	
}
