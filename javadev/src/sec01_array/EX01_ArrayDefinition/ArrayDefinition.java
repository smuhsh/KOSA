package sec01_array.EX01_ArrayDefinition;
/*
 * 작성일:2024-06-11
 * 작성자:황석현
 * 개요: 배열 교재p155, 1차원 배열의 2가지 선언방법과 다양한 배열선언의 예
 * 
 * */
public class ArrayDefinition {

	public static void main(String[] args) {
		
		//배열의 선언방법1
		int[] array1 = new int[3];
		int[] array2;
		array2 = new int[3];
		
		//배열의 선언방법2
		int array3[] = new int[3];
		int array4[];
		array4 = new int[3];
		
		//다양한 배열 선언(기본 자료형 배열, 참조 자료형 배열)
		boolean[] array5 = new boolean[3];
		int[] array6 = new int[5];
		double[] array7 = new double[7];
		String[] array8 = new String[9];
		
	}

}
