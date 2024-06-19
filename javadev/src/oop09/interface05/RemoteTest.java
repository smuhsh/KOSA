package oop09.interface05;
/*
 * 작성일:2024-06-19
 * 작성자:황석현
 * 개요: 
 * 
 * */
public class RemoteTest {

	public static void main(String[] args) {
		LgRemoteTv tv = new LgRemoteTv();
		tv.powerOn();
		tv.channelUp();
		tv.channelDown();
		tv.powerOff();
	}

}
