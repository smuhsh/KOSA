package sec05_threadstates.EX04_TimedWaiting_Join;
/*
 * 작성일:2024-06-21
 * 작성자:황석현
 * 개요: 교재p564
 * 		join() 메서드를 이용한 TIME_WATING과 interrupt()
 * */
public class TimedWaiting_Join {
	public static void main(String[] args) {
		
		//#1. 객체 생성 
		MyThread1 myThread1 = new MyThread1();		
		MyThread2 myThread2 = new MyThread2(myThread1);
		myThread1.start();
		myThread2.start();
		
		try {Thread.sleep(100);} catch (InterruptedException e) {} //쓰레드 시작 준비 시간
		System.out.println("MyThread1 State = " + myThread1.getState()); //RUNNABLE
		System.out.println("MyThread2 State = " + myThread2.getState()); //TIMED_WAITING
		
		myThread2.interrupt();
		try {Thread.sleep(100);} catch (InterruptedException e) {} //인터럽트 준비 시간
		System.out.println("MyThread1 State = " + myThread1.getState()); //RUNNABLE
		System.out.println("MyThread2 State = " + myThread2.getState()); //RUNNABLE
				
	}
}
