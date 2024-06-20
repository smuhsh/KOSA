package sec04_userexception.EX04_UserExceptionExample;
/*
 * 작성일:2024-06-20
 * 작성자:황석현
 * 개요: 교재p503
 * 		사용자 예외 클래스 정의 및 예외 발생시키기
 * 
 * */
public class UserExceptionExample {

	public static void main(String[] args) {
		A a = new A();
		
		try {
			a.checkScore(85);
			a.checkScore(150);
			
		} catch (MinusException | OverException e) {
			System.out.println(e.getMessage());
		}

	}

}
