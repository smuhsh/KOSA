package sec05_threadstates.EX05_BlockedState;
/*
 * 작성일:2024-06-21
 * 작성자:황석현
 * 개요: 교재p568
 * 		공유 객체 동기화로 인한 BLOCKED 상태
 * 
 * */
public class BlockedState {

	public static void main(String[] args) {
		MyBlockTest mbt = new MyBlockTest();
		mbt.startAll();

	}

}
