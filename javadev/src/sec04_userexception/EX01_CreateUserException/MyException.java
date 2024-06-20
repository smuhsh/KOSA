package sec04_userexception.EX01_CreateUserException;

//#1. 사용자 일반예외 (checked exception)
public class MyException extends Exception {
	public MyException() {
		super();
	}
	public MyException(String message) {
		super(message);
	}

}
