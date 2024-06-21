package sec04_synchronizedmethodandblock.EX01_TheNeedsForSynchronized;
/*
 * 작성일:2024-06-21
 * 작성자:황석현
 * 개요: 교재p540
 * 		동기화를 사용하지 않았을 때 문제 발생
 * 
 * */
public class TheNeedsForSynchronized {

	public static void main(String[] args) {
		
		//공유객체 생성
		MyData myData = new MyData();
		
		//plusThread
		Thread plusThread1 = new PlusThread(myData);
		plusThread1.setName("plusThread1");
		plusThread1.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//plusThread2
		Thread plusThread2 = new PlusThread(myData);
		plusThread1.setName("plusThread1");
		plusThread2.start();

	}

}
