package sec05_threadstates.EX02_YieldInRunnableState;

class MyThread extends Thread {
	boolean yieldFlag;
	@Override
	public void run() {
		while(true) {
			if(yieldFlag) {
				Thread.yield();
			} else {
				System.out.println(getName() + " 실행");
				for(long i=0; i<1000000000L ; i++) {} //시간지연
			}
		}
	}
}
