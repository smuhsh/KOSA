package oop09.interface05;

public abstract class RemoteTv implements RemoteControl {

	@Override
	public void powerOn() {
		System.out.println("RemoteTv 전원을 켭니다.");
	}

	@Override
	public void powerOff() {
		System.out.println("RemoteTv 전원을 끕니다.");
	}

	@Override
	public void channelUp() {
		System.out.println("RemoteTv 채널을 올립니다.");
	}

	@Override
	public void channelDown() {
		System.out.println("RemoteTv 채널을 내립니다.");
	}

}
