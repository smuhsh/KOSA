package sec02_method.EX04_EffectOfPrimaryDataArgument;

import java.util.Arrays;

/*
 * 작성일:2024-06-13
 * 작성자:황석현
 * 개요: p237 기본 자료형 입력매개변수값의 변화
 * 
 * */

public class EffectOfPrimaryDataArgument {
	public static void main(String[] args) {
		
		int a=3;
		int result1 = twice(3);
		System.out.println(result1);
		int result2 = twice(a);
		System.out.println(result2);
		System.out.println(a);
		
	}

	private static int twice(int a) {
		a = a*2;
		return a;
	}
		
}