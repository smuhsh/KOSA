package sec03_threadproperties.EX03_ThreadProperties_3_1;
/*
 * 작성일:2024-06-21
 * 작성자:황석현
 * 개요: 교재p535
 * 		쓰레드의 데몬설정 ⓛ일반 쓰레드
 * 
 * */
public class ThreadProperties_3_1 {
	public static void main(String[] args) {
		
		//# 일반쓰레드
		Thread thread1 = new MyThread();
		thread1.setDaemon(false);//디폴트
		thread1.setName("thread1");
		thread1.start();
				
		//# 3.5초 후 main Thread 종료
		try {
			Thread.sleep(3500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("main Thread 종료");
	}
}
