package sec05_threadstates.EX03_TimedWaiting_Sleep;

public class MyThread extends Thread {

	@Override
	public void run() {
		super.run();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			System.out.println(" -- sleep() 진행중 interrupt() 발생");
			for(long i=0; i<1000000000L ; i++) {} //시간지연
		}
	}
	

}
