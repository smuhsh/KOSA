package sec02_string.EX06_MethodOfString_2;

import java.util.Arrays;

/*
 * 작성일:2024-06-12
 * 작성자:황석현
 * 개요: 교재 p202 String 클래스의 주요 메서드 1
 * 
 * */
public class MethodOfString_2 {

	public static void main(String[] args) {
		
		//문자열 수정
		//@toLowerCase(), toUpperCase()
		String str1 = "Java Study";
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		
		//@replace()
		System.out.println(str1.replace("study", "공부")); //"Study" 문자열을 "공부"로 변경
		
		//@Substring
		System.out.println(str1.substring(0,5)); // 0<= 인덱스 <5 의 문자열
		
		//@split
		String[] strArry = "abc/def-gfi jkl".split("/|-|"); // '/' 또는 ''(공백)으로 구분된 문자열 배열 반환
		System.out.println(Arrays.toString(strArry));
		
		//@trim()
		System.out.println(" abc ".trim());
		
		System.out.println();
		
		//문자열의 내용비교
		String str2 = new String("Java");
		String str3 = new String("Java");
		String str4 = new String("java");
		
		//@stack 메모리 비교(==): 위치(번지) 비교
		System.out.println(str2 == str3);
		System.out.println(str3 == str4);
		System.out.println(str4 == str2);
		
		//@equals(), equalsIgnoreCase(): 내용비교
		System.out.println(str2.equals(str3));
		System.out.println(str3.equals(str4));
		System.out.println(str3.equalsIgnoreCase(str4));
		
	}

}
