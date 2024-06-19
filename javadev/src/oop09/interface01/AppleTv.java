package oop09.interface01;

public class AppleTv implements TV{
	
	private Speaker speaker;
	
	public void turnOn() {
		System.out.println("AppleTv : 전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("AppleTv : 전원을 끕니다.");
	}
	public void channelUp() {
		System.out.println("AppleTv : 채널을 올립니다.");
	}
	public void channelDown() {
		System.out.println("AppleTv : 채널을 내립니다.");
	}
	public void soundUp() {
		System.out.println("AppleTv : 소리를 올립니다.");
	}
	public void soundDown() {
		System.out.println("AppleTv : 소리를 내립니다.");
	}

}
