package sec02_string.EX04_PlusperationOfString;

/*
 * 작성일:2024-06-12
 * 작성자:황석현
 * 개요: 교재 p197 문자열의 '+' 연산자
 * 
 * */
public class PlusOperationOfString {

	public static void main(String[] args) {
		
		//문자열 + 문자열
		String str1 = "안녕"+"하세요"+"!";
		System.out.println(str1);
		
		String str2 = "반갑";
		str2 += "습니다";
		str2 += "!";
		System.out.println(str2);
		System.out.println();
		
		//문자열 + 기본 자료형 또는 기본 자료형 + 문자열
		String str3 = "안녕"+1;
		String str4 = "안녕"+String.valueOf(1);
		String str5 = "안녕"+1;
		
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		System.out.println();
		
		//문자열과 기본자료형 혼용
		System.out.println(1+"안녕");
		System.out.println(1+"안녕"+2);
		System.out.println("안녕"+1+2);
		System.out.println(1+2+"안녕"); //앞에서 부터 차례대로 +연산수행
		
	}

}
