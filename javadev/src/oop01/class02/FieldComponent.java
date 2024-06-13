package oop01.class02;
/*
 * 작성일:2024-06-13
 * 작성자:황석현
 * 개요: 교재 p224 필드와 지역변수의 구분
 * 
 * */

public class FieldComponent {
	public static void main(String[] args) {
		//클래스로 객체생성
		A a = new A();
		System.out.println(a.m);
		System.out.println(a.n);
		
		//메서드 호출
		a.work1(); //work1() 안에 정의된 지역변수를 스택메모리에 추가
	}

}
