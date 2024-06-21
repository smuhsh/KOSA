package sec05_threadstates.EX01_NewRunnableTerminated;
/*
 * 작성일:2024-06-21
 * 작성자:황석현
 * 개요: 교재p557
 * 		쓰레드 상태(New, Runnable, Terminated)
 * */
public class NewRunnableTerminated {
	public static void main(String[] args) {
		//#쓰레드 상태 저장 클래스 
		Thread.State state; //enum 과 같음 
		
		//#1. 객체 생성 (NEW)
		Thread myThread = new Thread() {
			@Override
			public void run() {
				for(long i=0; i<1000_000_000L ; i++) {} //시간지연
			}
		};		
		state = myThread.getState(); //현재 쓰레드의 상태를 얻어옴
		System.out.println("myThread state = "+ state); //NEW
		
		//#2. myThread 시작
		myThread.start();
		state = myThread.getState();
		System.out.println("myThread state = "+ state); //Runnable
				
		//#3. myThread 종료
		try {
			myThread.join();
		} catch (InterruptedException e) {	}
		
		state = myThread.getState();
		System.out.println("myThread state = "+ state); //TERMINATED		
	}
}
