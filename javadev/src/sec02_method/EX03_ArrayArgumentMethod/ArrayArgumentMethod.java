package sec02_method.EX03_ArrayArgumentMethod;

import java.util.Arrays;

/*
 * 작성일:2024-06-13
 * 작성자:황석현
 * 개요: p235 배열 입력매개변수가 있는 메서드 호출
 * 
 * */

public class ArrayArgumentMethod {
	public static void main(String[] args) {
		
		//배열을 입력매개변수로 하는 메서드호출
		int[] a = new int[] {1,2,3};
		printArray(a);
		printArray(new int[] {1,2,3});

}

	private static void printArray(int[] a) {
		System.out.println(Arrays.toString(a));
	}
}