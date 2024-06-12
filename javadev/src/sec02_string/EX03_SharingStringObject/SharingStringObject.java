package sec02_string.EX03_SharingStringObject;

/*
 * 작성일:2024-06-12
 * 작성자:황석현
 * 개요: 교재 p194 문자열 리터럴에 따른 생성 문자열 객체의 공유
 * 
 * */
public class SharingStringObject {

	public static void main(String[] args) {
		String str1 = new String("안녕");
		String str2 = "안녕";
		String str3 = "안녕"; //str2가 가리키는 객체를 공유
		String str4 = new String("안녕"); //새 객체 생성
		
		System.out.println(str1.equals(str2));
		
		//스택 메모리값 비교(==)
		System.out.println(str1==str2);
		System.out.println(str2==str3);
		System.out.println(str3==str4);
		System.out.println(str4==str1);
	}

}
