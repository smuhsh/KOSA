package sec04_userexception.EX01_CreateUserException;

//#2. 사용자 실행예외 (unchecked exception = runtime exception)
public class MyRTException extends RuntimeException {
	public MyRTException() {
		super();
	}
	public MyRTException(String message) {
		super(message);
	}

}
