package sec05_threadstates.EX04_TimedWaiting_Join;

class MyThread2 extends Thread {
	MyThread1 myThread1;
	public MyThread2(MyThread1 myThread1) {
		this.myThread1 = myThread1;
	}
	
	@Override
	public void run() {
		try {
			myThread1.join(3000);
		} catch (InterruptedException e) {
			System.out.println(" -- join(...) 진행중 interrupt() 발생");
			for(long i=0; i<1000000000L ; i++) {} //시간지연
		}
	}
}
