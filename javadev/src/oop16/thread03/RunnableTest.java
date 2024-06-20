package oop16.thread03;

public class RunnableTest {

	public static void main(String[] args) {
		
		Runnable smFileRunnable = new SMFileRunnable();
		
		Thread thread = new Thread(smFileRunnable);
		thread.start();
		
		//#1 비디오프레임 1~5
		int[] intArray = {1,2,3,4,5}; //비디오 프레임번호
		
		//#3. 비디오 프레임 출력
		for(int i=0; i<intArray.length; i++) {
			System.out.println("(비디오프레임)"+intArray[i]);
			try {
				Thread.sleep(200);
			} catch (Exception e) {
			}
		}


	}

}
