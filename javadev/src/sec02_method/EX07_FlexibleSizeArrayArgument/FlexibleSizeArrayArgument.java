package sec02_method.EX07_FlexibleSizeArrayArgument;

import java.util.Arrays;

/*
 * 작성일:2024-06-13
 * 작성자:황석현
 * 개요: p245 메서드의 가변길이 배열 입력매개변수
 * 
 * */

public class FlexibleSizeArrayArgument {
	public static void main(String[] args) {
		//method1(int ...values)
		method1(1,2);
		method1(1,2,3);
		method1();
		//method2(String ...values)
		method2("안녕","방가");
		method2("땡큐","베리","감사");
		method2();
		
	}

	private static void method1(int...values) {
		System.out.println("배열의 길이: "+values.length);
		
		//배열출력방법1
//		for(int i=0; i<values.length; i++) {
//			System.out.println(values[i]+" ");
//		}
		
		//배열출력방법2
		for(int k: values) {
			System.out.print(k+" ");
		}
		//배열출력방법3
//		System.out.println(Arrays.toString(values));
		System.out.println();
		
	}
	
	private static void method2(String...values) {
		System.out.println("배열의 길이: "+values.length);
		
	}
		
}