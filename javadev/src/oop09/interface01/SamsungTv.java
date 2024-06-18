package oop09.interface01;

public class SamsungTv implements TV{
	
	private HarmanSpeaker speaker = new HarmanSpeaker();
	
	public void turnOn() {
		System.out.println("SamsungTv : 전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("SamsungTv : 전원을 끕니다.");
	}
	public void channelUp() {
		System.out.println("SamsungTv : 채널을 올립니다.");
	}
	public void channelDown() {
		System.out.println("SamsungTv : 채널을 내립니다.");
	}
	public void soundUp() {
		if(speaker == null) {
			System.out.println("SamsungTv : 소리를 올립니다.");
		}
		else {
			speaker.soundUp();
		}
	}
	public void soundDown() {
		if(speaker == null) {
			System.out.println("SamsungTv : 소리를 내립니다.");
		}
		else {
			speaker.soundDown();
		}
	}
//	@Override
//	public void turnOn() {
//		
//	}
//	@Override
//	public void turnOff() {
//		
//	}
//	@Override
//	public void soundUp() {
//		
//	}
//	@Override
//	public void soundDown() {
//		
//	}

}
