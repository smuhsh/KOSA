package sec04_synchronizedmethodandblock.EX04_KeyObject_1;
/*
 * 작성일:2024-06-21
 * 작성자:황석현
 * 개요: 교재p548
 * 		동기화의 원리
 * 		3개의 동기화 영역이 동일한 열쇠로 동기화됐을 때
 * */
public class KeyObject_1 {

	public static void main(String[] args) {
		
		//#공유객체
		MyData myData = new MyData();
		
		//#세개의 쓰레드가 각각의 메서드 호출
		new Thread() {
			public void run() {
				myData.abc();
			};
		}.start();
		
		new Thread() {
			public void run() {
				myData.bcd();
			};
		}.start();
		
		new Thread() {
			public void run() {
				myData.cde();
			};
		}.start();

	}

}
