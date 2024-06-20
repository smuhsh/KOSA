package sec04_userexception.EX03_ExceptionMethod_2;
/*
 * 작성일:2024-06-19
 * 작성자:황석현
 * 개요: 교재p500
 * 
 * */
public class ExceptionMethod_2 {

	public static void main(String[] args) {
		//#1. 객체 생성
		A a = new A();
		
		//#2. 메서드 호출 / 예외처리
		try {
			a.abc();
		}catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}

}
