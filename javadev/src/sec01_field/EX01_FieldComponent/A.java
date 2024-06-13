package sec01_field.EX01_FieldComponent;
/*
 * 작성일:2024-06-13
 * 작성자:황석현
 * 개요: 교재 p224 필드와 지역변수의 구분
 * 
 * */

class A {
	int m=3;
	int n=4;
	void work1() {
		int k=5;
		System.out.println(k);
		work2(2); //work2() 안에 정의된 지역변수를 스택메모리에 추가
	}
	void work2(int i) { //인수를 변수 i에 대입해 입력매개변수로 활용
		int j=4;
		System.out.println(i+j);
	}

}
