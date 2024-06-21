package sec04_synchronizedmethodandblock.EX05_KeyObject_2;
/*
 * 작성일:2024-06-21
 * 작성자:황석현
 * 개요: 교재p550
 * 		동기화의 원리
 * 		동기화 메서드와 동기화 블록이 다른 열쇠를 사용할 때
 * */
public class KeyObject_2 {
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
