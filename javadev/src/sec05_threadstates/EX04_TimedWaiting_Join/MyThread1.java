package sec05_threadstates.EX04_TimedWaiting_Join;

class MyThread1 extends Thread {
	@Override
	public void run() {
		for(long i=0; i<1000000000L ; i++) {} //시간지연
	}
}
