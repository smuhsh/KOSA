package sec02_method.EX06_MethodOverloading;

import java.util.Arrays;

/*
 * 작성일:2024-06-13
 * 작성자:황석현
 * 개요: p242 메서드의 오버로딩
 * 
 * */

public class EffectOfReferenceDataArgument {
	public static void main(String[] args) {
		print();
		print(3);
		print(5.8);
		print(2,5);
	}
	
	private static void print() {
		System.out.println("데이터가 없습니다.");
	}

	private static void print(int a) {
		System.out.println(a);
	}
	
	private static void print(double a) {
		System.out.println(a);
	}
	/*void print(double a){} 와 중복으로 정의 불가능*/
	
//	public static void print(double b) {
//		System.out.println(b);
//	}
	
	
	private static void print(int a, int b) {
		System.out.println("a: "+a+" b: "+b);
	}
	
	/*void print(int a, int b){}와 중복으로 정의 불가능*/
//	private static void print(int a, int b) {
//		System.out.println("a: "+a+" b: "+b);
//		return a+b;
//	}
	
}