package oop16.thread02;

public class VideoFileThread extends Thread {

	@Override
	public void run() {
		super.run();
		
		//SMIFileThread 객체 생성 및 시작
		Thread smIFileThread = new SMFileThread();
		smIFileThread.start();
		
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
