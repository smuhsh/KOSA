package sec04_synchronizedmethodandblock.EX03_SynchronizedBlock;
/*
 * 작성일:2024-06-21
 * 작성자:황석현
 * 개요: 교재p545
 * 		블록동기화
 * 		동기화 블록을 활용한 동기화 구현
 * */
public class SynchronizedBlock {
	public static void main(String[] args) {
		//#공유객체 생성
		MyData myData = new MyData();
				
		//#1.  plusThread 1
		Thread plusThread1 = new PlusThread(myData);
		plusThread1.setName("plusThread1");
		plusThread1.start();
		
		try { Thread.sleep(1000);} catch (InterruptedException e) {}
		
		//#2.  plusThread 2
		Thread plusThread2 = new PlusThread(myData);
		plusThread2.setName("plusThread2");
		plusThread2.start();
	}
}
