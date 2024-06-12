package sec01_array.EX04_PrimaryAndReferenceType;
/*
 * 작성일:2024-06-12
 * 작성자:황석현
 * 개요: 배열 교재p165 기본 자료형과 참조 자료형의 특징비교
 * 
 * */
public class PrimaryAndReferenceType {

	public static void main(String[] args) {
		
		//기본 자료형의 대입연산
		int value1 = 3;
		int value2 = value1;
		value2 = 7;
		
		System.out.println("value1 :"+value1);
		System.out.println("value2 :"+value2);
		System.out.println();
		
		//참조 자료형의 대입연산
		int[] array1 = new int[] {3,4,5};
		int[] array2 = array1;
		array2[0] = 7;
		
		System.out.println(array1[0]);
		System.out.println(array2[0]);

	}

}
