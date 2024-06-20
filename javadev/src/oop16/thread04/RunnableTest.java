package oop16.thread04;
/*
 * 작성일:2024-06-20
 * 작성자:황석현
 * 개요: 교재p525, 526
 * 		이너 클래스를 활용한 쓰레드 객체 생성 및 실행
 * 
 * */
public class RunnableTest {

	public static void main(String[] args) {
		
//		Runnable videoFileRunnable1 = new VideoFileRunnable();
		
		Thread thread = new Thread(new Runnable() {
				@Override
				public void run() {
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
		});
		
//		Thread thread1 = new Thread(videoFileRunnable1);
//		Thread thread2 = new Thread(videoFileRunnable2);
		
//		Runnable videoFileRunnable2 = new VideoFileRunnable();

//		thread1.start();
//		thread2.start();
		
		thread.start();
	}

}
