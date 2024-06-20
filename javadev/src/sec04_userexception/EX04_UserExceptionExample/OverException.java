package sec04_userexception.EX04_UserExceptionExample;

//#점수가 100점을 초과하는 경우에 예외 발생
public class OverException extends Exception {
	public OverException() {
		super();
	}
	public OverException(String message) {
		super(message);
	}

}
