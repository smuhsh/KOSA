package oop09.interface01;

public class TvUser {
	public static void main(String[] args) {
//		LgTv tv = new LgTv();
		TV tv = new SamsungTv();
		tv.turnOn();
		tv.channelUp();
		tv.channelDown();
		tv.soundUp();
		tv.soundDown();
		tv.turnOff();
		
		//LgTv를 SamsungTv 로 바꾸려니 규격이 바뀌어서 인터페이스가 필요하다
//		SamsungTv tv = new SamsungTv();
//		tv.turnOn();
//		tv.channelUp();
//		tv.channelDown();
//		tv.soundUp();
//		tv.soundDown();
//		tv.turnOff();
	}

}
