package sec01_array.EX05_ReadyArrayData;

import java.util.Arrays;

/*
 * 작성일:2024-06-12
 * 작성자:황석현
 * 개요: 배열 교재p167 1차원 배열의 원소값 출력
 * 
 * */
public class ReadyArrayData {

	public static void main(String[] args) {
		
		int[] array = new int[] {3,4,5,6,7};
		
		//배열의 길이 구하기
		System.out.println(array.length);
		
		//출력하기1
		System.out.print(array[0]+" ");
		System.out.print(array[1]+" ");
		System.out.print(array[2]+" ");
		System.out.print(array[3]+" ");
		System.out.print(array[4]+" ");
		System.out.println();
		
		//출력하기2
		for(int i=0; i<array.length; i++)
			System.out.print(array[i]+ " ");
		System.out.println();
		
		//출력하기3
		System.out.println(Arrays.toString(array)); //Arrays 클래스의 toString() 메서드 사용

	}

}
