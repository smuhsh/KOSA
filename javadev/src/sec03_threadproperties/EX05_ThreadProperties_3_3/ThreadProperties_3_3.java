package sec03_threadproperties.EX05_ThreadProperties_3_3;
/*
 * 작성일:2024-06-21
 * 작성자:황석현
 * 개요: 교재p537
 * 		쓰레드의 데몬설정 ③일반 쓰레드와 데몬 쓰레드
 * 
 * */
public class ThreadProperties_3_3 {
	public static void main(String[] args) {
		
		//#1. 일반쓰레드
		Thread thread1 = new MyThread();
		thread1.setDaemon(false);// 일반쓰레드로 설정
		thread1.setName("thread1");
		thread1.start();
		
		//#2. 데몬쓰레드
		Thread thread2 = new MyThread();
		thread2.setDaemon(true);// 데몬쓰레드로 설정
		thread2.setName("thread2");
		thread2.start();
		
		//#3. 3.5초 후 main Thread 종료
		try {
			Thread.sleep(3500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("main Thread 종료");
	}
}
