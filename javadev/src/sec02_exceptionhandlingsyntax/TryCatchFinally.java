package sec02_exceptionhandlingsyntax;
/*
 * 작성일:2024-06-19
 * 작성자:황석현
 * 개요: 교재p468, 469
 * 		try catch 구문과 try catch finally 구문의 동작비교
 * 
 * */
public class TryCatchFinally {
	public static void main(String[] args) {
		
		//#1. try-catch
		try {
			System.out.println(3/0); //실행예외 (ArithmeticException)
			System.out.println("프로그램 종료");
		}
		catch(ArithmeticException e) {
			System.out.println("숫자는 0으로 나눌 수 없습니다.");
			System.out.println("프로그램 종료");
		}
		
		//#2. try-catch-finally
		try {
			System.out.println(3/0); //실행예외 (ArithmeticException)			
		}
		//catch(ArithmeticException e) {
		catch(Exception e) {
			System.out.println("숫자는 0으로 나눌 수 없습니다.");			
		}
		finally {
			System.out.println("프로그램 종료");
		}
	}
}