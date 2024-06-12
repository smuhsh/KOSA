package sec01_array.EX07_RectangleValueAssignment;

import java.util.Arrays;

/*
 * 작성일:2024-06-12
 * 작성자:황석현
 * 개요: 배열 교재p176 2차원 정방 행렬 배열의 4가지 배열 객체 생성 및 원소 값 대입 방법
 * 
 * */
public class RectangleValueAssignment {

	public static void main(String[] args) {
		
		//배열 객체의 생성 및 원소 값 대입(방법1)
		int[][] array1 = new int[2][3];
		array1[0][0] = 1;
		array1[0][1] = 2;
		array1[0][2] = 3;
		array1[1][0] = 4;
		array1[1][1] = 5;
		array1[1][2] = 6;
		
		System.out.println(array1[0][0]+" "+array1[0][1]+" "+array1[0][2]+" ");
		System.out.println(array1[1][0]+" "+array1[1][1]+" "+array1[1][2]+" ");
		System.out.println();
		
		int[][] array2;
		array2 = new int[2][3];
		array2[0][0] = 1;
		array2[0][1] = 2;
		array2[0][2] = 3;
		array2[1][0] = 4;
		array2[1][1] = 5;
		array2[1][2] = 6;
		
		System.out.println(array2[0][0]+" "+array2[0][1]+" "+array2[0][2]+" ");
		System.out.println(array2[1][0]+" "+array2[1][1]+" "+array2[1][2]+" ");
		System.out.println();
		
	}

}
