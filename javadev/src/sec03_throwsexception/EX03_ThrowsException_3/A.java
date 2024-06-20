package sec03_throwsexception.EX03_ThrowsException_3;

//#1. 하위메서드에 직접 예외를 처리하는 경우
class A {
	
	void abc() {
		bcd();
	}	
	void bcd() {
		try {
			Class cls = Class.forName("Java.lang.Object"); //ClassNotFoundException
			Thread.sleep(1000); //일반예외 : InterruptedException
		} catch (InterruptedException | ClassNotFoundException e) {
			//예외처리 구문
		} 
	}
}
