package sec03_threadproperties.EX04_ThreadProperties_3_2;
/*
 * 작성일:2024-06-21
 * 작성자:황석현
 * 개요: 교재p536
 * 		쓰레드의 데몬설정 ②데몬 쓰레드
 * 
 * */
public class ThreadProperties_3_2 {
	public static void main(String[] args) {
		
		//# 데몬쓰레드
		Thread thread2 = new MyThread();
		thread2.setDaemon(true);//데몬쓰레드로 설정
		thread2.setName("thread2");
		thread2.start();
		
		//# 3.5초 후 main Thread 종료
		try {Thread.sleep(3500);} catch (InterruptedException e) {}
		System.out.println("main Thread 종료");
	}
}
