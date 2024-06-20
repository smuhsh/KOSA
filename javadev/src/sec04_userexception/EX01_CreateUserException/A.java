package sec04_userexception.EX01_CreateUserException;

public class A {
	//#3. 사용자 정의 예외 객체 생성
	MyException me1 = new MyException();
	MyException me2 = new MyException("예외메시지: MyException");
	
	MyRTException mre1 = new MyRTException();
	MyRTException mre2 = new MyRTException("예외메시지: MyRTException");
	
	//#4. 예외 던지기 (throw) : 던진시점에서 예외 발생
	//@방법#1. 예외를 직접처리
	void abc_1(int num) {
		try {
			if(num > 70) {
				System.out.println("정상작동");
			}
			else {
				throw me1; //예외를 던진 이시점에 예외발생
			}
			
		}catch (MyException e) {
			System.out.println("예외처리 1");
		}
	}
	void bcd_1() {
		abc_1(65);
	}
	//@방법#2. 예외의 전가
	void abc_2(int num) throws MyException {
		if(num>70) {
			System.out.println("정상작동");
		}
		else {
			throw me1; //예외를 던진 이시점에 예외발생
		}
	}
	void bcd_2() {
		try {
			abc_2(65);
		} catch (MyException e) {
			System.out.println("예외처리 2");
		}
	}

}
