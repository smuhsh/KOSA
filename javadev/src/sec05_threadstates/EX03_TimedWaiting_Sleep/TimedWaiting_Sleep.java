package sec05_threadstates.EX03_TimedWaiting_Sleep;
/*
 * 작성일:2024-06-21
 * 작성자:황석현
 * 개요: 교재p562
 * 		Thread.sleep() 메서드를 이용한 TIME_WATING 과 interrupt
 * */
public class TimedWaiting_Sleep {

	public static void main(String[] args) {
		
		MyThread myThread = new MyThread();
		myThread.start();
		
		try {
			Thread.sleep(100);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("myThread State = " + myThread.getState());
		
		//TIMED_WAITTING
		myThread.interrupt(); //TIMED_WAITTING → RUNNABLE 상태전환
		System.out.println("myThread State = " + myThread.getState());

	}

}
