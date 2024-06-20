package sec04_userexception.EX04_UserExceptionExample;

//#점수가 음수인 경우에 예외발생
public class MinusException extends Exception {
	public MinusException() {
		super();
	}
	public MinusException(String message) {
		super(message);
	}

}
