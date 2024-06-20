package sec04_userexception.EX02_ExceptionMethod_1;
/*
 * 작성일:2024-06-19
 * 작성자:황석현
 * 개요: 교재p498
 * 		예외 객체의 대표적인 메서드 getMessage
 * 
 * */
public class ExceptionMethod_1 {

	public static void main(String[] args) {
		//#1. 예외객체 생성시 메시지 전달하지 않는 경우
		try {
			throw new Exception();
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//#2. 예외객체 생성시 메시지 전달하는 경우 
		try {
			throw new Exception("예외 메시지"); //예외발생
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
