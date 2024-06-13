package sec02_method.EX05_EffectOfReferenceDataArgument;

import java.util.Arrays;

/*
 * 작성일:2024-06-13
 * 작성자:황석현
 * 개요: p238 참조 자료형 매개변수값의 변화
 * 
 * */

public class EffectOfReferenceDataArgument {
	public static void main(String[] args) {
		
		int[] array = new int[] {1,2,3};
		modiftData(array);
		printArray(array);
		
	}
	
	private static void printArray(int[] a) {
		System.out.println(Arrays.toString(a));
	}

	private static void modiftData(int[] a) {
		a[0]=4;
		a[1]=5;
		a[2]=6;
		
	}		
}