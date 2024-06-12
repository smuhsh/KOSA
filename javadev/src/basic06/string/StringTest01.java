package basic06.string;
/*
 * 작성일:2024-06-12
 * 작성자:황석현
 * 개요: 교재 p190 String class 의 2가지 특징
 * 
 * */

public class StringTest01 {

	public static void main(String[] args) {
		String str1 = new String("안녕");
		System.out.println(str1.toString());
		System.out.println(str1); //toString 생략가능함
		
		String str2 = "안녕하세요";
		System.out.println(str2);
		
	}

}
