package sec04_synchronizedmethodandblock.EX01_TheNeedsForSynchronized;

//공유객체
public class MyData {
	int data = 3;
	
	public synchronized void plusData() { //synchronized 키워드를 붙이면 하나의 쓰레드가 완전히 종료된 후 다른 메서드를 수행한다.
		int mydata = data; //데이터 가져오기
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		data = mydata + 1;
	}

}
