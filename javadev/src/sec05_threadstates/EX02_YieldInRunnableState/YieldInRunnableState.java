package sec05_threadstates.EX02_YieldInRunnableState;
/*
 * 작성일:2024-06-21
 * 작성자:황석현
 * 개요: 교재p558
 * 		Runnable 상태에서 yield()메서드를 이용한 CPU 사용 양보
 * */
public class YieldInRunnableState {
	
	public static void main(String[] args) {
		MyThread thread1 = new MyThread();
		thread1.setName("thread1");
		thread1.yieldFlag=false;
		thread1.setDaemon(true);
		thread1.start();
		
		MyThread thread2 = new MyThread();
		thread2.setName("thread2");
		thread2.yieldFlag=true;
		thread2.setDaemon(true);
		thread2.start();
		
		//#1. 6초 지연 (1초마다 한번씩 양보)
		for(int i=0; i<6; i++) {
			try { Thread.sleep(1000); } catch (InterruptedException e) {}
			thread1.yieldFlag=!thread1.yieldFlag;
			thread2.yieldFlag=!thread2.yieldFlag;
		}
		
	}
	

}
