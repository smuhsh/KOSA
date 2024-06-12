package sec01_array.EX03_InitialValue;

import java.util.Arrays;

/*
 * 작성일:2024-06-11
 * 작성자:황석현
 * 개요: 배열 교재p161,162 스택 메모리의 초기값과 참조자료형의 강제초기값
 * 
 * */
public class InitialValue {

	public static void main(String[] args) {
		
		//스택 메모리값(강제 초기화되지 않음)
		
		//스택 메모리에 위치하는 변수는 초기화 없이 출력불가능
		int value1;
		//System.out.println(value1); //오류
		
		int[] value2;
		//System.out.println(value2); //오류
		
		int value3 = 0;
		System.out.println(value3);
		int[] value4 = null;
		System.out.println(value4);
		System.out.println();
		
		//힙 메모리의 초기값(강제초기화)
		//@기본 자료형 배열
		boolean[] array1 = new boolean[3]; //false 로 초기화
		for(int i=0; i<3; i++) {
			System.out.print(array1[i]+ " ");
		}
		System.out.println();
		
		int[] array2 = new int[3]; //0으로 초기화
		for(int i=0; i<3; i++) {
			System.out.print(array2[i]+" ");
		}
		System.out.println();
		
		
		double[] array3 = new double[3]; //0.0으로 초기화
		for(int i=0; i<3; i++) {
			System.out.print(array3[i]+" ");
		}
		System.out.println();
		
		//@참조 자료형 배열
		String[] array4 = new String[3]; //null으로 초기화
		for(int i=0; i<3; i++) {
			System.out.print(array4[i]+" ");
		}
		System.out.println();
		System.out.println();
		
		//배열을 한번에 출력
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		System.out.println(Arrays.toString(array3));
		System.out.println(Arrays.toString(array4));
	}

}
