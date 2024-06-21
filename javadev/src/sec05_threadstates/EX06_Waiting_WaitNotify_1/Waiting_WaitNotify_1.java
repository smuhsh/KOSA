package sec05_threadstates.EX06_Waiting_WaitNotify_1;
/*
 * 작성일:2024-06-21
 * 작성자:황석현
 * 개요: 교재p571
 * 		동기화만을 사용했을 때 임의적인 두 쓰레드의 실행순서
 * 
 * */
public class Waiting_WaitNotify_1 {

	public static void main(String[] args) {
		
		DataBox dataBox = new DataBox();
		
		Thread t1 = new Thread() {
			public void run() {
				for(int i=1; i<9; i++) {
					dataBox.inputData(i);
				}
			};
		};
		Thread t2 = new Thread() {
			public void run() {
				for(int i=1; i<9; i++) {
					dataBox.outputData(i);
				}
			};
		};
		
		t1.start();
		t2.start();

	}

}
