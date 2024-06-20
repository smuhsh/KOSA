package sec01_theneedforthread.EX01_TheNeedForThread;
/*
 * 작성일:2024-06-20
 * 작성자:황석현
 * 개요: 쓰레드
 * 
 * */
public class TheNeedForThread {

	public static void main(String[] args) {
		
		//#1 비디오프레임 1~5
		int[] intArray = {1,2,3,4,5};
		
		//#2. 자막 번호 하나~다섯
		String[] strArry = {"하나", "둘", "셋", "넷", "다섯"};
		
		//#3. 비디오 프레임 출력
		for(int i=0; i<intArray.length; i++) {
			System.out.println("(비디오프레임)"+intArray[i]);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
			}
		}
		
		//#4. 자막번호 출력
		for(int i=0; i<strArry.length; i++) {
			System.out.println("(자막번호)"+strArry[i]);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
			}
		}

	}

}
